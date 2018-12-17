package org.me.core.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@interface SampleAnnotation1 {
	int value();
}

@interface SampleAnnotation2 {
	String profession();

	int value();
}

@interface SampleAnnotation3 {
	String profession()

	default "Carpenter";

	int value() default 45;
}

@Repeatable(SampleAnnotationContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.TYPE,
		ElementType.METHOD })
@interface SampleAnnotation4 {
	String profession() default "Carpenter";

	int value() default 45;
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.TYPE,
		ElementType.METHOD })
@interface SampleAnnotationContainer {
	SampleAnnotation4[] value();
	// default { @SampleAnnotation4(profession = "PROGRAMMER", value = 8)}

}

/**
 * This {#Annotate} is being used to study annotation and its use on method,
 * field, class, constructor. We should expect more changes in this file.
 * 
 * @author kekannag
 *
 */
public class Annotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
