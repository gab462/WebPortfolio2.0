(ns webportfolio20.components.project
  (:require [reagent.core :as reagent]))

(defn project-component []
  [:div.notification
   [:div.columns
    [:div.column.is-one-third
     [:figure.image {:style {:max-width "600px"}}
      [:img {:src "https://cdn-images-1.medium.com/max/2600/1*S2mrAIUdexbLUjzNVVYdZg.png"}]]]
    [:div.column
     [:p.subtitle.is-4 [:strong "Webportfolio2.0"]]
     [:p.has-text-justified "Project made in ClojureScript in conjuction with Reagent (ClojureScript React bindings)."][:br]
     [:div.columns.is-flex
      [:div.column
       [:p.has-text-right [:i "Project date: 2020"]] [:br]
       [:div.has-text-right
        [:div.field.is-grouped
         [:div.control
          [:button.button.is-primary [:strong  "Info"]]]
         [:div.control
          [:button.button.is-link.is-danger "Delete"]]]]]
      [:div.column.is-one-fifth
       [:figure.image.has-text-center
        [:a {:href "source" :target "_blank"}
         [:i.fab.fa-github.fa-lg]]]]]]]])
