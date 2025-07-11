package com.example.mystical_dimension.portal;

import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class PortalIgnitionHandler {
    public static void register() {
            UseBlockCallback.EVENT.register((player, world, hand, hit) -> {
                        if (!world.isClient && player.getStackInHand(hand).isOf(Items.FLINT_AND_STEEL)) {
                                        BlockPos pos = hit.getBlockPos();
                                                        if (world.getBlockState(pos).isOf(Blocks.CRYING_OBSIDIAN)) {
                                                                            if (checkValidPortalFrame(world, pos)) { // 检查是否4×5框架
                                                                                                    world.setBlockState(pos, Blocks.NETHER_PORTAL.getDefaultState());
                                                                                                                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 0)); // 3秒反胃
                                                                                                                                                    scheduleTeleport(player, world, pos);
                                                                                                                                                                        }
                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                                return ActionResult.PASS;
                                                                                                                                                                                                                        });
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                private static boolean checkValidPortalFrame(World world, BlockPos pos) {
                                                                                                                                                                                                                                        // TODO: 实现4×5哭泣黑曜石框架检测
                                                                                                                                                                                                                                                return true;
                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                        private static void scheduleTeleport(PlayerEntity player, World world, BlockPos pos) {
                                                                                                                                                                                                                                                                world.getServer().execute(() -> {
                                                                                                                                                                                                                                                                            if (player.isInsideWall()) {
                                                                                                                                                                                                                                                                                            player.damage(player.getDamageSources().magic(), 6.0f); // 扣3格血
                                                                                                                                                                                                                                                                                                            ServerWorld targetWorld = world.getServer().getWorld(ModDimensions.MYSTICAL_DIM);
                                                                                                                                                                                                                                                                                                                            player.teleport(targetWorld, player.getX(), player.getY(), player.getZ(), player.getYaw(), player.getPitch());
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    }