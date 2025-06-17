package net.snowbegone.mixin.neoforge;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import bl4ckscor3.mod.snowundertrees.SnowUnderTrees;
import net.snowbegone.ServerConfig;

@Mixin(value = SnowUnderTrees.class, priority = 100, remap = false)
public class SnowUnderTreesMixin {

    @ModifyConstant(method = "isInBuildRangeAndDarkEnough", constant = @Constant(intValue = 10), require = 0)
    private static int snowbegone$shouldPlaceSnowLayerUnderTrees(int original) {
        return ServerConfig.snowMeltLightLevel.get() - 1;
    }
}
