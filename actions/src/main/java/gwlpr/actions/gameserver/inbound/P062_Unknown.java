
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.utils.IsArray;
import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P062_Unknown
    extends GenericAction
{

    @IsArray(constant = false, size = 256, prefixLength = 1)
    private short[] unknown1;

    public short getHeader() {
        return  62;
    }

    public short[] getUnknown1() {
        return unknown1;
    }

}