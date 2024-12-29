import java.lang.reflect.Field;
import java.util.ArrayList;

public class createArray {
    public static void main(String[] args) throws NoSuchFieldException {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayList = new ArrayList<>(11);
        arrayList.add(101);//0
        arrayList.add(102);//1
        arrayList.add(103);//2

//        System.out.println(arrayList.get(2));
//        System.out.println(arrayList.size());
//
//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//
//        for(int x:arrayList){
//            System.out.println(x);
//        }
//        System.out.println(arrayList.contains(104));
//        System.out.println(arrayList.contains(103));
//
//        arrayList.remove(2);
//        for(int x:arrayList){
//            System.out.println(x);
//        }
//
//        arrayList.add(1,104);
//        for(int x:arrayList){
//            System.out.println(x);
//        }
//      replacement
//        arrayList.set(1,105);
//        for(int x:arrayList){
//            System.out.println(x);
//        }
        System.out.println(arrayList);
        

    }
}