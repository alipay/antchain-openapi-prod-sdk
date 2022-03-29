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

    // 本地应用机房信息
    @NameInMap("idc_name")
    public String idcName;

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

    // 状态码，0或者00代表成功
    @NameInMap("status")
    public String status;

    // 键值对
    @NameInMap("tags")
    public java.util.List<KeySet> tags;

    // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_id")
    public String treeId;

    // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_parent_id")
    public String treeParentId;

    // 方法名
    @NameInMap("name")
    public String name;

    // 本地应用所属单元
    @NameInMap("cell_name")
    public String cellName;

    // 远端应用名
    @NameInMap("remote_app")
    public String remoteApp;

    // 远端应用ip
    @NameInMap("remote_ip")
    public String remoteIp;

    // 远端应用机房信息
    @NameInMap("remote_idc_name")
    public String remoteIdcName;

    // 远端应用所属单元
    @NameInMap("remote_cell_name")
    public String remoteCellName;

    // 代表是否本节点数据缺失
    @NameInMap("missing")
    public Boolean missing;

    // 代表是否有子节点
    @NameInMap("has_children")
    public Boolean hasChildren;

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

    public TraceTreeItem setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
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

    public TraceTreeItem setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public TraceTreeItem setTreeParentId(String treeParentId) {
        this.treeParentId = treeParentId;
        return this;
    }
    public String getTreeParentId() {
        return this.treeParentId;
    }

    public TraceTreeItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraceTreeItem setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public TraceTreeItem setRemoteApp(String remoteApp) {
        this.remoteApp = remoteApp;
        return this;
    }
    public String getRemoteApp() {
        return this.remoteApp;
    }

    public TraceTreeItem setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public TraceTreeItem setRemoteIdcName(String remoteIdcName) {
        this.remoteIdcName = remoteIdcName;
        return this;
    }
    public String getRemoteIdcName() {
        return this.remoteIdcName;
    }

    public TraceTreeItem setRemoteCellName(String remoteCellName) {
        this.remoteCellName = remoteCellName;
        return this;
    }
    public String getRemoteCellName() {
        return this.remoteCellName;
    }

    public TraceTreeItem setMissing(Boolean missing) {
        this.missing = missing;
        return this;
    }
    public Boolean getMissing() {
        return this.missing;
    }

    public TraceTreeItem setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }
    public Boolean getHasChildren() {
        return this.hasChildren;
    }

}
