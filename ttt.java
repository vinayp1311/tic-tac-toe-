import java.util.*;
class ttt
{
int i;
int value1;
boolean player1=true;
int count4;
String str[]={"","","","","","","","",""};
int num[]={9,9,9,9,9,9,9,9,9};

void wincondition()
{
count4=0;
if(str[0]=="X"&&str[1]=="X"&&str[2]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[3]=="X"&&str[4]=="X"&&str[5]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[6]=="X"&&str[7]=="X"&&str[8]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[0]=="X"&&str[4]=="X"&&str[8]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[2]=="X"&&str[4]=="X"&&str[6]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[0]=="X"&&str[3]=="X"&&str[6]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[1]=="X"&&str[4]=="X"&&str[7]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}
if(str[2]=="X"&&str[5]=="X"&&str[8]=="X")
{
System.out.println("player1 is winner eat chicken dinner");
System.exit(0);
}


if(str[0]=="O"&&str[1]=="O"&&str[2]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[3]=="O"&&str[4]=="O"&&str[5]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[6]=="O"&&str[7]=="O"&&str[8]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[0]=="O"&&str[4]=="O"&&str[8]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[2]=="O"&&str[4]=="O"&&str[6]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[0]=="O"&&str[3]=="O"&&str[6]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[1]=="O"&&str[4]=="O"&&str[7]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
if(str[2]=="O"&&str[5]=="O"&&str[8]=="O")
{
System.out.println("player2 is winner eat chicken dinner");
System.exit(0);
}
count4++;
}



void hardcond()
{
if(str[0]=="O"&&str[2]=="O"&&str[1]=="")
{
value1=1;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[1]=="O"&&str[2]=="O"&&str[0]=="")
{
value1=0;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="O"&&str[1]=="O"&&str[2]=="")
{
value1=2;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[3]=="O"&&str[5]=="O"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="O"&&str[5]=="O"&&str[3]=="")
{
value1=3;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[3]=="O"&&str[4]=="O"&&str[5]=="")
{
value1=5;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[6]=="O"&&str[8]=="O"&&str[7]=="")
{
value1=7;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[7]=="O"&&str[8]=="O"&&str[6]=="")
{
value1=6;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[6]=="O"&&str[7]=="O"&&str[8]=="")
{
value1=8;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="O"&&str[6]=="O"&&str[3]=="")
{
value1=3;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="O"&&str[3]=="O"&&str[6]=="")
{
value1=6;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[3]=="O"&&str[6]=="O"&&str[0]=="")
{
value1=0;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[1]=="O"&&str[7]=="O"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="O"&&str[7]=="O"&&str[1]=="")
{
value1=1;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[1]=="O"&&str[4]=="O"&&str[7]=="")
{
value1=7;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="O"&&str[8]=="O"&&str[5]=="")
{
value1=5;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[5]=="O"&&str[8]=="O"&&str[2]=="")
{
value1=2;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="O"&&str[5]=="O"&&str[8]=="")
{
value1=8;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="O"&&str[6]=="O"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="O"&&str[4]=="O"&&str[6]=="")
{
value1=6;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="O"&&str[6]=="O"&&str[2]=="")
{
value1=2;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="O"&&str[8]=="O"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="O"&&str[8]=="O"&&str[0]=="")
{
value1=0;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="O"&&str[4]=="O"&&str[8]=="")
{
value1=8;
this.value1=value1;
player1=true;
pattern2(value1);
}

if(str[0]=="X"&&str[2]=="X"&&str[1]=="")
{
value1=1;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[1]=="X"&&str[2]=="X"&&str[0]=="")
{
value1=0;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="X"&&str[1]=="X"&&str[2]=="")
{
value1=2;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[3]=="X"&&str[5]=="X"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="X"&&str[5]=="X"&&str[3]=="")
{
value1=3;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[3]=="X"&&str[4]=="X"&&str[5]=="")
{
value1=5;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[6]=="X"&&str[8]=="X"&&str[7]=="")
{
value1=7;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[7]=="X"&&str[8]=="X"&&str[6]=="")
{
value1=6;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[6]=="X"&&str[7]=="X"&&str[8]=="")
{
value1=8;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="X"&&str[6]=="X"&&str[3]=="")
{
value1=3;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="X"&&str[3]=="X"&&str[6]=="")
{
value1=6;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[3]=="X"&&str[6]=="X"&&str[0]=="")
{
value1=0;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[1]=="X"&&str[7]=="X"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="X"&&str[7]=="X"&&str[1]=="")
{
value1=1;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[1]=="X"&&str[4]=="X"&&str[7]=="")
{
value1=7;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="X"&&str[8]=="X"&&str[5]=="")
{
value1=5;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[5]=="X"&&str[8]=="X"&&str[2]=="")
{
value1=2;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="X"&&str[5]=="X"&&str[8]=="")
{
value1=8;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="X"&&str[6]=="X"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[2]=="X"&&str[4]=="X"&&str[6]=="")
{
value1=6;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="X"&&str[6]=="X"&&str[2]=="")
{
value1=2;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="X"&&str[8]=="X"&&str[4]=="")
{
value1=4;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[4]=="X"&&str[8]=="X"&&str[0]=="")
{
value1=0;
this.value1=value1;
player1=true;
pattern2(value1);
}
if(str[0]=="X"&&str[4]=="X"&&str[8]=="")
{
value1=8;
this.value1=value1;
player1=true;
pattern2(value1);
}
}


void pattern1()
{
System.out.println();
for(int i=0;i<3;i++)
{
System.out.print(" "+" "+" ");
if(i!=2)
System.out.print("|" + " ");
}
System.out.println();
System.out.println("-------------");
for(int i=3;i<6;i++)
{
System.out.print(" "+" "+" ");
if(i!=5)
System.out.print("|" + " ");
}
System.out.println();
System.out.println("-------------");
for(int i=6;i<9;i++)
{
System.out.print(" "+" "+" ");
if(i!=8)
System.out.print("|" + " ");
}
program();
}




void pattern(int k)
{
System.out.println();
wincondition();
this.i=k;
int count1=0;
int count3=0;
for(int l=0;l<8;l++)
{
if(i==num[l])
{
count1++;
}
}
if(count1==0)
{
num[i]=i;
str[i]="X";
for(int i=0;i<3;i++)
{
System.out.print(str[i] +" "+" ");
if(i!=2)
System.out.print("|" + " ");
}
System.out.println();
System.out.println("-------------");
for(int i=3;i<6;i++)
{
System.out.print(str[i] + " "+" ");
if(i!=5)
System.out.print("|" + " ");
}
System.out.println();
System.out.println("-------------");
for(int i=6;i<9;i++)
{
System.out.print(str[i] + " "+" ");
if(i!=8)
System.out.print("|" +" ");
}
wincondition();
for(int l=0;l<9;l++)
{
if(num[l]==l)
count3++;
}
if(count3==9 && count4==1)
{
System.out.println("Game Draw");
System.exit(0);
}
program();
}

if(count1!=0)
{
System.out.print("position is occupied already" + " ");
player1 =true;
wincondition();
program();
}
}



void pattern2(int k)
{

wincondition();
this.i=k;
int count2=0;
int count3=0;
for(int l=0;l<8;l++)
{
if(i==num[l])
{
count2++;
}
}
if(count2==0)
{
System.out.println();
num[i]=i;
str[i]="O";
for(int i=0;i<3;i++)
{
System.out.print(str[i] + " "+" ");
if(i!=2)
System.out.print("|"+" ");
}
System.out.println();
System.out.println("-------------");
for(int i=3;i<6;i++)
{
System.out.print(str[i] + " "+" ");
if(i!=5)
System.out.print("|"+" ");
}
System.out.println();
System.out.println("-------------");
for(int i=6;i<9;i++)
{
System.out.print(str[i] + " "+" ");
if(i!=8)
System.out.print("|"+" ");
}
wincondition();
for(int l=0;l<9;l++)
{
if(num[l]==l)
count3++;
}
if(count3==9 && count4==1)
{
System.out.println("Game Draw");
System.exit(0);
}
program();
}
if(count2!=0)
{
player1=false;
wincondition();
program2();
}
}


void program()
{
if(player1)
{
System.out.println("player1 move");
Scanner s1=new Scanner(System.in);
value1=s1.nextInt();
this.value1=value1;
if(value1>=9 || value1<0)
{
System.out.println("please enter correct grid values 0-8");
program();
}
player1=false;
pattern(value1);
}
else
{
System.out.println("player2 move");
hardcond();
int max = 10;
if(num[4]==9)
{
value1=4;
}
else
{
value1 = (int)(Math.random() * max);
}
this.value1=value1;
if(value1==9 || value1==10)
{
program2();
}
if(value1>=9 || value1<0)
{
System.out.println("please enter correct grid values 0-8");
program();
}
player1=true;
pattern2(value1);
}
}


void program2()
{
hardcond();
int max = 10;
if(num[4]==9)
{
value1=4;
}
else
{
value1 = (int)(Math.random() * max);
}
this.value1=value1;
if(value1==9 || value1==10)
{
program2();
}
if(value1>=9 || value1<0)
{
System.out.println("please enter correct grid values 0-8");
program();
}
player1=true;
pattern2(value1);
}








public static void main(String args[])
{
ttt obj =new ttt();
System.out.println("Player 1 = X");
System.out.println("Player 2 CPU = O");
System.out.println("Rules:Please enter numbers 0-8 only");
System.out.println("Follow this pattern");
System.out.print("0" + " ");
System.out.print("1"+ " ");
System.out.println("2"+ " ");
System.out.print("3"+ " ");
System.out.print("4"+ " ");
System.out.println("5"+ " ");
System.out.print("6"+ " ");
System.out.print("7"+ " ");
System.out.print("8"+ " ");
obj.pattern1();
}
}