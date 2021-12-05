package com.sunekaer.mods.flatbedrock.mixin;

import net.minecraft.data.worldgen.SurfaceRuleData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(SurfaceRuleData.class)
public abstract class FlatBedrockMixin {

    @ModifyArg(
            method = "overworldLike",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/VerticalAnchor;aboveBottom(I)Lnet/minecraft/world/level/levelgen/VerticalAnchor;",
                    ordinal = 0
            ),
            index = 0,
            slice = @Slice(from = @At(value="CONSTANT", args = "stringValue=bedrock_floor"))
    )
    private static int aboveBottom(int i) {
        return 1;
    }

    @ModifyArg(
            method = "nether",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/VerticalAnchor;aboveBottom(I)Lnet/minecraft/world/level/levelgen/VerticalAnchor;",
                    ordinal = 0
            ),
            index = 0,
            slice = @Slice(from = @At(value="CONSTANT", args = "stringValue=bedrock_floor"))
    )
    private static int aboveBottomFloorNether(int i) {
        return 1;
    }

    @ModifyArg(
            method = "nether",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/VerticalAnchor;belowTop(I)Lnet/minecraft/world/level/levelgen/VerticalAnchor;",
                    ordinal = 0
            ),
            index = 0,
            slice = @Slice(from = @At(value="CONSTANT", args = "stringValue=bedrock_roof"))
    )
    private static int belowTopRoofNether(int i) {
        return 1;
    }
}

