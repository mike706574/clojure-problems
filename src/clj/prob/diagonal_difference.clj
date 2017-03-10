(ns prob.diagonal-difference)

;; https://www.hackerrank.com/challenges/diagonal-difference

(defn run [matrix]
  (let [size (count matrix)
        hi (dec size)
        sum (reduce
             (fn [sum n]
               (let [a (-> matrix (nth n) (nth n))
                     b (-> matrix (nth (- hi n)) (nth n))]
                 (+ sum a (- b))))
             0
             (range 0 size))]
    (Math/abs sum)))

(def test-matrix [[11 2 4]
                  [4 5 6]
                  [10 8 -12]])
