package com.example.mystical_dimension.dimension;

import net.minecraft.world.biome.Biome;

public class MysticalBiome {
    public static Biome create() {
            return new Biome.Builder()
                        .precipitation(false) // 无天气
                                    .temperature(0.8f)    // 恒定温度（中午）
                                                .downfall(0.0f)       // 无降水
                                                            .effects(new BiomeEffects.Builder()
                                                                            .skyColor(0x7BA4FF) // 中午天空颜色
                                                                                            .fogColor(0xC0D8FF) // 中午雾颜色
                                                                                                            .build())
                                                                                                                        .build();
                                                                                                                            }
                                                                                                                            }