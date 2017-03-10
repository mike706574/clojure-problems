(ns prob.staircase)

;; https://www.hackerrank.com/challenges/staircase

(defn staircase
  [n]
  (clojure.string/join "\n"
        (map
         (fn [number]
           (let [width (inc number)]
             (clojure.string/join
              (concat (take (- n width) (repeat " "))
                      (take width (repeat "#"))))))
         (range n))))

(defn run []
  (println (staircase (Integer/parseInt (read-line)))))
