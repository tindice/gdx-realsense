/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCRectI32 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PXCRectI32(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCRectI32 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        realsenseJNI.delete_PXCRectI32(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(int value) {
    realsenseJNI.PXCRectI32_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return realsenseJNI.PXCRectI32_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    realsenseJNI.PXCRectI32_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return realsenseJNI.PXCRectI32_y_get(swigCPtr, this);
  }

  public void setW(int value) {
    realsenseJNI.PXCRectI32_w_set(swigCPtr, this, value);
  }

  public int getW() {
    return realsenseJNI.PXCRectI32_w_get(swigCPtr, this);
  }

  public void setH(int value) {
    realsenseJNI.PXCRectI32_h_set(swigCPtr, this, value);
  }

  public int getH() {
    return realsenseJNI.PXCRectI32_h_get(swigCPtr, this);
  }

  public PXCRectI32() {
    this(realsenseJNI.new_PXCRectI32(), true);
  }

}
