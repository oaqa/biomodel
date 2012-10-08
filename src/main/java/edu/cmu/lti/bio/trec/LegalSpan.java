

/* First created by JCasGen Mon Oct 08 18:14:56 EDT 2012 */
package edu.cmu.lti.bio.trec;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Oct 08 18:14:56 EDT 2012
 * XML source: /home/yangzi/QA/biomodel/src/main/resources/edu/cmu/lti/oaqa/bio/model/BioTypes.xml
 * @generated */
public class LegalSpan extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LegalSpan.class);
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
  protected LegalSpan() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public LegalSpan(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public LegalSpan(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public LegalSpan(JCas jcas, int begin, int end) {
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
     
}

    