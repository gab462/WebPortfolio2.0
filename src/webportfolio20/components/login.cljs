(ns webportfolio20.components.login
  (:require [reagent.core :as reagent]))

(defn login-component []
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
     [:button.button.navbar-item.is-fullwidth.is-success "Log in"]]]])
