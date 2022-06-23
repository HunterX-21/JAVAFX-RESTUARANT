package sample;

import java.util.ArrayList;

public class Menu {
    private ArrayList<item> breakfast= new ArrayList<item>();
    private ArrayList<item> lunch = new ArrayList<item>();
    private ArrayList<item> dinner= new ArrayList<item>();

    public Menu(){
        fillMenu();
    }
    //return specific item
    public item getBreakfast(int index){
        return breakfast.get(index);
    }
    //size of category
    public int getBreakfastSize(){
        return breakfast.size();
    }
    //return all breakfast
    public String getAllBreakfast (){
        String aMenu ="";
        aMenu += "BREAKFAST: \n";
        for (int i=0; i < breakfast.size();i++) {
            item b= breakfast.get(i) ;
            //add id, name and price
            aMenu+=  (i+1) + " "+ b.toString() + "\n";
        }
        return aMenu;
    }

    public item getLunch(int index){
        return lunch.get(index);
    }
    //size of category
    public int getLunchSize(){
        return lunch.size();
    }
    //return all lunch
    public String getAllLunch (){
        String aMenu ="";
        aMenu += "LUNCH: \n";
        for (int i=0; i < lunch.size();i++) {
            item l= lunch.get(i) ;
            //add id, name and price
            aMenu+=  (i+4) + " "+ l.toString() + "\n";
        }
        return aMenu;
    }
    //dinner
    public item getDinner(int index){
        return dinner.get(index);
    }
    //size of category
    public int getDinnerSize(){
        return dinner.size();
    }
    //return all Dinner
    public String getAllDinner (){
        String aMenu ="";
        aMenu += "DINNER: \n";
        for (int i=0; i < dinner.size();i++) {
            item d= dinner.get(i) ;
            //add id, name and price
            aMenu+=  (i+7) + " "+ d.toString() + "\n";
        }
        return aMenu;
    }


    private void fillMenu() {
        //bb
        breakfast.add(new item("Bread","Breakfast",10));
        breakfast.add(new item("Eggs","Breakfast",12));
        breakfast.add(new item("Oat Meal","Breakfast",15));
        //LL
        lunch.add(new item("Rice","Lunch",25));
        lunch.add(new item("French Fries","Lunch",30));
        lunch.add(new item("FUFU","Lunch",20));
        //DD
        dinner.add(new item("Tea","Dinner",5));
        dinner.add(new item("Pizza","Dinner",10));
        dinner.add(new item("Chinese","Dinner",16));
    }
    //PRINT ENTIRE MENU
    public String toString(){
        String menu="";
        menu+="Gerald's Menu\n"+
                "-----------------------------------------------------\n";
        menu += getAllBreakfast() + "\n";
        menu += getAllLunch() + "\n";
        menu += getAllDinner()+ "\n";
        return menu;
    }

}
