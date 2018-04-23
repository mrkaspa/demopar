(ns demopar.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [demopar.pmap :as pmap]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (> (pmap/dox) 0))))
