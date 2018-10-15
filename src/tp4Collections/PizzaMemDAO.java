package tp4Collections;

import java.util.Arrays;


public class PizzaMemDAO implements IPizzaDao{
	
	//Attribut
	private String nomBddPizza =null;
	private Pizza[] tableauDePizza;

	
//	/**
//	 * Constructeur :	
//	 * @param nomBddPizza
//	 * @param tableauDePizza
//	 */
//	public PizzaMemDAO(String nomBddPizza, Pizza[] tableauDePizza) {
//		super();
//		this.nomBddPizza = nomBddPizza;
//		this.tableauDePizza = tableauDePizza;
//	}
	/**
	 * Constructeur
	 */
	public PizzaMemDAO() {
		super();
		this.tableauDePizza = new Pizza[]{new Pizza("MAR","Margarita",8), new Pizza("4FR","4 Fromage",10), new Pizza("CAL","Calzone",9), new Pizza("JOF","Jambon Oeuf Fromage",7)};		
	}
	
	//Implémentation de l'interface IPizzaDao :
	
	/**
	 * Renvoie toutes les Pizzas de l'objet sous forme de tableau.
	 */
	public Pizza[] findAllPizzas(){
		return this.tableauDePizza;
	}
	
	/**
	 * Mise à jour à partir de la 'pizza' en entrée de la Pizza associée au code 'codePizza' en entrée.
	 */
	public void updatePizza(String codePizza, Pizza pizza){
		for(int i=0 ; i<this.tableauDePizza.length ;i++){
			if (this.tableauDePizza[i].getCode().equals(codePizza))	{
				this.tableauDePizza[i]=pizza;
				break;
			}
		}
	}
	
	/**
	 * Retourne la Pizza de l'objet dont le code est en entrée.
	 */
	public Pizza findPizzaByCode(String codePizza){
		for(int i=0 ; i<this.tableauDePizza.length ;i++){
			if (this.tableauDePizza[i].getCode().equals(codePizza))	{
				return this.tableauDePizza[i];
			}
		}
		return null;
		
	}
	/**
	 * Indique si la pizza dont le codePizza est en entrée existe dans l'objet.
	 */
	public boolean isPizzaExists(String codePizza){
		for(int i=0 ; i<this.tableauDePizza.length ;i++){
			if (this.tableauDePizza[i].getCode().equals(codePizza))	{
				return true;
			}
		}
		return false;
	}
	
	
		
	//Getter et Setter :
	
//	public Pizza[] getTableauDePizza() {
//		return tableauDePizza;
//	}
	
	@Override
	public String toString() {
		//Tri du tableau
		Arrays.sort(this.tableauDePizza);
		return "PizzaMemDAO [tableauDePizza=" + Arrays.toString(tableauDePizza) + "]";
	}

	public String getNomBddPizza() {
		return nomBddPizza;
	}
	public void setNomBddPizza(String nomBddPizza) {
		this.nomBddPizza = nomBddPizza;
	}
	public void setTableauDePizza(Pizza[] tableauDePizza) {
		this.tableauDePizza = tableauDePizza;
	}


}
