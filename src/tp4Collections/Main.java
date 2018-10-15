package tp4Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création de pizzas:
		Pizza pizza1 = new Pizza("MAR","Margarita",8);
		Pizza pizza2 = new Pizza("4FR","4 Fromage",10);
		Pizza pizza3 = new Pizza("CAL","Calzone",9);
		
		//Affichage test :
		System.out.println("Pizza 1 :\n"+pizza1.toString());
		System.out.println("Pizza 2 :\n"+pizza2.toString());
		System.out.println("Pizza 3 :\n"+pizza3.toString());

	}

}
