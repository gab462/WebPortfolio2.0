(ns webportfolio20.core
  (:require [reagent.core :as reagent]
            [webportfolio20.components.navbar :refer [navbar-component]]
            [webportfolio20.components.footer :refer [footer-component]]
            [webportfolio20.components.profileside :refer [profile-side-component]]
            [webportfolio20.components.project :refer [project-component]]))

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
