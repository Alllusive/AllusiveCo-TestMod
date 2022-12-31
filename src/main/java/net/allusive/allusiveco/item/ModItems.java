package net.allusive.allusiveco.item;

import net.allusive.allusiveco.AllusiveCo;
import net.allusive.allusiveco.block.ModBlocks;
import net.allusive.allusiveco.entity.ModEntities;
import net.allusive.allusiveco.item.custom.PlainDonutItem;
import net.allusive.allusiveco.item.custom.StrawberryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item PLAIN_DONUT = registerItem("plain_donut",
            new PlainDonutItem(new FabricItemSettings().group(ModItemGroup.ALLUSIVECO).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_CROP,
                    new FabricItemSettings().group(ModItemGroup.ALLUSIVECO)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new StrawberryItem(new FabricItemSettings().group(ModItemGroup.ALLUSIVECO).food(new FoodComponent.Builder().hunger(1).saturationModifier(4f).build())));

    public static final Item DOUGH = registerItem("dough",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLUSIVECO)));

    public static final Item DONUT_DOUGH = registerItem("donut_dough",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLUSIVECO)));

    public static final Item DONUT_CUTTER = registerItem("donut_cutter",
            new Item(new FabricItemSettings().maxCount(1).group(ModItemGroup.ALLUSIVECO)));

    public static final Item FURRY_SPAWN_EGG = registerItem("furry_spawn_egg",
            new SpawnEggItem(ModEntities.FURRY, 0x22b341, 0x19732e,
                    new FabricItemSettings().group(ModItemGroup.ALLUSIVECO)));










    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AllusiveCo.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AllusiveCo.LOGGER.debug("Registering New Items added by " + AllusiveCo.MOD_ID);
    }
}
