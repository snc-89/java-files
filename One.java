public class One {
 private int field = 0;
 One(int f){field = f;}
 void change(int g){field = g;}
 void add(One other){field = field + other.field;}


 public static void main(){
    One foo = new One(-25);
    System.out.println(foo.field);
    foo.add(new One(38));
    System.out.println(foo.field);

 }
}
