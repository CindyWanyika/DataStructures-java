package Question7;

public class ProposalRecord {
    private String proposalID;
    private String title;
    private int proposalScore;
    private String investigator;

    public ProposalRecord(String id,String title,int score,String investigator){
        this.proposalID=id;
        this.title=title;
        this.proposalScore=score;
        this.investigator=investigator;
    }

    public String getProposalID() {
        return proposalID;
    }

    public void setProposalID(String proposalID) {
        this.proposalID = proposalID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProposalScore() {
        return proposalScore;
    }

    public void setProposalScore(int proposalScore) {
        this.proposalScore = proposalScore;
    }

    public String getInvestigator() {
        return investigator;
    }

    public void setInvestigator(String investigator) {
        this.investigator = investigator;
    }
    @Override
    public String toString(){
        return this.proposalID+" "+this.title+" "+this.proposalScore+" "+this.investigator;
    }
}
