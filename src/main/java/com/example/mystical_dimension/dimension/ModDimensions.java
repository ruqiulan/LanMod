package com.example.mystical_dimension.dimension;

import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<DimensionType> MYSTICAL_DIM_TYPE = 
        RegistryKey.of(RegistryKeys.DIMENSION_TYPE, new Identifier("mystical_dimension", "mystical_dim"));
    
    public static final RegistryKey<World> MYSTICAL_DIM = 
        RegistryKey.of(RegistryKeys.WORLD, new Identifier("mystical_dimension", "mystical_dim"));

    public static void register() {
        // 在Fabric的初始化阶段注册维度
    }
}
