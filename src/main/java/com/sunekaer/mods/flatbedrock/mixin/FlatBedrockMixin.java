package com.sunekaer.mods.flatbedrock.mixin;

import net.minecraft.world.gen.NoiseChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NoiseChunkGenerator.class)
public abstract class FlatBedrockMixin {
    @ModifyConstant(method = "makeBedrock", constant = {@Constant(intValue = 4)})
    private int setBedrockHeight(int value){
        return 0;
    }

    @ModifyConstant(method = "makeBedrock", constant = {@Constant(intValue = 5)})
    private int setBedrockHeight2(int value){
        return 1;
    }
}

