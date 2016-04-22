package apps;

import structures.*;
import java.util.ArrayList;

public class MST
{

	/**
	 * Initializes the algorithm by building single-vertex partial trees
	 * 
	 * @param graph
	 *            Graph for which the MST is to be found
	 * @return The initial partial tree list
	 */
	
//	Separately for each vertex v in the graph:
//		Create a partial tree T containing only v.
//		Mark v as belonging to T. **IS THAT JUST TO SAY IT'S THE ROOT?
//		Create a priority queue (heap) P and associate it with T. //THE INSTANCE DATA ONE OR A DIFFERENT ONE??
//		Insert all of the arcs (edges) connected to v into P. The lower the weight on an arc, the higher its priority.
//		Add the partial tree T to the list L
//
	
	//something's not quite right here. it's adding everything both ways - am i supposed to add all the 
	//neighbors? does  neighborhood go both ways?
	//this is UNDIRECTED. i *think* it's actually doing what it's supposed to
	public static PartialTreeList initialize(Graph graph)
	{
		//the list which is to be returned
		PartialTreeList PTL = new PartialTreeList();
		//make a partial tree and queue for each vertex in the graph
		for (int i = 0; i < graph.vertices.length; i++)
		{
			//grab the current vertex
			Vertex v = graph.vertices[i];
			//make a partial tree with it
			PartialTree T = new PartialTree(v);
			//make a heap variable to get access to the arcs minheap in the tree instance data
			MinHeap arcs = T.getArcs();
			//get the first of the vertex's neighbors
			Vertex.Neighbor neighbor = v.neighbors;
			//add an arc for each neighbor to the minheap
			while (neighbor!=null)
			{
				//make an arc with this vertex and the current neighbor, with the respective weight
				PartialTree.Arc arc = new PartialTree.Arc (v, neighbor.vertex, neighbor.weight);
				arcs.insert(arc);
				//move through the linked list
				neighbor=neighbor.next;
			}
			//append the partial tree to the list
			PTL.append(T);
		}
		return PTL;
	}

	/**
	 * Executes the algorithm on a graph, starting with the initial partial tree
	 * list
	 * 
	 * @param ptlist
	 *            Initial partial tree list
	 * @return Array list of all arcs that are in the MST - sequence of arcs is
	 *         irrelevant
	 */
	public static ArrayList<PartialTree.Arc> execute(PartialTreeList ptlist)
	{

		/* COMPLETE THIS METHOD */

		return null;
	}
}
