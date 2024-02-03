package com.codewithharry.shape;
class shape{
    public shape(){
        System.out.println("This is a Shape!");
    }
}
class rectangle extends shape{
    private int l, b, h;
    public void getdim(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void setarea(){
        System.out.println("Area:"+this.l*this.b);
    }
}
class square extends shape{
    private int a;
    public void getdim(int a){
        this.a=a;
    }
    public void setarea(){
        System.out.println("Area:"+this.a*this.a);
    }
}
class circle extends shape {
    private int r;
    public void getdim(int r){
        this.r=r;
    }
    public void setarea(){
        System.out.println("Area:"+Math.PI*this.r*this.r);
    }
}
class cylinder extends shape{
    private int r,h;
    public void getdim(int r,int h){
        this.r=r;
        this.h=h;
    }
    public void setarea(){
        double y=2*Math.PI*this.r*this.h+2*Math.PI*this.r*this.r;
        System.out.println("Area:"+y);
    }
    public void setvol(){
        double y=Math.PI*this.h*this.r*this.r;
        System.out.println("Volume:"+y);
    }
}
class sphere extends shape{
    private int r;
    public void getdim(int r){
        this.r=r;
    }
    public void setarea(){
        double y=4*Math.PI*this.r*this.r;
        System.out.println("Area:"+y);
    }
    public void setvol(){
        double y=(4/3)*Math.PI*this.r*this.r*this.r;
        System.out.println("Volume:"+y);
    }
}
public class task35qn1 {
    public static void main(String args[]){
        sphere s=new sphere();
        s.getdim(5);
        s.setarea();
        s.setvol();
    }
}
