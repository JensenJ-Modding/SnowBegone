package net.snowbegone.fabric;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;
import net.snowbegone.ServerConfig;
import net.snowbegone.SnowBegone;

public class SnowBegoneFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        NeoForgeConfigRegistry.INSTANCE.register(SnowBegone.MOD_ID, ModConfig.Type.SERVER, ServerConfig.SERVER_CONFIG);
    }
}
