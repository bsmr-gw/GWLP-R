
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P215_SkillActivated
    extends GenericAction
{

    private long agentID;
    private int skillID;
    private long skillInstance;

    public short getHeader() {
        return  215;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public void setSkillInstance(long skillInstance) {
        this.skillInstance = skillInstance;
    }

}