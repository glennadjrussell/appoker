(defproject appoker "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; CLJ and CLJS source code paths
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2843"]

                 ;; Backend dependencies
                 [compojure "1.3.1"]
                 [ring/ring-core "1.3.2" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-servlet "1.3.2" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-defaults "0.1.2" :exclusions [javax.servlet/servlet-api]]
                 
                 [cc.qbits/jet "0.5.4"]]

  :main appoker.core

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "1.0.4"]]

  ;; cljsbuild options configuration
  :cljsbuild {:builds
              [{;; CLJS source code path
                :id "appoker"
                :source-paths ["src/cljs"]

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/appoker.js"
                           :output-dir "resources/public/js/out"
                           ;;:source-map true
                           :asset-path "/static/js/out"

                           ;; minimal JS optimization directive
                           optimizations :whitespace

                           ;; generated JS code prettyfication
                           :pretty-print true
                           :main "appoker.core"
                           }
                }]}
)
