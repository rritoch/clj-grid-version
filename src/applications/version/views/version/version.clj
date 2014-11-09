(ns applications.version.views.version.version
    (:gen-class
      :name applications.version.views.version
      :extends com.vnetpublishing.clj.grid.lib.mvc.base.View)
    (:use [com.vnetpublishing.clj.grid.lib.mvc.engine]))

(defn -display
  [this]
  (assign this ["version" #_(with-model "version" (getVersion))
                         (.getVersion (.getModel (.getModule this) "version"))]))
