package merlin.ianusinc.ianusinchq.tileentities;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.model.obj.OBJModel;
import org.apache.logging.log4j.Level;

/**
 * Created by Seine Eiligkeit on 07.07.2017.
 */
public class IanusIncRocketBullpglEntity extends TileEntity{

    protected static AxisAlignedBB TOP_AABB;

    public IanusIncRocketBullpglEntity(AxisAlignedBB aabb)
    {
        super();
        IanusIncHq.LOGGER.log(Level.INFO,"created rocket tile entity");
        TOP_AABB = aabb;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return TOP_AABB;
        //return new AxisAlignedBB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 2, pos.getZ() + 1);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        return tagCompound;
    }

    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
    }

}
