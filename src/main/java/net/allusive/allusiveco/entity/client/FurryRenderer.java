package net.allusive.allusiveco.entity.client;

import com.google.common.collect.Maps;
import net.allusive.allusiveco.AllusiveCo;
import net.allusive.allusiveco.entity.custom.FurryEntity;
import net.allusive.allusiveco.entity.variant.FurryVariant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class FurryRenderer extends GeoEntityRenderer<FurryEntity> {

    public static final Map<FurryVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(FurryVariant.class), (map) -> {
                map.put(FurryVariant.FURRY1,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry1.png"));
                map.put(FurryVariant.FURRY2,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry2.png"));
                map.put(FurryVariant.FURRY3,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry3.png"));
                map.put(FurryVariant.FURRY4,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry4.png"));
                map.put(FurryVariant.FURRY5,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry5.png"));
                map.put(FurryVariant.FURRY6,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry6.png"));
                map.put(FurryVariant.FURRY7,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry7.png"));
                map.put(FurryVariant.FURRY8,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry8.png"));
                map.put(FurryVariant.FURRY9,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry9.png"));
                map.put(FurryVariant.FURRY10,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry10.png"));
                map.put(FurryVariant.FURRY11,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry11.png"));
                map.put(FurryVariant.FURRY12,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry12.png"));
                map.put(FurryVariant.FURRY13,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry13.png"));
                map.put(FurryVariant.FURRY14,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry14.png"));
                map.put(FurryVariant.FURRY15,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry15.png"));
                map.put(FurryVariant.FURRY16,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry16.png"));
                map.put(FurryVariant.FURRY17,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry17.png"));
                map.put(FurryVariant.FURRY18,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry18.png"));
                map.put(FurryVariant.FURRY19,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry19.png"));
                map.put(FurryVariant.FURRY20,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry20.png"));
                map.put(FurryVariant.FURRY21,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry21.png"));
                map.put(FurryVariant.FURRY22,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry22.png"));
                map.put(FurryVariant.FURRY23,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry23.png"));
                map.put(FurryVariant.FURRY24,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry24.png"));
                map.put(FurryVariant.FURRY25,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry25.png"));
                map.put(FurryVariant.FURRY26,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry26.png"));
                map.put(FurryVariant.FURRY27,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry27.png"));
                map.put(FurryVariant.FURRY28,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry28.png"));
                map.put(FurryVariant.FURRY29,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry29.png"));
                map.put(FurryVariant.FURRY30,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry30.png"));
                map.put(FurryVariant.FURRY31,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry31.png"));
                map.put(FurryVariant.FURRY32,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry32.png"));
                map.put(FurryVariant.FURRY33,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry33.png"));
                map.put(FurryVariant.FURRY34,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry34.png"));
                map.put(FurryVariant.FURRY35,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry35.png"));
                map.put(FurryVariant.FURRY36,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry36.png"));
                map.put(FurryVariant.FURRY37,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry37.png"));
                map.put(FurryVariant.FURRY38,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry38.png"));
                map.put(FurryVariant.FURRY39,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry39.png"));
                map.put(FurryVariant.FURRY40,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry40.png"));
                map.put(FurryVariant.FURRY41,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry41.png"));
                map.put(FurryVariant.FURRY42,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry42.png"));
                map.put(FurryVariant.FURRY43,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry43.png"));
                map.put(FurryVariant.FURRY44,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry44.png"));
                map.put(FurryVariant.FURRY45,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry45.png"));
                map.put(FurryVariant.FURRY46,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry46.png"));
                map.put(FurryVariant.FURRY47,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry47.png"));
                map.put(FurryVariant.FURRY48,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry48.png"));
                map.put(FurryVariant.FURRY49,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry49.png"));
                map.put(FurryVariant.FURRY50,
                        new Identifier(AllusiveCo.MOD_ID, "textures/entity/furry50.png"));
            });

    public FurryRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FurryModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(FurryEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderLayer getRenderType(FurryEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(1f, 1f, 1f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
