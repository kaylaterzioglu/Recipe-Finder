import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class GUI {

	public static void main(String[] args) {
		System.out.println("Hello, This is Recipe finder program");
	     String ingredient1; // The first ingredient the user inputs
	     String ingredient2; // The second ingredient the user inputs
	     String ingredient3; // The third ingredient the user inputs


	 
	     Scanner in = new Scanner(System.in);
	 
	     //Get input String
	     System.out.println("Enter first ingredient: "); // Prompting the user to input first ingredient
	     ingredient1 = in.nextLine();
	     System.out.println("First ingredient is: "+ingredient1); // Displaying the first ingredient
	 
	     //Get input String
	     System.out.println("Enter second ingredient: ");  // Prompting the user to input second ingredient
	     ingredient2 = in.nextLine();
	     System.out.println("Second ingredient is: "+ingredient2); // Displaying the second ingredient
		
	 
	     //Get input String
	     System.out.println("Enter third ingredient: "); // Prompting the user to input second ingredient
	     ingredient3 = in.nextLine();
	     System.out.println("Third ingredient is: " + ingredient3); // Displaying the third ingredient
	     compareingredints(ingredient1,ingredient2,ingredient3); // Calling the method that takes the user input and process it to output the recipe if founded. 
	}
	
	public static void compareingredints (String in1, String in2, String in3) {
	    Recipe.main(null);	// Calling the main method of Recipe class to initialize recipes and ingredients. 
	    int counterforingridents=0;
	    boolean RecipeIsFound = false; //boolean value that turns to true if the recipe is found. 
	    String [] Arrayofinput = new String[] {in1,in2,in3}; //Array that stores inputed ingredients.
	    Ingredient [] matchingIngridents = new Ingredient [Recipe.Iobjects.length]; //Array that stores ingredients in the database that matches any of the inputed ingredients .
	    for(int j=0;j<Arrayofinput.length;j++) {
	    	
	    	  for(int i=0;i<Recipe.Iobjects.length;i++) {
	  	    	if(Arrayofinput[j].equalsIgnoreCase(Recipe.Iobjects[i].GetIngredientName(Recipe.Iobjects[i]))) { // if the ingredients that was inputed matches an ingredient in the database
	  	    	if(counterforingridents<Recipe.Iobjects.length) { // # of matching ingredients doesn't exceed the # of ingredients in the database
	  	    		matchingIngridents[counterforingridents]=new Ingredient(Recipe.Iobjects[i].GetIngredientName(Recipe.Iobjects[i]), Recipe.Iobjects[i].GetIngredientRecipeNumber(Recipe.Iobjects[i])); //input all the matching ingredients in the array. 
	  	    		counterforingridents++; //increase index for the recipe 
	  	    		
	  	    	}
	  	    	}
	  	    }
	    	  
	    	  
	    

	    }
	  
		  
  	  for(int i=0;i<matchingIngridents.length;i++ ) {
  		  for(int j=0;j<Recipe.Robjects.length;j++) {
  			  if(matchingIngridents[i]!=null && matchingIngridents[i].GetIngredientRecipeNumber(matchingIngridents[i])==Recipe.Robjects[j].RecipeNumber ) {
  				  for(int i2=i+1;i2<matchingIngridents.length;i2++){{
  		  			  if(matchingIngridents[i2]!=null && matchingIngridents[i2].GetIngredientRecipeNumber(matchingIngridents[i2])==Recipe.Robjects[j].RecipeNumber  ) {		  
  		  				 for(int i3=i2+1;i3<matchingIngridents.length;i3++){{
  		  		  			  if( matchingIngridents[i3]!=null && matchingIngridents[i3].GetIngredientRecipeNumber(matchingIngridents[i3])==Recipe.Robjects[j].RecipeNumber) {
  		  		  			RecipeIsFound=true; //recipe was found so boolean value turns to true
  		  		  			System.out.println("Recipe name is " + Recipe.Robjects[j].GetRecipeName(Recipe.Robjects[j]));
  		  		  	    	System.out.println("Recipe number is " + Recipe.Robjects[j].GetRecipeNumber(Recipe.Robjects[j]));
  		  		  	    	System.out.println("Recipe instructions are " + Recipe.Robjects[j].GetRecipeInstructions(Recipe.Robjects[j]));


  		  		  				  
  		  		  			  }
  		  			  }

  				  }
  			  }
  			  
  			  
  		  }
  	  }
	  

	}
}
}
  	if(!RecipeIsFound) {  // checks if recipe is not found
	  	  System.out.println("Recipe was not found"); // displays message
	  }
	}
}
