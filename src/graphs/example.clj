(ns graphs.example
  (:require [graphs.data :refer [Vertex]]))

(def alice-data {:name "alice" :colour "green"})
(def bob-data {:name "bob" :colour "blue"})
(def chuck-data {:name "chuck" :colour "red"})

(def a (Vertex. 1 alice-data))
(def b (Vertex. 2 bob-data))
(def c (Vertex. 3 chuck-data))

(def ed1 (Edge. 1 2))
(def ed2 (Edge. 2 3))
(def ed3 (Edge. 3 1))
