/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcQrySuperUserFunctionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySuperUserFunctionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySuperUserFunctionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v15x64apiJNI.delete_CThostFtdcQrySuperUserFunctionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcQrySuperUserFunctionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcQrySuperUserFunctionField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQrySuperUserFunctionField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcQrySuperUserFunctionField(), true);
  }

}