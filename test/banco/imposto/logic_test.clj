(ns banco.imposto.logic_test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :refer [imposto-retido-fonte]]))
;;Solicitação cliente:
  ;;Valores abaixo de R$1000,00 não tem imposto retido na fonte.
  ;;Acima disso pagam 10% de imposto.

(deftest imposto-retido-fonte-test
  (testing "Dado que o valor seja de R$1000,00 - Quando for acima de R$1000,00 - Então não deve ter imposto retido na fonte."
    (is (= 0 (imposto-retido-fonte 1)))
    (is (= 0 (imposto-retido-fonte 999.99))))

  (testing "Dado que tenha um valor igual ou acima - Então deve ter um imposto retido de 10%."
    (is (= 100.00 (imposto-retido-fonte 1000)))))

