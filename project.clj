(defproject ringtest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  ; :ring {:handler ringtest.core/my_routes
  ;        :auto-reload? true
  ;        :auto-refresh? false}
  :plugins [[lein-ring "0.12.5"]]
  :dev-dependencies [[lein-ring "0.12.5"]]
  :ring {:handler ringtest.core/my_routes}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring "1.2.0"]
                 [compojure "1.6.2"]]
  :main ^:skip-aot ringtest.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
