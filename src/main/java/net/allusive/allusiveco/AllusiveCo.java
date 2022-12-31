package net.allusive.allusiveco;

import net.allusive.allusiveco.block.ModBlocks;
import net.allusive.allusiveco.block.entity.ModBlockEntities;
import net.allusive.allusiveco.entity.ModEntities;
import net.allusive.allusiveco.entity.custom.FurryEntity;
import net.allusive.allusiveco.item.ModItems;
import net.allusive.allusiveco.recipe.ModRecipes;
import net.allusive.allusiveco.screen.ModScreenHandlers;
import net.allusive.allusiveco.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class AllusiveCo implements ModInitializer {
	public static final String MOD_ID = "allusiveco";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
		ModWorldGen.generateWorldGen();


		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.FURRY, FurryEntity.setAttributes());
	}
}
