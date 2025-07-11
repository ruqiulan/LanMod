package com.example.mystical_dimension;

import net.fabricmc.api.ModInitializer;
import com.example.mystical_dimension.dimension.ModDimensions;
import com.example.mystical_dimension.portal.PortalIgnitionHandler;

public class MysticalMod implements ModInitializer {
    public static final String MOD_ID = "mystical_dimension";

    @Override
    public void onInitialize() {
        ModDimensions.register(); // 注册维度
        PortalIgnitionHandler.register(); // 传送门逻辑
    }
}
