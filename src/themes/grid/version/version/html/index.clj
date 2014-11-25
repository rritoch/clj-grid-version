(ns themes.grid.version.version.html.index
  (:use [com.vnetpublishing.clj.grid.mvc.engine]
        [com.vnetpublishing.clj.grid.lib.grid.kernel]))

(fscript "grid view index layout"
    (do (println "<html>")
        (println "<head>")
        (println (str "<title>Grid Platform - Version</title>"))
        (println "</head>")
        (println "<body>")
        (println (str "<h2>Grid Platform - Version</h2>"))
        (println (str "<p>Language clj</p>"))
        (println (str "<p>Version " (get *current-view* "version") "</p"))
        (println "</body>")
        (println "</html>")))

