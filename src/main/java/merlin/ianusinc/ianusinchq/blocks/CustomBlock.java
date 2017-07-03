package merlin.ianusinc.ianusinchq.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class CustomBlock extends Block{

    public CustomBlock(String name,float hardness,float resistance)
    {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);


    }

    public CustomBlock(String name, float hardness, float resistance, Material mat){
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance)
    }
}
