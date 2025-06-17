package net.snowbegone.mixin;

import net.minecraft.world.level.biome.Biome;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.snowbegone.ServerConfig;

@Mixin(value = Biome.class, priority = 100)
public class BiomeMixin {

    @ModifyConstant(
            method = "shouldFreeze(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Z)Z",
            constant = @Constant(intValue = 10))
    private int snowbegone$shouldAllowFreeze(int original) {
        return ServerConfig.iceMeltLightLevel.get() - 1;
    }

    @ModifyConstant(method = "shouldSnow", constant = @Constant(intValue = 10))
    private int snowbegone$shouldAllowSnow(int original) {
        return ServerConfig.snowMeltLightLevel.get() - 1;
    }
}
