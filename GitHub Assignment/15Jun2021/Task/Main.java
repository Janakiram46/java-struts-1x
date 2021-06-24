package com.Task;

public class Main
{

	public static void main(String[] args)
	{
		Process.process(new A(1,"a"));
		Process.process(new B(2,"b"));
		Process.process(new C(3,"c"));
		Process.process(new D(4,"d"));
		
		ClassProcess.classProcess(new A(2,"m"));
		ClassProcess.classProcess(new B(3,"mn"));
		ClassProcess.classProcess(new C(4,"mh"));
		ClassProcess.classProcess(new D(5,"mg"));
		

	}

}
