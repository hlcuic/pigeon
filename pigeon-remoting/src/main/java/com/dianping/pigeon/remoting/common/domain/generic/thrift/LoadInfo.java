/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dianping.pigeon.remoting.common.domain.generic.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoadInfo implements org.apache.thrift.TBase<LoadInfo, LoadInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LoadInfo");

  private static final org.apache.thrift.protocol.TField AVERAGE_LOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("averageLoad", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField OLD_GC_FIELD_DESC = new org.apache.thrift.protocol.TField("oldGC", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField THREAD_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("threadNum", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField QUEUE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("queueSize", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField QPS_FIELD_DESC = new org.apache.thrift.protocol.TField("qps", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LoadInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LoadInfoTupleSchemeFactory());
  }

  public double averageLoad; // optional
  public int oldGC; // optional
  public int threadNum; // optional
  public int queueSize; // optional
  public int qps; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AVERAGE_LOAD((short)1, "averageLoad"),
    OLD_GC((short)2, "oldGC"),
    THREAD_NUM((short)3, "threadNum"),
    QUEUE_SIZE((short)4, "queueSize"),
    QPS((short)5, "qps");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AVERAGE_LOAD
          return AVERAGE_LOAD;
        case 2: // OLD_GC
          return OLD_GC;
        case 3: // THREAD_NUM
          return THREAD_NUM;
        case 4: // QUEUE_SIZE
          return QUEUE_SIZE;
        case 5: // QPS
          return QPS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AVERAGELOAD_ISSET_ID = 0;
  private static final int __OLDGC_ISSET_ID = 1;
  private static final int __THREADNUM_ISSET_ID = 2;
  private static final int __QUEUESIZE_ISSET_ID = 3;
  private static final int __QPS_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);
  private _Fields optionals[] = {_Fields.AVERAGE_LOAD,_Fields.OLD_GC,_Fields.THREAD_NUM,_Fields.QUEUE_SIZE,_Fields.QPS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AVERAGE_LOAD, new org.apache.thrift.meta_data.FieldMetaData("averageLoad", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.OLD_GC, new org.apache.thrift.meta_data.FieldMetaData("oldGC", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.THREAD_NUM, new org.apache.thrift.meta_data.FieldMetaData("threadNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.QUEUE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("queueSize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.QPS, new org.apache.thrift.meta_data.FieldMetaData("qps", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LoadInfo.class, metaDataMap);
  }

  public LoadInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LoadInfo(LoadInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.averageLoad = other.averageLoad;
    this.oldGC = other.oldGC;
    this.threadNum = other.threadNum;
    this.queueSize = other.queueSize;
    this.qps = other.qps;
  }

  public LoadInfo deepCopy() {
    return new LoadInfo(this);
  }

  @Override
  public void clear() {
    setAverageLoadIsSet(false);
    this.averageLoad = 0.0;
    setOldGCIsSet(false);
    this.oldGC = 0;
    setThreadNumIsSet(false);
    this.threadNum = 0;
    setQueueSizeIsSet(false);
    this.queueSize = 0;
    setQpsIsSet(false);
    this.qps = 0;
  }

  public double getAverageLoad() {
    return this.averageLoad;
  }

  public LoadInfo setAverageLoad(double averageLoad) {
    this.averageLoad = averageLoad;
    setAverageLoadIsSet(true);
    return this;
  }

  public void unsetAverageLoad() {
    __isset_bit_vector.clear(__AVERAGELOAD_ISSET_ID);
  }

  /** Returns true if field averageLoad is set (has been assigned a value) and false otherwise */
  public boolean isSetAverageLoad() {
    return __isset_bit_vector.get(__AVERAGELOAD_ISSET_ID);
  }

  public void setAverageLoadIsSet(boolean value) {
    __isset_bit_vector.set(__AVERAGELOAD_ISSET_ID, value);
  }

  public int getOldGC() {
    return this.oldGC;
  }

  public LoadInfo setOldGC(int oldGC) {
    this.oldGC = oldGC;
    setOldGCIsSet(true);
    return this;
  }

  public void unsetOldGC() {
    __isset_bit_vector.clear(__OLDGC_ISSET_ID);
  }

  /** Returns true if field oldGC is set (has been assigned a value) and false otherwise */
  public boolean isSetOldGC() {
    return __isset_bit_vector.get(__OLDGC_ISSET_ID);
  }

  public void setOldGCIsSet(boolean value) {
    __isset_bit_vector.set(__OLDGC_ISSET_ID, value);
  }

  public int getThreadNum() {
    return this.threadNum;
  }

  public LoadInfo setThreadNum(int threadNum) {
    this.threadNum = threadNum;
    setThreadNumIsSet(true);
    return this;
  }

  public void unsetThreadNum() {
    __isset_bit_vector.clear(__THREADNUM_ISSET_ID);
  }

  /** Returns true if field threadNum is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadNum() {
    return __isset_bit_vector.get(__THREADNUM_ISSET_ID);
  }

  public void setThreadNumIsSet(boolean value) {
    __isset_bit_vector.set(__THREADNUM_ISSET_ID, value);
  }

  public int getQueueSize() {
    return this.queueSize;
  }

  public LoadInfo setQueueSize(int queueSize) {
    this.queueSize = queueSize;
    setQueueSizeIsSet(true);
    return this;
  }

  public void unsetQueueSize() {
    __isset_bit_vector.clear(__QUEUESIZE_ISSET_ID);
  }

  /** Returns true if field queueSize is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueSize() {
    return __isset_bit_vector.get(__QUEUESIZE_ISSET_ID);
  }

  public void setQueueSizeIsSet(boolean value) {
    __isset_bit_vector.set(__QUEUESIZE_ISSET_ID, value);
  }

  public int getQps() {
    return this.qps;
  }

  public LoadInfo setQps(int qps) {
    this.qps = qps;
    setQpsIsSet(true);
    return this;
  }

  public void unsetQps() {
    __isset_bit_vector.clear(__QPS_ISSET_ID);
  }

  /** Returns true if field qps is set (has been assigned a value) and false otherwise */
  public boolean isSetQps() {
    return __isset_bit_vector.get(__QPS_ISSET_ID);
  }

  public void setQpsIsSet(boolean value) {
    __isset_bit_vector.set(__QPS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AVERAGE_LOAD:
      if (value == null) {
        unsetAverageLoad();
      } else {
        setAverageLoad((Double)value);
      }
      break;

    case OLD_GC:
      if (value == null) {
        unsetOldGC();
      } else {
        setOldGC((Integer)value);
      }
      break;

    case THREAD_NUM:
      if (value == null) {
        unsetThreadNum();
      } else {
        setThreadNum((Integer)value);
      }
      break;

    case QUEUE_SIZE:
      if (value == null) {
        unsetQueueSize();
      } else {
        setQueueSize((Integer)value);
      }
      break;

    case QPS:
      if (value == null) {
        unsetQps();
      } else {
        setQps((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AVERAGE_LOAD:
      return Double.valueOf(getAverageLoad());

    case OLD_GC:
      return Integer.valueOf(getOldGC());

    case THREAD_NUM:
      return Integer.valueOf(getThreadNum());

    case QUEUE_SIZE:
      return Integer.valueOf(getQueueSize());

    case QPS:
      return Integer.valueOf(getQps());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AVERAGE_LOAD:
      return isSetAverageLoad();
    case OLD_GC:
      return isSetOldGC();
    case THREAD_NUM:
      return isSetThreadNum();
    case QUEUE_SIZE:
      return isSetQueueSize();
    case QPS:
      return isSetQps();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LoadInfo)
      return this.equals((LoadInfo)that);
    return false;
  }

  public boolean equals(LoadInfo that) {
    if (that == null)
      return false;

    boolean this_present_averageLoad = true && this.isSetAverageLoad();
    boolean that_present_averageLoad = true && that.isSetAverageLoad();
    if (this_present_averageLoad || that_present_averageLoad) {
      if (!(this_present_averageLoad && that_present_averageLoad))
        return false;
      if (this.averageLoad != that.averageLoad)
        return false;
    }

    boolean this_present_oldGC = true && this.isSetOldGC();
    boolean that_present_oldGC = true && that.isSetOldGC();
    if (this_present_oldGC || that_present_oldGC) {
      if (!(this_present_oldGC && that_present_oldGC))
        return false;
      if (this.oldGC != that.oldGC)
        return false;
    }

    boolean this_present_threadNum = true && this.isSetThreadNum();
    boolean that_present_threadNum = true && that.isSetThreadNum();
    if (this_present_threadNum || that_present_threadNum) {
      if (!(this_present_threadNum && that_present_threadNum))
        return false;
      if (this.threadNum != that.threadNum)
        return false;
    }

    boolean this_present_queueSize = true && this.isSetQueueSize();
    boolean that_present_queueSize = true && that.isSetQueueSize();
    if (this_present_queueSize || that_present_queueSize) {
      if (!(this_present_queueSize && that_present_queueSize))
        return false;
      if (this.queueSize != that.queueSize)
        return false;
    }

    boolean this_present_qps = true && this.isSetQps();
    boolean that_present_qps = true && that.isSetQps();
    if (this_present_qps || that_present_qps) {
      if (!(this_present_qps && that_present_qps))
        return false;
      if (this.qps != that.qps)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LoadInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LoadInfo typedOther = (LoadInfo)other;

    lastComparison = Boolean.valueOf(isSetAverageLoad()).compareTo(typedOther.isSetAverageLoad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAverageLoad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.averageLoad, typedOther.averageLoad);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOldGC()).compareTo(typedOther.isSetOldGC());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldGC()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldGC, typedOther.oldGC);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThreadNum()).compareTo(typedOther.isSetThreadNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadNum, typedOther.threadNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueueSize()).compareTo(typedOther.isSetQueueSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queueSize, typedOther.queueSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQps()).compareTo(typedOther.isSetQps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qps, typedOther.qps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LoadInfo(");
    boolean first = true;

    if (isSetAverageLoad()) {
      sb.append("averageLoad:");
      sb.append(this.averageLoad);
      first = false;
    }
    if (isSetOldGC()) {
      if (!first) sb.append(", ");
      sb.append("oldGC:");
      sb.append(this.oldGC);
      first = false;
    }
    if (isSetThreadNum()) {
      if (!first) sb.append(", ");
      sb.append("threadNum:");
      sb.append(this.threadNum);
      first = false;
    }
    if (isSetQueueSize()) {
      if (!first) sb.append(", ");
      sb.append("queueSize:");
      sb.append(this.queueSize);
      first = false;
    }
    if (isSetQps()) {
      if (!first) sb.append(", ");
      sb.append("qps:");
      sb.append(this.qps);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LoadInfoStandardSchemeFactory implements SchemeFactory {
    public LoadInfoStandardScheme getScheme() {
      return new LoadInfoStandardScheme();
    }
  }

  private static class LoadInfoStandardScheme extends StandardScheme<LoadInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LoadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AVERAGE_LOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.averageLoad = iprot.readDouble();
              struct.setAverageLoadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OLD_GC
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.oldGC = iprot.readI32();
              struct.setOldGCIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THREAD_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.threadNum = iprot.readI32();
              struct.setThreadNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUEUE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.queueSize = iprot.readI32();
              struct.setQueueSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // QPS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.qps = iprot.readI32();
              struct.setQpsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LoadInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetAverageLoad()) {
        oprot.writeFieldBegin(AVERAGE_LOAD_FIELD_DESC);
        oprot.writeDouble(struct.averageLoad);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOldGC()) {
        oprot.writeFieldBegin(OLD_GC_FIELD_DESC);
        oprot.writeI32(struct.oldGC);
        oprot.writeFieldEnd();
      }
      if (struct.isSetThreadNum()) {
        oprot.writeFieldBegin(THREAD_NUM_FIELD_DESC);
        oprot.writeI32(struct.threadNum);
        oprot.writeFieldEnd();
      }
      if (struct.isSetQueueSize()) {
        oprot.writeFieldBegin(QUEUE_SIZE_FIELD_DESC);
        oprot.writeI32(struct.queueSize);
        oprot.writeFieldEnd();
      }
      if (struct.isSetQps()) {
        oprot.writeFieldBegin(QPS_FIELD_DESC);
        oprot.writeI32(struct.qps);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LoadInfoTupleSchemeFactory implements SchemeFactory {
    public LoadInfoTupleScheme getScheme() {
      return new LoadInfoTupleScheme();
    }
  }

  private static class LoadInfoTupleScheme extends TupleScheme<LoadInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LoadInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAverageLoad()) {
        optionals.set(0);
      }
      if (struct.isSetOldGC()) {
        optionals.set(1);
      }
      if (struct.isSetThreadNum()) {
        optionals.set(2);
      }
      if (struct.isSetQueueSize()) {
        optionals.set(3);
      }
      if (struct.isSetQps()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAverageLoad()) {
        oprot.writeDouble(struct.averageLoad);
      }
      if (struct.isSetOldGC()) {
        oprot.writeI32(struct.oldGC);
      }
      if (struct.isSetThreadNum()) {
        oprot.writeI32(struct.threadNum);
      }
      if (struct.isSetQueueSize()) {
        oprot.writeI32(struct.queueSize);
      }
      if (struct.isSetQps()) {
        oprot.writeI32(struct.qps);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LoadInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.averageLoad = iprot.readDouble();
        struct.setAverageLoadIsSet(true);
      }
      if (incoming.get(1)) {
        struct.oldGC = iprot.readI32();
        struct.setOldGCIsSet(true);
      }
      if (incoming.get(2)) {
        struct.threadNum = iprot.readI32();
        struct.setThreadNumIsSet(true);
      }
      if (incoming.get(3)) {
        struct.queueSize = iprot.readI32();
        struct.setQueueSizeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.qps = iprot.readI32();
        struct.setQpsIsSet(true);
      }
    }
  }

}

