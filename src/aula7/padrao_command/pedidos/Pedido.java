package aula7.padrao_command.pedidos;

import java.util.Calendar;

public class Pedido {
	
	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public void paga() {
		status = status.PAGO;
	}
	
	public void finaliza() {
		dataFinalizacao = Calendar.getInstance();
		status = Status.ENTREGUE;
	}
}
