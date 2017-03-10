(ns prob.misc`)

;; https://www.hackerrank.com/challenges/compare-the-triplets
(defn combine
  [[a b] [av bv]]
  (case (compare av bv)
    -1 [a (inc b)]
    0 [a b]
    1 [(inc a) b]))

;; https://www.hackerrank.com/challenges/ctci-array-left-rotation
(defn shift-left
  [n coll]
  (->> (cycle coll)
       (drop (+ (count coll) n))
       (take (count coll))))
