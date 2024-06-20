
(define fac (lambda (n)
	      (fac2 n 1)))

(define fac2 (lambda (n m)
	       (cond
		((< n 2) m)
		(#t (fac2 (- n 1) (* n m))))))

(fac 5)  ;; 120
(fac 10) ;; 3628800
(fac 20) ;; 2432902008176640000

