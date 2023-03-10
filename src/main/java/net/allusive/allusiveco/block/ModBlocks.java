package net.allusive.allusiveco.block;

import net.allusive.allusiveco.AllusiveCo;
import net.allusive.allusiveco.block.custom.StrawberryCropBlock;
import net.allusive.allusiveco.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    public static final Block BAKERS_OVEN = registerBlock("bakers_oven",
            new BakersOven(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.ALLUSIVECO);


    public static final Block STRAWBERRY_CROP = registerBlockWithoutItem("strawberry_crop",
            new StrawberryCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));











    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(AllusiveCo.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(AllusiveCo.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(AllusiveCo.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        AllusiveCo.LOGGER.debug("Registering New Blocks added by " + AllusiveCo.MOD_ID);
    }
}
