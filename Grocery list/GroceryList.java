package com.ashish;

import java.util.ArrayList;
import java.util.Scanner;


public class GroceryList {
   private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() +" items in grocerylist");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". "+ groceryList.get(i));
        }
    }
    public void updateGroceryItem(int position, String item) {
        groceryList.set(position,item);
        System.out.println("Grocery item "+ (position) + " has been updated");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0) return groceryList.get(position);
        else return null;
     }

    static Scanner sc = new Scanner(System.in);
    static GroceryList gl = new GroceryList();

      public static void main(String[] args) {



          boolean quit = false;
          int choice = 0;

          while(!quit){
              System.out.println("Enter zero initially otherwise your choice: ");
              choice = sc.nextByte();
              sc.nextLine();
              switch (choice){
                  case 0:
                      printinstruction();
                      break;
                  case 1:
                      gl.printGroceryList();
                      break;
                  case 2:
                      gl.addItem();
                      break;
                  case 3:
                      gl.modifyItem();
                      break;
                  case 4:
                      gl.removeItem();
                      break;
                  case 5:
                      gl.searchForItem();
                      break;
                  case 6:
                      quit = true;
                      break;
              }

          }
      }

     public static void printinstruction(){
         System.out.println("\t 0 - To print instruction");
         System.out.println("\t 1 - To print the list of grocery items");
         System.out.println("\t 2 - To add item to your grocery list");
         System.out.println("\t 3 - To modify item in your grocery list");
         System.out.println("\t 4 - To remove item from your grocery list");
         System.out.println("\t 5 - To search item in your grocery item");
         System.out.println("\t 6 - To quit the application");
     }
     public void addItem(){
         System.out.println("Please enter grocery item: ");
         gl.addGroceryItem(sc.nextLine());
     }
     public void modifyItem(){
         System.out.println("Please Enter the item number: ");
         int itemNo = sc.nextInt();
         sc.nextLine();
         System.out.println("Please Enter the replacement item: ");
         String newItem = sc.nextLine();

         gl.updateGroceryItem(itemNo-1,newItem);
     }
     public static void searchForItem(){
         System.out.println("Item to search for: ");
         String searchItem = sc.nextLine();
         if(gl.findItem(searchItem)!=null){ //suggesting here make gl static?
             System.out.println("found "+ searchItem +" in grocer items at no. "
                     + gl.groceryList.indexOf(searchItem)+1);
         }
         else System.out.println(searchItem+ " is not in the grocerylist ");
     }
     public static void removeItem(){
         System.out.println("Enter Item to be removed for");
         String removeItem = sc.nextLine();
         if(gl.findItem(removeItem)!=null){ //suggesting here make gl static?
             System.out.println("found "+ removeItem +" in grocer items at no. "
                     + gl.groceryList.indexOf(removeItem)+1 + "now being removed...");
             gl.removeGroceryItem(gl.groceryList.indexOf(removeItem));
         }
         else System.out.println(removeItem+ " is not in the grocerylist ");

     }
}

