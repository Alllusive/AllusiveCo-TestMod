package net.allusive.allusiveco.entity.client;

import net.allusive.allusiveco.AllusiveCo;
import net.allusive.allusiveco.entity.custom.FurryEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FurryModel extends AnimatedGeoModel<FurryEntity> {
    @Override
    public Identifier getModelResource(FurryEntity object) {
        return new Identifier(AllusiveCo.MOD_ID, "geo/furry.geo.json");
    }

    @Override
    public Identifier getTextureResource(FurryEntity object) {
        return FurryRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public Identifier getAnimationResource(FurryEntity animatable) {
        return new Identifier(AllusiveCo.MOD_ID, "animations/furry.animation.json");
    }
}
