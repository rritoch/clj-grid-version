(ns applications.version.controllers.controller
    (:gen-class
      :name applications.version.controllers.controller
      :exposes-methods {dispatch parentDispatch}
      :methods [[methodDisplay [] void]]
      :extends com.vnetpublishing.clj.grid.lib.mvc.base.Controller))


(defn -methodDisplay
  [this]
  (let [view (.getView (.getModule this) "version")]
       (.display view)
       (.render view)))
  
(defn -dispatch
   ([this lock]
   (if (.parentDispatch this lock)
       (do (.methodDisplay this)
         true
       )))
   ([this] (.dispatch this true)))