package model;

public class ContaPoupanca extends Conta {
	private double rendimento;
	ContaPoupanca (String email) {
		super (email);
		this.rendimento = rendimento;
}
	
	public String Saque (double valorSaque) {
		if (valorSaque <= saldo) {
			saldo =- valorSaque;
			return (
					"Valor Sacado: " + valorSaque
					+"\nValor Saldo Após o Saque: " + saldo
				    
					);
		} else {
			return "Saldo insuficiente";
		
	    }

	}
	
	public String Deposito(double valorDeposito) {
		saldo += (valorDeposito + (valorDeposito*rendimento));
		return ("Valor Sacado: " + valorDeposito
				+"\nValor Saldo Após o Saque: "
				+ saldo);
		
	}
	
	public double getSaldo() {
		return saldo;
		
	}
	
	
}
