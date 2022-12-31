import java.util.logging.Level;
import java.util.logging.Logger;

public class ExempleTree {
	private static final Logger logger = Logger.getLogger(ExempleTree.class.getCanonicalName());
	
	public static void main(String[] args) {		
		logger.log(Level.INFO, "in main ExemleTree");
		
		
		Tree<String> tree = new Tree();
		tree.add("hi");
		tree.add("ho");
		tree.add("lolo");
		tree.add("bobo");
		tree.print();
		
		Tree<Integer> intTree = new Tree();
		intTree.add(2);
		intTree.add(3);
		intTree.add(1);
		intTree.add(5);
		intTree.print();
	}
	
}
