package homework.h9;


public class RandomCandidate extends Voter {
    private int counterRandomCandidate;

    public int getCounterRandomCandidate() {
        return counterRandomCandidate++;
    }

    public void setCounterRandomCandidate(int counterRandomCandidate) {
        this.counterRandomCandidate = counterRandomCandidate;
    }
}
