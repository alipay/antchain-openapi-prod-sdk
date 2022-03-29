// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceCompactTreeItem extends TeaModel {
    // 方法名
    @NameInMap("name")
    public String name;

    // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_id")
    public String treeId;

    // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_parent_id")
    public String treeParentId;

    // 客户端span是否缺失
    @NameInMap("client_missing")
    public Boolean clientMissing;

    // 服务端span是否缺失
    @NameInMap("server_missing")
    public Boolean serverMissing;

    // 客户端是否经过mesh
    @NameInMap("has_client_mesh")
    public Boolean hasClientMesh;

    // 服务端是否经过mesh
    @NameInMap("has_server_mesh")
    public Boolean hasServerMesh;

    // 是否包含子节点
    @NameInMap("has_children")
    public Boolean hasChildren;

    // 客户端应用名
    @NameInMap("client_app")
    public String clientApp;

    // 服务端应用名
    @NameInMap("server_app")
    public String serverApp;

    // 客户端 ip
    @NameInMap("client_ip")
    public String clientIp;

    // 服务端 ip
    @NameInMap("server_ip")
    public String serverIp;

    // 客户端 idc
    @NameInMap("client_idc_name")
    public String clientIdcName;

    // 服务端 idc
    @NameInMap("server_idc_name")
    public String serverIdcName;

    // 客户端 cell
    @NameInMap("client_cell_name")
    public String clientCellName;

    // 服务端 cell
    @NameInMap("server_cell_name")
    public String serverCellName;

    // 客户端开始时间, 毫秒时间戳
    @NameInMap("client_start_time")
    public Long clientStartTime;

    // 服务端开始时间, 毫秒时间戳
    @NameInMap("server_start_time")
    public Long serverStartTime;

    // 客户端毫秒耗时
    @NameInMap("client_duration")
    public Long clientDuration;

    // 服务端毫秒耗时
    @NameInMap("server_duration")
    public Long serverDuration;

    // 客户端状态码
    @NameInMap("client_status")
    public String clientStatus;

    // 服务端状态码
    @NameInMap("server_status")
    public String serverStatus;

    // 客户端组件类型
    @NameInMap("client_component")
    public String clientComponent;

    // 服务端组件类型
    @NameInMap("server_component")
    public String serverComponent;

    // 客户端span
    @NameInMap("client_span")
    public TraceSpan clientSpan;

    // 服务端span
    @NameInMap("server_span")
    public TraceSpan serverSpan;

    // 整体状态码
    @NameInMap("status")
    public String status;

    // 健康度耗时配置
    @NameInMap("apdex_threshold")
    public String apdexThreshold;

    // 健康度
    @NameInMap("apdex_status")
    public String apdexStatus;

    public static TraceCompactTreeItem build(java.util.Map<String, ?> map) throws Exception {
        TraceCompactTreeItem self = new TraceCompactTreeItem();
        return TeaModel.build(map, self);
    }

    public TraceCompactTreeItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraceCompactTreeItem setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public TraceCompactTreeItem setTreeParentId(String treeParentId) {
        this.treeParentId = treeParentId;
        return this;
    }
    public String getTreeParentId() {
        return this.treeParentId;
    }

    public TraceCompactTreeItem setClientMissing(Boolean clientMissing) {
        this.clientMissing = clientMissing;
        return this;
    }
    public Boolean getClientMissing() {
        return this.clientMissing;
    }

    public TraceCompactTreeItem setServerMissing(Boolean serverMissing) {
        this.serverMissing = serverMissing;
        return this;
    }
    public Boolean getServerMissing() {
        return this.serverMissing;
    }

    public TraceCompactTreeItem setHasClientMesh(Boolean hasClientMesh) {
        this.hasClientMesh = hasClientMesh;
        return this;
    }
    public Boolean getHasClientMesh() {
        return this.hasClientMesh;
    }

    public TraceCompactTreeItem setHasServerMesh(Boolean hasServerMesh) {
        this.hasServerMesh = hasServerMesh;
        return this;
    }
    public Boolean getHasServerMesh() {
        return this.hasServerMesh;
    }

    public TraceCompactTreeItem setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }
    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    public TraceCompactTreeItem setClientApp(String clientApp) {
        this.clientApp = clientApp;
        return this;
    }
    public String getClientApp() {
        return this.clientApp;
    }

    public TraceCompactTreeItem setServerApp(String serverApp) {
        this.serverApp = serverApp;
        return this;
    }
    public String getServerApp() {
        return this.serverApp;
    }

    public TraceCompactTreeItem setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public TraceCompactTreeItem setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public TraceCompactTreeItem setClientIdcName(String clientIdcName) {
        this.clientIdcName = clientIdcName;
        return this;
    }
    public String getClientIdcName() {
        return this.clientIdcName;
    }

    public TraceCompactTreeItem setServerIdcName(String serverIdcName) {
        this.serverIdcName = serverIdcName;
        return this;
    }
    public String getServerIdcName() {
        return this.serverIdcName;
    }

    public TraceCompactTreeItem setClientCellName(String clientCellName) {
        this.clientCellName = clientCellName;
        return this;
    }
    public String getClientCellName() {
        return this.clientCellName;
    }

    public TraceCompactTreeItem setServerCellName(String serverCellName) {
        this.serverCellName = serverCellName;
        return this;
    }
    public String getServerCellName() {
        return this.serverCellName;
    }

    public TraceCompactTreeItem setClientStartTime(Long clientStartTime) {
        this.clientStartTime = clientStartTime;
        return this;
    }
    public Long getClientStartTime() {
        return this.clientStartTime;
    }

    public TraceCompactTreeItem setServerStartTime(Long serverStartTime) {
        this.serverStartTime = serverStartTime;
        return this;
    }
    public Long getServerStartTime() {
        return this.serverStartTime;
    }

    public TraceCompactTreeItem setClientDuration(Long clientDuration) {
        this.clientDuration = clientDuration;
        return this;
    }
    public Long getClientDuration() {
        return this.clientDuration;
    }

    public TraceCompactTreeItem setServerDuration(Long serverDuration) {
        this.serverDuration = serverDuration;
        return this;
    }
    public Long getServerDuration() {
        return this.serverDuration;
    }

    public TraceCompactTreeItem setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
        return this;
    }
    public String getClientStatus() {
        return this.clientStatus;
    }

    public TraceCompactTreeItem setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
        return this;
    }
    public String getServerStatus() {
        return this.serverStatus;
    }

    public TraceCompactTreeItem setClientComponent(String clientComponent) {
        this.clientComponent = clientComponent;
        return this;
    }
    public String getClientComponent() {
        return this.clientComponent;
    }

    public TraceCompactTreeItem setServerComponent(String serverComponent) {
        this.serverComponent = serverComponent;
        return this;
    }
    public String getServerComponent() {
        return this.serverComponent;
    }

    public TraceCompactTreeItem setClientSpan(TraceSpan clientSpan) {
        this.clientSpan = clientSpan;
        return this;
    }
    public TraceSpan getClientSpan() {
        return this.clientSpan;
    }

    public TraceCompactTreeItem setServerSpan(TraceSpan serverSpan) {
        this.serverSpan = serverSpan;
        return this;
    }
    public TraceSpan getServerSpan() {
        return this.serverSpan;
    }

    public TraceCompactTreeItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceCompactTreeItem setApdexThreshold(String apdexThreshold) {
        this.apdexThreshold = apdexThreshold;
        return this;
    }
    public String getApdexThreshold() {
        return this.apdexThreshold;
    }

    public TraceCompactTreeItem setApdexStatus(String apdexStatus) {
        this.apdexStatus = apdexStatus;
        return this;
    }
    public String getApdexStatus() {
        return this.apdexStatus;
    }

}
