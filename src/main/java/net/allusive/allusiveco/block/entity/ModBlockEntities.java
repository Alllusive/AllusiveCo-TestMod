package net.allusive.allusiveco.block.entity;

import net.allusive.allusiveco.AllusiveCo;
import net.allusive.allusiveco.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<BakersOvenBlockEntity> BAKERS_OVEN;

    public static void registerBlockEntities() {
        BAKERS_OVEN = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(AllusiveCo.MOD_ID, "bakers_oven"),
                FabricBlockEntityTypeBuilder.create(BakersOvenBlockEntity::new,
                        ModBlocks.BAKERS_OVEN).build(null));
    }
}
