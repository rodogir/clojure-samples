(ns clojure-samples.core
  (:gen-class))

(defn square [n]
  (* n n))

;; remove all mupltiples of p in seq
(defn filter-multiples [p seq]
  (filter (fn [x] (not= (mod x p) 0)) seq))

;; infinite seq starting from 2
(defn prime-range [] (rest (rest (range))))

;; recursive implementation of the sieve of eratosthenes
(defn rec-sieve [list]
  (lazy-seq
    (cons
      (first list)
      (rec-sieve
        (filter-multiples
          (first list)
          (rest list))))))

;; generate infinite seq containing all primes
;; uses the sieve of eratosthenes algorithm
(defn all-primes []
  (rec-sieve (prime-range)))

;; get the first n primes
(defn n-primes [n]
  (take n (all-primes)))

(defn -main [& args]
  (println (n-primes 20)))