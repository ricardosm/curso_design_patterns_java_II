package aula8.padrao_singleton.empresa;

public class Programa {
	EmpresaFacade fachada = new EmpresaFacadeSingleton().getInstancia();
}
