// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceSpan extends TeaModel {
    // 组件类型
    @NameInMap("component")
    public String component;

    // 毫秒耗时
    @NameInMap("duration")
    public Long duration;

    // 服务描述信息
    @NameInMap("info")
    public String info;

    // span kind, CLIENT SERVER PRODUCER CONSUMER
    @NameInMap("kind")
    public String kind;

    // local endpoint ip
    @NameInMap("local_ip")
    public String localIp;

    // local endpoint service name
    @NameInMap("local_service_name")
    public String localServiceName;

    // local idc name
    @NameInMap("local_idc_name")
    public String localIdcName;

    // local cell name
    @NameInMap("local_cell_name")
    public String localCellName;

    // name
    @NameInMap("name")
    public String name;

    // parent_id
    @NameInMap("parent_id")
    public String parentId;

    // remote endpoint ip
    @NameInMap("remote_ip")
    public String remoteIp;

    // remote endpoint service name
    @NameInMap("remote_service_name")
    public String remoteServiceName;

    // remote idc name
    @NameInMap("remote_idc_name")
    public String remoteIdcName;

    // remote cell name
    @NameInMap("remote_cell_name")
    public String remoteCellName;

    // span_id
    @NameInMap("span_id")
    public String spanId;

    // 开始时间, 毫秒时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 状态码
    @NameInMap("status")
    public String status;

    // span tags, 是关于span的键值对
    @NameInMap("tags")
    public java.util.List<KeySet> tags;

    // trace id
    @NameInMap("trace_id")
    public String traceId;

    public static TraceSpan build(java.util.Map<String, ?> map) throws Exception {
        TraceSpan self = new TraceSpan();
        return TeaModel.build(map, self);
    }

    public TraceSpan setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public TraceSpan setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public TraceSpan setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public TraceSpan setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public TraceSpan setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }
    public String getLocalIp() {
        return this.localIp;
    }

    public TraceSpan setLocalServiceName(String localServiceName) {
        this.localServiceName = localServiceName;
        return this;
    }
    public String getLocalServiceName() {
        return this.localServiceName;
    }

    public TraceSpan setLocalIdcName(String localIdcName) {
        this.localIdcName = localIdcName;
        return this;
    }
    public String getLocalIdcName() {
        return this.localIdcName;
    }

    public TraceSpan setLocalCellName(String localCellName) {
        this.localCellName = localCellName;
        return this;
    }
    public String getLocalCellName() {
        return this.localCellName;
    }

    public TraceSpan setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraceSpan setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public TraceSpan setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public TraceSpan setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName;
        return this;
    }
    public String getRemoteServiceName() {
        return this.remoteServiceName;
    }

    public TraceSpan setRemoteIdcName(String remoteIdcName) {
        this.remoteIdcName = remoteIdcName;
        return this;
    }
    public String getRemoteIdcName() {
        return this.remoteIdcName;
    }

    public TraceSpan setRemoteCellName(String remoteCellName) {
        this.remoteCellName = remoteCellName;
        return this;
    }
    public String getRemoteCellName() {
        return this.remoteCellName;
    }

    public TraceSpan setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public TraceSpan setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public TraceSpan setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceSpan setTags(java.util.List<KeySet> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeySet> getTags() {
        return this.tags;
    }

    public TraceSpan setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
