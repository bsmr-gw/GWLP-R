
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P028_MovementSpeed
    extends GenericAction
{

    private long agent;
    private float speed;

    public short getHeader() {
        return  28;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}