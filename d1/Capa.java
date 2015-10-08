package d1;

import java.util.ArrayList;

public class Capa extends Componente {
	
	protected ArrayList<Componente> subcapas;
	
	public void aplicar_efecto() {
		for(Componente subcapa : subcapas) {
			subcapa.aplicar_efecto();
		}
	}
}
