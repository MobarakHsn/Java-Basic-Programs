package org.child;
import org.child.Mammal;
public class Lion extends Mammal
{
	protected boolean Bipolar;
	
	public void isBipolar(boolean Bipolar)
	{
		this.Bipolar=Bipolar;
	}
	
	public boolean isBipolar()
	{
		return Bipolar;
	}
}