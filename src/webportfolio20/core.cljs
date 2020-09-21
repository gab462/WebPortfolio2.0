(ns webportfolio20.core
  (:require [reagent.core :as reagent :refer [atom]]
            [ajax.core :as ajax]))

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn hello-world []
  [:div.pagesize
   [:section.section
    [:div.container
     [:div.columns
      [:div.column.is-one-third
       [:div.notification
        [:div.card-image.has-text-centered
         [:figure.image.is-128x128.is-inline-block
          [:img.is-rounded {:src "https://www.jodilogik.com/wordpress/wp-content/uploads/2016/05/people-1.png"}]]]
       [:p.title.has-text-centered "Guilherme de Paula"]
       [:div.card-image.has-text-centered
        [:div.columns.is-inline-flex
         [:div.column
          [:a.image.is-48x48 {:href "linkedin" :target "_blank"}
           [:img {:src "http://www.prepare1.com/wp-content/uploads/2014/04/linkedin-logo-high-res-1254-1024x1024.jpg"}]]]
         [:div.column
          [:a.image.is-48x48 {:href "github" :target "_blank"}
           [:img {:src "https://cdn.afterdawn.fi/v3/news/original/github-logo.png"}]]]
         [:div.column
          [:a.image.is-48x48 {:href "email" :target "_blank"}
           [:img {:src "http://cdn.onlinewebfonts.com/svg/img_386071.png"}]]]]]
       [:hr.has-background-grey-lighter]
       [:p.subtitle.is-4 "Experience:"]
       [:div
        [:p.is-marginless.subtitle.is-5 [:strong "Client-Side:"]]
        [:span [:p [:i.fas.fa-code] "\tClojureScript (Reagent)"]] [:br]
        [:p.is-marginless.subtitle.is-5 [:strong "Server-side:"]]
        [:span [:p [:i.fas.fa-server] "\tClojure"]] [:br]
        [:p.is-marginless.subtitle.is-5 [:strong "Database:"]]
        [:span [:p [:i.fas.fa-database] "\tMongoDB"]] [:br]
        [:p.is-marginless.subtitle.is-5 [:strong "Other:"]]
        [:span [:p [:i.fas.fa-plus-square] "\tPython"]]]]]
      [:div.column
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
            [:br]
            [:p.has-text-right [:i "Data do Projeto: 2020"]] [:br]
            [:div.has-text-right
             [:div.field.is-grouped
              [:div.control
               [:button.button.is-primary [:strong  "Info"]]]
              [:div.control
               [:button.button.is-link.is-danger "Delete"]]]]]
           [:div.column.is-one-fifth
            [:figure.image.has-text-right
             [:a.image.is-48x48 {:href "source" :target "_blank"}
              [:img {:src "https://cdn.afterdawn.fi/v3/news/original/github-logo.png"}]]]]]]]]
       [:a.button.is-primary.is-fullwidth.is-large "+ Project"]]]]]])

(defn start []
  (reagent/render-component [hello-world]
                            (. js/document (getElementById "app"))))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (start))

(defn stop []
  ;; stop is called before any code is reloaded
  ;; this is controlled by :before-load in the config
  (js/console.log "stop"))
