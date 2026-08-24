import java.util.ArrayList;
import java.util.Iterator;
class ArrayListPrac{
    public static void main (String[] args){
//        ArrayList<Integer> list1= new ArrayList<>();
//        list1.add(23);
//        list1.add(100);
//        list1.add(11);
//        list1.add(57);
//        System.out.println(list1);
//        //now you can add more
//        list1.add(01);
//        System.out.println(list1);
//        //position wise add
//        list1.add(2,66);
//        System.out.println(list1);
//
//        ArrayList<Integer> list2= new ArrayList<>();
//        list2.add(100);
//        list2.add(200);
//        list1.addAll(list2);    //only same data type of list can be added into one list
//        System.out.println(list1);

//
//        list1.remove(Integer.valueOf(100));
//        System.out.println(list1);
//
//        list1.clear();
//        System.out.println(list1);

        ArrayList<Integer> list= new ArrayList<>();
        list.add(23);
        list.add(100);
        list.add(11);
        list.add(57);
        list.add(30);
        System.out.println(list);


        //iteration method:
        //for loop using size
//        for( int i=0; i< list.size(); i++){
//            System.out.println("elements are: "+ list.get(i));
//        }
        //foreach loop
//        for(Integer element: list){
//            System.out.println("elements are: "+ element);
//        }
//        //iterator<>
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println("Elements are: "+ itr.next());
        }

        

    }
}
