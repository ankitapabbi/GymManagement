package facilities;

import machineries.Equipments;

public class Silver extends Memberships implements Equipments {
    public int silver_price=200;
    String[] equipment_name;


    @Override
    public void gymnasium() {
        equipment_name= new String[]{"Bench press", "Shoulder press","Lats pull over","Dumbell press","Dumbell strech"};
        System.out.println("Equipments For Gymnasium :");
        for(int i = 0 ; i<equipment_name.length;i++) {
            System.out.println("Machine "+i+" "+equipment_name[i]);
        }
        equipment_name=null;
    }

    @Override
    public void cardio() {

    }

    @Override
    public void sona() {

    }

    @Override
    public void swimmingPool() {

    }

}
