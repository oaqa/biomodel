

/* First created by JCasGen Mon Oct 08 19:13:59 EDT 2012 */
package edu.cmu.lti.oaqa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** This type contains information for both token and
				phrase.
 * Updated by JCasGen Mon Oct 08 19:13:59 EDT 2012
 * XML source: /home/yangzi/QA/biomodel/src/main/resources/edu/cmu/lti/oaqa/bio/model/BioTypes.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: sequence

  /** getter for sequence - gets This is the position of constituent in the question.
   * @generated */
  public int getSequence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_sequence == null)
      jcasType.jcas.throwFeatMissing("sequence", "edu.cmu.lti.oaqa.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_sequence);}
    
  /** setter for sequence - sets This is the position of constituent in the question. 
   * @generated */
  public void setSequence(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_sequence == null)
      jcasType.jcas.throwFeatMissing("sequence", "edu.cmu.lti.oaqa.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_sequence, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The original text of name entity
   * @generated */
  public String getText() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.oaqa.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets The original text of name entity 
   * @generated */
  public void setText(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.oaqa.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: cType

  /** getter for cType - gets The type of this constituent.
   * @generated */
  public int getCType() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_cType == null)
      jcasType.jcas.throwFeatMissing("cType", "edu.cmu.lti.oaqa.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_cType);}
    
  /** setter for cType - sets The type of this constituent. 
   * @generated */
  public void setCType(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_cType == null)
      jcasType.jcas.throwFeatMissing("cType", "edu.cmu.lti.oaqa.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_cType, v);}    
   
    
  //*--------------*
  //* Feature: resources

  /** getter for resources - gets External resource list.
   * @generated */
  public FSList getResources() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "edu.cmu.lti.oaqa.Token");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_resources)));}
    
  /** setter for resources - sets External resource list. 
   * @generated */
  public void setResources(FSList v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_resources == null)
      jcasType.jcas.throwFeatMissing("resources", "edu.cmu.lti.oaqa.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_resources, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: tags

  /** getter for tags - gets Part-of-speech tag of the token
   * @generated */
  public FSList getTags() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tags == null)
      jcasType.jcas.throwFeatMissing("tags", "edu.cmu.lti.oaqa.Token");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_tags)));}
    
  /** setter for tags - sets Part-of-speech tag of the token 
   * @generated */
  public void setTags(FSList v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tags == null)
      jcasType.jcas.throwFeatMissing("tags", "edu.cmu.lti.oaqa.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_tags, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    