(ns demopar.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [demopar.pmap :as pmap]
            [demopar.fail :as fail]
            [failjure.core :as f]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (> (pmap/dox) 0))))

(deftest a-test
  (testing "Failjure works"
    (is (= (fail/validate-name {:id 100}) 100)))
  (testing "Failjure fails"
    (is (= (fail/validate-name {}) (f/fail "FAIL")))))
