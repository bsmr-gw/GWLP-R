
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P395_InstanceLoadDistrictInfo
    extends GenericAction
{

    private long charAgent;
    private int mapID;
    private short isExplorable;
    private long districtAndRegion;
    private short language;
    private short isObserver;

    public short getHeader() {
        return  395;
    }

    public void setCharAgent(long charAgent) {
        this.charAgent = charAgent;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public void setIsExplorable(short isExplorable) {
        this.isExplorable = isExplorable;
    }

    public void setDistrictAndRegion(long districtAndRegion) {
        this.districtAndRegion = districtAndRegion;
    }

    public void setLanguage(short language) {
        this.language = language;
    }

    public void setIsObserver(short isObserver) {
        this.isObserver = isObserver;
    }

}