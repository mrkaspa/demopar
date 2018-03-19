(ns demopar.async
  (:require [clojure.core.async :as async :refer [<! >! chan go]]))

(defn randi
  [c]
  (go (>! c (rand-int 10))))

(defn dox
  []
  (let [c (chan)
        r (range 1 50)]
   (doseq [n r]
    (randi c))
   (go (doseq [n r]
        (let [n (<! c)]
          (println n))))))

(defn async-exec
  [& args]
  (dox)
  (Thread/sleep 1000))
