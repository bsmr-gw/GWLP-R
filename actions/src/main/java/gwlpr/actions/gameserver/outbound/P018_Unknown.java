
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.utils.IsArray;
import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P018_Unknown
    extends GenericAction
{

    @IsArray(constant = false, size = 128, prefixLength = 2)
    private long[] unknown1;

    public short getHeader() {
        return  18;
    }

    public void setUnknown1(long[] unknown1) {
        this.unknown1 = unknown1;
    }

}