
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;
import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P108_Unknown
    extends GenericAction
{

    private short unknown1;
    @IsArray(constant = false, size = 32, prefixLength = 2)
    private P108_Unknown.NestedUnknown2 [] unknown2;

    public short getHeader() {
        return  108;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(P108_Unknown.NestedUnknown2 [] unknown2) {
        this.unknown2 = unknown2;
    }

    public final class NestedUnknown2
        implements NestedMarker
    {

        private int unknown1;
        private short unknown2;
        private long unknown3;
        private long unknown4;
        private short unknown5;

    }

}