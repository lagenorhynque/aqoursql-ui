(defproject aqoursql-ui "0.1.0"
  :description "AqoursQL UI, an example GraphQL frontend"
  :url "https://github.com/lagenorhynque/aqoursql-ui"

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.597"
                  :exclusions [com.google.javascript/closure-compiler-unshaded
                               org.clojure/google-closure-library]]
                 [re-frame "0.10.9"]
                 [re-graph "0.1.11"]
                 [reagent "0.8.1"]
                 [secretary "1.2.3"]
                 [thheller/shadow-cljs "2.8.74"]]

  :plugins [[lein-shell "0.5.0"]]

  :min-lein-version "2.5.3"

  :jvm-opts ["-Xmx1G"]

  :source-paths ["src/clj" "src/cljs"]

  :test-paths   ["test/cljs"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"
                                    "test/js"]

  :shell {:commands {"open" {:windows ["cmd" "/c" "start"]
                             :macosx  "open"
                             :linux   "xdg-open"}}}

  :aliases {"dev"          ["with-profile" "dev" "do"
                            ["clean"]
                            ["run" "-m" "shadow.cljs.devtools.cli" "watch" "app"]]
            "prod"         ["with-profile" "prod" "do"
                            ["clean"]
                            ["run" "-m" "shadow.cljs.devtools.cli" "release" "app"]]
            "build-report" ["with-profile" "prod" "do"
                            ["clean"]
                            ["run" "-m" "shadow.cljs.devtools.cli" "run" "shadow.cljs.build-report" "app" "target/build-report.html"]
                            ["shell" "open" "target/build-report.html"]]
            "karma"        ["with-profile" "prod" "do"
                            ["clean"]
                            ["run" "-m" "shadow.cljs.devtools.cli" "compile" "karma-test"]
                            ["shell" "karma" "start" "--single-run" "--reporters" "junit,dots"]]}

  :profiles
  {:dev {:dependencies [[binaryage/devtools "0.9.11"]
                        [day8.re-frame/re-frame-10x "0.4.5"]
                        [day8.re-frame/tracing "0.5.3"]
                        [re-frisk "0.5.4.1"]]}

   :prod {:dependencies [[day8.re-frame/tracing-stubs "0.5.3"]]}})
