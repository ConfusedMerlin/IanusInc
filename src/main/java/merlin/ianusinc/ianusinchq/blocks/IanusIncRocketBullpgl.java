package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import merlin.ianusinc.ianusinchq.blocks.multiblock.IMultiBlock;
import merlin.ianusinc.ianusinchq.blocks.multiblock.MultiBlockContainer;
import merlin.ianusinc.ianusinchq.tileentities.IanusIncRocketBullpglEntity;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBed;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;

import javax.annotation.Nullable;

/**
 * Created by Seine Eiligkeit on 01.07.2017.
 */
public class IanusIncRocketBullpgl extends CustomBlock{

    private MultiBlockContainer mbc;
    protected static final AxisAlignedBB TOP_AABB = new AxisAlignedBB(0D, 0D, 0D, 1D, 1D, 1D);
    //protected static final AxisAlignedBB TOP_AABB = new AxisAlignedBB(0.1D, 0.1D, 0.1D, 0.9D, 1.9D, 0.9D);
    //public static final PropertyDirection FACING = PropertyDirection.create("facing");

    public IanusIncRocketBullpgl(String name, float hardness, float resistance, int harvestLevel) {
        super(name,hardness,resistance);
        setHarvestLevel("pickaxe", harvestLevel);
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TOP_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new IanusIncRocketBullpglEntity(TOP_AABB);
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    /*
    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    public static final PropertyBool BASE = PropertyBool.create("base");

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this,FACING,BASE);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int meta = state.getValue(FACING).getIndex();
        if (state.getValue(BASE)) {
            meta |= 8;
        }
        return meta;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getFront(meta & 7);
        if (facing.getAxis() == EnumFacing.Axis.Y) {
            facing = EnumFacing.NORTH;
        }
        boolean isBase = (meta & 8) > 0;
        return getDefaultState().withProperty(FACING, facing).withProperty(BASE, isBase);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        EnumFacing facing = EnumFacing.getDirectionFromEntityLiving(pos, placer);
        if(facing.getAxis() == EnumFacing.Axis.Y) {
            facing = EnumFacing.NORTH;
        }
        worldIn.setBlockState(pos,this.getDefaultState().withProperty(FACING,facing).withProperty(BASE,true));
        worldIn.setBlockState(pos.up(),this.getDefaultState().withProperty(BASE,false));

    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        super.breakBlock(worldIn, pos, state);
        if (worldIn.getBlockState(pos.up()).getBlock() == this) {
            worldIn.setBlockToAir(pos.up());
        } else if (worldIn.getBlockState(pos.down()).getBlock() == this) {
            worldIn.setBlockToAir(pos.down());
        }
    }
    */
}


