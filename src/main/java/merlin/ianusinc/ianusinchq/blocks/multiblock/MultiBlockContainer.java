package merlin.ianusinc.ianusinchq.blocks.multiblock;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

/**
 * Created by Seine Eiligkeit on 10.07.2017.
 */
public class MultiBlockContainer {

    private ArrayList<BlockPos> multiBlockMemberList = new ArrayList();
    private World world;

    public MultiBlockContainer(World worldIn){
        this.world = worldIn;
    }

    public void addMultiblockMembers(BlockPos...location){
        for(BlockPos pos : location){
            multiBlockMemberList.add(pos);
        }
    }

    public void destroyMultiblock(){
        if(!multiBlockMemberList.isEmpty()) {
            for (BlockPos toDestroy : multiBlockMemberList) {
                world.setBlockToAir(toDestroy);
            }
        }
    }

}
