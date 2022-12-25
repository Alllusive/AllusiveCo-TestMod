package net.allusive.allusiveco.item;

import net.allusive.allusiveco.AllusiveCo;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALLUSIVECO = FabricItemGroupBuilder.build(
            new Identifier(AllusiveCo.MOD_ID, "allusiveco"), () -> new ItemStack(ModItems.PLAIN_DONUT));
}
