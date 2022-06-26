import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello, This is Recipe finder program");
	     String ingredient1;
	     String ingredient2;
	     String ingredient3;


	 
	     Scanner in = new Scanner(System.in);
	 
	     //Get input String
	     System.out.println("Enter first ingredient: ");
	     ingredient1 = in.nextLine();
	     System.out.println("First ingredient is: "+ingredient1);
	 
	     //Get input String
	     System.out.println("Enter second ingredient: ");
	     ingredient2 = in.nextLine();
	     System.out.println("Second ingredient is: "+ingredient2);
	 
	     //Get input String
	     System.out.println("Enter third ingredient: ");
	     ingredient3 = in.nextLine();
	     System.out.println("Third ingredient is: " + ingredient3);
	     compareingredints(ingredient1,ingredient2,ingredient3);
	}
	
	public static void compareingredints (String in1, String in2, String in3) {
	    Recipe.main(null);	
	    int counterforingridents=0;
	    String [] Arrayofinput = new String[] {in1,in2,in3};
	    boolean foundrecipe=false;
	    Ingredient [] matchingIngridents = new Ingredient [Recipe.Iobjects.length];
	    for(int j=0;j<Arrayofinput.length;j++) {
	    	
	    	  for(int i=0;i<Recipe.Iobjects.length;i++) {
	  	    	if(Arrayofinput[j].equalsIgnoreCase(Recipe.Iobjects[i].GetIngredientName(Recipe.Iobjects[i]))) {
	  	    	//System.out.println("Hello class, Recipe number is:" + Recipe.Iobjects[i].GetIngredientRecipeNumber(Recipe.Iobjects[i]));
	  	    	//System.out.println("Hello class, Ingredient name is:" + Recipe.Iobjects[i].GetIngredientName(Recipe.Iobjects[i]));	
	  	    	if(counterforingridents<Recipe.Iobjects.length) {
	  	    		matchingIngridents[counterforingridents]=new Ingredient(Recipe.Iobjects[i].GetIngredientName(Recipe.Iobjects[i]), Recipe.Iobjects[i].GetIngredientRecipeNumber(Recipe.Iobjects[i]));
	  	    		counterforingridents++;
	  	    		
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
  		  		  				  
  		  		  			System.out.println("Recipe name is " + Recipe.Robjects[j].GetRecipeName(Recipe.Robjects[j]));
  		  		  	    	System.out.println("Recipe number is " + Recipe.Robjects[j].GetRecipeNumber(Recipe.Robjects[j]));
  		  		  	    	System.out.println("Recipe instructions are " + Recipe.Robjects[j].GetRecipeInstructions(Recipe.Robjects[j]));
  		  			     foundrecipe=true;


  		  		  				  
  		  		  			  }
  		  			  }

  				  }
  			  }
  			  
  			  
  		  }
  	  }
	  

	}
}
}
	  if(!foundrecipe) {
	  	  System.out.println("Recipe was not found");
	  	  
		}
	}
}
