
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P234_TitleTrackStatus
    extends GenericAction
{

    private long titleTrackId;
    private long titleGroupId;
    private long currentPointsInTitle;
    private long currentTitleRankId;
    private long pointsNeededToReachCurrentRank;
    private long nextTitleRankId;
    private long pointsNeededToReachNextRank;
    private long maxRank;
    private long maxRankId;
    private String pointName;
    private String description;

    public short getHeader() {
        return  234;
    }

    public void setTitleTrackId(long titleTrackId) {
        this.titleTrackId = titleTrackId;
    }

    public void setTitleGroupId(long titleGroupId) {
        this.titleGroupId = titleGroupId;
    }

    public void setCurrentPointsInTitle(long currentPointsInTitle) {
        this.currentPointsInTitle = currentPointsInTitle;
    }

    public void setCurrentTitleRankId(long currentTitleRankId) {
        this.currentTitleRankId = currentTitleRankId;
    }

    public void setPointsNeededToReachCurrentRank(long pointsNeededToReachCurrentRank) {
        this.pointsNeededToReachCurrentRank = pointsNeededToReachCurrentRank;
    }

    public void setNextTitleRankId(long nextTitleRankId) {
        this.nextTitleRankId = nextTitleRankId;
    }

    public void setPointsNeededToReachNextRank(long pointsNeededToReachNextRank) {
        this.pointsNeededToReachNextRank = pointsNeededToReachNextRank;
    }

    public void setMaxRank(long maxRank) {
        this.maxRank = maxRank;
    }

    public void setMaxRankId(long maxRankId) {
        this.maxRankId = maxRankId;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}