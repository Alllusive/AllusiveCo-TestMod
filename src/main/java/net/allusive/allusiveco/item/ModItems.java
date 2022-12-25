package net.allusive.allusiveco.item;

import net.allusive.allusiveco.AllusiveCo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item PLAIN_DONUT = registerItem("plain_donut",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLUSIVECO)));













    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AllusiveCo.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AllusiveCo.LOGGER.debug("Registering New Items added by " + AllusiveCo.MOD_ID);
    }
}
