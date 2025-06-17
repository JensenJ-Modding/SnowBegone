package net.snowbegone.mixin;

import net.minecraft.world.level.block.SnowLayerBlock;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.snowbegone.ServerConfig;

@Mixin(value = SnowLayerBlock.class, priority = 100)
public class SnowLayerBlockMixin {

    @ModifyConstant(method = "randomTick", constant = @Constant(intValue = 11))
    private int snowbegone$shouldMeltSnowLayer(int original) {
        return ServerConfig.snowMeltLightLevel.get();
    }
}
