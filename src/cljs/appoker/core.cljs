;;
;; Driver for our app sim SPA
;;
;; Types
;; -----
;; * Application
;; * Component
;; * Resource
;; * Package
;; * Node
;; * Capability Resource
;; * Service
;;

(ns appoker.core
  (:require [goog.events :as events]
            [goog.dom :as dom]))

(def graph-element "container")

(defn- listeners
  []
  (let [graph-container (dom/getElement graph-element)]
    (.addMethod (js-obj "sigma.classes.graph"))))

(defn set-html! [el content]
  (set! (.-innerHTML el) content))

(defn main
  []
  (let [content "Hello World from Clojure Script"
        element (aget (js/document.getElementsByTagName "main") 0)]
    (set-html! element content)))

(main)
