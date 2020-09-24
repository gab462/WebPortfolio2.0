(ns webportfolio20.components.profile
  (:require [reagent.core :as reagent]
            [webportfolio20.components.profileside :refer [profile-side-component]]
            [webportfolio20.components.project :refer [project-component]]))

(defn profile-component []
  [:div.columns
   [:div.column.is-one-third
    [profile-side-component]]
   [:div.column
    [project-component]
    [:a.button.is-primary.is-fullwidth.is-large "+ Project"]]])
