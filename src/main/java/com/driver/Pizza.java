package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            price+=300;
        }
        else{
            price+=400;
        }

        bill="Base Price Of The Pizza: "+price+"\n";

    }

    
    public int getPrice(){
        return this.price;
    }

    boolean flag1=false;
    public void addExtraCheese(){
        // your code goes here
        if(flag1==false){
            this.price+=80;
            bill+="Extra Cheese Added: 80\n";
            flag1=true;
        }
    }

    boolean flag2=false;
    public void addExtraToppings(){
        // your code goes here
        if(flag2==false){
            if(isVeg==true){
                this.price+=70;
                bill+="Extra Toppings Added: "+70+"\n";
            }
            else{
                this.price+=120;
                bill+="Extra Toppings Added: "+120+"\n";
            }
            flag2=true;
        }
    }

    boolean flag3=false;
    public void addTakeaway(){
        // your code goes here
        if(flag3==false){
            this.price+=20;
            bill+="Paperbag Added: "+20+"\n";
            flag3=true;
        }
    }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+price;
        return this.bill;
    }
}
