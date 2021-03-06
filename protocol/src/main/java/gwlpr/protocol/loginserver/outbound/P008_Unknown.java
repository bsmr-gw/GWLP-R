
package gwlpr.protocol.loginserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P008_Unknown
    extends GWMessage
{

    private long unknown1;
    private long unknown2;
    @IsArray(constant = true, size = 24, prefixLength = -1)
    private byte[] unknown3;
    private long unknown4;

    @Override
    public short getHeader() {
        return  8;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(byte[] unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(long unknown4) {
        this.unknown4 = unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P008_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(this.unknown4).append("]");
        return sb.toString();
    }

}
