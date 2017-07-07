package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncHolographicPhaser extends IanusIncCommonHolographicBlock implements IHoloBlock
{

    protected final Material blockMaterial = new IanusIncHolographicMaterial(MapColor.CYAN);

    public IanusIncHolographicPhaser(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance,harvestLevel);




    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.attackEntityFrom(DamageSource.LIGHTNING_BOLT,5f);
        entityIn.setFire(2);

        super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);

    }

    @Override
    public int getFadeTime() {
        return 2;
    }
}
