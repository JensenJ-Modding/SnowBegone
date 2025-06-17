package net.snowbegone.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.snowbegone.ServerConfig;
import net.snowbegone.SnowBegone;

@Mod(SnowBegone.MOD_ID)
public class SnowBegoneNeoForge {
    public SnowBegoneNeoForge(ModContainer container, IEventBus bus) {
        container.registerConfig(ModConfig.Type.SERVER, ServerConfig.SERVER_CONFIG);
    }
}
