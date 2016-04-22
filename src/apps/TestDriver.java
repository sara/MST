package apps;

import java.util.Iterator;
import structures.Graph;
import java.util.ArrayList;

public class TestDriver
{
	public static void main(String[] args)
	{

		try
		{
			Graph graph = new Graph("graph1.txt");
			PartialTreeList list = MST.initialize(graph);

			Iterator<PartialTree> iterator = list.iterator();
			// get the current tree
			do
			{
				PartialTree curr = iterator.next();
				// go through the list of arcs HOW?!!?
				while (curr.getArcs().size()>0)
				{
					System.out.print(curr.getArcs().deleteMin().toString());
				}
				System.out.println();
			} while (iterator.hasNext());

		} catch (Exception e)
		{
			System.out.println("input error");
		}
	}

}
