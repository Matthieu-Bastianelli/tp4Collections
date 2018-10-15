package tp4Collections;


public class PizzaMemDAO implements IPizzaDao{
	
	//Attribut
	private String nomBddPizza =null;
	private Pizza[] tableauDePizza;

	
	/**
	 * Constructeur :	
	 * @param nomBddPizza
	 * @param tableauDePizza
	 */
	public PizzaMemDAO(String nomBddPizza, Pizza[] tableauDePizza) {
		super();
		this.nomBddPizza = nomBddPizza;
		this.tableauDePizza = tableauDePizza;
	}

	//Implémentation de l'interface IPizzaDao :
	
	public Pizza[] findAllPizzas(){
		return this.tableauDePizza;
	}
	
	public void updatePizza(String codePizza, Pizza pizza){
		for(int i=0 ; i<this.tableauDePizza.length ;i++){
			if (this.tableauDePizza[i].getCode().equals(codePizza))	{
				this.tableauDePizza[i]=pizza;
				break;
			}
		}
	}
	
	public Pizza findPizzaByCode(String codePizza){
		for(int i=0 ; i<this.tableauDePizza.length ;i++){
			if (this.tableauDePizza[i].getCode().equals(codePizza))	{
				return this.tableauDePizza[i];
			}
		}
		return null;
		
	}
	public boolean isPizzaExists(String codePizza){
		for(int i=0 ; i<this.tableauDePizza.length ;i++){
			if (this.tableauDePizza[i].getCode().equals(codePizza))	{
				return true;
			}
		}
		return false;
	}
	
	
		
	//Getter et Setter :
	
	public Pizza[] getTableauDePizza() {
		return tableauDePizza;
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
