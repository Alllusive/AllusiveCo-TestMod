package net.allusive.allusiveco.entity;

import net.allusive.allusiveco.AllusiveCo;
import net.allusive.allusiveco.entity.custom.FurryEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<FurryEntity> FURRY = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AllusiveCo.MOD_ID, "furry"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FurryEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
}
