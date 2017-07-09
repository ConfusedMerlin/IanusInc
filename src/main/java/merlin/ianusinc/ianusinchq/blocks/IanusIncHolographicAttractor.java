package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncHolographicAttractor extends IanusIncCommonHolographicBlock implements IHoloBlock
{

    protected final Material blockMaterial = new IanusIncHolographicMaterial(MapColor.CYAN);

    public IanusIncHolographicAttractor(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance,harvestLevel);
        //this.setCorporal(true);

    }


    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {

        entityIn.addVelocity(entityIn.motionX*-1,entityIn.motionY*-1,entityIn.motionZ*-1);
    }

    @Override
    public int getFadeTime() {
        return 5;
    }
}
