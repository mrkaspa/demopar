(ns demopar.fail
  (:require [failjure.core :as f]))

(defn validate-name
  [{:keys [id] :as m}]
  (if (nil? id)
    (f/fail "FAIL")
    m))

(defn fail-exec
  [& args]
  (let [m {:id 123}
        res (f/attempt-all
             [res (validate-name m)]
             "OK"
             (f/when-failed [_] "EPIC FAIL"))]
   (println "res = " res)))
