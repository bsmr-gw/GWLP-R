
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P001_ComputerUser
    extends GWMessage
{

    private String userName;
    private String computerName;

    @Override
    public short getHeader() {
        return  1;
    }

    public String getUserName() {
        return userName;
    }

    public String getComputerName() {
        return computerName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P001_ComputerUser[");
        sb.append("userName=").append(this.userName.toString()).append(",computerName=").append(this.computerName.toString()).append("]");
        return sb.toString();
    }

}