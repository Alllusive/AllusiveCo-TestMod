package net.allusive.allusiveco;

import net.allusive.allusiveco.block.ModBlocks;
import net.allusive.allusiveco.entity.ModEntities;
import net.allusive.allusiveco.entity.client.FurryRenderer;
import net.allusive.allusiveco.screen.BakersOvenScreen;
import net.allusive.allusiveco.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class AllusiveCoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_CROP, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.BAKERS_OVEN_SCREEN_HANDLER, BakersOvenScreen::new);

        EntityRendererRegistry.register(ModEntities.FURRY, FurryRenderer::new);
    }
}
