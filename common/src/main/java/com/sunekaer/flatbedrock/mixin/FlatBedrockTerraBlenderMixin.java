package com.sunekaer.flatbedrock.mixin;


import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(targets = "terrablender.worldgen.TBSurfaceRuleData", remap = false)
@Pseudo

public abstract class FlatBedrockTerraBlenderMixin {

    @ModifyArg(
            method = "overworldLike",
            remap = false,
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/VerticalAnchor;m_158930_(I)Lnet/minecraft/world/level/levelgen/VerticalAnchor;",
                    remap = false,
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
            remap = false,
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/VerticalAnchor;m_158930_(I)Lnet/minecraft/world/level/levelgen/VerticalAnchor;",
                    remap = false,
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
            remap = false,
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/VerticalAnchor;m_158935_(I)Lnet/minecraft/world/level/levelgen/VerticalAnchor;",
                    remap = false,
                    ordinal = 0
            ),
            index = 0,
            slice = @Slice(from = @At(value="CONSTANT", args = "stringValue=bedrock_roof"))
    )
    private static int belowTopRoofNether(int i) {
        return 1;
    }
}

