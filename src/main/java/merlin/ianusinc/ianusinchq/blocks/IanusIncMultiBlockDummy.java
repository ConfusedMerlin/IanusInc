package merlin.ianusinc.ianusinchq.blocks;


import merlin.ianusinc.ianusinchq.blocks.multiblock.IMultiBlock;
import merlin.ianusinc.ianusinchq.blocks.multiblock.MultiBlockContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncMultiBlockDummy extends CustomBlock
{
    private MultiBlockContainer mbc;

    public IanusIncMultiBlockDummy(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);

    }

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }


}
