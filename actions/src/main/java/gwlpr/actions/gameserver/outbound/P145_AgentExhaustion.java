
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P145_AgentExhaustion
    extends GenericAction
{

    private long agent;
    private long amount;
    private long regeneration;

    public short getHeader() {
        return  145;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setRegeneration(long regeneration) {
        this.regeneration = regeneration;
    }

}