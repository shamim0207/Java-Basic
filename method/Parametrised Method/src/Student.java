// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student {
    String name,gender;
    int id;
    public void setfunction(String n,String m,int ph){
        /* for receive parametrise
        (data type variable name)
         */
        this.name=n;
        this.gender=m;
        this.id=ph;
    }
    public void getfunction(){
        System.out.println("name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("id: "+id);
    }
}