package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
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


        double x = entityIn.getPositionVector().x;
        double y = entityIn.getPositionVector().y;
        double z = entityIn.getPositionVector().z;


        try {
            worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("koordinaten: x: " + x +", y: " + y + ", z: "+ z + ";"));
        }catch(Exception e){
            //just keep on going
        }

        x = entityIn.getForward().x;
        y = entityIn.getForward().y;
        z = entityIn.getForward().z;

        try {
            worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("blickrichtung: x: " + x +", y: " + y + ", z: "+ z + ";"));
        }catch(Exception e){
            //just keep on going
        }


        x= entityIn.motionX ;
        y= entityIn.motionY;
        z= entityIn.motionZ;

        try {
            worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("bewegung: x: " + x +", y: " + y + ", z: "+ z + ";"));
        }catch(Exception e){
            //just keep on going
        }

        entityIn.motionX = (x * (-2));
        entityIn.motionY = (y * (-2));
        entityIn.motionZ = (z * (-1));
        /*
        //ups... einmal Koordinaten * -1 :D
        double x = entityIn.getPositionVector().x;
        double y = entityIn.getPositionVector().y;
        double z = entityIn.getPositionVector().z;
        x = x * (-1);
        y = y * (-1);
        z = z + (-1);

        entityIn.setVelocity(x,y,z);
        */


        //entityIn.setVelocity(1,1,1);   /*okay, aber zu gerichtet und zu stark*/
        //entityIn.moveRelative(0f,0f,-1f,1f);  /*gut, aber sehr horizontal :) */

        super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
    }

    @Override
    public int getFadeTime() {
        return 5;
    }
}
