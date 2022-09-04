package com.sunekaer.flatbedrock.fabric;

import com.sunekaer.flatbedrock.FlatBedrock;
import net.fabricmc.api.ModInitializer;

public class FlatBedrockFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FlatBedrock.init();
    }
}
