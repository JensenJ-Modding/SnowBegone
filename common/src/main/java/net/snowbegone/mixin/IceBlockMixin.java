package net.snowbegone.mixin;

import net.minecraft.world.level.block.IceBlock;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.snowbegone.ServerConfig;

@Mixin(value = IceBlock.class, priority = 100)
public class IceBlockMixin {

    @ModifyConstant(method = "randomTick", constant = @Constant(intValue = 11))
    private int snowbegone$shouldMeltIce(int original) {
        return ServerConfig.iceMeltLightLevel.get();
    }
}
