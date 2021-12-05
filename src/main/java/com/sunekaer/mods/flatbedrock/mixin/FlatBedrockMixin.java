package com.sunekaer.mods.flatbedrock.mixin;

import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;


@Mixin(NoiseBasedChunkGenerator.class)
public abstract class FlatBedrockMixin {
//    @ModifyConstant(method = "setBedrock", constant = {@Constant(intValue = 4)})
//    private int setBedrockHeight(int value){
//        return 0;
//    }
//
//    @ModifyConstant(method = "setBedrock", constant = {@Constant(intValue = 5)})
//    private int setBedrockHeight2(int value){
//        return 1;
//    }
}

