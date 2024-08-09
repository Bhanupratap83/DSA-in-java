import java.util.ArrayList;

public class ArrayListClassroom {
    public static void main(String[] args) {
        // Integer | Boolean | Float ....hamesha first letter capital rahega
        ArrayList<Integer> list = new ArrayList<>();
        
        // add operation
        list.add(1);
        list.add(2);
        list.add(3);

        // list.add(1,9);  // indx 1 pe 9 add kr diya baaki shift ho jaenge aage
        // System.out.println(list);

        // get operation
        // int element = list.get(1);
        // System.out.println(element);

        //delete
        // list.remove(2);
        // System.out.println(list);

        //set element at index
        // list.set(2,10);

        //contains element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // System.out.println(list.size());

        // //print the arrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //reverse printing of arraylist
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
