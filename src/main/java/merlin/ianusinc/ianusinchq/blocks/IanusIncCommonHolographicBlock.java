package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncCommonHolographicBlock extends CustomBlock
{

    private Material myMaterial;
    private boolean isCorporalHologram = false;

//TODO Das blöde Material an den Konstruktor durchreichen!


    public IanusIncCommonHolographicBlock(String name, float hardness, float resistance, int harvestLevel){

        super(name,hardness,resistance);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);
        setLightLevel(5F);


    }
    public IanusIncCommonHolographicBlock(String name, float hardness, float resistance){

        super(name,hardness,resistance);
        setCreativeTab(CreativeTabs.MISC);
        setLightLevel(5F);

    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return false;
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



    public boolean isCorporal(){
        return isCorporalHologram;
    }
    public void setCorporal(boolean corporal){
        this.isCorporalHologram = corporal;
    }
}
