package tech.command;

public class Demo {
	public static void main(String[] args) 
	{
		Receiver receiver = new Light();
		
		OnCommand switchOn = new OnCommand(receiver);
		Invoker invok = new Invoker(switchOn);
		invok.execute();
	
		OffCommand switchOff = new OffCommand(receiver);
		invok = new Invoker(switchOff);
		invok.execute();
	
		System.out.println();
		
		receiver = new Stereo();
	
		switchOn = new OnCommand(receiver);
		invok = new Invoker(switchOn);
		invok.execute();
	
		switchOff = new OffCommand(receiver);
		invok = new Invoker(switchOff);
		invok.execute();
		
		System.out.println();
		
		receiver = new Kettle();
		
		switchOn = new OnCommand(receiver);
		invok = new Invoker(switchOn);
		invok.execute();
	
		switchOff = new OffCommand(receiver);
		invok = new Invoker(switchOff);
		invok.execute();
		
		System.out.println();
		
		receiver = new Juicer();
		
		switchOn = new OnCommand(receiver);
		invok= new Invoker(switchOn);
		invok.execute();
	
		switchOff = new OffCommand(receiver);
		invok = new Invoker(switchOff);
		invok.execute();
		
		System.out.println();
		
		receiver = new Microwave();
		
		switchOn = new OnCommand(receiver);
		invok = new Invoker(switchOn);
		invok.execute();
	
		switchOff = new OffCommand(receiver);
		invok = new Invoker(switchOff);
		
		invok.execute();
		
	}
}
