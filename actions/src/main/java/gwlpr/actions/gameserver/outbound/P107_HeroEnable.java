
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P107_HeroEnable
    extends GenericAction
{

    private int heroID;

    public short getHeader() {
        return  107;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

}