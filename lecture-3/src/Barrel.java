
public class Barrel {
    public static void main(String[] args) {
        Barrel a = new Barrel(5);
        Barrel b = new Barrel(7);
        a.fill();
        b.fill();
        System.out.println(a.getCurrent() + " " + b.getCurrent());
        a.clear();
        b.pourTo(a);
        System.out.println(a.getCurrent() + " " + b.getCurrent());
    }

    int V;
    int CurrentV;

    Barrel(int v){
        V=v;
        CurrentV=0;
    }

     void pourTo(Barrel barrel) {
       if (this.CurrentV<barrel.V-barrel.CurrentV){
           barrel.CurrentV+=this.CurrentV;
           this.CurrentV=0;
       }
         else{
           this.CurrentV=this.CurrentV-(barrel.V-barrel.CurrentV);
           barrel.CurrentV=barrel.V;
       }
    }
     void pourFrom(Barrel barrel){
         barrel.pourTo(this);

     }

     int getCurrent() {

         return this.CurrentV;
    }

    void clear() {
        this.CurrentV=0;
    }

     void fill() {
         this.CurrentV=V;
    }


}
