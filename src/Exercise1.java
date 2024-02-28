public class Exercise1 {
    public static void main (String [] args){
        //3.2.1
        /*
        "==" - равно, "!=" - не равно
        ">=" - больше чем или равно, "<=" - меньше чем или равно
        ">" - больше чем, "<" - меньше чем,
         */
        //3.2.2
        int x = 1;
        boolean b1 = x > 0;
        System.out.println(b1);

        boolean b2 = x < 0;
        System.out.println(b2);

        boolean b3 = x != 0;
        System.out.println(b3);

        boolean b4 = x >= 0;
        System.out.println(b4);

        boolean b5 = x != 1;
        System.out.println(b5);

        //3.2.3
        //boolean b = true;
        //i = (int)b;
        //int i = 1;
        //boolean b = (boolean)i;
        // несовместимые типы данных, bool не может быть конвертирован в int

    }
}
