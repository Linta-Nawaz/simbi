package tech.command;

public class Light implements Receiver 
{
	@Override
	public void switchOn()
	{
		System.out.println("The Light is switched ON");
	}
	@Override
	public void switchOff()
	{
		System.out.println("The Light is switched OFF");
	}

}