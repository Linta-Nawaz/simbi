package tech.command;

public class Kettle implements Receiver 
{
	@Override
	public void switchOn()
	{
		System.out.println("The Kettle is switched ON");
	}
	@Override
	public void switchOff()
	{
		System.out.println("The Kettle is switched OFF");
	}

}