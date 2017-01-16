package tech.command;

public class Stereo implements Receiver 
{
	@Override
	public void switchOn()
	{
		System.out.println("The Stereo is switched ON");
	}
	@Override
	public void switchOff()
	{
		System.out.println("The Stereo is switched OFF");
	}

}
