
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P028_Unknown
    extends GWMessage
{

    private long unknown1;
    private String unknown2;

    @Override
    public short getHeader() {
        return  28;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public String getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P028_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append("]");
        return sb.toString();
    }

}
