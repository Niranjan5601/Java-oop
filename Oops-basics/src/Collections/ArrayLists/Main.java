package Collections.ArrayLists;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
//            arr.add(sc.nextInt());
            arr.add(i+1);

        }
        System.out.println(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
//        System.out.println(arr2);

        arr2.set(1,200);
        arr2.forEach(a-> System.out.println(a+"\n"));

        Collections.sort(arr2);

        System.out.println(arr2);

        arr2.clear();
        System.out.println(arr2);


        ArrayList<String> arr3 = new ArrayList<>();

//        for (int i = 1; i < 10; i++) {
////            arr.add(sc.nextInt());
//            arr3.add(sc.nextLine());
//
//        }
        // print using iterator
        Iterator iterate = arr3.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next()+" ");
        }
        //print in reverse
        ListIterator<String> listIterate = arr3.listIterator(arr3.size());
        while(listIterate.hasPrevious()){
            System.out.print(listIterate.previous()+" ");
        }

        ArrayList<Human> arr4 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
           arr4.add(new Human(sc.nextInt(),sc.next()));
        }

        for(Human i: arr4){
            System.out.println(i.name+" "+i.age);
        }

    }



}
 class   Human{
    int age;
    String name;

    Human(int age,String name){
        this.age = age;
        this.name = name;
    }

}
