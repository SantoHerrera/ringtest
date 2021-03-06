(ns ringtest.core
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))



(defn foo [x] (str "Hello, " x))

(defroutes my_routes
  (GET "/" [] (foo "FUck yeeaaah, this bitch working"))
  (route/resources "/"))
