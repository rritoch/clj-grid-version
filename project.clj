(defproject clj-grid-version "0.1.0-SNAPSHOT"
  :description "Grid Version Module"
  :url "http://www.vnetpublishing.com"
  :plugins [[grid "0.1.0-SNAPSHOT"]]
  :repositories [["releases" {:url "http://home.vnetpublishing.com/artifactory/libs-release-local"
                              :creds :gpg}]
                 ["snapshots" {:url "http://home.vnetpublishing.com/artifactory/libs-snapshot-local"
                               :creds :gpg}]]
  :main grid.core
  :grid {:modules [applications.version]
         :osgi {:import-package [org.osgi.framework
                                 clojure.lang]}}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-grid-core "0.1.0-SNAPSHOT"]
                 [org.apache.felix/org.apache.felix.main "4.4.1"]]
  :aot :all
  
  :profiles {; Compile & Run profile, excluded from uberjar
             :dev {:dependencies []}})
