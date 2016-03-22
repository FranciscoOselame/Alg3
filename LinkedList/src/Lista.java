
public class Lista {
	int numElementos = 0;
	No inicio, fim;
	
	public void addInicio(Object valor){
		No novo = new No(valor);
		if(!isEmpty()){
			inicio = novo;
			fim = novo;		
		}
		else{
			inicio.setAnterior(novo);
			novo.setProximo(inicio);
			inicio = novo;
		}	
	}
	
	public  void addFim(Object valor){
		No novo = new No(valor);
		if(!isEmpty()){
			inicio = novo;
			fim = novo;
		}
		else{
		novo.setAnterior(fim);
		fim.setProximo(novo);
		fim = novo;
		}
	}
	
	
	public void removeInicio(){
		No aux = inicio;
		
		if(inicio.getProximo() != null){
			inicio = inicio.getProximo();
			inicio.getAnterior().setProximo(null);
			inicio.setAnterior(null);
		}
		else{
			inicio = null;
			fim = null;
		}
	}
	
	public void removeFim(){
		No aux = fim;
		
		if(fim.getAnterior() != null){
			fim = fim.getAnterior();
			fim.getProximo().setAnterior(null);
			fim.setProximo(null);
		}
		else{
			inicio = null;
			fim = null;
		}
	}
	

	
	public boolean isEmpty(){
		if(numElementos == 0)
			return true;
		else
			return false;
	}
}
