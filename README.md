# Tree Traversal!

Unlike graph, tree does not contain cycle and always connected. So DFS of a tree is relatively easier. We can simply begin from a node, then traverse its adjacent (or children) without caring about cycles. And if we begin from a single node (root), and traverse this way, it is guaranteed that we traverse the whole tree as there is no dis-connectivity,

Tree Traversal is much easier than you can think. Simple, understandable and balance as everything should be in life ! 
As always [Wikipedia](https://en.wikipedia.org/wiki/Tree_traversal#Pre-order_%28NLR%29) comes handy if it is about education!
Every type of Tree Traversal Is called recursive and the most important part is when the vertex is Explored 

![enter image description here](https://upload.wikimedia.org/wikipedia/commons/d/dc/Sorted_binary_tree_ALL.svg)

### PRE-ORDER
As the name suggest Vertex is explored PRE-ORDER, so the procedure will look like. ( EXPLORE , GO_LEFT , GO_RIGHT)
1. Explore F then  GO_LEFT
2. Explore B then  GO_LEFT
3. Explore A then there is no child so we back to the B vertex
4. In a B vertex we Explored and WENT_LEFT so it is time to GO_RIGHT
5. Explore D vertex then GO_LEFT
6. Explore C vertex then there is no child so we back to the D vertex 
7. In a D vertex we Explored and WENT_LEFT so it is time to GO_RIGHT
8. Explore E vertex there there is no child so we back to the D vertex
9. In a D vertex we did everything so we go back to B
10. B same situation so we go F
11. In a F vertex we Explored WENT_LEFT so it is time to GO_RIGHT 
12. and so on... 

Result of PRE-ORDER
	
		F, B, A, D, C, E, G, I, H;
### IN-ORDER
Result of IN-ORDER
		
	A, B, C, D, E, F, G, H, I;
### POST-ORDER
Result of Post-Order
	
	A, C, E, D, B, H, I, G, F.
