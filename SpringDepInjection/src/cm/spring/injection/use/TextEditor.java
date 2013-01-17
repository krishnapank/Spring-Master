package cm.spring.injection.use;

import com.spring.injection.declare.Checker;

public class TextEditor {
	
	private Checker check;
	
	public TextEditor()
	{
		
	}

	public TextEditor(Checker check)
	{
		System.out.println("In the parameterized cons:::::");
		this.check=check;
	}
	
	public void doTextEditor()
	{
		check.spellCheck();
	}
}
