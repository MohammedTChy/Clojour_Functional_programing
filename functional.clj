;; Mohammed Tahmid Chowdhury
;; Studen ID: moch8386

;;sorry for naming scheme, just works for me in my head, i'll try to comment my train of thought, but it seems it doesn't make any sense (tried to explain to my sibling who sort of learning coding too, didn't make any sense at all it seems)
;;

;; my max
(defn my-max [l]
  (if (not-empty l)                                         ;;if its emppy return nill
    (reduce (fn [comp1 comp2]                               ;; if not get number
              (if (> comp1 comp2)                           ;;check which one is greater
                comp1 comp2))                               ;;fix it
            l)))

(my-max '(1 2 3 55 4 5 6))
(my-max '(36))
(my-max '())



;; my map
(defn my-map [l func]
  (if (not-empty l)
    ((fn step [temp]                                          ;;fix the temp
       (lazy-seq (when-not (empty? temp)                              ;; not emptpy contiune ish
           (cons (func (first temp))                          ;;check
                 (step (rest temp))))))                       ;;check again and fix
     l)))

(my-map  '(1 2 3 4 5 6) inc)
(my-map  '(-3 6 -9 12) pos?)


;; my reverse
(defn my-reverse [l]
  (loop [temp l tempo ()]                                       ;; loop a temp
    (if (empty? temp)                     ;;check
      tempo
      (recur (rest temp)
             (cons (first temp)
                   tempo))))) ;; fix


(my-reverse '(1 2 3 4 5 6))
(my-reverse '(36))
(my-reverse '())


