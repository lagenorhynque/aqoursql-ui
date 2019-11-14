(ns aqoursql-ui.core-test
  (:require [aqoursql-ui.core :as core]
            [cljs.test :as t :refer-macros [deftest testing is]]))

(t/deftest fake-test
  (t/testing "fake description"
    (is (= 1 2))))
