package com.fourpillers.useoffinal;

//Can not extends cuz final keyword used in Car class
public class EVCar extends Car{

   //Can not override cuz final
   @Override
   public void airBags() {
       System.out.println("2 AirBags");
   }
}
