import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	
	private List<Pizza> listaCompras;
	
	public CarrinhoDeCompra(){
		listaCompras = new ArrayList<Pizza>();
	}
	
	public void adicionaPizza(Pizza p){
		if(p.possuiIngrediente())
			listaCompras.add(p);
		else
			System.out.println("Pizza deve possui pelo menos um ingrediente!");
		
	}
	
	public int getPrecoTotal(){
		int precoTotal = 0;
		
		for(int i = 0; i< listaCompras.size(); i++){
			precoTotal += listaCompras.get(i).getPreco();
		}
		
		return precoTotal;
	}
	
}
