package com.gamerlord48.crackfoxmod;

import com.gamerlord48.crackfoxmod.handler.ModRecipes;
import com.gamerlord48.crackfoxmod.help.Reference;
import com.gamerlord48.crackfoxmod.uncraftables.Armors;
import com.gamerlord48.crackfoxmod.uncraftables.Tools;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.version)
public class CrackFoxMod
{
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModRecipes.addRecipes();
        Tools.addToolRecipes();
        Armors.addArmorRecipes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
