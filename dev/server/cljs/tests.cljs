(ns cljs.tests
  "Place to put specific test cases to run"
  (:require
   [clojure.test :refer [run-tests]]
   [ethlance.server.contract.ethlance-job-factory-test]
   [ethlance.server.contract.ethlance-job-store-test]
   [ethlance.server.contract.ethlance-work-contract-test]
   [ethlance.server.contract.ethlance-invoice-test]
   [ethlance.server.contract.ethlance-dispute-test]
   [ethlance.server.db-test]
   [ethlance.server.model.user-test]
   [ethlance.server.model.candidate-test]
   [ethlance.shared.enum.currency-type-test]))


(defn run-enum-tests []
  (run-tests
   'ethlance.shared.enum.currency-type-test))


(defn run-job-factory-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.contract.ethlance-job-factory-test)))

(defn run-job-store-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.contract.ethlance-job-store-test)))


(defn run-work-contract-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.contract.ethlance-work-contract-test)))


(defn run-invoice-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.contract.ethlance-invoice-test)))


(defn run-dispute-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.contract.ethlance-dispute-test)))


(defn run-db-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.db-test)))


(defn run-model-tests []
  (.nextTick js/process
             #(run-tests
               'ethlance.server.model.user-test
               'ethlance.server.model.candidate-test)))
