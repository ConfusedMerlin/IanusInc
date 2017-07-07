package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncCommonHolographicBlock extends CustomBlock
{

    private static Material myMaterial = new IanusIncHolographicMaterial(MapColor.CYAN);
    private boolean isCorporalHologram = false;
    protected static final AxisAlignedBB TOP_AABB = new AxisAlignedBB(0.05D, 0.05D, 0.05D, 0.95D, 0.95D, 0.95D);

//TODO Das blöde Material an den Konstruktor durchreichen!


    public IanusIncCommonHolographicBlock(String name, float hardness, float resistance, int harvestLevel){

        super(name,hardness,resistance,myMaterial);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);
        setLightLevel(1F);

    }

    /*
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return false;
    }
    */

    @Override
    public Item getItemDropped(IBlockState p_getItemDropped_1_, Random p_getItemDropped_2_, int p_getItemDropped_3_) {
        return null;
    }

    @Override
    public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos) {

        return false;
     }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        if(! this.isCorporal()){
            return null;
        }else{
            return super.getCollisionBoundingBox(blockState,worldIn,pos);
        }
    }

    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {

        if( this.isCorporal()){
            return true;
        }else{
            return false;
        }
        //return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }


    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TOP_AABB;
    }

    public boolean isCorporal(){
        return isCorporalHologram;
    }
    public void setCorporal(boolean corporal){
        this.isCorporalHologram = corporal;
    }

    public static class HoloForce{

        public static Explosion applyForce(float size, Entity entityIn, BlockPos pos, World worldIn){

            Explosion holoForce = new Explosion(worldIn,entityIn,pos.getX(),pos.getY(),pos.getZ(),size,false,false);

            return holoForce;
        }

    }
}
