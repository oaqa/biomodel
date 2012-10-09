

/* First created by JCasGen Mon Oct 08 19:13:59 EDT 2012 */
package edu.cmu.lti.oaqa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.StringArray;


/** External resource including ontology
 * Updated by JCasGen Mon Oct 08 19:13:59 EDT 2012
 * XML source: /home/yangzi/QA/biomodel/src/main/resources/edu/cmu/lti/oaqa/bio/model/BioTypes.xml
 * @generated */
public class ExternalResource extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ExternalResource.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ExternalResource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ExternalResource(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ExternalResource(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ExternalResource(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: concept

  /** getter for concept - gets Concept information of this constituent from external
						resource
   * @generated */
  public String getConcept() {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_concept == null)
      jcasType.jcas.throwFeatMissing("concept", "edu.cmu.lti.oaqa.ExternalResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_concept);}
    
  /** setter for concept - sets Concept information of this constituent from external
						resource 
   * @generated */
  public void setConcept(String v) {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_concept == null)
      jcasType.jcas.throwFeatMissing("concept", "edu.cmu.lti.oaqa.ExternalResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_concept, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets The category information of consituent
   * @generated */
  public String getCategory() {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "edu.cmu.lti.oaqa.ExternalResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets The category information of consituent 
   * @generated */
  public void setCategory(String v) {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "edu.cmu.lti.oaqa.ExternalResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_category, v);}    
   
    
  //*--------------*
  //* Feature: synonyms

  /** getter for synonyms - gets It contains string array of synonyms
   * @generated */
  public StringArray getSynonyms() {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oaqa.ExternalResource");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_synonyms)));}
    
  /** setter for synonyms - sets It contains string array of synonyms 
   * @generated */
  public void setSynonyms(StringArray v) {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oaqa.ExternalResource");
    jcasType.ll_cas.ll_setRefValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_synonyms, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for synonyms - gets an indexed value - It contains string array of synonyms
   * @generated */
  public String getSynonyms(int i) {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oaqa.ExternalResource");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_synonyms), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_synonyms), i);}

  /** indexed setter for synonyms - sets an indexed value - It contains string array of synonyms
   * @generated */
  public void setSynonyms(int i, String v) { 
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oaqa.ExternalResource");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_synonyms), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_synonyms), i, v);}
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets The source name of this external resource
   * @generated */
  public String getSource() {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.oaqa.ExternalResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets The source name of this external resource 
   * @generated */
  public void setSource(String v) {
    if (ExternalResource_Type.featOkTst && ((ExternalResource_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.oaqa.ExternalResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExternalResource_Type)jcasType).casFeatCode_source, v);}    
  }

    