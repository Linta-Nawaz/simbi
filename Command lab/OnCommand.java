package tech.command;

public class OnCommand implements Command {
	public Receiver receiver;
	public OnCommand(Receiver receiver)
	{
		this.receiver=receiver;
	}
	@Override
	public void execute()
	{
		this.receiver.switchOn();
	}
}
