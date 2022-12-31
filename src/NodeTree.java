import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NodeTree<T extends Comparable<T> > {
	private static final Logger logger = Logger.getLogger(NodeTree.class.getCanonicalName());

	 Optional<NodeTree> m_left= Optional.empty();
	 Optional<NodeTree> m_right= Optional.empty();
	 final T m_data;
	 
	 public NodeTree(final T data){
		 m_data = data;		 
	 }
	 
	 public void setLeft(NodeTree<T> nodeTree) {
		 m_left = Optional.of(nodeTree);
	 }
	 
	 public void setrRight(NodeTree<T> nodeTree) {
		 m_right = Optional.of(nodeTree);
	 }
	 
	 public final T getData() {
		 return m_data;
	 }
	 
	 public final T get(T key) {
			if(m_data.compareTo(key)==0) {
				return m_data;
			}
			if(!m_left.isEmpty() && m_data.compareTo(key) < 0) {
				return (T)m_left.get().get(key);
			 }
			if(!m_right.isEmpty() && m_data.compareTo(key) > 0) {
				return (T)m_right.get().get(key);
			 }
			throw new NoSuchElementException("The tree not contain: " + key.toString());
	 }
	 
	 public void add(T data) {			
		 if(m_data.compareTo(data) < 0) {
			 if(m_left.isEmpty()) {
				 setLeft(new NodeTree<T>(data));
			 }
			 else {
				 m_left.get().add(data);
			 }
		 }
		 else {
			 if(m_right.isEmpty()) {
				 setrRight(new NodeTree<T>(data));
			 }
			 else {
				 m_right.get().add(data);
			 }
		 }		 
	 }
	 
	 public void printRightToLeft() {		
		logger.log(Level.INFO, m_data.toString() );
		if(!m_left.isEmpty()) {
			m_left.get().printRightToLeft();
		 }
		if(!m_right.isEmpty()) {
			m_right.get().printRightToLeft();
		 }
	} 
}
