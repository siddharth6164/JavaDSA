package ENUMSJAVA;

// DAY is like a class and this is final and inside DAYS are method / variable this variable are static, fincal
enum DAY {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    DAY(){
        System.out.println("ENUMS Constructor ");
    }
}

public class enumskeyword {
    public static void main(String[] args) {
        System.out.println(DAY.MONDAY);
        System.out.println(DAY.TUESDAY);
        System.out.println(DAY.WEDNESDAY);
        System.out.println(DAY.TUESDAY);
    }
}
