// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class DetailKmVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版本ID
    @NameInMap("version_id")
    public String versionId;

    // 知识库ID
    @NameInMap("tree_id")
    public String treeId;

    // 版本号
    @NameInMap("version")
    public String version;

    // 版本描述
    @NameInMap("description")
    public String description;

    // 版本快照JSON文本(树结构全文)
    @NameInMap("snapshot")
    public String snapshot;

    // 文档数
    @NameInMap("doc_count")
    public Long docCount;

    // 节点数
    @NameInMap("node_count")
    public Long nodeCount;

    public static DetailKmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailKmVersionResponse self = new DetailKmVersionResponse();
        return TeaModel.build(map, self);
    }

    public DetailKmVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailKmVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailKmVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailKmVersionResponse setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DetailKmVersionResponse setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public DetailKmVersionResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DetailKmVersionResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetailKmVersionResponse setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

    public DetailKmVersionResponse setDocCount(Long docCount) {
        this.docCount = docCount;
        return this;
    }
    public Long getDocCount() {
        return this.docCount;
    }

    public DetailKmVersionResponse setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

}
