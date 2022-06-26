import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Recipe {
	
	String RecipeName;
	String RecipeInstructions;
	int RecipeNumber;
	  static Recipe [] Robjects= new Recipe [3];
	  static Ingredient [] Iobjects= new Ingredient [39];

	  
	public Recipe(String Rname, String RInstructions, int RNumber) {
		RecipeName=Rname;
		RecipeInstructions=RInstructions;
		RecipeNumber=RNumber;
		
	}
	
	public String GetRecipeName(Recipe r) {
		return r.RecipeName;
	}
	
	public String GetRecipeInstructions(Recipe r) {
		return r.RecipeInstructions;
	}
	
	
	public int GetRecipeNumber(Recipe r) {
		return r.RecipeNumber;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConnectionToSQL ConnectingToDatabase = new ConnectionToSQL();

		
	    Recipe[] RRObjects= new Recipe[3];

	try(Statement statement = ConnectingToDatabase.connection.createStatement()){
	    String Recipelist = "select * from Recipe";
	    String AllIngredients = "select * from Ingredients_List";

	    try(ResultSet result = statement.executeQuery(Recipelist)){
	    	
	    	int i=0;
	        while(result.next()) {
	        	
	        	if(result!=null  & i<Robjects.length) {
	            String rname = result.getString("recipe_title");
	            int rnumber = result.getInt("recipe_number");
	            String rinstructions = result.getString("recipe_instructions");
	            Robjects [i]= new Recipe(rname,rinstructions, rnumber);
	            i++; 
	        	}
	          
	        }
	        
	        try(ResultSet result1 = statement.executeQuery(AllIngredients)){
		    	
		    	int i1=0;
		        while(result1.next()) {
		        	
		        	if(result1!=null  & i<Iobjects.length) {
		            String iname = result1.getString("list_of_ingredients");
		            int inumber = result1.getInt("recipe_number_fk");
		          //  System.out.println(iname+" " + inumber);
		            Iobjects [i1]= new Ingredient(iname,inumber);
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
