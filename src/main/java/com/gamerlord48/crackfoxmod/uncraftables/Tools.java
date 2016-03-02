package com.gamerlord48.crackfoxmod.uncraftables;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Tools {

    /**
     * Adds the tool recipes.
     * Called in the preInit
     */
    public static void addToolRecipes()
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
        //Iron Tools
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.iron_pickaxe));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.iron_axe));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.iron_shovel));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_hoe));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_sword));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.bucket));

        //Gold Tools
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 3), new ItemStack(Items.golden_pickaxe));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 3), new ItemStack(Items.golden_axe));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1), new ItemStack(Items.golden_shovel));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new ItemStack(Items.golden_hoe));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new ItemStack(Items.golden_sword));

        //Stone Tools
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 3), new ItemStack(Items.stone_pickaxe));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 3), new ItemStack(Items.stone_axe));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 1), new ItemStack(Items.stone_shovel));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(Items.stone_hoe));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(Items.stone_sword));

        //Wooden Tools
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3), new ItemStack(Items.wooden_pickaxe));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3), new ItemStack(Items.wooden_axe));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1), new ItemStack(Items.wooden_shovel));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2), new ItemStack(Items.wooden_hoe));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2), new ItemStack(Items.wooden_sword));
    }
}
