package facilities;

import machineries.Equipments;

public class Gold extends Memberships implements Equipments {
    private int gold_price=300;
    String[] equipment_name;

    @Override
    public void gymnasium() {
        equipment_name= new String[]{"Bench press", "Shoulder press","Lats pull over","Dumbell press","Dumbell strech"};
    }

    @Override
    public void cardio() {
        equipment_name= new String[]{"Treadmill","Cycle","Stairmill","Rowing machine"};
    }

    @Override
    public void sona() {
        equipment_name= new String[]{"room1","room2","room3","room4","room5"};
    }

    @Override
    public void swimmingPool() {
        equipment_name= new String[]{"pool1","pool2","pool3"};
    }

}
