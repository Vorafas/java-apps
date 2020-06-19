package LambdaDemo.LambdaArgumentDemo;

public class LambdaArgumentDemo {
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lorem ipsun dolor g hel pong va";
        String outStr = changeStr(new StringFunc() {
            @Override
            public String func(String str) {
                return str.replace(" ", "");
            }
        }, inStr);
//        StringFunc sf = (str) -> str.replace(" " , "");
//        String outStr = changeStr(sf, inStr);
            System.out.println(outStr);
    }
}
