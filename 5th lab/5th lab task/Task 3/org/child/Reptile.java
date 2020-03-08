package org.child;
import org.parent.Animal;
public class Reptile extends Animal
{
	protected boolean Bipolar;
	
	public void isBipoloar(boolean Bipolar)
	{
		this.Bipolar=Bipolar;
	}
	
	public boolean isBipolar()
	{
		return Bipolar;
	}
}