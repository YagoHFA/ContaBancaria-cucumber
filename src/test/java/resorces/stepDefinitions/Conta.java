package resorces.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * Classe para simular as operacoes de uma conta bancaria.
 */
public class Conta {


    private Integer saldo;
    private String status;

    /**
     * @author YagoHFA
     * @param int1 este e o saldo inicial da conta.
     */
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        saldo = int1;
        status = "especial";

    }

    /**
     * @author YagoHFA
     * @param int1 este e o valor a ser sacado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1){
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Saque: " + int1);
        saldo -= int1;
    }

    /**
     * @author YagoHFA
     * @param int1 este e o saldo final da conta no final da operação.
     */
    @Then("deve efetuar o saque e atualiza o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualiza_o_saldo_da_conta_para_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(int1, saldo);
        if (saldo.equals(int1)){
            System.out.println("Saque efetuado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente!");
        }

    }

    /**
     * @author YagoHFA
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Esperando ações");
    }


    /**
     * @author YagoHFA
     * @param arg0 este e o saldo inicial da conta.
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void umClienteComumComSaldoAtualDeReais(int arg0) {
        System.out.println("Saldo atual: " + arg0);
        saldo = arg0;
        status = "comum";
    }

    /**
     * @author YagoHFA
     * @param arg0 este e o valor a ser sacado.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitarUmSaqueDeReais(int arg0) {
        if (saldo >= arg0){
            saldo -= arg0;
            System.out.println("Saque efetuado com sucesso!");
        }
    }

    /**
     * Metodo que avisa retorno insuficiente.
     */
    @Then("não deve efetuar o saque e deve retornanar a mensagem saldo insuficiente")
    public void naoDeveEfetuarOSaqueEDeveRetornanarAMensagemSaldoInsuficiente() {
        System.out.println("Saldo insuficiente!");
    }
}
