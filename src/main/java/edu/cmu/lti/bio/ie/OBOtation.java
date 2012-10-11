

/* First created by JCasGen Thu Oct 11 11:51:12 EDT 2012 */
package edu.cmu.lti.bio.ie;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Ontology annotation from Open Biological Ontology format file.  Labels a word as having been found in the list of [Term]s contained in an OBO format ontology, as well as the name of the ontology file in which it was found.
 * Updated by JCasGen Thu Oct 11 11:51:12 EDT 2012
 * XML source: /home/yangzi/QA/biomodel/src/main/resources/edu/cmu/lti/oaqa/bio/model/OBOtations.xml
 * @generated */
public class OBOtation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OBOtation.class);
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
  protected OBOtation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public OBOtation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public OBOtation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public OBOtation(JCas jcas, int begin, int end) {
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
  //* Feature: OntologyFile

  /** getter for OntologyFile - gets OBO format ontology file name in which the term is found.
   * @generated */
  public String getOntologyFile() {
    if (OBOtation_Type.featOkTst && ((OBOtation_Type)jcasType).casFeat_OntologyFile == null)
      jcasType.jcas.throwFeatMissing("OntologyFile", "edu.cmu.lti.bio.ie.OBOtation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OBOtation_Type)jcasType).casFeatCode_OntologyFile);}
    
  /** setter for OntologyFile - sets OBO format ontology file name in which the term is found. 
   * @generated */
  public void setOntologyFile(String v) {
    if (OBOtation_Type.featOkTst && ((OBOtation_Type)jcasType).casFeat_OntologyFile == null)
      jcasType.jcas.throwFeatMissing("OntologyFile", "edu.cmu.lti.bio.ie.OBOtation");
    jcasType.ll_cas.ll_setStringValue(addr, ((OBOtation_Type)jcasType).casFeatCode_OntologyFile, v);}    
  }

    