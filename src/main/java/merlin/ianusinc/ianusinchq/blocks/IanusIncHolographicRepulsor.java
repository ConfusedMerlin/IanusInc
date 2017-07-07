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




        /*


        double holoX =  pos.getX();
        double holoY =  pos.getY();
        double holoZ =  pos.getZ();



        double outputX=(holoX-entiX)*-1;
        double outputY=(holoY-entiY)*-1;
        double outputZ=(holoZ-entiZ)*-1;


        try {
           worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("holo: x: " + holoX +", y: " + holoY + ", z: "+ holoZ + ";"));
           worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("enti: x: " + entiX +", y: " + entiY + ", z: "+ entiZ + ";"));
           worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("dif: x: " + (holoX-entiX) +", y: " + (holoY-entiY) + ", z: "+ (holoZ-entiZ) + ";"));
           worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("input vel: x: " + inputX +", y: " + inputY + ", z: "+ inputZ + ";"));
           worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("output vel: x: " + outputX +", y: " + outputY + ", z: "+ outputZ + ";"));

            entityIn.setVelocity((holoX-entiX)*-2,(holoY-entiY)*-2,(holoZ-entiZ)*-2);

        }catch(Exception e){
            //just keep on going
        }
        */
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

        //linearbeschleuniger :D
        /*

        double holoX =  pos.getX();
        double holoY =  pos.getY();
        double holoZ =  pos.getZ();

        double entiX = entityIn.getPosition().getX();
        double entiY = entityIn.getPosition().getY();
        double entiZ = entityIn.getPosition().getZ();

        double sideX=(holoX-entiX);
        double sideY=(holoY-entiY);
        double sideZ=(holoZ-entiZ);

        EnumFacing blockSide = EnumFacing.UP;
        if(sideX < 0){blockSide = EnumFacing.EAST;}
        else if(sideX > 0){blockSide = EnumFacing.WEST;}
        else if(sideZ < 0){blockSide = EnumFacing.SOUTH;}
        else if(sideZ > 0){blockSide = EnumFacing.NORTH;}

        EnumFacing entityLooking = entityIn.getAdjustedHorizontalFacing();

        //EnumFacing direction = entityIn.getAdjustedHorizontalFacing();
        try {
            worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("BlockFacing: " + blockSide.toString() + " EntiFacing: " + entityLooking.toString()));
        }catch(Exception e){
            //keep on moving
        }
        //

        if(entityLooking == EnumFacing.NORTH && blockSide == EnumFacing.NORTH){
            entityIn.moveRelative(0f,0f,1f,2f);
        }if(entityLooking == EnumFacing.NORTH && blockSide == EnumFacing.SOUTH){
            entityIn.moveRelative(0f,0f,-1f,2f);
        }if(entityLooking == EnumFacing.NORTH && blockSide == EnumFacing.EAST){
            entityIn.moveRelative(1f,0f,-0f,2f);
        }if(entityLooking == EnumFacing.NORTH && blockSide == EnumFacing.WEST){
            entityIn.moveRelative(-1f,0f,-2f,2f);
        }

        if(entityLooking == EnumFacing.SOUTH && blockSide == EnumFacing.NORTH){
            entityIn.moveRelative(0f,0f,-1f,2f);
        }if(entityLooking == EnumFacing.SOUTH && blockSide == EnumFacing.SOUTH){
            entityIn.moveRelative(0f,0f,1f,2f);
        }if(entityLooking == EnumFacing.SOUTH && blockSide == EnumFacing.EAST){
            entityIn.moveRelative(-1f,0f,0f,2f);
        }if(entityLooking == EnumFacing.SOUTH && blockSide == EnumFacing.WEST){
            entityIn.moveRelative(1f,0f,-0f,2f);
        }
        if(entityLooking == EnumFacing.EAST && blockSide == EnumFacing.NORTH){
            entityIn.moveRelative(1f,0f,-0f,2f);
        }if(entityLooking == EnumFacing.EAST && blockSide == EnumFacing.SOUTH){
            entityIn.moveRelative(-1f,0f,-0f,2f);
        }if(entityLooking == EnumFacing.EAST && blockSide == EnumFacing.EAST){
            entityIn.moveRelative(0f,0f,1f,2f);
        }if(entityLooking == EnumFacing.EAST && blockSide == EnumFacing.WEST){
            entityIn.moveRelative(0f,0f,-1f,2f);
        }
        if(entityLooking == EnumFacing.WEST && blockSide == EnumFacing.NORTH){
            entityIn.moveRelative(-1f,0f,0f,2f);
        }if(entityLooking == EnumFacing.WEST && blockSide == EnumFacing.SOUTH){
            entityIn.moveRelative(1f,0f,0f,2f);
        }if(entityLooking == EnumFacing.WEST && blockSide == EnumFacing.EAST){
            entityIn.moveRelative(0f,0f,-1f,2f);
        }if(entityLooking == EnumFacing.WEST && blockSide == EnumFacing.WEST){
            entityIn.moveRelative(0f,0f,1f,2f);
        }
        if(entityLooking == EnumFacing.UP){
            entityIn.moveRelative(0f,2f,0f,2f);
        }else{
            super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
        }


        */

        //Nothing works really well, because the collision detection seems to return wrong coordinates some time :(
        //When approaching from north, the touching side should be north,
        //but its east as often as north, sometimes up too and west in rare occations
        //the direction I find myself slinged to is usually right into the blocks, which causes even more accelleration





        double xMove,yMove,zMove;
        xMove = -1*(entityIn.posX - entityIn.prevPosX);
        zMove = -1*(entityIn.posZ - entityIn.prevPosZ);
        yMove = entityIn.motionY  ;//(entityIn.posZ - entityIn.prevPosZ);
        //xMove = xMove<=0.2&&xMove>=-0.2 ? xMove*2:xMove*1;
        //zMove = zMove<=0.2&&zMove>=-0.2 ? zMove*2:zMove*1;
        //yMove = yMove==0 ? yMove*1.5 : yMove*1;

        boolean speedlimitXPlus = entityIn.motionX <= 4 ? true:false;
        boolean speedlimitXMinus = entityIn.motionX >= -4 ? true:false;
        boolean speedlimitYPlus = entityIn.motionY <= 1 ? true:false;
        boolean speedlimitYMinus = entityIn.motionY >= -1 ? true:false;
        boolean speedlimitZPlus = entityIn.motionZ <= 4 ? true:false;
        boolean speedlimitZMinus = entityIn.motionZ >= -4 ? true:false;


            if(speedlimitXMinus && speedlimitXPlus && speedlimitYMinus && speedlimitYPlus && speedlimitZMinus && speedlimitZPlus) {


                try {
                    worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("new velocity (X,Z,Y): " + xMove + "," + zMove + "," + yMove));
                } catch (Exception e) {
                    //keep on moving
                }
                entityIn.setVelocity(xMove*10, yMove+0.1, zMove*10);
            }else{
                try {
                    worldIn.getPlayerEntityByName(entityIn.getName()).sendMessage(new TextComponentString("speed overlimit"));
                } catch (Exception e) {
                    //keep on moving
                }
            }
            //entityIn.moveRelative(0f, 0.2f, -0.5f, 2f);

    }

    @Override
    public int getFadeTime() {
        return 5;
    }
}
