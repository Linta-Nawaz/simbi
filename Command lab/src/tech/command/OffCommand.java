package tech.command;

public class OffCommand implements Command {
	public Receiver receiver;
	public OffCommand(Receiver receiver)
	{
		this.receiver=receiver;
	}
	@Override
	public void execute()
	{
		this.receiver.switchOff();
	}
}
