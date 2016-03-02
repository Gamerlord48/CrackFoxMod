package com.gamerlord48.crackfoxmod.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModRecipes {

    /**
     * Adds the recipes.
     * Called in the preInit
     */
    public static void addRecipes()
    {
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */

        GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.1f);

        /**
         * Shapeless recipes are the same as normal recipes, except that they dont have a layout.
         */

        /**
         GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chromiumNugget), new Object[]
         {
         Items.iron_ingot, new ItemStack(Items.dye, 1, 11)
         });
         */
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 1), new ItemStack(Blocks.gravel));
    }
}
