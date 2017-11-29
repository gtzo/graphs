(ns graphs.data)

(defrecord Graph [id vertices edges])

(defrecord Edge [in out])

(defrecord Vertex [id data])
