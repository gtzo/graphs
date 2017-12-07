(ns graphs.core)

(defrecord Graph [id vertices edges])

(defrecord Edge [in out])

(defrecord Vertex [id data])

(defn add-vertex [graph vertex]
  (let [existing-vertices (:vertices graph)]
    (assoc graph :vertices (conj existing-vertices vertex))))

(defn add-edge [graph edge]
  (let [existing-edges (:edges graph)]
    (assoc graph :edges (conj existing-edges edge))))

(defn vertex-exists [graph id]
  (= 0 (count
        (filter #(= id (:id %))
                (:vertices graph)))))
