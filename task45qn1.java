import java.time.LocalDate;
import java.util.*;
class book{
    private ArrayList <String> name=new ArrayList<>();
    private ArrayList <String> author=new ArrayList<>();
    private ArrayList <String> issto=new ArrayList<>();
    private ArrayList <String> isson=new ArrayList<>();
    public void add(String name,String author){
        this.name.add(name);
        this.author.add(this.name.indexOf(name),author);
        this.issto.add(this.name.indexOf(name),null);
        this.isson.add(this.name.indexOf(name),null);
        System.out.println("Added:"+name);
    }
    public void ret(String name){
        this.issto.set(this.name.indexOf(name),null);
        this.isson.set(this.name.indexOf(name),null);
        System.out.println("Returned");
    }
    public boolean iss(String name){
        if(this.issto.get(this.name.indexOf(name))!=null){
            System.out.println("Already Issued!-Not Available");
            return false;
        }
        LocalDate l=LocalDate.now();
        String ls=l.toString();
        this.issto.set(this.name.indexOf(name),name);
        this.isson.set(this.name.indexOf(name),ls);
        System.out.println("Issued");
        return true;
    }
}
class user_db extends book{
    private ArrayList <String> name=new ArrayList<>();
    private ArrayList <String> issued=new ArrayList<>();
    public void add(String name){
        this.name.add(name);
        this.issued.add(this.name.indexOf(name),null);
        System.out.println("Registered");
    }
    public boolean check(String n){
        for(String k:name){
            if(n==k){
                return true;
            }
        }
        return false;
    }
    public void addb(String name,String a){
        add(name,a);
    }
    public void get_book(String name){
        System.out.println(this.issued.get(this.name.indexOf(name)));
    }
    public void retb(String name,String bn){
        ret(bn);
        this.issued.set(this.name.indexOf(name),null);
        System.out.println("Recorded");
    }
    public void issb(String name,String b){
        if(iss(b)){
            this.issued.set(this.name.indexOf(name),b);
        System.out.println("Recorded");
        }
        
    }
}
class user extends user_db{
    private String peyar;
    public user(String n){
        if(!check(n)){
            System.out.println("Not registered");
            return;
        }
    }
    public void reg(String n){
        add(n);
        this.peyar=n;
    }
    public void acc(){
        if(!check(peyar)){
            System.out.println("Not registered");
            return;
        }
        System.out.println("Books:");
        get_book(peyar);
    }
    public void add_book(String n,String a){
        if(!check(peyar)){
            System.out.println("Not registered");
            return;
        }
        addb(n,a);
    }
    public void return_book(String bn){
        if(!check(peyar)){
            System.out.println("Not registered");
            return;
        }
        retb(peyar,bn);
    }
    public void iss_book(String bn){
        if(!check(peyar)){
            System.out.println("Not registered");
            return;
        }
        issb(peyar,bn);
    }
}
public class task45qn1 {
    public static void main(String[] args) {
        user u1=new user("hems");
        u1.reg("hems");
        u1.add_book("ps", "kalki");
        u1.iss_book("ps");
        
    }
}
