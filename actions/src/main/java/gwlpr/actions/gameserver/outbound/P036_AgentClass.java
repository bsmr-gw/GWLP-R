
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P036_AgentClass
    extends GenericAction
{

    private long agent;
    private long agentClass;

    public short getHeader() {
        return  36;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    public void setAgentClass(long agentClass) {
        this.agentClass = agentClass;
    }

}