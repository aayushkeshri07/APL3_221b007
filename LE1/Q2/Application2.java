/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Application2
{
	public static void main (String args[]){
        Mother m= new Mother ( );
        m.show( ); // show of Mother is called
        Child ch=new Child ( ); 
        ch. show ( ); // show ( ) inherited in Child from Mother is called
 }
}

class Mother{
    int x;
    public void show(){
        System.out.println("mother is called");
        System.out.println("Hello World");
        
    }
}

class Child extends Mother{
    public void show(){
        System.out.println("child is called");
        System.out.println("Hello Juet");
    }
}


