(ns prob.quick-sort)

(defn quick-sort
  [pivot & coll]
  (when pivot
    (let [{less false greater true} (group-by #(> % pivot) coll)]
      (lazy-cat (quick-sort less)
                (list pivot)
                (quick-sort greater)))))
