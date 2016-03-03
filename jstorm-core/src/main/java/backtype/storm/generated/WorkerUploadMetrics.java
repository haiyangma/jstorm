/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-22")
public class WorkerUploadMetrics implements org.apache.thrift.TBase<WorkerUploadMetrics, WorkerUploadMetrics._Fields>, java.io.Serializable, Cloneable, Comparable<WorkerUploadMetrics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WorkerUploadMetrics");

  private static final org.apache.thrift.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("topologyId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SUPERVISOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisorId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ALL_METRICS_FIELD_DESC = new org.apache.thrift.protocol.TField("allMetrics", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WorkerUploadMetricsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WorkerUploadMetricsTupleSchemeFactory());
  }

  private String topologyId; // required
  private String supervisorId; // required
  private int port; // required
  private MetricInfo allMetrics; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPOLOGY_ID((short)1, "topologyId"),
    SUPERVISOR_ID((short)2, "supervisorId"),
    PORT((short)3, "port"),
    ALL_METRICS((short)4, "allMetrics");

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
        case 1: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 2: // SUPERVISOR_ID
          return SUPERVISOR_ID;
        case 3: // PORT
          return PORT;
        case 4: // ALL_METRICS
          return ALL_METRICS;
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
  private static final int __PORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.thrift.meta_data.FieldMetaData("topologyId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUPERVISOR_ID, new org.apache.thrift.meta_data.FieldMetaData("supervisorId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ALL_METRICS, new org.apache.thrift.meta_data.FieldMetaData("allMetrics", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WorkerUploadMetrics.class, metaDataMap);
  }

  public WorkerUploadMetrics() {
  }

  public WorkerUploadMetrics(
    String topologyId,
    String supervisorId,
    int port,
    MetricInfo allMetrics)
  {
    this();
    this.topologyId = topologyId;
    this.supervisorId = supervisorId;
    this.port = port;
    set_port_isSet(true);
    this.allMetrics = allMetrics;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkerUploadMetrics(WorkerUploadMetrics other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_topologyId()) {
      this.topologyId = other.topologyId;
    }
    if (other.is_set_supervisorId()) {
      this.supervisorId = other.supervisorId;
    }
    this.port = other.port;
    if (other.is_set_allMetrics()) {
      this.allMetrics = new MetricInfo(other.allMetrics);
    }
  }

  public WorkerUploadMetrics deepCopy() {
    return new WorkerUploadMetrics(this);
  }

  @Override
  public void clear() {
    this.topologyId = null;
    this.supervisorId = null;
    set_port_isSet(false);
    this.port = 0;
    this.allMetrics = null;
  }

  public String get_topologyId() {
    return this.topologyId;
  }

  public void set_topologyId(String topologyId) {
    this.topologyId = topologyId;
  }

  public void unset_topologyId() {
    this.topologyId = null;
  }

  /** Returns true if field topologyId is set (has been assigned a value) and false otherwise */
  public boolean is_set_topologyId() {
    return this.topologyId != null;
  }

  public void set_topologyId_isSet(boolean value) {
    if (!value) {
      this.topologyId = null;
    }
  }

  public String get_supervisorId() {
    return this.supervisorId;
  }

  public void set_supervisorId(String supervisorId) {
    this.supervisorId = supervisorId;
  }

  public void unset_supervisorId() {
    this.supervisorId = null;
  }

  /** Returns true if field supervisorId is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisorId() {
    return this.supervisorId != null;
  }

  public void set_supervisorId_isSet(boolean value) {
    if (!value) {
      this.supervisorId = null;
    }
  }

  public int get_port() {
    return this.port;
  }

  public void set_port(int port) {
    this.port = port;
    set_port_isSet(true);
  }

  public void unset_port() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean is_set_port() {
    return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void set_port_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public MetricInfo get_allMetrics() {
    return this.allMetrics;
  }

  public void set_allMetrics(MetricInfo allMetrics) {
    this.allMetrics = allMetrics;
  }

  public void unset_allMetrics() {
    this.allMetrics = null;
  }

  /** Returns true if field allMetrics is set (has been assigned a value) and false otherwise */
  public boolean is_set_allMetrics() {
    return this.allMetrics != null;
  }

  public void set_allMetrics_isSet(boolean value) {
    if (!value) {
      this.allMetrics = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY_ID:
      if (value == null) {
        unset_topologyId();
      } else {
        set_topologyId((String)value);
      }
      break;

    case SUPERVISOR_ID:
      if (value == null) {
        unset_supervisorId();
      } else {
        set_supervisorId((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unset_port();
      } else {
        set_port((Integer)value);
      }
      break;

    case ALL_METRICS:
      if (value == null) {
        unset_allMetrics();
      } else {
        set_allMetrics((MetricInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_ID:
      return get_topologyId();

    case SUPERVISOR_ID:
      return get_supervisorId();

    case PORT:
      return Integer.valueOf(get_port());

    case ALL_METRICS:
      return get_allMetrics();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY_ID:
      return is_set_topologyId();
    case SUPERVISOR_ID:
      return is_set_supervisorId();
    case PORT:
      return is_set_port();
    case ALL_METRICS:
      return is_set_allMetrics();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkerUploadMetrics)
      return this.equals((WorkerUploadMetrics)that);
    return false;
  }

  public boolean equals(WorkerUploadMetrics that) {
    if (that == null)
      return false;

    boolean this_present_topologyId = true && this.is_set_topologyId();
    boolean that_present_topologyId = true && that.is_set_topologyId();
    if (this_present_topologyId || that_present_topologyId) {
      if (!(this_present_topologyId && that_present_topologyId))
        return false;
      if (!this.topologyId.equals(that.topologyId))
        return false;
    }

    boolean this_present_supervisorId = true && this.is_set_supervisorId();
    boolean that_present_supervisorId = true && that.is_set_supervisorId();
    if (this_present_supervisorId || that_present_supervisorId) {
      if (!(this_present_supervisorId && that_present_supervisorId))
        return false;
      if (!this.supervisorId.equals(that.supervisorId))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_allMetrics = true && this.is_set_allMetrics();
    boolean that_present_allMetrics = true && that.is_set_allMetrics();
    if (this_present_allMetrics || that_present_allMetrics) {
      if (!(this_present_allMetrics && that_present_allMetrics))
        return false;
      if (!this.allMetrics.equals(that.allMetrics))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topologyId = true && (is_set_topologyId());
    list.add(present_topologyId);
    if (present_topologyId)
      list.add(topologyId);

    boolean present_supervisorId = true && (is_set_supervisorId());
    list.add(present_supervisorId);
    if (present_supervisorId)
      list.add(supervisorId);

    boolean present_port = true;
    list.add(present_port);
    if (present_port)
      list.add(port);

    boolean present_allMetrics = true && (is_set_allMetrics());
    list.add(present_allMetrics);
    if (present_allMetrics)
      list.add(allMetrics);

    return list.hashCode();
  }

  @Override
  public int compareTo(WorkerUploadMetrics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_topologyId()).compareTo(other.is_set_topologyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topologyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topologyId, other.topologyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_supervisorId()).compareTo(other.is_set_supervisorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisorId, other.supervisorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_port()).compareTo(other.is_set_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_allMetrics()).compareTo(other.is_set_allMetrics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_allMetrics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allMetrics, other.allMetrics);
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
    StringBuilder sb = new StringBuilder("WorkerUploadMetrics(");
    boolean first = true;

    sb.append("topologyId:");
    if (this.topologyId == null) {
      sb.append("null");
    } else {
      sb.append(this.topologyId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("supervisorId:");
    if (this.supervisorId == null) {
      sb.append("null");
    } else {
      sb.append(this.supervisorId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("allMetrics:");
    if (this.allMetrics == null) {
      sb.append("null");
    } else {
      sb.append(this.allMetrics);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_topologyId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topologyId' is unset! Struct:" + toString());
    }

    if (!is_set_supervisorId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'supervisorId' is unset! Struct:" + toString());
    }

    if (!is_set_port()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'port' is unset! Struct:" + toString());
    }

    if (!is_set_allMetrics()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'allMetrics' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (allMetrics != null) {
      allMetrics.validate();
    }
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WorkerUploadMetricsStandardSchemeFactory implements SchemeFactory {
    public WorkerUploadMetricsStandardScheme getScheme() {
      return new WorkerUploadMetricsStandardScheme();
    }
  }

  private static class WorkerUploadMetricsStandardScheme extends StandardScheme<WorkerUploadMetrics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topologyId = iprot.readString();
              struct.set_topologyId_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUPERVISOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.supervisorId = iprot.readString();
              struct.set_supervisorId_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.set_port_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ALL_METRICS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.allMetrics = new MetricInfo();
              struct.allMetrics.read(iprot);
              struct.set_allMetrics_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topologyId != null) {
        oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
        oprot.writeString(struct.topologyId);
        oprot.writeFieldEnd();
      }
      if (struct.supervisorId != null) {
        oprot.writeFieldBegin(SUPERVISOR_ID_FIELD_DESC);
        oprot.writeString(struct.supervisorId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      if (struct.allMetrics != null) {
        oprot.writeFieldBegin(ALL_METRICS_FIELD_DESC);
        struct.allMetrics.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WorkerUploadMetricsTupleSchemeFactory implements SchemeFactory {
    public WorkerUploadMetricsTupleScheme getScheme() {
      return new WorkerUploadMetricsTupleScheme();
    }
  }

  private static class WorkerUploadMetricsTupleScheme extends TupleScheme<WorkerUploadMetrics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topologyId);
      oprot.writeString(struct.supervisorId);
      oprot.writeI32(struct.port);
      struct.allMetrics.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topologyId = iprot.readString();
      struct.set_topologyId_isSet(true);
      struct.supervisorId = iprot.readString();
      struct.set_supervisorId_isSet(true);
      struct.port = iprot.readI32();
      struct.set_port_isSet(true);
      struct.allMetrics = new MetricInfo();
      struct.allMetrics.read(iprot);
      struct.set_allMetrics_isSet(true);
    }
  }

}

