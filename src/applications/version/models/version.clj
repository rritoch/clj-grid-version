(ns applications.version.models.version
    (:gen-class
      :name applications.version.models.version
      :methods [[getVersion [] String]]
      :extends com.vnetpublishing.clj.grid.lib.mvc.base.Model)
    (:require [com.vnetpublishing.clj.grid.lib.mvc.base.version :as version]))

(defn -getVersion
      [this]
      (clojure.string/join "." (version/getVersion) ))