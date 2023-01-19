(defproject clojure-renovate-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :main ^:skip-aot my-project.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories [["amazon-s3" {:id "redshift"
                               :url "https://s3.amazonaws.com/redshift-maven-repository/release"}]]
  :dependencies [[org.clojure/clojure "1.9.0"]])
