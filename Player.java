class player
{
    String name;
    int age;
    player(String n, int a)
    {
        name=n; 
        age=a;
    }
    void show()
    {
        System.out.println("\n");
        System.out.println("Player name : "+name);
        System.out.println("Age : "+age);
    }
}
class cricket_player extends player
{
    String type;
    cricket_player(String n, String t,int a)
    {
        super(n,a);
        type=t;
    }
    public void show()
    {
        super.show();
        System.out.println("Player type : "+type);
    }
}
class football_player extends player
{
    String type;
    football_player(String n, String t,int a)
    {
        super(n,a);
        type=t;
    }
    public void show()
    {
        super.show();
        System.out.println("Player type : "+type);
    }
}
class hockey_player extends player
{
    String type;
    hockey_player(String n, String t,int a)
    {
        super(n,a);
        type=t;
    }
    public void show()
    {
        super.show();
        System.out.println("Player type : "+type);
    }
}
class Player
{
    public static void main(String args[])
    {
        cricket_player c1 = new cricket_player("Virat","Cricket",30);
        football_player c2 = new football_player("Mbappe","Football",20);
        hockey_player c3 = new hockey_player("Salah","Hockey",25);
        c1.show();
        c2.show();
        c3.show();
    }
}
