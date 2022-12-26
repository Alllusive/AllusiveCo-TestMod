package net.allusive.allusiveco.recipe;

import net.allusive.allusiveco.AllusiveCo;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(AllusiveCo.MOD_ID, BakersOvenRecipe.Serializer.ID),
                BakersOvenRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(AllusiveCo.MOD_ID, BakersOvenRecipe.Type.ID),
                BakersOvenRecipe.Type.INSTANCE);
    }
}
