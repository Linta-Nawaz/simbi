package tech.command;

public class Microwave implements Receiver 
{
	@Override
	public void switchOn()
	{
		System.out.println("The Microwave is switched ON");
	}
	@Override
	public void switchOff()
	{
		System.out.println("The Microwave is switched OFF");
	}

}