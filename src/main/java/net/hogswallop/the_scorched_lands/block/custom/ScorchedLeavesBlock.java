package net.hogswallop.the_scorched_lands.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ScorchedLeavesBlock extends LeavesBlock {

    public ScorchedLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        entity.damage(world.getDamageSources().onFire(), 1.0f); // burns any entity that stands on the block
        super.onSteppedOn(world, pos, state, entity);
    }
}
