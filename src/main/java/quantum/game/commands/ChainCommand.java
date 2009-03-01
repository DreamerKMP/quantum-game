package quantum.game.commands;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp class ChainCommand extends Command 
{
	int id;
	int source;
	int target;
	
	public ChainCommand(int id, int source, int target) 
	{
		super(CommandTypes.CHAIN);
		this.id = id;
		this.source = source;
		this.target = target;
	}

	public ChainCommand() 
	{
		super( CommandTypes.CHAIN );
	}

	@Override
	public void read(DataInputStream in) throws Exception 
	{	
		id = in.readShort();
		source = in.readShort();
		target = in.readShort();
	}

	@Override
	public void write(DataOutputStream out) throws Exception 
	{
		out.writeByte( type );
		out.writeShort( id );
		out.writeShort( source );
		out.writeShort( target );
	}

	public int getId() 
	{
		return id;
	}

	public int getSource() 
	{	
		return source;
	}

	public int getTarget() 
	{	
		return target;
	}

}
