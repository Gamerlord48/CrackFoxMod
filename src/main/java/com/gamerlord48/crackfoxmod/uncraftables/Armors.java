package com.gamerlord48.crackfoxmod.uncraftables;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Armors {

    /**
     * Adds the armor recipes
     * Called in the preInit
     */
    public static void addArmorRecipes()
    {
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */

        /**
         * Shapeless recipes are the same as normal recipes, except that they dont have a layout.
         */

        /**
         GameRegistry.addShapelessRecipe(new ItemStack(Items.output, amount), new ItemStack(Items.input));
         */
        //Iron Armor
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 8), new ItemStack(Items.iron_chestplate));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 7), new ItemStack(Items.iron_leggings));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), new ItemStack(Items.iron_boots));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), new ItemStack(Items.iron_helmet));

        //Gold Armor
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 8), new ItemStack(Items.golden_chestplate));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 7), new ItemStack(Items.golden_leggings));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 4), new ItemStack(Items.golden_boots));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 5), new ItemStack(Items.golden_helmet));

        //Leather Armor
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 8), new ItemStack(Items.leather_chestplate));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 7), new ItemStack(Items.leather_leggings));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 4), new ItemStack(Items.leather_boots));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 5), new ItemStack(Items.leather_helmet));
    }
}
