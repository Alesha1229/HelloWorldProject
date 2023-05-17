package classwork.c15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Steve",10);
        Human father = new Human("Dad",40);
        Human mother = new Human("Mom", 35);
        Human anonim = new Human(null,50);
        human.setFather(father);
        human.setMother(mother);
        System.out.println(human);
        System.out.println(anonim);
        System.out.println(human.getFather().getName());
        //System.out.println(human.getFather().getFather().getName());
        if(human.getFather() != null &&
                human.getFather().getFather()!= null &&
        human.getFather().getFather().getName() != null){
            System.out.println(human.getFather().getFather().getName());
        } else {
            System.out.println("unknown name");
        }

        Optional<Human> fatherOpt = Optional.ofNullable(anonim.getFather());
        if (fatherOpt.isPresent()){
            System.out.println(fatherOpt.get().getName());
        }
        fatherOpt.ifPresent(f -> System.out.println(f.getName()));
        //Human possibleFather = fatherOpt.orElseThrow();
        //Human possibleFather = fatherOpt.orElseThrow(() -> new RuntimeException("Here"));
        fatherOpt.ifPresentOrElse(fOpt -> System.out.println(fOpt.getName()),
                () -> System.out.println("Anonim"));

        Human protector = new Human("Prot",100);
        Human ourDef = fatherOpt.orElse(protector);
        Optional.ofNullable(human.getFather())
                .orElse(getDefaultHuman());
        Optional.ofNullable(human.getFather())
                .orElseGet(HumanMain::getDefaultHuman);

        fatherOpt.map(f -> f.getFather())
                .map(f -> f.getFather())
                .ifPresent(ded -> System.out.println(ded.getName()));

        Optional.ofNullable(human)
                .map(Human::getFather)
                .filter(f -> f.getName().startsWith("Ab"))
                .ifPresent(f -> System.out.println(f));

    }
    private  static Human getDefaultHuman(){
        System.out.println("This is default human");
        return new Human("Prot",100);
    }
}
