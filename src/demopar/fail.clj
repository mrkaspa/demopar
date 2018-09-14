(ns demopar.fail
  (:require [failjure.core :as f]))

(defn validate-name
  [{:keys [id]}]
  (if (nil? id)
    (f/fail "FAIL")
    id))

(defn fail-exec
  [& args]
  (let [m {:id 123}
        res (f/attempt-all
             [res (validate-name m)]
             (do
                (println "res = " res)
                "OK")
             (f/when-failed [_] "EPIC FAIL"))]
   (println "res = " res)))
