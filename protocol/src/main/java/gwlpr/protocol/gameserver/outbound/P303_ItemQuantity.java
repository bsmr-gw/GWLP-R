
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P303_ItemQuantity
    extends GWMessage
{

    private long itemLocalID;
    private long quantity;

    @Override
    public short getHeader() {
        return  303;
    }

    public void setItemLocalID(long itemLocalID) {
        this.itemLocalID = itemLocalID;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P303_ItemQuantity[");
        sb.append("itemLocalID=").append(this.itemLocalID).append(",quantity=").append(this.quantity).append("]");
        return sb.toString();
    }

}