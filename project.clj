(defproject epistomic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]]
  :profiles {:dev {:dependencies [[com.datomic/datomic-free "0.9.5561"
                                   :exclusions [org.slf4j/slf4j-api
                                                org.slf4j/slf4j-nop
                                                org.slf4j/slf4j-log4j12
                                                org.slf4j/log4j-over-slf4j
                                                org.slf4j/jcl-over-slf4j
                                                org.slf4j/jul-to-slf4j
                                                org.clojure/clojure]]]}})
