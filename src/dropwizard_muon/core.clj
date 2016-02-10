(ns dropwizard-muon.core
  (:require [muon-clojure.client :as cl] 
            [clojure.tools.logging :as log]
            )
  )

 (gen-class
    :main false
    :name com.qwickr.dropwizard.muon.MuonFactory
     :prefix java-
     :methods [^:static [build [com.qwickr.dropwizard.muon.SingleTransportMuonFactory] io.muoncore.SingleTransportMuon] 
              ])

(defn- create-tags-string [x]
  (clojure.string/join ", " (java.util.ArrayList.))
  )

(defn java-build
  "creates a Muon instance" [x]
 (let [u (.getConnectionUrl x) n (.getServiceName x) t (.getTags x)]
  (log/info "building muon instance. connection: " u  "service: " n " tags:" (create-tags-string t))
  (cl/muon-client u  n (seq t)))
)
