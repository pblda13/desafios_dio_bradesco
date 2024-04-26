package BancoDigital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContaPoupanca extends Conta {

	private double taxaDeJuros;

	public ContaPoupanca(Cliente cliente, double taxaDeJuros) {
		super(cliente);
		this.taxaDeJuros = taxaDeJuros;
	}

	public void adicionarJuros() {
		double juros = saldo * taxaDeJuros;
		depositar(juros);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Taxa de Juros: %.2f", this.taxaDeJuros));
	}
}
