package Collection_Management_System;

import java.math.BigInteger;
import java.util.*;

public class Lists_Sets {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<String> ls = new LinkedList<String>();
    static HashSet<String> hs = new HashSet<String>();
    static HashMap hm = new HashMap();

    public static void main(String[] args) {
        System.out.println("*************************** Collection Management System ***************************");
        while (true){
            System.out.println("Choice : \n 1. List Operations  \n 2. Set Operations  \n 3. Map Operations  \n 4. Exit");
            System.out.print("Enter Your Choice : ");
            int choice=0;
            try{
             choice = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println(" ❌ Enter in Digit!");
            }
            sc.nextLine();

            switch(choice){

                case 1 :
                    listOperations();
                    break;

                case 2 :
                    setOperations();
                    break;

                case 3 :
                    mapOperations();
                    break;

                case 4 :
                    System.out.println("Exiting.......");
                    System.out.println(" ✅ Exited Successfully !");
                    return;

                default:
                    System.out.println(" ❌ Invalid Operations !");
            }
        }
    }

    public static void listOperations(){
        while(true){
            System.out.println();
            System.out.println("Choose Your Operations: \n 1.Add an Elements:  \n 2.Remove an Element :  \n 3.Display all Elements : \n 4.Exit From List : ");
            System.out.print("Choice :");
            int operations=0;
            try {
                operations = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println(" ❌ Enter in Digit !");
            }
            sc.nextLine();
            String listItems;
            switch (operations){
                case 1 -> {
                    int j=0;
                    int n=0;
                    try {
                        System.out.print("Enter the size of the List : ");
                        n = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println(" ❌ Enter in Digits !");
                        }
                        while (j<=n) {
                            try {
                                    listItems = sc.nextLine();
                                    if(n>0) {
                                        ls.add(listItems);
                                    }
                            }catch (InputMismatchException e){
                                System.out.println("Enter the size of the List :");
                            } j++;
                       }
                        if(n>0) {
                        System.out.println(" ✅ Elements added successfully !");
                    }
                   }

                case 2 -> {
                    System.out.print("Enter your Element: ");
                    String removeItem = sc.nextLine();
                    if(ls.contains(removeItem)){
                        ls.remove(removeItem);
                        System.out.println(" ✅ Removed Successfully !");
                    }
                    else {
                        System.out.println(" ❌ Element Not Found !");
                    }
                }

                case  3 ->{
                    for(Object ob1 :ls){
                        System.out.println(ob1);
                    }
                }

                case 4 ->{
                    System.out.println("Exiting from List....");
                    System.out.println(" ✅ Exited Successfully !");
                    return;
                }

                default -> {
                    System.out.println(" ❌ Invalid Operations !");
                }
            }

        }

    }
    static void setOperations(){
        while(true){
            System.out.println();
            System.out.println("Choose Your Operations: \n 1.Add an Elements:  \n 2.Remove an Element :  \n 3.Display all Elements : \n 4.Exit From Set : ");
            System.out.print("Choice :");
            int operations=0;
            try {
                operations = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println(" ❌ Enter in Digit !");
            }
            sc.nextLine();
            String setItems;
            switch (operations){
                case 1 -> {
                    System.out.print("Enter the size of the Set and Elements Shouldn't be Duplicated : ");
                    int j=0;
                    int n=0;
                    try{
                         n = sc.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println(" ❌ Enter in Digit!");
                    }
                    while (j<=n) {
                        try {
                            setItems = sc.nextLine();
                            if(n>0)
                            hs.add(setItems);
                            j++;
                        }catch (InputMismatchException e){
                            System.out.println(" ❌ Enter in Digits !");
                        }
                    }
                    if(n>0) {
                        System.out.println(" ✅ Elements added successfully !");
                    }
                }

                case 2 -> {
                    System.out.print("Enter your Element: ");
                    String removeItem = sc.nextLine();
                    if(hs.contains(removeItem)){
                        hs.remove(removeItem);
                        System.out.println(" ✅ Removed Successfully !");
                    }
                    else {
                        System.out.println(" ❌ Element Not Found !");
                    }
                }

                case  3 ->{
                    for(Object ob1 :hs){
                        System.out.println(ob1);
                    }
                }

                case 4 ->{
                    System.out.println("Exiting from Set....");
                    System.out.println(" ✅ Exited Successfully !");
                    return;
                }

                default -> {
                    System.out.println(" ❌ Invalid Operations !");
                }
            }

        }

    }

    static void mapOperations(){
        while(true){
            System.out.println();
            System.out.println("Choose Your Operations: \n 1.Add an Elements:  \n 2.Remove an Element :  \n 3.Display all Elements : \n 4.Exit From Map : ");
            System.out.print("Choice : ");
            int operations=0;
            try {
                operations = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println(" ❌ Enter in Digit !");
            }
            sc.nextLine();
            String key;
            int value=0;
            switch (operations){
                case 1 -> {
                    System.out.println("Enter the Elements and it Shouldn't be Duplicated Keys:");
                    System.out.print("Enter the number of entries: ");
                    int n=0;
                    try{
                        n = sc.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println(" ❌ Enter in Digit!");
                    }
                    sc.nextLine();
                    int j=1;
                        while (j<=n) {
                            System.out.println("Enter Name (String): ");
                            key = sc.nextLine();

                            System.out.println("Enter Id (Integer): ");
                            try{
                                value = sc.nextInt();
                            }catch (InputMismatchException e){
                                System.out.println(" ❌ Enter in Digit!");
                            }
                            sc.nextLine(); // consume newline
                            hm.put(key, value);
                            j++;
                        }
                        if(n>0) {
                            System.out.println(" ✅ Elements added successfully !");
                        }
                }

                case 2 -> {
                    System.out.print("Enter your Element: ");
                    String removeItem = sc.nextLine();
                    if(hm.containsKey(removeItem)){
                        hm.remove(removeItem);
                        System.out.println(" ✅ Removed Successfully !");
                    }else if(hm.containsValue(removeItem)){
                        hm.remove(removeItem);
                        System.out.println(" ✅ Removed Successfully !");
                    }
                    else {
                        System.out.println(" ❌ Element Not Found !");
                    }
                }

                case  3 ->{
                    Set s2 = hm.entrySet();
                    Iterator i  = s2.iterator();
                   while (i.hasNext()){
                       System.out.println(i.next());
                   }
                }

                case 4 ->{
                    System.out.println("Exiting from Map....");
                    System.out.println(" ✅ Exited Successfully !");
                    return;
                }

                default -> {
                    System.out.println(" ❌ Invalid Operations !");
                }
            }

        }

    }
}
