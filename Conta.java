package aula04;

public class Conta {

	int id;
	String tipo;
	double saldo;
	double sacar;
	double depositar;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	 public void depositar(double depositar) {
		 saldo += depositar;
		
	 }
	 
	 public void sacar(double sacar) {
		 saldo -= sacar;
	 }
	 
	 public void exibirConta1() {
		 System.out.println("O saldo conta 1 da conta é: " + saldo);
	 }
  
	 public void exibirConta2() {
		 System.out.println("");
		 System.out.println("O saldo conta 2 da conta é: " + saldo);
}}
