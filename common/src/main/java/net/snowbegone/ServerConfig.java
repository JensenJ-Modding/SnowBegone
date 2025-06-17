package net.snowbegone;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ServerConfig {

    public static final String CATEGORY_GENERAL = "general";
    public static ModConfigSpec SERVER_CONFIG;
    public static ModConfigSpec.ConfigValue<Integer> snowMeltLightLevel;
    public static ModConfigSpec.ConfigValue<Integer> iceMeltLightLevel;
    public static ModConfigSpec.ConfigValue<Integer> frostedIceMeltLightLevel;

    static {
        ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

        BUILDER.comment("General settings").push(CATEGORY_GENERAL);

        snowMeltLightLevel = BUILDER.comment("The required light level for snow to melt. [Default: 5, Vanilla: 11]")
                .defineInRange("snowMeltLightLevel", 5, 0, 11);
        iceMeltLightLevel = BUILDER.comment("The required light level for ice to melt. [Default: 5, Vanilla: 11]")
                .defineInRange("iceMeltLightLevel", 5, 0, 11);
        frostedIceMeltLightLevel = BUILDER.comment(
                        "The required light level for frosted ice (from frost walker) to melt. [Default: 5, Vanilla: 11]")
                .defineInRange("frostedIceMeltLightLevel", 5, 0, 11);

        BUILDER.pop();
        SERVER_CONFIG = BUILDER.build();
    }
}
