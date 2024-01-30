class library{
    private String a[]=new String[100];
    static private int i=0;
    private String b[]=new String[100];
    static private int p=0;
    public void addbook(String d){
        a[i++]=d;
    }
    public void show(){
        System.out.println("AVAILABLE BOOKS:");
        for(int j=0;j<a.length;j++){
            if(a[j]!=null){
                System.out.printf("BOOK-%d:%s\n",j,a[j]);
            }
        }
    }
    public void issue(String h){
        for(int j=0;j<a.length;j++){
            if(a[j]==h){
                System.out.println("BOOK:"+a[j]+" issued");
                b[p++]=h;
                a[j]=null;
            }
        }
    }
    public void showissue(){
        System.out.println("ISSUED BOOKS:");
        for(int j=0;j<b.length;j++){
            if(b[j]!=null){
                System.out.printf("BOOK-%d:%s\n",j,b[j]);
            }
        }
    }

}
public class task32qn1 {
    public static void main(String args[]){
        library a=new library();
        a.addbook("ps");
        a.addbook("harry");
        a.show();
        a.issue("ps");
        a.showissue();
        a.show();
    }
}
