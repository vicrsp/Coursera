import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Pizza {
	
	public static HashMap<String, Integer> numIngredientes = new HashMap<String, Integer>();
	private List<String> listaIngredientes;
	
	public Pizza(){
		listaIngredientes = new ArrayList<String>();
	}
	
	public void adicionaIngrediente(String ingrediente){
		listaIngredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public static void contabilizaIngrediente(String ingrediente)
	{
		if(numIngredientes.containsKey(ingrediente))
		{
			Integer value = numIngredientes.get(ingrediente);
			numIngredientes.remove(ingrediente);
			numIngredientes.put(ingrediente, value + 1);
		}
		else
		{
			numIngredientes.put(ingrediente, 1);
		}
	}
	
	public int getPreco(){
		int numIng = listaIngredientes.size();
		int preco = 0;
		
		if(numIng == 0){ return 0;}
		
		if(numIng <= 2)
		{
			preco = 15;
		}
		else if(numIng <=5)
				{
					preco = 20;
				}
				else if(numIng > 5)
						{
							preco = 23;
						}
		
		return preco;
	}
	
	public boolean possuiIngrediente(){
		return (listaIngredientes.size() > 0);
	}
	
	public static void ImprimeTotalDeIngedientes(){
		int totalIngredientes = 0;
		
		Iterator<String> keySetIterator = numIngredientes.keySet().iterator();
		while(keySetIterator.hasNext()){
			String key = keySetIterator.next();
			System.out.println("Ingrediente: " + key + "- Quantidade: " + numIngredientes.get(key));
			
			totalIngredientes+=numIngredientes.get(key);
		}
		System.out.println("Total de ingredientes: " + totalIngredientes);
	}
}
