import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Recipe {
	
	String RecipeName; //Initialize variable for recipe name
	String RecipeInstructions; //Initialize variable for recipe instructions
	int RecipeNumber;  //Initialize variable for recipe number
	  static Recipe [] Robjects= new Recipe [3]; //Initialize array that will hold recipes.
	  static Ingredient [] Iobjects= new Ingredient [39]; //Initialize array that will hold ingredients.

	  
	public Recipe(String Rname, String RInstructions, int RNumber) {  //Initialize constructor that will hold recipes.
		RecipeName=Rname;
		RecipeInstructions=RInstructions;
		RecipeNumber=RNumber;
		
	}
	
	public String GetRecipeName(Recipe r) { //getter method that returns recipe's name 
		return r.RecipeName;
	}
	
	public String GetRecipeInstructions(Recipe r) {  //getter method that returns recipe's instructions 
		return r.RecipeInstructions;
	}
	
	
	public int GetRecipeNumber(Recipe r) {  //getter method that returns recipe's number 
		return r.RecipeNumber;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConnectionToSQL ConnectingToDatabase = new ConnectionToSQL();  //Create an object from ConnectionToSQL Class. 

		
	    Recipe[] RRObjects= new Recipe[3];

	try(Statement statement = ConnectingToDatabase.connection.createStatement()){
	    String Recipelist = "select * from Recipe"; //A query that selects all recipes. 
	    String AllIngredients = "select * from Ingredients_List"; //A query that selects all ingredients.  

	    try(ResultSet result = statement.executeQuery(Recipelist)){
	    	
	    	int i=0;
	        while(result.next()) { 
	        	
	        	if(result!=null  & i<Robjects.length) {
	            String rname = result.getString("recipe_title");  //getting recipe's name from query
	            int rnumber = result.getInt("recipe_number"); //getting recipe's number from query
	            String rinstructions = result.getString("recipe_instructions"); //getting recipe's instructions from query
	            Robjects [i]= new Recipe(rname,rinstructions, rnumber);  //Initializing a recipe's object with info from sql query.
	            i++; 
	        	}
	          
	        }
	        
	        try(ResultSet result1 = statement.executeQuery(AllIngredients)){
		    	
		    	int i1=0;
		        while(result1.next()) {
		        	
		        	if(result1!=null  & i<Iobjects.length) {
		            String iname = result1.getString("list_of_ingredients");  //getting ingredient's name from query
		            int inumber = result1.getInt("recipe_number_fk"); //getting the number of the recipe that the ingredient is in  from query
		            Iobjects [i1]= new Ingredient(iname,inumber); //Initializing an ingredient's object with info from sql query
		            i1++; 
		        	}
		          
		        }
	       
	    }
	        
	}
	}
	    catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("not opreating");

	    }


	



}
}
