package homework.h9;


public class OurHonestVoteAccounter {
    public static void electionResult() {
        OfficialCandidate officialCandidate = new OfficialCandidate();
        IllegalCandidate illegalCandidate = new IllegalCandidate();
        RandomCandidate randomCandidate = new RandomCandidate();

        int offCan;
        int illCan;
        int randomCan;

        for (int i = 0; i < 100; i++) {
            offCan = officialCandidate.vote();
            illCan = illegalCandidate.vote();
            randomCan = randomCandidate.vote();
            if (offCan > illCan && offCan > randomCan) {
                officialCandidate.getCounterOfficialCandidate();
            } else if (illCan > offCan && illCan > randomCan) {
                illegalCandidate.getCounterIllegalCandidate();
            } else {
                randomCandidate.getCounterRandomCandidate();
            }
        }
        System.out.println("Оффициальный кондидат: " + officialCandidate.getCounterOfficialCandidate());
        System.out.println("Альтернативный кондидат: " + illegalCandidate.getCounterIllegalCandidate());
        System.out.println("Рандомный кондидат: " + randomCandidate.getCounterRandomCandidate());

        if ((officialCandidate.getCounterOfficialCandidate() < illegalCandidate.getCounterIllegalCandidate() ||
         officialCandidate.getCounterOfficialCandidate() < randomCandidate.getCounterRandomCandidate())){
            officialCandidate.setCounterOfficialCandidate(80);
            illegalCandidate.setCounterIllegalCandidate(3);
            randomCandidate.setCounterRandomCandidate(17);
        }
        System.out.println("-------------------------");
        System.out.println("Оффициальный кондидат: " + officialCandidate.getCounterOfficialCandidate());
        System.out.println("Альтернативный кондидат: " + illegalCandidate.getCounterIllegalCandidate());
        System.out.println("Рандомный кондидат: " + randomCandidate.getCounterRandomCandidate());
    }
}
