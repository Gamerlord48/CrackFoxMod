package com.gamerlord48.crackfoxmod.Items;

import com.gamerlord48.crackfoxmod.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CrackFoxItem extends Item
{
    private final String name = "crackFoxItem";
    public CrackFoxItem()
    {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(Reference.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);
    }
    public String getName()
    {
        return name;
    }
}
