(ns clojure-samples.core-test
  (:require [clojure.test :refer :all]
            [clojure-samples.core :refer :all]))

(deftest square-test
  (testing "square"
    (is (= [9 1 0 1 9] (map square [-3 -1 0 1 3])))))

(deftest prime-test
  (testing "prime calculation"
    (testing "first prime"
      (is (= '(2) (n-primes 1))))
    (testing "first 2 primes"
      (is (= '(2 3) (n-primes 2))))
    (testing "first 20 primes"
      (is (=
            '(2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71)
            (n-primes 20))))))