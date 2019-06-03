package facilities;

import machineries.Equipments;

public class Diamond extends Memberships implements Equipments {
    public int diamond_price=500;
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
        equipment_name= new String[]{"Treadmill","Cycle","Stairmill","Rowing machine"};
        System.out.println("Equipments For Cardio :");
        for(int i = 0 ; i<equipment_name.length;i++) {
            System.out.println("Machine "+i+" "+equipment_name[i]);
        }
        equipment_name=null;
    }

    @Override
    public void sona() {
        equipment_name= new String[]{"room1","room2","room3","room4","room5"};
        System.out.println("Rooms For Sona :");
        for(int i = 0 ; i<equipment_name.length;i++) {
            System.out.println("Room "+i+" "+equipment_name[i]);
        }
        equipment_name=null;
    }

    @Override
    public void swimmingPool() {
        equipment_name= new String[]{"pool1","pool2","pool3"};
        System.out.println("Pools For Sona :");
        for(int i = 0 ; i<equipment_name.length;i++) {
            System.out.println("Pool "+i+" "+equipment_name[i]);
        }
        equipment_name=null;
    }
}
