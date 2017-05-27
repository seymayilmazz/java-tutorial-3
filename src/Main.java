/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        /* primitive types */
        boolean b = true;
        byte x = 123;
        short s = 452;
        int i = 1192;
        long l = 36923;
        float f = 23.2f;
        double d = 12.4;

        System.out.println("i : " + i);
        changePrimitiveTypeValue(i);
        System.out.println("i : " + i);

        Integer i1 = 5;
        System.out.println("i1 : " + i1);
        changePrimitiveTypeWrapperValue(i1);
        System.out.println("i1 : " + i1);

    }

    public static void changePrimitiveTypeValue(int i){
        i = 10;
    }

    public static void changePrimitiveTypeWrapperValue(Integer integer){
        integer = 6;
    }
}
