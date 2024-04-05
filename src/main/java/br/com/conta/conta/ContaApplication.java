package br.com.conta.conta;

import br.com.conta.conta.model.Conta;
import br.com.conta.conta.model.ContaInvestimento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContaApplication {

	public static void main(String[] args) {

		Conta conta = new ContaInvestimento(1111111,"1020-9", 1029.00);

		System.out.println(conta);

	}

}
