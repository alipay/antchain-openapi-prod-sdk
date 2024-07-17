// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class OutboundDialogFlowDetailResponseData extends TeaModel {
    // 数据库自增id
    @NameInMap("id")
    public Long id;

    // 前端生成的随机字符串id
    @NameInMap("fe_id")
    @Validation(required = true)
    public String feId;

    // 流程名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 流程当前版本号
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    // 流程版本号集合
    @NameInMap("versions")
    @Validation(required = true)
    public java.util.List<Long> versions;

    // 全局配置
    @NameInMap("global_config")
    @Validation(required = true)
    public String globalConfig;

    // 流程类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 暂存code
    @NameInMap("temporary_storage_code")
    @Validation(required = true)
    public String temporaryStorageCode;

    // 视频播报类型
    @NameInMap("flow_interactive_type")
    @Validation(required = true)
    public String flowInteractiveType;

    // 流程图边数据
    @NameInMap("edges")
    @Validation(required = true)
    public java.util.List<Edge> edges;

    // 流程图节点数据
    @NameInMap("nodes")
    @Validation(required = true)
    public java.util.List<Node> nodes;

    public static OutboundDialogFlowDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
        OutboundDialogFlowDetailResponseData self = new OutboundDialogFlowDetailResponseData();
        return TeaModel.build(map, self);
    }

    public OutboundDialogFlowDetailResponseData setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OutboundDialogFlowDetailResponseData setFeId(String feId) {
        this.feId = feId;
        return this;
    }
    public String getFeId() {
        return this.feId;
    }

    public OutboundDialogFlowDetailResponseData setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OutboundDialogFlowDetailResponseData setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public OutboundDialogFlowDetailResponseData setVersions(java.util.List<Long> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<Long> getVersions() {
        return this.versions;
    }

    public OutboundDialogFlowDetailResponseData setGlobalConfig(String globalConfig) {
        this.globalConfig = globalConfig;
        return this;
    }
    public String getGlobalConfig() {
        return this.globalConfig;
    }

    public OutboundDialogFlowDetailResponseData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OutboundDialogFlowDetailResponseData setTemporaryStorageCode(String temporaryStorageCode) {
        this.temporaryStorageCode = temporaryStorageCode;
        return this;
    }
    public String getTemporaryStorageCode() {
        return this.temporaryStorageCode;
    }

    public OutboundDialogFlowDetailResponseData setFlowInteractiveType(String flowInteractiveType) {
        this.flowInteractiveType = flowInteractiveType;
        return this;
    }
    public String getFlowInteractiveType() {
        return this.flowInteractiveType;
    }

    public OutboundDialogFlowDetailResponseData setEdges(java.util.List<Edge> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<Edge> getEdges() {
        return this.edges;
    }

    public OutboundDialogFlowDetailResponseData setNodes(java.util.List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<Node> getNodes() {
        return this.nodes;
    }

}
