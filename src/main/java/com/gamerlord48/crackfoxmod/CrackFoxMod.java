package com.gamerlord48.crackfoxmod;

import com.gamerlord48.crackfoxmod.Blocks.CrackFoxBlock;
import com.gamerlord48.crackfoxmod.Items.CrackFoxItem;
import com.gamerlord48.crackfoxmod.handler.ModRecipes;
import com.gamerlord48.crackfoxmod.help.Reference;
import com.gamerlord48.crackfoxmod.uncraftables.Armors;
import com.gamerlord48.crackfoxmod.uncraftables.Tools;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MODID, version = Reference.version)
public class CrackFoxMod
{
    public static Block crackFoxBlock;
    public static Item crackFoxItem;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //blocks
        crackFoxBlock = new CrackFoxBlock();

        //items
        crackFoxItem = new CrackFoxItem();
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //register renders
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            //blocks
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(crackFoxBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((CrackFoxBlock) crackFoxBlock).getName(), "inventory"));

            //items
            renderItem.getItemModelMesher().register(crackFoxItem, 0, new ModelResourceLocation(Reference.MODID + ":" + ((CrackFoxItem) crackFoxItem).getName(), "inventory"));
        }

        //Add Recipes
        ModRecipes.addRecipes();
        Tools.addToolRecipes();
        Armors.addArmorRecipes();
    }
}
