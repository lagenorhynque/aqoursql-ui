(ns aqoursql-ui.runner
  (:require [aqoursql-ui.core-test]
            [doo.runner :refer-macros [doo-tests]]))

(doo-tests 'aqoursql-ui.core-test)
