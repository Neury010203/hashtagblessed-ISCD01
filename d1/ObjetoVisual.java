package d1;
import java.util.ArrayList;


public class ObjetoVisual extends Componente {
	
	protected ArrayList<ObjetoVisual> hijos;
	
	public void aplicar_efecto() {
		for(ObjetoVisual hijo : hijos){
			hijo.aplicar_efecto();
		}
	}

}
