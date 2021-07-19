(ns acme.web.app
  (:require [re-frame.core :as rf]
            [reagent.core :as r]
            [reagent.dom]))

(defn mount-root
  []
  (reagent.dom/render [:div [:h1 "Hello there, candidate!"]]
                      (js/document.getElementById "main")))

(defn reload
  []
  (rf/clear-subscription-cache!)
  (mount-root))

(defn main
  []
  (mount-root))
