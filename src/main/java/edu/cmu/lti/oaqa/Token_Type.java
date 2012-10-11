
/* First created by JCasGen Thu Oct 11 11:48:24 EDT 2012 */
package edu.cmu.lti.oaqa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.oaqa.model.QueryConcept_Type;

/** This type contains information for both token and
				phrase.
 * Updated by JCasGen Thu Oct 11 11:48:24 EDT 2012
 * @generated */
public class Token_Type extends QueryConcept_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.oaqa.Token");
 
  /** @generated */
  final Feature casFeat_sequence;
  /** @generated */
  final int     casFeatCode_sequence;
  /** @generated */ 
  public int getSequence(int addr) {
        if (featOkTst && casFeat_sequence == null)
      jcas.throwFeatMissing("sequence", "edu.cmu.lti.oaqa.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sequence);
  }
  /** @generated */    
  public void setSequence(int addr, int v) {
        if (featOkTst && casFeat_sequence == null)
      jcas.throwFeatMissing("sequence", "edu.cmu.lti.oaqa.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_sequence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "edu.cmu.lti.oaqa.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "edu.cmu.lti.oaqa.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_cType;
  /** @generated */
  final int     casFeatCode_cType;
  /** @generated */ 
  public int getCType(int addr) {
        if (featOkTst && casFeat_cType == null)
      jcas.throwFeatMissing("cType", "edu.cmu.lti.oaqa.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_cType);
  }
  /** @generated */    
  public void setCType(int addr, int v) {
        if (featOkTst && casFeat_cType == null)
      jcas.throwFeatMissing("cType", "edu.cmu.lti.oaqa.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_cType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_resources;
  /** @generated */
  final int     casFeatCode_resources;
  /** @generated */ 
  public int getResources(int addr) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "edu.cmu.lti.oaqa.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_resources);
  }
  /** @generated */    
  public void setResources(int addr, int v) {
        if (featOkTst && casFeat_resources == null)
      jcas.throwFeatMissing("resources", "edu.cmu.lti.oaqa.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_resources, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tags;
  /** @generated */
  final int     casFeatCode_tags;
  /** @generated */ 
  public int getTags(int addr) {
        if (featOkTst && casFeat_tags == null)
      jcas.throwFeatMissing("tags", "edu.cmu.lti.oaqa.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tags);
  }
  /** @generated */    
  public void setTags(int addr, int v) {
        if (featOkTst && casFeat_tags == null)
      jcas.throwFeatMissing("tags", "edu.cmu.lti.oaqa.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_tags, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sequence = jcas.getRequiredFeatureDE(casType, "sequence", "uima.cas.Integer", featOkTst);
    casFeatCode_sequence  = (null == casFeat_sequence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sequence).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_cType = jcas.getRequiredFeatureDE(casType, "cType", "uima.cas.Integer", featOkTst);
    casFeatCode_cType  = (null == casFeat_cType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cType).getCode();

 
    casFeat_resources = jcas.getRequiredFeatureDE(casType, "resources", "uima.cas.FSList", featOkTst);
    casFeatCode_resources  = (null == casFeat_resources) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_resources).getCode();

 
    casFeat_tags = jcas.getRequiredFeatureDE(casType, "tags", "uima.cas.FSList", featOkTst);
    casFeatCode_tags  = (null == casFeat_tags) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tags).getCode();

  }
}



    