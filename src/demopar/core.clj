(ns demopar.core
  (:gen-class)
  (:require [demopar.pmap :refer [pmap-exec]])
  (:require [demopar.async :refer [async-exec]])
  (:require [demopar.fail :refer [fail-exec]])
  (:require [demopar.spec :refer [spec-exec]]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (case (first args)
    "pmap" (pmap-exec)
    "async" (async-exec)
    "fail" (fail-exec)
    "spec" (spec-exec)
    (println "unknow option")))

