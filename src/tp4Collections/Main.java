package tp4Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//===============================================================================================================
		//TEST Pizza :
		//==============

		System.out.println("\r\n" + 
				"===============================================================================================================\nTEST Pizza! \r\n");
		
		//Création de pizzas:
		Pizza pizzaMAR = new Pizza("MAR","Margarita",8);
		Pizza pizza4FR = new Pizza("4FR","4 Fromage",10);
		Pizza pizzaCAL = new Pizza("CAL","Calzone",9);
		Pizza pizzaJOF = new Pizza("JOF","Jambon Oeuf Fromage",7);
		
		//Affichage test :
		System.out.println("Pizza 1 :\n"+pizzaMAR.toString());
		System.out.println("Pizza 2 :\n"+pizza4FR.toString());
		System.out.println("Pizza 3 :\n"+pizzaCAL.toString());
		System.out.println("Pizza 4 :\n"+pizzaJOF.toString());
		
		System.out.println("Fin TEST Pizza! \r\n\r\n" + 
				"===============================================================================================================\n");

		//===============================================================================================================
		// TEST PizzaMemDAO :
		//===================

		System.out.println("===============================================================================================================\nTEST PizzaMemDAO! \r\n");
		
		//Création d'un PizzaMemDAO :
		PizzaMemDAO ensemblePizza = new PizzaMemDAO();
		
		for (int i=0;i<ensemblePizza.findAllPizzas().length;i++) {
			System.out.println(ensemblePizza.findAllPizzas()[i].toString());
		}
		
		System.out.println(ensemblePizza.toString());
		
		ensemblePizza.updatePizza("MAR", new Pizza("MAR","Marinière",11));

		System.out.println(ensemblePizza.toString());
		
		System.out.println("Fin TEST PizzaMemDAO! \r\n\r\n" + 
				"===============================================================================================================\n");

	}

}
