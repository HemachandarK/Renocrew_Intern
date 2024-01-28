 class employee{
    int salary;
    String name;
    public int getsal(){
        return this.salary;
    }
    public void setsal(int s){
        this.salary=s;
    }
    public void setname(String s){
        this.name=s;
    }
    public String getname(){
        return this.name;
    }
}
public class prac23qn1 {
    public static void main(String args[]){
        employee p1=new employee();
        p1.setname("Ram");
        String n=p1.getname();
        p1.setsal(7000);
        int s=p1.getsal();
        System.out.println(n);
        System.out.println(s);
    }
}
