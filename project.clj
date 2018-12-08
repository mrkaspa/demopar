(defproject demopar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]
                 [failjure "1.3.0"]
                 [com.novemberain/langohr "5.0.0"]
                 [com.fzakaria/slf4j-timbre "0.3.8"]]
  :dev-dependencies [[lein-cljfmt "0.5.7"]]
  :jvm-opts ["--add-modules" "java.xml.bind"]
  :main ^:skip-aot demopar.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
