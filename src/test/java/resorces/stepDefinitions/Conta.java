package resorces.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

    private int saldo;
    private String status;

    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        saldo = int1;
        status = "especial";

    }

    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Saque: " + int1);
        saldo -= int1;
    }

    @Then("deve efetuar o saque e atualiza o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualiza_o_saldo_da_conta_para_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        if(saldo != int1 ){
            System.out.println("Erro no saque");
        }else {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual: " + saldo);
        }

    }

    @Then("check more outcomes")
    public void check_more_outcomes() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Esperando ações");
    }
}
