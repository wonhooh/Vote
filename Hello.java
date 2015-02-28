package Hello;

public class Hello 
{
	
	String word = null;
	
	public Hello()
	{
		word = "Hello";
	}

	public void setWord(String w)
	{
		word = w;
	}
	
	public void print()
	{
		System.out.println(word);
	}
	
	public static void main(String [] args)
	{
		Hello hello = new Hello();
		hello.setWord("hello world");
		hello.print();
		//hello.setWord("world");
		//hello.print();
	}
}
