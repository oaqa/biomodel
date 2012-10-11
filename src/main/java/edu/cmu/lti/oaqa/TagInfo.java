

/* First created by JCasGen Thu Oct 11 11:48:24 EDT 2012 */
package edu.cmu.lti.oaqa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.oaqa.model.OAQATop;


/** Tag that associates with a token from a particular NLP
				tool
 * Updated by JCasGen Thu Oct 11 11:48:24 EDT 2012
 * XML source: /home/yangzi/QA/biomodel/src/main/resources/edu/cmu/lti/oaqa/bio/model/BioTypes.xml
 * @generated */
public class TagInfo extends OAQATop {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TagInfo.class);
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
  protected TagInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TagInfo(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TagInfo(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tag

  /** getter for tag - gets Tag generated from the NLP tagging tool
   * @generated */
  public String getTag() {
    if (TagInfo_Type.featOkTst && ((TagInfo_Type)jcasType).casFeat_tag == null)
      jcasType.jcas.throwFeatMissing("tag", "edu.cmu.lti.oaqa.TagInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TagInfo_Type)jcasType).casFeatCode_tag);}
    
  /** setter for tag - sets Tag generated from the NLP tagging tool 
   * @generated */
  public void setTag(String v) {
    if (TagInfo_Type.featOkTst && ((TagInfo_Type)jcasType).casFeat_tag == null)
      jcasType.jcas.throwFeatMissing("tag", "edu.cmu.lti.oaqa.TagInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((TagInfo_Type)jcasType).casFeatCode_tag, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets Source id of the NLP tool
   * @generated */
  public String getSource() {
    if (TagInfo_Type.featOkTst && ((TagInfo_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.oaqa.TagInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TagInfo_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Source id of the NLP tool 
   * @generated */
  public void setSource(String v) {
    if (TagInfo_Type.featOkTst && ((TagInfo_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.oaqa.TagInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((TagInfo_Type)jcasType).casFeatCode_source, v);}    
  }

    