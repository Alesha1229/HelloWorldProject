package homework.h9;


public class OfficialCandidate extends Voter{
    private int counterOfficialCandidate;
    public int getCounterOfficialCandidate(){
        return counterOfficialCandidate++;
    }

    public void setCounterOfficialCandidate(int counterOfficialCandidate) {
        this.counterOfficialCandidate = counterOfficialCandidate;
    }
}
