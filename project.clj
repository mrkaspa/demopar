(defproject demopar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [otplike "0.3.0-alpha"]
                 [org.clojure/core.async "0.4.474"]
                 [failjure "1.3.0"]
                 [org.clojure/core.match "0.3.0-alpha5"]]
  :main ^:skip-aot demopar.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
