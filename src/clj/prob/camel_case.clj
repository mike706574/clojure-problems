(ns prob.camel-case)

(defn count-words
  [camel-case-str]
  (reduce
   (fn [tally char]
     (if (Character/isUpperCase char)
       (inc tally)
       tally))
   (rest camel-case-str)))
