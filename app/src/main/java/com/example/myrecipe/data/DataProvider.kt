package com.example.myrecipe.data

import com.example.myrecipe.R

object DataProvider {

    val recipeList = listOf(
        Recipe(
            id = 2,
            title = "Omelette",
            meal = "Breakfast",
            serves = "1 Person",
            description = "Here's a simple recipe for preparing a classic omelette:\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "\n" +
                    "3 large eggs\n" +
                    "2 tablespoons milk or water\n" +
                    "Salt and pepper to taste\n" +
                    "1 tablespoon butter or cooking oil\n" +
                    "Fillings of your choice (e.g., grated cheese, chopped vegetables, cooked meats, herbs)\n" +
                    "\n"+
                    "Instructions:\n" +
                    "\n" +
                    "1. Crack the eggs into a bowl and whisk them until the yolks and whites are well combined.\n" +
                    "\n" +
                    "2. Add the milk or water to the eggs and whisk again. The addition of milk or water helps create a lighter and fluffier omelette.\n" +
                    "\n" +
                    "3. Season the egg mixture with salt and pepper according to your taste. Mix well.\n" +
                    "\n" +
                    "4. Heat a non-stick skillet or omelette pan over medium heat. Add the butter or cooking oil and let it melt, ensuring it coats the entire surface of the pan.\n" +
                    "\n" +
                    "5. Once the butter has melted and the pan is hot, pour the whisked egg mixture into the pan. Allow it to spread evenly across the surface.\n" +
                    "\n" +
                    "6. As the eggs begin to set, gently push the cooked edges toward the center using a spatula. Tilt the pan to allow the uncooked eggs to flow to the edges.\n" +
                    "\n" +
                    "7. When the top of the omelette is still slightly runny but mostly set, add your desired fillings on one side of the omelette.\n" +
                    "\n" +
                    "8. Using the spatula, carefully fold the empty side of the omelette over the side with the fillings, creating a half-moon shape.\n" +
                    "\n" +
                    "9. Cook for another minute or so to ensure the fillings are heated through and any cheese has melted.\n" +
                    "\n" +
                    "10. Slide the omelette onto a plate, folding it in half if necessary, and serve immediately.\n" +
                    "\n" +
                    "This recipe will serve 1 person. You can garnish the omelette with fresh herbs, such as chopped parsley or chives, if desired. Serve it as is or with toast, salad, or any sides of your choice. Feel free to experiment with different fillings to create your own delicious omelette variations.",
            recipeImageId = R.drawable.omlette
        ),
        Recipe(
            id = 2,
            title = "Rice Beef Stew",
            meal = "Lunch",
            serves = "4 People",
            description = "Learn how to prepare yout favorite rice and beef stew:\n" +
                    "Here's a recipe for preparing rice and beef stew:\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "\n" +
                    "1 lb (450g) beef stew meat, cubed\n" +
                    "1 onion, chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "2 carrots, peeled and chopped\n" +
                    "2 celery stalks, chopped\n" +
                    "2 tablespoons vegetable oil\n" +
                    "2 tablespoons all-purpose flour\n" +
                    "2 cups beef broth\n" +
                    "1 cup diced tomatoes\n" +
                    "1 teaspoon dried thyme\n" +
                    "1 teaspoon paprika\n" +
                    "Salt and pepper to taste\n" +
                    "2 cups cooked rice\n" +
                    "\n"+
                    "Instructions:\n" +
                    "\n" +
                    "1. Heat the vegetable oil in a large pot or Dutch oven over medium-high heat.\n" +
                    "\n" +
                    "2. Add the beef stew meat to the pot and cook until browned on all sides. Remove the meat from the pot and set it aside.\n" +
                    "\n" +
                    "3. In the same pot, add the chopped onion, minced garlic, carrots, and celery. Sauté until the vegetables are slightly softened, about 5 minutes.\n" +
                    "\n" +
                    "4. Sprinkle the flour over the vegetables and stir well to coat everything. Cook for an additional minute to cook off the raw flour taste.\n" +
                    "\n" +
                    "5. Slowly pour in the beef broth while stirring constantly. This will help to create a smooth sauce.\n" +
                    "\n" +
                    "6. Add the diced tomatoes, dried thyme, paprika, salt, and pepper to the pot. Stir everything together.\n" +
                    "\n" +
                    "7. Return the browned beef stew meat to the pot. Stir well to combine with the vegetables and sauce.\n" +
                    "\n" +
                    "8. Bring the stew to a boil, then reduce the heat to low. Cover the pot and simmer for about 1.5 to 2 hours, or until the beef is tender and the flavors have melded together.\n" +
                    "\n" +
                    "9. While the stew is simmering, prepare the rice according to the package instructions or your preferred method.\n" +
                    "\n" +
                    "10. Once the beef stew is cooked and the flavors have developed, taste and adjust the seasoning if needed.\n" +
                    "\n" +
                    "11. Serve the beef stew over a bed of cooked rice. Enjoy!\n" +
                    "\n" +
                    "This recipe will make approximately 4 servings of rice and beef stew. Feel free to adjust the ingredients and quantities based on your preferences and the number of people you are serving.",
            recipeImageId = R.drawable.riceandbeefstew
        ),
        Recipe(
            id = 3,
            title = "Spaghetti Bolognese",
            meal = "Supper",
            serves = "4 People",
            description = "Here's a recipe for preparing spaghetti with minced meat (also known as spaghetti bolognese):\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "\n" +
                    "8 ounces (225g) spaghetti\n" +
                    "1 lb (450g) ground beef or minced meat\n" +
                    "1 onion, chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "1 carrot, grated\n" +
                    "1 celery stalk, chopped\n" +
                    "1 can (14 oz or 400g) diced tomatoes\n" +
                    "2 tablespoons tomato paste\n" +
                    "1 teaspoon dried oregano\n" +
                    "1 teaspoon dried basil\n" +
                    "1/2 teaspoon sugar\n" +
                    "Salt and pepper to taste\n" +
                    "Grated Parmesan cheese (optional)\n" +
                    "Fresh basil or parsley for garnish (optional)\n" +
                    "\n" +
                    "Instructions:\n" +
                    "\n" +
                    "1. Cook the spaghetti according to the package instructions until al dente. Drain and set aside.\n" +
                    "\n" +
                    "2. In a large skillet or saucepan, heat some olive oil over medium heat.\n" +
                    "\n" +
                    "3. Add the chopped onion and minced garlic to the pan. Sauté until the onion becomes translucent and the garlic is fragrant, about 2-3 minutes.\n" +
                    "\n" +
                    "4. Add the ground beef or minced meat to the pan. Break it up with a spatula or wooden spoon and cook until it's browned and cooked through.\n" +
                    "\n" +
                    "5. Add the grated carrot and chopped celery to the pan. Sauté for a few minutes until the vegetables start to soften.\n" +
                    "\n" +
                    "6. Stir in the diced tomatoes, tomato paste, dried oregano, dried basil, sugar, salt, and pepper. Mix well to combine all the ingredients.\n" +
                    "\n" +
                    "7. Reduce the heat to low and let the sauce simmer for about 15-20 minutes, stirring occasionally to ensure the flavors meld together.\n" +
                    "\n" +
                    "8. While the sauce is simmering, you can taste and adjust the seasoning if needed.\n" +
                    "\n" +
                    "9. Once the sauce has thickened and the flavors have developed, it's time to serve. Place a portion of cooked spaghetti on a plate or bowl and top it with a generous amount of the minced meat sauce.\n" +
                    "\n" +
                    "10. If desired, sprinkle grated Parmesan cheese over the top of each serving. You can also garnish with fresh basil or parsley for added freshness.\n" +
                    "\n" +
                    "11. Serve the spaghetti and minced meat hot and enjoy!\n" +
                    "\n" +
                    "This recipe will make approximately 4 servings of spaghetti with minced meat. Feel free to adjust the quantities of the ingredients based on your preferences and the number of people you are serving.",
            recipeImageId = R.drawable.spaghettibolognese
        ),
        Recipe(
            id = 4,
            title = "Beef and Bacon Burgers",
            meal = "Lunch",
            serves = "6",
            description = "1. Preheat the grill. Put the beef, onion, garlic (if using). breadcrumbs, sage and egg into a bowl, season to taste with salt and pepper and mix well until thoroughly combined.\n" +
                    "Divide the mixture into six equal portions and shape into balls, then gently flatten into patties.\n" +
                    "2. Wrap a bacon rasher around each patty and secure with a wooden cocktail stick.\n" +
                    "3. Brush one side of each burger with a little of the melted butter and cook under the preheated grill for 5 minutes. \n" +
                    "4. Carefully turn the burgers with a spatula, brush with the remaining melted butter and grill for a further 4-5 minutes, unti cooked to your liking.\n" +
                    "Carefully transfer the burgers to warmed individual plates, then remove and discard the cocktail sticks. Serve immediately.\n" +
                    "\n" +
                    "* 650 g/1 lb 7 oz fresh beef mince\n" +
                    "* 1 large onion, very finely chopped\n" +
                    "* 1 garlic clove, very finely chopped (optional)\n" +
                    "85 q/3 oz fresh breadcrumbs\n" +
                    "2 tsp chopped fresh sage\n" +
                    "1 large egg, lightly beaten\n" +
                    "6 bacon rashers\n" +
                    "40 g/1½ oz butter, melted\n" +
                    "* salt and pepper",
            recipeImageId = R.drawable.beefandbaconburger
        ),
        Recipe(
            id = 5,
            title = "Quick Curry",
            meal = "Lunch",
            serves = "Serves 4",
            description = "1. Heat half the oil in a large saucepan. Add the onion, green pepper, cumin seeds, cardamom pods and bay leaves and cook over a low heat, stirring constantly, for 2-3 minutes, until the spices give off their aroma. Add the tomatoes and cook, stirring frequently, for 10 minutes.\n" +
                    "2. Meanwhile, heat the remaining oil in a frying pan. Add the garlic and cook, stirring frequently, for 1 minute, then add the beef, ground coriander, turmeric and chilli powder. Cook over a medium heat, stirring constantly and breaking up the meat with a wooden spoon, for 4-5 minutes, until the meat is evenly browned. Transfer the mixture to the saucepan.\n" +
                    "3. Pour in the stock and bring to the boil, then reduce the heat, cover and simmer, stirring occasionally, for 20-25 minutes.If the mixture seems to be drying out, add a little water.\n" +
                    "4. Remove and discard the bay leaves and cardamom pods, then season to taste with salt. Scatter over the chopped coriander and serve immediately with rice and naan bread.\n" +
                    "\n" +
                    "Serves 4\n" +
                    "4 tbsp groundnut oil\n" +
                    "* 1 large onion, finely chopped 1 green pepper, deseeded and diced\n" +
                    "1 tsp cumin seeds\n" +
                    "4 green cardamom pods\n" +
                    "2 bay leaves\n" +
                    "500 g/1 lb 2 oz tomatoes, peeled and chopped\n" +
                    "72 garlic cloves, finely chopped\n" +
                    "* 450 g/1 lb fresh beef mince\n" +
                    "2 tsp ground coriander\n" +
                    "2 tsp ground turmeric\n" +
                    "1 tsp chilli powder\n" +
                    "600 ml/1 pint beef stock\n" +
                    "2 tbsp chopped fresh coriander salt\n" +
                    "cooked rice and naan bread, to serve",
            recipeImageId = R.drawable.quickcurry
        ),
        Recipe(
            id = 6,
            title = "Spaghetti and Meatballs",
            meal = "Supper",
            serves = "Serves 4",
            description = "Ingredients\n" +
                    "For the sauce\n" +
                    "1 tbsp olive oil\n" +
                    "1 brown onion, chopped\n" +
                    "1 garlic clove, finely chopped\n" +
                    "1 tsp dried mixed herbs\n" +
                    "400g tin tomatoes\n" +
                    "500ml/18fl oz vegetable or beef stock (from a cube)\n" +
                    "400g/14oz dried spaghetti\n" +
                    "salt and pepper\n" +
                    "For the meatballs\n" +
                    "400g/14oz beef mince\n" +
                    "1 garlic clove, finely chopped\n" +
                    "½ tsp dried mixed herbs\n" +
                    "1 tbsp olive oil" +
                    "Method\n" +
                    "Heat a large saucepan over a medium heat and add the olive oil. Once hot, add the onion and cook gently without browning for 4–5 minutes, or until softened and translucent. Add the garlic, continue to cook for 2 minutes until aromatic, then add the dried herbs, tomatoes and stock. Bring the sauce to a simmer, reduce the heat and simmer gently while you make the meatballs.\n" +
                    "\n" +
                    "For the meatballs, mix together the beef, garlic and herbs along with a decent pinch of salt and pepper. Using wet hands roll into 20 balls.\n" +
                    "\n" +
                    "Heat a frying pan over a medium heat and add the olive oil. Once hot, fry the meatballs on all sides until nicely coloured, being careful not to burn them. You may need to do this in batches. Transfer to the saucepan containing the sauce.\n" +
                    "\n" +
                    "Continue to simmer the sauce for 10 minutes while you cook the spaghetti.\n" +
                    "\n" +
                    "Bring a large saucepan water to the boil, add a pinch of salt and cook the spaghetti according to the packet instructions. Once cooked, drain and tip into the saucepan with the meatball sauce. Mix well and serve hot.",
            recipeImageId = R.drawable.spaghettiandmeatballs
        ),
        Recipe(
            id = 7,
            title = "Iced Mocha and Pancake",
            meal = "Breakfast",
            serves = "2",
            description = "",
            recipeImageId = R.drawable.icedmochaandpancake
        ),
        Recipe(
            id = 8,
            title = "Toast Bread and Avocado",
            meal = "Breakfast",
            serves = "Serves 2",
            description = "Ingredient Notes\n" +
                    "Milk: By default, Starbucks uses 2% milk in their coffee drinks, but you can use any milk you’d like including non-dairy milks. The higher fat your milk, the richer and creamier your drink will be.\n" +
                    "Homemade chocolate syrup: Instead of using store-bought chocolate syrup or hot chocolate mix as many homemade recipes do, you’ll make a quick syrup of cocoa powder, sugar, and water to flavor the mocha base.\n" +
                    "Heavy cream: Cream is optional, but a little splash adds a really delicious richness to the coffee. For leftover heavy cream, check out my post What to Do With Leftover Whipping Cream for storage tips and recipe ideas for the leftovers. " +
                    "How to Make an Iced Mocha at Home\n" +
                    "1.  First, you’ll whisk together sugar, cocoa powder, and a little milk on the stove over medium heat until the sugar dissolves and you get a smooth chocolate syrup.\n" +
                    "\n" +
                    "2. Then you just mix a bit more milk and cold coffee into the syrup, stir, and pour over ice.\n" +
                    "\n" +
                    "3. Top with whipped cream if desired, and if you’d like to garnish your mocha with fudge sauce as I did in the photos, this is the fudge sauce recipe I used." +
                    "How to Make Pancakes\n" +
                    "You'll find a detailed ingredient list and step-by-step instructions in the recipe below, but let's go over the basics:\n" +
                    "\n" +
                    "Pancake Ingredients\n" +
                    "You likely already have everything you need to make this pancake recipe. If not, here's what to add to your grocery list:\n" +
                    "\n" +
                    "· Flour: This homemade pancake recipe starts with all-purpose flour.\n" +
                    "· Baking powder: Baking powder, a leavener, is the secret to fluffy pancakes.\n" +
                    "· Sugar: Just a tablespoon of white sugar is all you'll need for subtly sweet pancakes.\n" +
                    "· Salt: A pinch of salt will enhance the overall flavor without making your pancakes taste salty.\n" +
                    "· Milk and butter: Milk and butter add moisture and richness to the pancakes.\n" +
                    "· Egg: A whole egg lends even more moisture. Plus, it helps bind the pancake batter together.\n" +
                    "\n" +
                    "How to Make Pancakes From Scratch\n" +
                    "It's not hard to make homemade pancakes — you just need a good recipe. That's where we come in! You'll find the step-by-step recipe below, but here's a brief overview of what you can expect:\n" +
                    "\n" +
                    "1. Sift the dry ingredients together.\n" +
                    "2. Make a well, then add the wet ingredients. Stir to combine.\n" +
                    "3. Scoop the batter onto a hot griddle or pan.\n" +
                    "4. Cook for two to three minutes, then flip.\n" +
                    "5. Continue cooking until brown on both sides.\n" +
                    "\n" +
                    "When to Flip Pancakes\n" +
                    "Your pancake will tell you when it's ready to flip. Wait until bubbles start to form on the top and the edges look dry and set. This will usually take about two to three minutes on each side.",
            recipeImageId = R.drawable.toastbreadandavocado
        ),
        Recipe(
            id = 9,
            title = "Beef Samosas",
            meal = "Breakfast",
            serves = "Serves 28",
            description = "Ingredients\n" +
                    "2 large potatoes, peeled\n" +
                    "\n" +
                    "1 cup frozen peas, thawed\n" +
                    "\n" +
                    "2 tablespoons vegetable oil\n" +
                    "\n" +
                    "½ teaspoon cumin seeds\n" +
                    "\n" +
                    "1 bay leaf, crushed\n" +
                    "\n" +
                    "1 pound ground beef\n" +
                    "\n" +
                    "2 large onions, finely chopped\n" +
                    "\n" +
                    "4 cloves garlic, crushed\n" +
                    "\n" +
                    "1 tablespoon minced fresh ginger root\n" +
                    "\n" +
                    "1 ½ teaspoons salt\n" +
                    "\n" +
                    "1 teaspoon ground cumin\n" +
                    "\n" +
                    "1 teaspoon ground coriander\n" +
                    "\n" +
                    "1 teaspoon ground turmeric\n" +
                    "\n" +
                    "1 teaspoon chili powder\n" +
                    "\n" +
                    "½ teaspoon ground cinnamon\n" +
                    "\n" +
                    "½ teaspoon ground cardamom\n" +
                    "\n" +
                    "½ teaspoon ground black pepper\n" +
                    "\n" +
                    "1 quart oil for deep frying\n" +
                    "\n" +
                    "2 tablespoons chopped fresh cilantro\n" +
                    "\n" +
                    "2 tablespoons chopped green chile peppers\n" +
                    "\n" +
                    "1 (16 ounce) package phyllo dough\n" +
                    "\n" +
                    "Local Offers\n" +
                    "00000 Change\n" +
                    "Oops! We cannot find any ingredients on sale near you. Do we have the correct zip code?\n" +
                    "ADVERTISEMENT\n" +
                    "Directions\n" +
                    "Bring a medium saucepan of lightly salted water to a boil. Stir in potatoes and peas; cook until potatoes are tender but still firm, about 15 minutes. Drain, mash together, and set aside.\n" +
                    "\n" +
                    "Meanwhile, heat 2 tablespoons oil in a large saucepan over medium-high heat. Add cumin seeds and bay leaf; stir until fragrant and seeds are browned. Add ground beef and onions; cook until beef is browned and crumbly and onions are soft, about 5 to 7 minutes.\n" +
                    "\n" +
                    "Stir in garlic and ginger. Season with salt, cumin, coriander, turmeric, chili powder, cinnamon, cardamom, and black pepper. Stir in the mashed potato mixture. Remove from heat and chill in the refrigerator for 1 hour, or until cool.\n" +
                    "\n" +
                    "Heat 1 quart of oil in a deep saucepan over medium heat.\n" +
                    "\n" +
                    "Mix cilantro and green chile peppers into potato and beef mixture. Place approximately 1 tablespoon of the mixture onto each phyllo sheet. Fold sheets into triangles, pressing edges together with moistened fingers.\n" +
                    "\n" +
                    "Lower samosas carefully into the hot oil in batches. Fry until golden brown, about 3 minutes. Transfer to a paper towel-lined plate to drain. Repeat with remaining samosas. Serve warm.\n" +
                    "\n" +
                    "Tips\n" +
                    "Chicken livers may be substituted for beef if you prefer.",
            recipeImageId = R.drawable.beefsamosa
        ),
        Recipe(
            id = 10,
            title = "Beef and Pine Kernel Triangles",
            meal = "Breakfast",
            serves = "Serves 15",
            description = "1. Heat the oil in a large frying pan. Add the onion and garlic and cook over a low heat, stirring occasionally, for 5 minutes, until softened. Stir in the ground coriander and cumin and cook, stirring occasionally, for a further 3 minutes. Add the beef, half the mint and the pine kernels, increase the heat to medium and cook, stirring and breaking up the meat with a wooden spoon, for 8-10 minutes, until evenly browned.\n" +
                    "Season to taste with salt and remove the pan from the heat.\n" +
                    "2. Meanwhile, cook the potatoes in a saucepan of salted boiling water for 15-20 minutes, until tender but not falling apart.\n" +
                    "Drain the potatoes, tip into a bowl and mash well, then stir in the cheese until melted. Stir in the beef mixture.\n" +
                    "3. Preheat the oven to 200°C/400°F/Gas Mark 6. Brush two baking sheets with a little of the melted butter. Brush one sheet of filo with a little melted butter, put a second sheet on top and brush with more melted butter. Cut the double layer lengthways into three strips. Put a heaped tablespoon of the filling near one end of a strip, then fold over the corner to form a triangle. Continue to fold over in triangles to make a neat parcel, then place on a prepared baking sheet. Make 14 more triangles in the same way. Brush the triangles with the remaining melted butter and bake in the preheated oven for\n" +
                    "8-10 minutes, until golden brown.\n" +
                    "4. Meanwhile, stir the remaining mint into the tomato sauce and reheat gently. Serve the pastry triangles with the tomato\n" +
                    "sauce.\n" +
                    "\n" +
                    "Makes 15\n" +
                    "1 tbsp olive oil\n" +
                    "* 1 small onion, chopped\n" +
                    "* 2 garlic cloves, finely chopped 1 tsp ground coriander\n" +
                    "1 tsp ground cumin\n" +
                    "* 300 q/10½ oz fresh beef mince\n" +
                    "4 tbsp chopped fresh mint\n" +
                    "2 tbsp pine kernels\n" +
                    "2 potatoes, cut into chunks\n" +
                    "55 g/2 oz Kefalotiri or Cheddar cheese, grated\n" +
                    "115 g/4 oz butter, melted\n" +
                    "10 sheets filo pastry\n" +
                    "1 quantity Tomato Sauce\n" +
                    "*salt",
            recipeImageId = R.drawable.beefandpinekerneltriangles
        ),
        Recipe(
            id = 11,
            title = "Beef Pilau",
            meal = "Supper",
            serves = " Serves 4-6",
            description = "INGREDIENTS USED TO MAKE SWAHILI BEEF PILAU\n" +
                    "1. Basmati rice. I normally use Basmati rice as the base for the pilau. It’s naturally fragrant and tends to absorb spices and flavors very well. You’re free to use any type of rice that’s available to you but I highly recommend trying basmati rice. Make sure to wash the rice thoroughly.\n" +
                    "2. Beef meat. This is a beef pilau and I’ll be using beef as my meat option. You want to boil the beef beforehand to save on time and also keep the broth as we’ll use it later. Boil your beef in garlic and ginger for flavor.\n" +
                    "3. Pilau Masala Spice. You can definitely make this at home which I recommend. You’d need the following spices. Then use about a teaspoon in the pilau.\n" +
                    "\t\tCumin\n" +
                    "\t\tCardamom\n" +
                    "\t\tCloves\n" +
                    "\t\tBlack peppercorn\n" +
                    "\t\tCinnamon sticks\n" +
                    "4. Onions. You’ll need lots of diced onions. The more the better. Onions are the game changer to how your Pilau will turn out. They’re also the secret to having brown pilau. I recommend using red onions and not spring onions.\n" +
                    "5. Pure Mountain Herb Infused Canola Oil. You’ll definitely need cooking oil to make this pilau. I highly recommend using this Canola oil from Pure Mountain as it is infused with rosemary, thyme and black pepper which will add more flavor to the pilau. Don’t be shy with the oil when frying the onions and by using canola oil this is a healthier option to vegetable oils. Canola oil is rich in Omega 3,6 & 9, high in vitamin E and antioxidants and since it’s rich in monounsaturated it’s a healthy option.\n" +
                    "6. Potatoes. These are OPTIONAL but authentic Swahili pilau requires to have potatoes. Keep them big and whole.\n" +
                    "7. Garlic. What’s food without garlic? You’ll need some garlic when boiling the meat and when cooking the pilau.\n" +
                    "8. Beef broth or Water. While boiling your meat save some broth and if it’s not enough add some water. Use this broth and water to cook the rice.\n" +
                    "\n" +
                    "STEP BY STEP DIRECTION ON MAKING AUTHENTIC SWAHILI PILAU\n" +
                    "HOW TO MAKE BROWN PILAU\n" +
                    "1. In a large pot, add some Pure Mountain Herb Infused Canola oil and chopped onions. You’ll need to fry the onions until brown. Be careful not to burn the onions. This is the secret to making brown pilau and you want to take time while doing this.\n" +
                    "2. Next we add the garlic and our whole potatoes. You’ll notice the brown color on the potatoes as you keep stirring and this means you’ve done the onions justice! Add your pilau masala here and stir. let everything cook for a few minutes covered but be careful not to let it burn, then add the precooked beef. Keep stirring.\n" +
                    "3. The next step is to add the saved broth and some water and washed rice. The decision on how much broth and water to add depends on how much rice you want to use. Rule of thumb is 2:1, 2 cups of water to 1 cup of rice. This is also the secret to fluffy rice so you need to measure your rice. Stir everything to make sure its evenly distributed. Let this cook while covered on high heat until the water almost evaporates.\n" +
                    "4. When the rice looks like it’s almost done, cover with aluminum foil and reduce heat to low, let it simmer for 10 minutes. This is  also a good time to make the kachumbari.",
            recipeImageId = R.drawable.beefpilau
        ),
        Recipe(
            id = 12,
            title = "Chinese Noodles with Beef and Shredded Vegetables",
            meal = "Lunch",
            serves = "Serves 4",
            description = "1. Put the beansprouts and shredded vegetables into small serving dishes and set aside. Cook the noodles in a large pan of salted boiling water according to the packet instructions, then drain and keep warm.\n" +
                    "2. Meanwhile, heat a wok over a medium heat, then add the groundnut oil and swirl it around the pan to heat. Add the spring onions, garlic and ginger and stir-fry for 2 minutes.\n" +
                    "Add the beef and stir-fry, breaking it up with a wooden spoon, for 5 minutes, until evenly browned. Stir in the sesame oil. soy sauce, rice wine and sugar and cook, stirring constantly, for a further 3 minutes.\n" +
                    "3. Mix the cornflour to a paste with the water in a small bowl and add to the wok. Simmer, stirring constantly, until the sauce has thickened and become glossy.\n" +
                    "Divide the noodles among individual bowls and top with the beef mixture and shredded vegetables. Serve immediately.\n" +
                    "\n" +
                    "Serves 4\n" +
                    "500 g/1 lb 2 oz dried egg\n" +
                    "noodles\n" +
                    "3 tbsp groundnut oil\n" +
                    "* 3 spring onions, thinly sliced\n" +
                    "* 2 garlic cloves, finely chopped\n" +
                    "1-cm/½-inch piece fresh ginger, finely chopped\n" +
                    "# 350 g/12 oz fresh beef mince\n" +
                    "1 tbsp sesame oil\n" +
                    "5 tbsp soy sauce\n" +
                    "2 tbsp Chinese rice wine or dry sherry\n" +
                    "1 tbsp sugar\n" +
                    "1 tbsp cornflour\n" +
                    "4 tbsp water salt\n" +
                    "To serve\n" +
                    "115 g/4 oz fresh beansprouts, blanched\n" +
                    "115g/4 oz Chinese leaves, blanched and shredded 115 g/4 oz carrots, blanched and shredded\n" +
                    "115 g/4 oz cucumber, shredded\n" +
                    "115 g/4 oz radishes, shredded",
            recipeImageId = R.drawable.chinesenoodles
        ),
    )
}