(ns demopar.otp
  (:gen-class)
  (:require [otplike.process :as process :refer [!]]))

(process/proc-defn server
  []
  (println "server: waiting for messages...")
  ; wait for messages
  (process/receive!
   [from msg]
   (do
    (println "server: got" msg)
    ; send response
    (! from [(process/self) msg])
    (recur))
   :stop
   ; exit receive loop
   (println "server: stopped")))

(process/proc-defn client
  []
  ; spawn process
  (let [pid (process/spawn server)]
   ; send message to it
   (! pid [(process/self) :hello])
   ;wait for response
   (process/receive!
    [pid msg]
    (println "client: got" msg))
   ; ask spawned process to stop
   (! pid :stop)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (process/spawn client)
  (Thread/sleep 1000))
