public class exceptionDemo {
    String name=null;
    void show(){
        try{
            System.out.println(name.charAt(2) );
        }catch(NullPointerException e1){
            System.out.println( "exception: "+e1);
        }finally {
            System.out.println("done");
        }
    }
}
