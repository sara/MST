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
			Graph graph = new Graph("graph2.txt");
			PartialTreeList list = MST.initialize(graph);
				//System.out.println("hineini");
				list.remove();

			
			
			
			//THIS BLOCK PRINTS OUT THE TREE LIST AND QUEUES
			Iterator<PartialTree> iterator = list.iterator();
		//	 get the current tree
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
