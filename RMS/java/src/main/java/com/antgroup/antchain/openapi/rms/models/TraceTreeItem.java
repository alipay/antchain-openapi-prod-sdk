// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceTreeItem extends TeaModel {
    // 应用名
    @NameInMap("app")
    public String app;

    // 组件类型
    @NameInMap("component")
    public String component;

    // 耗时, 毫秒
    @NameInMap("duration")
    public Long duration;

    // 机房信息
    @NameInMap("idc")
    public String idc;

    // 描述信息
    @NameInMap("info")
    public String info;

    // ip
    @NameInMap("ip")
    public String ip;

    // 对应的span的类型 枚举类型 CLIENT SERVER CONSUMER PRODUCER
    @NameInMap("kind")
    public String kind;

    // parent span id
    @NameInMap("parent_id")
    public String parentId;

    // 请求体字节大小, 如果取不到就为-1
    @NameInMap("request_size")
    public Long requestSize;

    // 响应体大小, 如果取不到就为-1
    @NameInMap("response_size")
    public Long responseSize;

    // span id
    @NameInMap("span_id")
    public String spanId;

    // 开始时间, 毫秒时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 状态码
    @NameInMap("status")
    public String status;

    // 键值对
    @NameInMap("tags")
    public java.util.List<KeySet> tags;

    // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_id")
    public Long treeId;

    // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_parent_id")
    public Long treeParentId;

    // 单元化信息
    @NameInMap("unit")
    public String unit;

    public static TraceTreeItem build(java.util.Map<String, ?> map) throws Exception {
        TraceTreeItem self = new TraceTreeItem();
        return TeaModel.build(map, self);
    }

    public TraceTreeItem setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public TraceTreeItem setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public TraceTreeItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public TraceTreeItem setIdc(String idc) {
        this.idc = idc;
        return this;
    }
    public String getIdc() {
        return this.idc;
    }

    public TraceTreeItem setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public TraceTreeItem setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public TraceTreeItem setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public TraceTreeItem setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public TraceTreeItem setRequestSize(Long requestSize) {
        this.requestSize = requestSize;
        return this;
    }
    public Long getRequestSize() {
        return this.requestSize;
    }

    public TraceTreeItem setResponseSize(Long responseSize) {
        this.responseSize = responseSize;
        return this;
    }
    public Long getResponseSize() {
        return this.responseSize;
    }

    public TraceTreeItem setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public TraceTreeItem setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public TraceTreeItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceTreeItem setTags(java.util.List<KeySet> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeySet> getTags() {
        return this.tags;
    }

    public TraceTreeItem setTreeId(Long treeId) {
        this.treeId = treeId;
        return this;
    }
    public Long getTreeId() {
        return this.treeId;
    }

    public TraceTreeItem setTreeParentId(Long treeParentId) {
        this.treeParentId = treeParentId;
        return this;
    }
    public Long getTreeParentId() {
        return this.treeParentId;
    }

    public TraceTreeItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
