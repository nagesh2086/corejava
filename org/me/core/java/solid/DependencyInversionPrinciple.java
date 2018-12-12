package org.me.core.java.solid;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversionPrinciple {

	public static void main(String[] args) {
		ArrayList<Developer> developers = new ArrayList<>();
		developers.add(new FrontEndDeveloper());
		developers.add(new BackEndDeveloper());

		// my project providing dependency so it is not DI
		// make Developer interface public and Project too
		// so others like external library/ system/ container can provide dependency
		// injection (DI)

		// IOC: If my code initiating dependency providing code then it is not IOC
		// At the same time, if external library/ system/ container initiate Dependency
		// providing code for Project modulte then its IOC!!
		Project p = new Project(developers);
		p.implement();
	}

}

interface Developer {
	void develop();
}

class FrontEndDeveloper implements Developer {

	public void writeJavaScript() {
		System.out.println("FED:Writing JavaScript....");
	}

	@Override
	public void develop() {
		writeJavaScript();
	}
}

class BackEndDeveloper implements Developer {
	public void writeJava() {
		System.out.println("BED:Writing Java....");
	}

	@Override
	public void develop() {
		writeJava();
	}
}

/**
 * Dependency inversion implemented
 * 
 * @author kekannag
 *
 */
class Project {
	List<Developer> developers;

	public Project(List<Developer> developers) {
		this.developers = developers;
	}

	public void implement() {
		developers.forEach(d -> d.develop());
	}
}
