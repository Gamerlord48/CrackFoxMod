package com.gamerlord48.crackfoxmod.Blocks;

        import com.gamerlord48.crackfoxmod.help.Reference;
        import net.minecraft.block.Block;
        import net.minecraft.block.material.Material;
        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraftforge.fml.common.registry.GameRegistry;

public class CrackFoxBlock extends Block
{
    private final String name = "crackFoxBlock";

    public CrackFoxBlock()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setUnlocalizedName(Reference.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public String getName()
    {
        return name;
    }
}