package tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import thewebsemantic.PrimitiveWrapper;
import thewebsemantic.UserDefNamespace;
import thewebsemantic.binding.Jenabean;

import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFWriter;

/**
 * This tool controls the transformation library. User can transform an
 * object-oriented data model into a semantic resource.
 * 
 * @author Jakub Krauz
 */
public class JenaBeanExtensionTool implements JenaBeanExtension {
	
	/** default language of the ontology document */
	public static final String DEFAULT_LANG = Syntax.RDF_XML;
	
	/** logger */
	private Log log = LogFactory.getLog(getClass());

	/** provides operations over semantic model */
	private Jenabean jenaBean = Jenabean.instance();


	/**
	 * Loads data from the list of objects and creates an ontology model
	 * in the default specification (OWL-DL without inferencing).
	 * 
	 * @param dataList list of objects - object-orinted model
	 */
	public JenaBeanExtensionTool(List<Object> dataList) {
		/* parameter OntModelSpec.OWL_DL_MEM disables reasoner included
		 * in ModelFactory.createOntologyModel() as default,
		 * which led to a very slow computation */
		createModel(dataList, OntModelSpec.OWL_DL_MEM);
	}
	
	
	/**
	 * Loads data from the list of objects and creates an ontology model
	 * in the given specification (e.g. OWL Full, OWL-DL, OWL-Lite, without
	 * reasoning or with an inferencer etc.).
	 * @see OntModelSpec
	 * 
	 * @param dataList - list of objects - object-orinted model
	 * @param specification - specification of the ontology model
	 */
	public JenaBeanExtensionTool(List<Object> dataList, OntModelSpec specification) {
		createModel(dataList, specification);
	}


	/**
	 * Loads data from the list of objects and creates an ontology model
	 * in the default specification (OWL-DL without inferencing).
	 * Sets the default namespace for the whole model.
	 * 
	 * @param dataList - list of objects - object-oriented model
	 * @param namespace - namespace for the whole model
	 */
	public JenaBeanExtensionTool(List<Object> dataList, String namespace) {
		UserDefNamespace.set(namespace);
		createModel(dataList, OntModelSpec.OWL_DL_MEM);
	}


	@Override
	public InputStream getOntologyDocument() {
		return getOntologyDocument(DEFAULT_LANG);
	}
	
	
	@Override
	public InputStream getOntologyDocument(String lang) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		jenaBean.writeModel(out, lang);
		return new ByteArrayInputStream(out.toByteArray());
	}
	
	
	@Override
	public void writeOntologyDocument(OutputStream out) {
		// jenaBean.writeModel(out, DEFAULT_LANG);
		RDFWriter writer = jenaBean.model().getWriter(Syntax.RDF_XML_ABBREV);
		writer.setProperty("showXmlDeclaration", true);
		writer.setProperty("xmlbase", "http://data.pojo");
		writer.write(jenaBean.model(), out, null);
	}
	
	
	@Override
	public void writeOntologyDocument(OutputStream out, String lang) {
		jenaBean.writeModel(out, lang);
	}


	/**
	 * Creates the semantic model and fills it with the user data
	 * 
	 * @param dataList - list of user objects
	 * @param spec - specification of the ontology model
	 */
	private void createModel(List<Object> dataList, OntModelSpec spec) {
		log.debug("Started creating ontology model.");
		jenaBean.bind(ModelFactory.createOntologyModel(spec));
		for (int i = 0; i < dataList.size(); i++) {
			jenaBean.writer().save(dataList.get(i));
			
			//System.out.println(thewebsemantic.TypeWrapper.instanceURI(dataList.get(i)));
		}
		log.debug("Ontology model was created.");
	}
	

}
