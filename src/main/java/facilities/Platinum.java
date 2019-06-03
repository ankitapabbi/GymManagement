package facilities;

import machineries.Equipments;

public class Platinum extends Memberships implements Equipments {
    private int platinum_price=400;
    String[] equipment_name;

    public int getPlatinum_price() {
        return platinum_price;
    }

    public void setPlatinum_price(int platinum_price) {
        this.platinum_price = platinum_price;
    }

    public void equiped(){
         gymnasium();
         cardio();
         sona();
         swimmingPool();
     }
    @Override
    public void gymnasium() {
        equipment_name= new String[]{"Bench press", "Shoulder press","Lats pull over","Dumbell press","Dumbell strech"};
        for(int i = 0 ; i<equipment_name.length;i++){
            System.out.println(equipment_name[i]);
        }
    }

    @Override
    public void cardio() {
        equipment_name= new String[]{"Treadmill","Cycle","Stairmill","Rowing machine"};
        for(int i = 0 ; i<equipment_name.length;i++){
            System.out.println(equipment_name[i]);
        }
    }

    @Override
    public void sona() {
        equipment_name= new String[]{"room1","room2","room3","room4","room5"};
        for(int i = 0 ; i<equipment_name.length;i++){
            System.out.println(equipment_name[i]);
        }
    }

    @Override
    public void swimmingPool() {
        equipment_name= new String[]{"pool1","pool2","pool3"};
        for(int i = 0 ; i<equipment_name.length;i++){
            System.out.println(equipment_name[i]);
        }
    }

}
