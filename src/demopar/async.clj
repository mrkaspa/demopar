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

(defn say
  [{:keys [a b c]}]
  (if-some [a a] ; VALIDATES A NOT NIL
   (println a "+" b "+" c)))

(defn async-exec
  [& args]
  (say {:a "eo"})
  ; (dox)
  (Thread/sleep 1000))
