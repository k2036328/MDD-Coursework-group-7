/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cw.edu.eduLangauage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.cw.edu.eduLangauage.VariableReference#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.cw.edu.eduLangauage.EduLangauagePackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends IntExpression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VariableDeclaration)
   * @see uk.ac.kcl.inf.cw.edu.eduLangauage.EduLangauagePackage#getVariableReference_Var()
   * @model
   * @generated
   */
  VariableDeclaration getVar();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.cw.edu.eduLangauage.VariableReference#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VariableDeclaration value);

} // VariableReference
