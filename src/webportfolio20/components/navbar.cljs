(ns webportfolio20.components.navbar
  (:require [reagent.core :as reagent]
            [webportfolio20.components.register :refer [register-component]]
            [webportfolio20.components.login :refer [login-component]]))

(defn toggle-class [a k class1 class2]
  (if (= (@a k) class1)
  (swap! a assoc k class2)
  (swap! a assoc k class1)))

(defn navbar-component []
  (let [burger-state (reagent/atom {:btn-class ""})]
    (fn []
      [:section.hero.has-background-light {:style {:max-height "100px"}}
       [:div.barsize
        [:nav.navbar {:role "navigation" :aria-label "main navigation"}
         [:div.navbar-brand
          [:a.navbar-item
           [:i.fas.fa-folder-open.fa-2x]]
          [:a {:class (str "navbar-burger " (@burger-state :btn-class))
               :on-click #(toggle-class burger-state :btn-class "" "is-active")
               :role "button"
               :aria-label "menu"
               :aria-expanded "false"
               :data-target="navbarSample"}
           [:span {:aria-hidden "true"}]
           [:span {:aria-hidden "true"}]
           [:span {:aria-hidden "true"}]]]
         [:div#navbarSample {:class (str "navbar-menu " (@burger-state :btn-class))}
          [:div.navbar-start
           [:a.navbar-item "Home"]
           [:a.navbar-item "Profile"]
           [:a.navbar-item "About"]]
          [:div.navbar-end
           [:div.navbar-item
            [:p.control.has-icons-right
             [:input.input.is-rounded {:type "text" :placeholder "Search"}]
             [:span.icon.is-small.is-right
              [:i.fas.fa-search]]]]
           [register-component]
           [login-component]]]]]])))
