package set;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet add method throws classCastException if we try to add element which
 * is not implementing Comparable or we are not setting specific comparator for
 * our set.
 * 
 * @author nagesh2086
 *
 */
public class TreeSetTest {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee());
		set.add(new Employee());
		Employee e = new Employee();
		e.setId(0);
		set.add(e);
		Employee e1 = new Employee();
		e1.setId(0);
		e1.setName("sdfasd");
		set.add(e1);
		for (Employee employee : set) {
			System.out.println(employee.toString());
		}
	}

}

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		int compareTo = Integer.valueOf(getId()).compareTo(o.getId());
		if (compareTo != 0) {
			return compareTo;
		}
		if (getName() == o.getName()) {
			return 0;
		}
		if (getName() == null && o.getName() != null) {
			return -1;
		}
		if (getName() != null && o.getName() == null) {
			return 1;
		}
		return getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
