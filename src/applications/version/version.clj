(ns applications.version.version
  (:gen-class
    :name applications.version
    :exposes-methods {postConstructHandler parentPostConstructHandler
                      getView parentGetView}
    :extends com.vnetpublishing.clj.grid.lib.mvc.base.Module)
  (:require  [grid.core])
  (:use [clojure.java.io]
        [com.vnetpublishing.clj.grid.lib.grid.kernel]))

(def marker true)
 
(defn -getView
  [this name]
  (let [view (.parentGetView this name)]
    (.addTemplatePath view (str (:path (tglobal-get :current-theme)) *ds* "version" *ds* name))
    view))
	
(defn -postConstructHandler
  [this]
  (.parentPostConstructHandler this)
  (let [base-path (.toString (.getParent (as-file (:file (meta #'marker)))))]
    (.set this "_basePath" base-path)))
