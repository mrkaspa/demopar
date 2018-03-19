(ns demopar.core
  (:gen-class)
  (:require [clojure.core.match :refer [match]])
  (:require [demopar.pmap :refer [pmap-exec]])
  (:require [demopar.otp :refer [otp-exec]])
  (:require [demopar.async :refer [async-exec]])
  (:require [demopar.fail :refer [fail-exec]]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (match (vec args)
   ["pmap"] (pmap-exec)
   ["otp"] (otp-exec)
   ["async"] (async-exec)
   ["fail"] (fail-exec)
   :else (println "unknow option")))

