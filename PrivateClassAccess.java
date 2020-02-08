class room
{
private int l,b;
room(int x,int y)
{ l=x; b=y;}
int area()
{return(l*b);}
}
class class_room extends room
{
int h;
class_room(int x,int y,int z)
{
super(x,y);
h=z;
}
int volume()
{
return(area()*h);
}
}
