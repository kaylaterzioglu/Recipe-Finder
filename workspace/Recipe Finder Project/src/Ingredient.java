
public class Ingredient {
	String IngredientName;
	int IngredientRecipeNumber;
	
	public Ingredient(String Iname, int Inumber) {
		IngredientName=Iname;
		IngredientRecipeNumber=Inumber;
		
		// TODO Auto-generated constructor stub
	}
	
	public String GetIngredientName(Ingredient I) {
		return I.IngredientName;
	}
	

	public int GetIngredientRecipeNumber(Ingredient I) {
		return I.IngredientRecipeNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
