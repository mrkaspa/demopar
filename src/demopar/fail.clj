(ns demopar.fail
  (:require [failjure.core :as f]))

(defn validate-name
  [{:keys [name]}]
  (if (nil? name)
    (f/fail "FAIL")
    name))

(defn process
  [m]
  (f/attempt-all
    [res (validate-name m)]
    (do
      (println "res =" res)
      "OK")
    (f/when-failed
      [{:keys [message]}]
      (do
        (println "error =" message)
        message))))

(defn fail-exec
  [& args]
  (let
    [m {:name "Name"}
     res (process m)]
    (println "res = " res)))
