package aula6.padrao_adapter.data;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

	@Override
	public Calendar dataAtual() {
		return Calendar.getInstance();
	}

}
