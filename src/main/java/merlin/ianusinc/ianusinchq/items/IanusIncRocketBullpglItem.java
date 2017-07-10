package merlin.ianusinc.ianusinchq.items;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import merlin.ianusinc.ianusinchq.blocks.IanusIncMultiBlockDummy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.GameData;
import org.apache.logging.log4j.Level;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncRocketBullpglItem extends DedicatedBlockItem {


    public IanusIncRocketBullpglItem(Block block){
        super(block);
    }


    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        IanusIncHq.LOGGER.log(Level.INFO,"HI I'M THE ITEM WITH THE ROCKETS IDENTY");
        if(facing != EnumFacing.UP){
            IanusIncHq.LOGGER.log(Level.INFO,"Placement-Facing for rocket bad!");
            return EnumActionResult.FAIL;
        }else{
            try {

                IBlockState bottomBlock = this.getMyBlock().getDefaultState();
                IBlockState upperBlock = Block.getBlockFromName("ianusinchq:ianus_inc_multi_block_dummy").getDefaultState();

                worldIn.setBlockState(pos.up(1), bottomBlock);
                worldIn.setBlockState(pos.up(2), upperBlock);
                IanusIncHq.LOGGER.log(Level.INFO, "The code for creating the multiblock did run... so, what did you got?");
            }catch(Exception e){
                IanusIncHq.LOGGER.log(Level.ERROR, "Didn't work... again :'( ");
                return EnumActionResult.FAIL;
            }
            return EnumActionResult.SUCCESS;
        }

        //return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
