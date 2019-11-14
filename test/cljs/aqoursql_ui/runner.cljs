(ns aqoursql-ui.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [aqoursql-ui.core-test]))

(doo-tests 'aqoursql-ui.core-test)
