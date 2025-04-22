public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Thilakes");
        System.out.println("original String: "+sb);

        //append
        sb.append(" KP");
        System.out.println("after-append : " + sb);

        //insert
        sb.insert(8,"h");
        System.out.println("after-insert : "+sb);

        //replace
        sb.replace(9, 12, "waran");
        System.out.println("replaced KP with waran : "+sb);

        //reverse
        sb.reverse();
        System.out.println("reversed : "+sb);
    }    
}