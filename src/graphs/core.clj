(ns graphs.core
  (:require [graphs.data :refer [Graph Edge Vertex]]
            [graphs.example]))

(defn add-vertex [graph vertex]
  (Graph. (:id graph)
          (conj (:vertices graph) vertex)
          (:edges graph)))

(defn add-edge [graph edge]
  (Graph. (:id graph)
          (:vertices graph)
          (conj (:edges graph) edge)))
