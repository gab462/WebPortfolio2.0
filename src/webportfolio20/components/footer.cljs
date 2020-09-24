(ns webportfolio20.components.footer
  (:require [reagent.core :as reagent]))

(defn footer-component []
  [:footer.footer
    [:div.columns
     [:div.column.has-text-left "By " [:strong "Gustavo Araujo Borges"] " @2020"]
     [:div.column.has-text-right [:i.fab.fa-github.fa-2x]]]])

