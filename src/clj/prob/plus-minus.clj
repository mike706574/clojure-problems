(ns prob.plus-minus)

;; https://www.hackerrank.com/challenges/plus-minus
(defn fraction-of
  [total number]
  (double (/ number total)))

(defn digits
  [number]
  (if number
    (format "%.6f" number)
    "0.00000"))

(defn plus-minus
  [total coll]
  (let [{pos -1
         zero 0
         neg 1 :as foo} (->> coll
                             (group-by (partial compare 0))
                             (map (fn [[k v]]
                                    [k (fraction-of total (count v))]))
                             (into {}))]
    (println (digits pos))
    (println (digits neg))
    (println (digits zero))))

(let [total (Integer/parseInt (read-line))
      coll (map #(Integer/parseInt %) (clojure.string/split (read-line) #"\s+"))]
  (plus-minus total coll))
