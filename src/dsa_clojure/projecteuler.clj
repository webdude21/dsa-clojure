(ns dsa-clojure.projecteuler)

(defn fibonacci-seq []
  (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(defn even-fibonacci-numbers-sum [limit]
  (reduce + (filter even? (take-while #(< % limit) (fibonacci-seq)))))