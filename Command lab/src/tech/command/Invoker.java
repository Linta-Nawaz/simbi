package tech.command;

public class Invoker {
	public Command c;

	public Invoker(Command c) 
	{
		this.c= c;
	}
	public void execute()
	{
		this.c.execute();
	}
}