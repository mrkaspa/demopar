(ns demopar.fail
  (:require [failjure.core :as f]))

(defn validate-name
  [val]
  (let [{:keys [id]} val]
   (if (nil? id)
    (f/fail "FAIL")
    val)))

(defn fail-exec
  [& args]
  (let [val {:id 123}
        res (f/attempt-all [res (validate-name val)]
             "OK"
             (f/when-failed [_] "EPIC FAIL"))]
   (println "res = " res)))
