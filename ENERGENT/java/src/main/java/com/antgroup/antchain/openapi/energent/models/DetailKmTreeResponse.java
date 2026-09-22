// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DetailKmTreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识库ID
    @NameInMap("tree_id")
    public String treeId;

    // 知识库名称
    @NameInMap("name")
    public String name;

    // 知识库描述
    @NameInMap("description")
    public String description;

    // 知识库图标
    @NameInMap("icon")
    public String icon;

    // 最新版本号(无版本为空)
    @NameInMap("version")
    public String version;

    // 当前激活版本号(未激活为空)
    @NameInMap("active_version")
    public String activeVersion;

    // 节点总数
    @NameInMap("node_count")
    public Long nodeCount;

    // 文档总数
    @NameInMap("document_count")
    public Long documentCount;

    // 是否开启图谱编译
    @NameInMap("graph_enabled")
    public Boolean graphEnabled;

    // 处理中(未终态)编译任务数(仅图谱开启返回)
    @NameInMap("compile_task_count")
    public Long compileTaskCount;

    // 根节点树JSON文本(OpenNode字段定义见文档)
    @NameInMap("root_node_json")
    public String rootNodeJson;

    // 创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 租户标签(官方租户数据为official)
    @NameInMap("tenant_tag")
    public String tenantTag;

    public static DetailKmTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailKmTreeResponse self = new DetailKmTreeResponse();
        return TeaModel.build(map, self);
    }

    public DetailKmTreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailKmTreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailKmTreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailKmTreeResponse setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public DetailKmTreeResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailKmTreeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetailKmTreeResponse setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public DetailKmTreeResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DetailKmTreeResponse setActiveVersion(String activeVersion) {
        this.activeVersion = activeVersion;
        return this;
    }
    public String getActiveVersion() {
        return this.activeVersion;
    }

    public DetailKmTreeResponse setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

    public DetailKmTreeResponse setDocumentCount(Long documentCount) {
        this.documentCount = documentCount;
        return this;
    }
    public Long getDocumentCount() {
        return this.documentCount;
    }

    public DetailKmTreeResponse setGraphEnabled(Boolean graphEnabled) {
        this.graphEnabled = graphEnabled;
        return this;
    }
    public Boolean getGraphEnabled() {
        return this.graphEnabled;
    }

    public DetailKmTreeResponse setCompileTaskCount(Long compileTaskCount) {
        this.compileTaskCount = compileTaskCount;
        return this;
    }
    public Long getCompileTaskCount() {
        return this.compileTaskCount;
    }

    public DetailKmTreeResponse setRootNodeJson(String rootNodeJson) {
        this.rootNodeJson = rootNodeJson;
        return this;
    }
    public String getRootNodeJson() {
        return this.rootNodeJson;
    }

    public DetailKmTreeResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DetailKmTreeResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DetailKmTreeResponse setTenantTag(String tenantTag) {
        this.tenantTag = tenantTag;
        return this;
    }
    public String getTenantTag() {
        return this.tenantTag;
    }

}
