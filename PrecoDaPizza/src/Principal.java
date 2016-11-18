
public class Principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Bacon");
		p1.adicionaIngrediente("Frango");
		Pizza.ImprimeTotalDeIngedientes();
		
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Calabresa");
		
		Pizza.ImprimeTotalDeIngedientes();
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Tomate");
		
		Pizza.ImprimeTotalDeIngedientes();
		CarrinhoDeCompra c = new CarrinhoDeCompra();
	
		c.adicionaPizza(p1);
		c.adicionaPizza(p2);
		c.adicionaPizza(p3);
		
		System.out.println(p1.getPreco());
		System.out.println(p2.getPreco());
		System.out.println(p3.getPreco());
		
		System.out.println(c.getPrecoTotal());
		
		Pizza.ImprimeTotalDeIngedientes();
	}

}
