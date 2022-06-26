CREATE DATABASE IF NOT EXISTS recipe_finder_database;
USE recipe_finder_database;

CREATE TABLE Recipe (

	recipe_number int4  AUTO_INCREMENT,
    recipe_title VARCHAR(50),
    recipe_instructions text,
number_of_ingredients int,
    CONSTRAINT recipe_pk PRIMARY KEY (recipe_number)

    
);

CREATE TABLE Ingredients_List (
	
    ingredient VARCHAR(150),
    recipe_number_fk int4,
    FOREIGN KEY (recipe_number_fk) REFERENCES Recipe(recipe_number),
    PRIMARY KEY(list_of_ingredients,recipe_number_fk)
    
);


INSERT INTO Recipe (recipe_title, recipe_instructions, number_of_ingredients ) values ("PUMPKIN CREAM CHEESE SWIRL CAKE
", "Preheat oven to 325°. Grease a 9” x 5” loaf pan. (For extra insurance against sticking, you can also line the pan with a layer of parchment paper before greasing; this is optional.)
Whisk together the dry ingredients for the cake batter in a medium bowl: 1 ½ cups flour, baking soda, baking powder, salt and pumpkin pie spice.
In a separate large bowl, whisk the 2 eggs until slightly frothy. Add in the brown sugar and ½ cup granulated sugar, whisk until smooth and sugar begins to dissolve. Whisk in the pumpkin, oil, and 1 teaspoon vanilla. Add the dry ingredients gradually, whisking to combine after each addition. Continue to whisk just until the batter is smooth, set aside. 
Add the softened cream cheese to the bowl of a stand mixer or separate medium bowl (you can use the same bowl that was used to mix the dry ingredients!). Using the stand mixer or electric beaters, beat the cream cheese on medium speed for about 30 seconds, then add the remaining ½ cup granulated sugar and beat until smooth, scraping the bowl down as necessary. Beat in the remaining 1 egg and ½ teaspoon vanilla. Sprinkle in the remaining ¼ cup flour and beat until just combined.
Add a thick layer of the pumpkin mixture to the bottom of the greased loaf pan, spreading the batter out toward the edges of the pan. Then add a scoop of the cream cheese mixture directly on top of the pumpkin mixture. Continue adding large scoops of the pumpkin and cream cheese batters directly on top of one another until all the batter is in the pan. Wiggle the pan gently to help level out the top. (See notes section for more tips on creating the layers.)
Bake in the preheated oven for 65 - 75 minutes or until the top of the cake is firm and cracked. Let the cake cool in the pan for 15 minutes, then remove it to a wire rack to finish cooling.", 12);

INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("flour",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("baking powder",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("baking soda",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("fine salt",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("pumpkine pie spice",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("eggs",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("granulated sugur",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("brown sugar",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("vegetable oil",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("pumpkin puree",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("vanilla",1);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("cream cheese",1);

INSERT INTO Recipe (recipe_title, recipe_instructions, number_of_ingredients ) values ("BANANA BREAD"
, "1. Preheat the oven to 325 F (160 C) and grease a 9-x-5-inch (2L) loaf pan.

2. Whisk the banana, melted butter, granulated and brown sugar together until well-blended.  Whisk in the egg and vanilla. 

3. In a separate bowl, sift the flour, baking soda and salt. Add this to the banana mixture and stir just until blended.  Stir in the chocolate chips or walnut pieces (if using).  Scrape the batter into the prepared loaf tin and sprinkle the top with a little sugar. Bake for about 75 minutes, until a tester inserted in the centre of the cake comes out clean.  Cool the cake for 20 minutes in the tin, then turn it out to cool completely on a cooling rack.

The banana bread will keep, well-wrapped for up to 3 days.
", 10);

INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("flour",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("Chocolate Chips",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("baking soda",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("fine salt",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("ripe bananas",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("eggs",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("granulated sugur",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("brown sugar",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("Butter",2);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("vanilla extract",2);

INSERT INTO Recipe (recipe_title, recipe_instructions, number_of_ingredients ) values ("Chicken and Rice "
, "
Note: A 3-quart saucepan or Dutch oven with a tight fitting lid is highly recommended for this recipe.
Pat the cubed chicken completely dry and season with salt, pepper, and Italian seasoning.
Heat 2 tbsps. butter in a skillet over medium heat. Add the onions and toss to coat. Soften for 4 minutes. Add the garlic and cook for 1 minute.
Increase heat to medium-high and add the chicken and 2 tbsp. butter. Toss to coat and let it sit, undisturbed, for 3-4 minutes to get a golden sear on one side. Toss and let it sear for 3 more minutes.
Add the wine and let it reduce for 3 more minutes, until just a little liquid remains. Use a silicone spatula to “clean” the bottom and sides of the pot with the wine, this will make the dish more flavorful.
Add the seasonings for the rice. Add the chicken broth and bring it to a boil. Add the rice and submerge it into the liquid. Return to a boil and cover tightly. Reduce to a gentle simmer (medium-low), and let the rice steam for 20 minutes.
Taste-test the rice for doneness. Optional: You may choose to remove it from the heat and let it sit with the lid on for 10 minutes. This makes the rice extra fluffy, and allows any rice stuck to the bottom of the pot to release naturally. Refrain from stirring as this will release starch and make it sticky.
Set the heat to low and add the half in half in small splashes, stirring it in gently. Add the Parmesan cheese and stir to incorporate.
Add the spinach and stir to combine. Let the spinach wilt and the sauce thicken for 3 minutes, then remove from heat. Stir in the lemon juice and serve!
", 10);

INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("yellow onion",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("garlic cloves",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("chicken breast",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("salt",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("pepper",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("italian seasoning",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("white wine",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("chicken broth",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("white rice",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("half and half",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("parmesan cheese",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("spinach",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("lemon juice",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("dried parsley",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("mustard powder",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("paprika",3);
INSERT INTO Ingredients_List ( list_of_ingredients, recipe_number_fk)  values ("dried oregano",3);

