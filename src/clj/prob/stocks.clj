(ns prob.stocks)

(use '[clojure.string :only (split triml)])


(defn combine
  [[a b] [av bv]]
  (case (compare av bv)
    -1 [a (inc b)]
    0 [a b]
    1 [(inc a) b]))

(reduce combine [0 0] [[1 2] [2 1]])

;; https://www.hackerrank.com/challenges/ctci-array-left-rotation
(defn shift-left
  [n coll]
  (->> (cycle coll)
       (drop (+ (count coll) n))
       (take (count coll))))
