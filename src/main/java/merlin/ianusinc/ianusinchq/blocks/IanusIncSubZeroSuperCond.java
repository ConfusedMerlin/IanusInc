package merlin.ianusinc.ianusinchq.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncSubZeroSuperCond extends CustomBlock
{
    public IanusIncSubZeroSuperCond(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
