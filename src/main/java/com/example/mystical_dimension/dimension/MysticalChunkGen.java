package com.example.mystical_dimension.dimension;

import net.minecraft.block.Blocks;
import net.minecraft.world.*;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.chunk.*;

public class MysticalChunkGen extends NoiseChunkGenerator {
    public MysticalChunkGen(BiomeSource biomeSource) {
            super(biomeSource, NoiseRouterData.overworld(biomeSource));
                }

                    @Override
                        public void buildSurface(ChunkRegion region, StructureAccessor structures, NoiseConfig noiseConfig, Chunk chunk) {
                                // 填充哭泣的黑曜石（除基岩层）
                                        for (int y = region.getBottomY(); y < region.getTopY(); y++) {
                                                    for (int x = 0; x < 16; x++) {
                                                                    for (int z = 0; z < 16; z++) {
                                                                                        if (y < -60) { // 基岩层
                                                                                                                chunk.setBlockState(new BlockPos(x, y, z), Blocks.BEDROCK.getDefaultState(), false);
                                                                                                                                    } else { // 其他层全部是哭泣的黑曜石
                                                                                                                                                            chunk.setBlockState(new BlockPos(x, y, z), Blocks.CRYING_OBSIDIAN.getDefaultState(), false);
                                                                                                                                                                                }
                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        }