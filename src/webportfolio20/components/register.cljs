(ns webportfolio20.components.register
  (:require [reagent.core :as reagent]))

(defn register-component []
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
     [:button.button.navbar-item.is-fullwidth.is-link "Register"]]]])
