package tsteelworks.lib;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.util.ForgeDirection;

public interface IFacingLogic
{
    public byte getRenderDirection();

    public ForgeDirection getForgeDirection();

    public void setDirection(int side);

    public void setDirection(float yaw, float pitch, EntityLivingBase player);

    /** This will be added next version
    * public void setDirection(int side, float yaw, float pitch, EntityLivingBase player); */
}