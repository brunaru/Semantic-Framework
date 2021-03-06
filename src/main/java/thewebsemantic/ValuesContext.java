package thewebsemantic;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.ParameterizedType;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import thewebsemantic.Base.NullType;

/**
 * Encapsulates bean's attributes or methods.
 * Provides all neccesaty methods to gather data in propriate format
 * and mostly all bounded annotations and their values.
 */
public abstract class ValuesContext {
	
	/** bean */
	protected Object subject;

	
	/**
	 * Returns the accesible object (attribute or method).
	 * @return AccessibleObject
	 */
	public abstract AccessibleObject getAccessibleObject();


	/**
	 * Returns preset URI of the loaded accessible object.
	 * @return uri
	 */
	public abstract String uri();


	/**
	 * Returns if Id annotation is preset over this object.
	 * 
	 * @return true if Id is set, else false
	 */
	public abstract boolean isId();


	public abstract boolean existsInModel(Model m);


	public abstract Object invokeGetter();


	public abstract void setProperty(Object v);


	public abstract boolean isPrimitive();


	public abstract String getName();

	
	/**
	 * Returns a <code>Class</code> object that identifies the declared
	 * type for the gathered method or attribute.
	 * @return a <code>Class</code> object identifying the declared type
	 */
	public abstract Class<?> type();

	
	/**
	 * This method may be used only if the gathered object is declared
	 * as a <code>Collection</code>. Returns a <code>Class</code> object
	 * that identifies the declared type of elements of the collection.
	 * @return a <code>Class</code> object identifying the declared type
	 * 			of the collection
	 */
	public abstract Class<?> t();
	
	
	/**
	 * Checks if the attribute or method is annotated by the given annotation.
	 * @param annotationClass tested annotation
	 * @return true if annotated, else false
	 */
	public abstract boolean isAnnotatedBy(Class<? extends Annotation> annotationClass);
	
	
	/**
	 * Returns the requested annotation of the annotated accessible object.
	 * @param <T> annotation class
	 * @param annotationClass requested annotation
	 * @return requested object's annotation
	 */
	public abstract <T extends Annotation> T getAnnotation(Class<T> annotationClass);


	public Class<?> getGenericType(ParameterizedType type) {
		return (type == null) ? NullType.class : (Class<?>) type.getActualTypeArguments()[0];
	}
	
	
	public boolean isCollection() {
		return type().equals(Collection.class);
	}


	public boolean isCollectionOrSet() {
		return isCollection() || isSet();
	}


	public boolean isSet() {
		return type().equals(Set.class);
	}


	public boolean isCollectionType() {
		return Collection.class.isAssignableFrom(type());
	}


	public boolean isURI() {
		return type().equals(URI.class);
	}
	
	
	public boolean isList() {
		return type().equals(List.class);
	}


	public boolean isAggregateType() {
		return isCollectionType() || isArray();
	}


	public boolean isArray() {
		return type().isArray();
	}
	
	
	public Property property(Model m) {
		return m.getProperty(uri());
	}


	public String toString() {
		return getName();
	}

}
