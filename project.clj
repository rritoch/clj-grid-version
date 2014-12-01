(defproject clj-grid-version "0.1.0-SNAPSHOT"
  :description "Grid Version Module"
  :url "http://www.vnetpublishing.com"
  :plugins [[grid "0.1.0-SNAPSHOT"]]
  :main grid.core
  :grid {:modules [applications.version]
         :osgi {:import-package [org.osgi.framework
                                 clojure.lang]}}
  :dependencies [[clj-grid-core "0.1.0-SNAPSHOT"]]
  :aot :all
  :profiles {; Compile & Run profile, excluded from uberjar
             :dev {:dependencies []}})
