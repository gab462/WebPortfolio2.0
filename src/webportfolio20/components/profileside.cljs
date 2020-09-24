(ns webportfolio20.components.profileside
  (:require [reagent.core :as reagent]))

(defn profile-side-component []
  [:div.notification
   [:div.card-image.has-text-centered
    [:figure.image.is-128x128.is-inline-block
     [:img.is-rounded {:src "https://www.jodilogik.com/wordpress/wp-content/uploads/2016/05/people-1.png"}]]]
   [:p.title.has-text-centered "Guilherme de Paula"]
   [:div.card-image.has-text-centered
    [:div.columns.is-inline-flex
     [:div.column
      [:a {:href "linkedin" :target "_blank"}
       [:i.fab.fa-linkedin.fa-2x]]]
     [:div.column
      [:a {:href "github" :target "_blank"}
       [:i.fab.fa-github.fa-2x]]]
     [:div.column
      [:a {:href "email" :target "_blank"}
       [:i.fa.fa-envelope.fa-2x]]]]]
   [:hr.has-background-grey-lighter]
   [:p.subtitle.is-5 "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc convallis dui non sagittis tincidunt. Praesent consectetur, massa id malesuada finibus, nulla neque maximus arcu, at sagittis leo libero id dui. Nunc a quam sagittis, mattis est vitae, facilisis mauris."]
   [:p.subtitle.is-4 "Experience:"]
   [:div
    [:p.is-marginless.subtitle.is-5 [:strong "Client-Side:"]]
    [:span [:p [:i.fas.fa-code] "\tClojureScript (Reagent)"]] [:br]
    [:p.is-marginless.subtitle.is-5 [:strong "Server-side:"]]
    [:span [:p [:i.fas.fa-server] "\tClojure"]] [:br]
    [:p.is-marginless.subtitle.is-5 [:strong "Database:"]]
    [:span [:p [:i.fas.fa-database] "\tMongoDB"]] [:br]
    [:p.is-marginless.subtitle.is-5 [:strong "Other:"]]
    [:span [:p [:i.fas.fa-plus-square] "\tPython"]]]])
