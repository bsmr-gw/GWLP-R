
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P108_Unknown
    extends GWMessage
{

    private short unknown1;
    @IsArray(constant = false, size = 32, prefixLength = 2)
    private P108_Unknown.NestedUnknown2 [] unknown2;

    @Override
    public short getHeader() {
        return  108;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(P108_Unknown.NestedUnknown2 [] unknown2) {
        this.unknown2 = unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P108_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(Arrays.toString(this.unknown2)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown2
        implements NestedMarker
    {

        private int unknown1;
        private short unknown2;
        private long unknown3;
        private long unknown4;
        private short unknown5;

        public void setUnknown1(int unknown1) {
            this.unknown1 = unknown1;
        }

        public void setUnknown2(short unknown2) {
            this.unknown2 = unknown2;
        }

        public void setUnknown3(long unknown3) {
            this.unknown3 = unknown3;
        }

        public void setUnknown4(long unknown4) {
            this.unknown4 = unknown4;
        }

        public void setUnknown5(short unknown5) {
            this.unknown5 = unknown5;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown2[");
            sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append("]");
            return sb.toString();
        }

    }

}
