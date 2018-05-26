(ns dsa-clojure.projecteuler-test
  (:require [clojure.test :refer :all]
            [dsa-clojure.projecteuler :refer :all]))

(deftest a-test-common-problems-fibonacci-seq
  (testing "Fibonacci-seq function works just fine"
    (are [input expected]
      (= expected (take input (fibonacci-seq)))
      0 '()
      1 '(0)
      2 '(0 1)
      7 '(0 1 1 2 3 5 8)
      10 '(0 1 1 2 3 5 8 13 21 34)
      18 '(0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597))))

(deftest a-test-fibonacci-even-sum
  (testing "Fibonacci-seq even sum"
    (is (= 4613732 (even-fibonacci-numbers-sum 4000000)))))