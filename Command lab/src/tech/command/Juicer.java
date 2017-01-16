package tech.command;

public class Juicer implements Receiver 
{
	@Override
	public void switchOn()
	{
		System.out.println("The Juicer is switched ON");
	}
	@Override
	public void switchOff()
	{
		System.out.println("The Juicer is switched OFF");
	}

}