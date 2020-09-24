(ns webportfolio20.core
  (:require [reagent.core :as reagent :refer [atom]]
            [ajax.core :as ajax]))

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn navbar-component []
  [:section.hero.has-background-light {:style {:max-height "100px"}}
   [:div.barsize
    [:nav.navbar {:role "navigation" :aria-label "main navigation"}
     [:div.navbar-brand
      [:a.navbar-item
       [:i.fas.fa-folder-open.fa-2x]]
      [:a.navbar-burger.burger {:role "button" :aria-label "menu" :aria-expanded "false" :data-target="navbarSample"} ;; Javascript needed?
       [:span {:aria-hidden "true"}]
       [:span {:aria-hidden "true"}]
       [:span {:aria-hidden "true"}]]]
     [:div#navbarSample.navbar-menu
      [:div.navbar-start
       [:a.navbar-item "Home"]
       [:a.navbar-item "Profile"]
       [:a.navbar-item "About"]]
      [:div.navbar-end
       [:div.navbar-item]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:a.navbar-link "Register"]
        [:div.navbar-dropdown
         [:div.navbar-item
          [:p.subtitle.is-5 "Create a new account"]]
         [:div.navbar-item.field
          [:input.input {:type "text" :placeholder "Username"}]]
         [:div.navbar-item.field
          [:input.input {:type "email" :placeholder "Email"}]]
         [:div.navbar-item.field
          [:input.input {:type "password" :placeholder "Password"}]]
         [:div.navbar-item.field
          [:input.input {:type "password" :placeholder "Confirm Password"}]]
         [:div.navbar-item
          [:button.button.navbar-item.is-fullwidth.is-link "Register"]]]]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:a.navbar-link "Log In"]
        [:div.navbar-dropdown
         [:div.navbar-item
          [:p.subtitle.is-5 "Log into existing account"]]
         [:div.navbar-item.field
          [:input.input {:type "email" :placeholder "Email"}]]
         [:div.navbar-item.field
          [:input.input {:type "password" :placeholder "Password"}]]
         [:div.navbar-item
          [:button.button.navbar-item.is-fullwidth.is-success "Log in"]]]]]]]]])

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

(defn footer-component []
  [:footer.footer
    [:div.columns
     [:div.column.has-text-left "By " [:strong "Gustavo Araujo Borges"] " @2020"]
     [:div.column.has-text-right [:i.fab.fa-github.fa-2x]]]])

(defn main-component []
  [:div.pagesize
   [:section.section
    [:div.container
     [navbar-component] [:br]
     [:div.columns
      [:div.column.is-one-third
       [profile-side-component]]
      [:div.column
       [project-component]
       [:a.button.is-primary.is-fullwidth.is-large "+ Project"]]]
     [footer-component]]]])

(defn start []
  (reagent/render-component [main-component]
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
