package org.child;
import org.parent.Animal;
public class Mammal extends Animal
{
	protected boolean Hair;
	protected boolean Fur;
	
	public void hasHair(boolean Hair)
	{
		this.Hair=Hair;
	}
	
	public boolean hasHair()
	{
		return Hair;
	}
	
	public void hasFur(boolean Fur)
	{
		this.Fur=Fur;
	}
	
	public boolean hasFur()
	{
		return Fur;
	}
}