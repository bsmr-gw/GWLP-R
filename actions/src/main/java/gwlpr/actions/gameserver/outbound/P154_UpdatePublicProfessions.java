
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P154_UpdatePublicProfessions
    extends GenericAction
{

    private long agentID;
    private short primaryProf;
    private short secondaryProf;

    public short getHeader() {
        return  154;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setPrimaryProf(short primaryProf) {
        this.primaryProf = primaryProf;
    }

    public void setSecondaryProf(short secondaryProf) {
        this.secondaryProf = secondaryProf;
    }

}