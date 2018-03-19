(ns demopar.pmap)

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

(defn pmap-exec
  []
  (time (dox))
  (shutdown-agents))
