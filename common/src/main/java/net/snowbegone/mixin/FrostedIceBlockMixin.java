package net.snowbegone.mixin;

import net.minecraft.world.level.block.FrostedIceBlock;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.snowbegone.ServerConfig;

@Mixin(value = FrostedIceBlock.class, priority = 100)
public class FrostedIceBlockMixin {

    @ModifyConstant(method = "tick", constant = @Constant(intValue = 11))
    private int snowbegone$shouldMeltFrostedIce(int original) {
        return ServerConfig.frostedIceMeltLightLevel.get();
    }
}
