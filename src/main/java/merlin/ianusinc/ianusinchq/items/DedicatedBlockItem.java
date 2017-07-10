package merlin.ianusinc.ianusinchq.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by Seine Eiligkeit on 10.07.2017.
 */
public class DedicatedBlockItem extends ItemBlock {

    public DedicatedBlockItem(Block block){
        super(block);
        this.setCreativeTab(CreativeTabs.MISC);
    }

    public static Item provideInstance(Block block){
        return new DedicatedBlockItem(block);
    }

    public Block getMyBlock(){
        return this.block;
    }
}
