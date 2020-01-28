package kalkulator;

public class settergetter {
    int hasiln,hasilk,hasilkal;
    double hasilb;
    public void setnilainambah(int a, int b){
        this.hasiln=a+b;
    }
    public void setnilaikurang(int a, int b){
        this.hasilk=a-b;
    }
    public void setnilaikali(int a, int b){
        this.hasilkal=a*b;
    }
    public void setnilaibagi(int a, int b){
        this.hasilb=a/b;
    }
    public int getnilainambah(){
        return hasiln;
    }
    public int getnilaikurang(){
        return hasilk;
    }
    public int getnilaikali(){
        return hasilkal;
    }
    public double getnilaibagi(){
        return hasilb;
    }
}
