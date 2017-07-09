package merlin.ianusinc.ianusinchq.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncTextileConcrete extends CustomBlock
{
    public IanusIncTextileConcrete(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }
}
