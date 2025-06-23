package lec16.test;


public class test1 {

    public static int getFullPageCount(int itemsCount, int intemsPerPage) {
        return itemsCount/intemsPerPage;
    }



    public static void main(String[] args) {

        System.out.println(getFullPageCount(10, 5));
        System.out.println(getFullPageCount(7,2));
    }


}
