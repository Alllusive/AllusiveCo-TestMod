package net.allusive.allusiveco.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<BakersOvenScreenHandler> BAKERS_OVEN_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        BAKERS_OVEN_SCREEN_HANDLER = new ScreenHandlerType<>(BakersOvenScreenHandler::new);
    }
}
