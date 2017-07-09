package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockSlime;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncHolographicRepulsor extends IanusIncCommonHolographicBlock implements IHoloBlock
{

    protected final Material blockMaterial = new IanusIncHolographicMaterial(MapColor.CYAN);

    public IanusIncHolographicRepulsor(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance,harvestLevel);
        this.setCorporal(true);

    }


    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {

        double xMove,yMove,zMove;
        xMove = -1*(entityIn.posX - entityIn.prevPosX);
        zMove = -1*(entityIn.posZ - entityIn.prevPosZ);
        yMove = entityIn.motionY  ;

        boolean speedlimitXPlus = entityIn.motionX <= 4 ? true:false;
        boolean speedlimitXMinus = entityIn.motionX >= -4 ? true:false;
        boolean speedlimitYPlus = entityIn.motionY <= 1 ? true:false;
        boolean speedlimitYMinus = entityIn.motionY >= -1 ? true:false;
        boolean speedlimitZPlus = entityIn.motionZ <= 4 ? true:false;
        boolean speedlimitZMinus = entityIn.motionZ >= -4 ? true:false;


            if(speedlimitXMinus && speedlimitXPlus && speedlimitYMinus && speedlimitYPlus && speedlimitZMinus && speedlimitZPlus) {
                entityIn.setVelocity(xMove*10, yMove+0.1, zMove*10);
            }else{

            }
    }

    @Override
    public int getFadeTime() {
        return 5;
    }
}
