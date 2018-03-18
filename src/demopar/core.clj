(ns demopar.core
  (:gen-class))

(defn randi
  [n]
  (rand-int 10))

(defn dox
  []
  (let
    [sum (->>
          (range 1 50)
          (pmap randi)
          (reduce +))]
   sum))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (time (dox))
  (shutdown-agents))
