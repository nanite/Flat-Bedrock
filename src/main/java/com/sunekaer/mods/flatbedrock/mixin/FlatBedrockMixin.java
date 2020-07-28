package com.sunekaer.mods.flatbedrock.mixin;

import net.minecraft.world.gen.NoiseChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NoiseChunkGenerator.class)
public abstract class FlatBedrockMixin {
    @ModifyConstant(method = "makeBedrock", constant = {@Constant(intValue = 4), @Constant(intValue = -4)})
    private int setBedrockHeight(int value){
        return 0;
    }
}

