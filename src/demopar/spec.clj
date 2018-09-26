(ns demopar.spec
  (:require [clojure.spec.alpha :as s]))

(s/def ::name (s/or :str string? :int int?))

(s/def :music/id uuid?)
(s/def :music/artist string?)
(s/def :music/title string?)
(s/def :music/date inst?)

(s/def :music/release
  (s/keys :req [:music/id]
          :opt [:music/artist
                :music/title
                :music/date]))

(defn spec-exec
  []
  (println
   (s/explain
    :music/release
    {:music/id #uuid "40e30dc1-55ac-33e1-85d3-1f1508140bfc"
     :music/artist "Nemo"})))
