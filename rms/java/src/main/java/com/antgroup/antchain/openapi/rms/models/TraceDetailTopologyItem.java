// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceDetailTopologyItem extends TeaModel {
    // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_id")
    public String treeId;

    // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
    @NameInMap("tree_parent_id")
    public String treeParentId;

    // 应用名
    @NameInMap("app")
    public String app;

    // 应用ip
    @NameInMap("ip")
    public String ip;

    // 客户端是否经过mesh
    @NameInMap("has_client_mesh")
    public Boolean hasClientMesh;

    // 服务端是否经过mesh
    @NameInMap("has_server_mesh")
    public Boolean hasServerMesh;

    // 数据中心
    @NameInMap("idc_name")
    public String idcName;

    // 单元名
    @NameInMap("cell_name")
    public String cellName;

    // 方法名
    @NameInMap("name")
    public String name;

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

    // 整体状态码
    @NameInMap("status")
    public String status;

    // 健康度耗时配置
    @NameInMap("apdex_threshold")
    public String apdexThreshold;

    // 健康度
    @NameInMap("apdex_status")
    public String apdexStatus;

    // 健康度数值
    @NameInMap("apdex_value")
    public String apdexValue;

    public static TraceDetailTopologyItem build(java.util.Map<String, ?> map) throws Exception {
        TraceDetailTopologyItem self = new TraceDetailTopologyItem();
        return TeaModel.build(map, self);
    }

    public TraceDetailTopologyItem setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public TraceDetailTopologyItem setTreeParentId(String treeParentId) {
        this.treeParentId = treeParentId;
        return this;
    }
    public String getTreeParentId() {
        return this.treeParentId;
    }

    public TraceDetailTopologyItem setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public TraceDetailTopologyItem setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public TraceDetailTopologyItem setHasClientMesh(Boolean hasClientMesh) {
        this.hasClientMesh = hasClientMesh;
        return this;
    }
    public Boolean getHasClientMesh() {
        return this.hasClientMesh;
    }

    public TraceDetailTopologyItem setHasServerMesh(Boolean hasServerMesh) {
        this.hasServerMesh = hasServerMesh;
        return this;
    }
    public Boolean getHasServerMesh() {
        return this.hasServerMesh;
    }

    public TraceDetailTopologyItem setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public TraceDetailTopologyItem setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public TraceDetailTopologyItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraceDetailTopologyItem setClientStartTime(Long clientStartTime) {
        this.clientStartTime = clientStartTime;
        return this;
    }
    public Long getClientStartTime() {
        return this.clientStartTime;
    }

    public TraceDetailTopologyItem setServerStartTime(Long serverStartTime) {
        this.serverStartTime = serverStartTime;
        return this;
    }
    public Long getServerStartTime() {
        return this.serverStartTime;
    }

    public TraceDetailTopologyItem setClientDuration(Long clientDuration) {
        this.clientDuration = clientDuration;
        return this;
    }
    public Long getClientDuration() {
        return this.clientDuration;
    }

    public TraceDetailTopologyItem setServerDuration(Long serverDuration) {
        this.serverDuration = serverDuration;
        return this;
    }
    public Long getServerDuration() {
        return this.serverDuration;
    }

    public TraceDetailTopologyItem setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
        return this;
    }
    public String getClientStatus() {
        return this.clientStatus;
    }

    public TraceDetailTopologyItem setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
        return this;
    }
    public String getServerStatus() {
        return this.serverStatus;
    }

    public TraceDetailTopologyItem setClientComponent(String clientComponent) {
        this.clientComponent = clientComponent;
        return this;
    }
    public String getClientComponent() {
        return this.clientComponent;
    }

    public TraceDetailTopologyItem setServerComponent(String serverComponent) {
        this.serverComponent = serverComponent;
        return this;
    }
    public String getServerComponent() {
        return this.serverComponent;
    }

    public TraceDetailTopologyItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TraceDetailTopologyItem setApdexThreshold(String apdexThreshold) {
        this.apdexThreshold = apdexThreshold;
        return this;
    }
    public String getApdexThreshold() {
        return this.apdexThreshold;
    }

    public TraceDetailTopologyItem setApdexStatus(String apdexStatus) {
        this.apdexStatus = apdexStatus;
        return this;
    }
    public String getApdexStatus() {
        return this.apdexStatus;
    }

    public TraceDetailTopologyItem setApdexValue(String apdexValue) {
        this.apdexValue = apdexValue;
        return this;
    }
    public String getApdexValue() {
        return this.apdexValue;
    }

}
