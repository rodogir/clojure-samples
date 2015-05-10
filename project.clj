(defproject clojure-samples "0.1.0-SNAPSHOT"
            :description "clojure samples"
            :url "https://github.com/rodogir/clojure-samples"
            :license {:name "The MIT License (MIT)"
                      :url  "http://opensource.org/licenses/MIT"}
            :dependencies [[org.clojure/clojure "1.6.0"]]
            :main ^:skip-aot clojure-samples.core
            :target-path "target/%s"
            :profiles {:uberjar {:aot :all}})
