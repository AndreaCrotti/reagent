(ns reagentdemo.news
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.interop :refer-macros [.' .! fvar]]
            [reagent.debug :refer-macros [dbg println]]
            [reagentdemo.page :refer [title link page-map]]
            [reagentdemo.common :as common :refer [demo-component]]
            [reagentdemo.news.anyargs :as anyargs]
            [reagentdemo.news.async :as async]
            [reagentdemo.news.undodemo :as undodemo]
            [reagentdemo.news.clockpost :as clock]))

(defn main []
  [:div
   [title "Reagent news"]
   [clock/main {:summary true}]
   [anyargs/main {:summary true}]
   [async/main {:summary true}]
   [undodemo/main {:summary true}]])
