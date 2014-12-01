(ns applications.version.views.version.version
  (:require [clojure.string :as string]
            [com.vnetpublishing.clj.grid.mvc.engine :refer :all]
            [com.vnetpublishing.clj.grid.mvc.base.view :as view]
            [com.vnetpublishing.clj.grid.mvc.base.module :as module]
            [com.vnetpublishing.clj.grid.lib.grid.kernel :refer :all]))

(view/make-view)

(defn display
  []
    (let [t-ns (this-ns)
          module (view/get-module t-ns)
          vwp-model (module/get-model module "grid")]
         (assign t-ns ["version" (ns-call vwp-model 'get-version)])))
