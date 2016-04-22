package apps;


import java.util.Iterator;
import structures.Graph;

public class Test
{
	public static void main(String[] args)
	{

		try
		{
			Graph graph = new Graph("graph1.txt");
			PartialTreeList list = MST.initialize(graph);
			//KEEP GOING IN LOOPS WITH THIS, ASK FOR HELP
			//Iterator <PartialTreeList> iterator = list.iterator();
			System.out.println(list.iterator());
			//			System.out.println()

		} catch (Exception e){}
	}

}
