(ns demopar.macro)

(defmacro unless [con exprs]
  (list 'if con nil (cons 'do exprs)))
