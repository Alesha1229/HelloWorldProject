package homework.h9;
;

public class IllegalCandidate extends Voter{
    private int counterIllegalCandidate;
    public int getCounterIllegalCandidate(){
        return counterIllegalCandidate++;
    }

    public void setCounterIllegalCandidate(int counterIllegalCandidate) {
        this.counterIllegalCandidate = counterIllegalCandidate;
    }
}
