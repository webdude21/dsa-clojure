(ns dsa-clojure.projecteuler
  (:require [clojure.string :as str]))

(defn fibonacci-seq []
  (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(defn even-fibonacci-numbers-sum [limit]
  (reduce + (filter even? (take-while #(< % limit) (fibonacci-seq)))))

(defn palindrome?
  [x]
  (if (number? x)
    (palindrome? (str x))
    (= (if (string? x)
         (str/reverse x)
         (reverse x)) x)))

(defn largest-palindrome-product [digits]
  (let [upper-bound (int (Math/pow 10 digits))
        lower-bound (int (Math/pow 10 (dec digits)))
        a-range (reverse (range lower-bound upper-bound))
        b-range (reverse (range lower-bound upper-bound))
        product-seq (for [a a-range b b-range] (* a b))]
    (->> product-seq
         (filter palindrome?)
         (apply max))))