package merlin.ianusinc.ianusinchq.blocks;


import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncCarbonConcrete extends CustomBlock
{
    public IanusIncCarbonConcrete(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);

    }
}
