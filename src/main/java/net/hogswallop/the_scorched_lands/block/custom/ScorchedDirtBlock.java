package net.hogswallop.the_scorched_lands.block.custom;

import net.hogswallop.the_scorched_lands.block.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;

public class ScorchedDirtBlock extends ScorchedBlock {

    public ScorchedDirtBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    private static boolean canSurvive (BlockState state, WorldView world, BlockPos pos) {
        BlockPos abovepos = pos.up();
        BlockState abovestate = world.getBlockState(abovepos);
        if (abovestate.isTransparent(world, pos) || abovestate.isAir()) { // checks if block above is air or transparent
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canSurvive(state, world, pos)) { // if it has air/transparent block above
            world.setBlockState(pos, ModBlocks.SCORCHED_GRASS_BLOCK.getDefaultState()); // set block to scorched grass
        }
    }
}
