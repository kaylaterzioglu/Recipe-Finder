
public class Ingredient {
	String IngredientName; //Initialize variable for ingredient's name
	int IngredientRecipeNumber; //Initialize variable for ingredient's number
	
	public Ingredient(String Iname, int Inumber) { //Initialize constructor that holds ingredient's information 
		IngredientName=Iname;
		IngredientRecipeNumber=Inumber;
		
		// TODO Auto-generated constructor stub
	}
	
	public String GetIngredientName(Ingredient I) { //getter method that returns ingredient's name 
		return I.IngredientName;
	}
	

	public int GetIngredientRecipeNumber(Ingredient I) { //getter method that returns the number of the recipe that ingredient is in
		return I.IngredientRecipeNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
