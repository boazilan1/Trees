import java.util.NoSuchElementException;
import java.util.Optional;

public class Tree<T extends Comparable<T>> {

	public Optional<NodeTree> m_root = Optional.empty();
	private int m_size=0;
	public Tree() {

	}

	public void add(final T data) {
		if (m_root.isEmpty()) {
			m_root = Optional.of(new NodeTree<T>(data));
		}else {
			m_root.get().add(data);
		}
		++m_size;

	}
	public final int size() {
		return m_size;
	}
	public boolean isEmpty() {
		return m_root.isEmpty();
	}
	public T get(T key) {
		if (!isEmpty()) {
			return (T)m_root.get().get(key);
		}
		throw new NoSuchElementException("The tree not contain: " + key.toString());
	}
	
	public void print() {
		if (isEmpty()) {
			return;
		}
		m_root.get().printRightToLeft();
	}
}
