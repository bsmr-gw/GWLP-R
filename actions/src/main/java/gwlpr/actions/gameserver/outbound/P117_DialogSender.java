
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P117_DialogSender
    extends GenericAction
{

    private long agentID;

    public short getHeader() {
        return  117;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

}