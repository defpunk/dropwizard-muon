(defproject dropwizard-muon "0.1.0-SNAPSHOT"
  :description "Config for muon"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["java"]
  :aot :all
  :dependencies [[org.clojure/clojure "1.8.0"] 
                 [io.muoncore/muon-clojure "6.4-20160401135945"] 
                 [io.dropwizard/dropwizard-auth "0.8.4"] 
                 [io.dropwizard/dropwizard-logging "0.8.4"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.fasterxml.jackson.core/jackson-annotations "2.6.0"] 
                 [atticus "0.1.0-SNAPSHOT"]
                 ]
  )
