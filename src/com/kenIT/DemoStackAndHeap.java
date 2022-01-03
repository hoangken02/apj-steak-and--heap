package com.kenIT;

public class DemoStackAndHeap {
    public static void main(String[] args) {//Khai báo 1 hàm main() tại steak
            int a = 10;// Khai báo 1 biến a tại steak
           Object object = new Object(); //Khai báo 1 biến object tham chiếu đến đội tượng Object được lưu ở Heap
            String s = "ád";// Khai báo 1 biến s tham chiếu đến String pool
            DemoStackAndHeap demoStackAndHeap = new DemoStackAndHeap();
            demoStackAndHeap.foo(object);
    }// kết thúc và giải phóng hàm main() tại steak

    private static void foo(Object param) { // hàm foo() được lưu trong steak và param là kiểu Object
        String str = param.toString(); //biến str được lưu tại steak tham chiếu đến vùng nhớ của String pool
        System.out.println(str); //
    }//giải phóng hàm foo() tại steak
}
