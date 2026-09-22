// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class NextKmVersionResponse extends TeaModel {
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

    // 下一个版本号
    @NameInMap("next_version")
    public String nextVersion;

    // 节点数
    @NameInMap("node_count")
    public Long nodeCount;

    // 文档数
    @NameInMap("document_count")
    public Long documentCount;

    public static NextKmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        NextKmVersionResponse self = new NextKmVersionResponse();
        return TeaModel.build(map, self);
    }

    public NextKmVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NextKmVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NextKmVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NextKmVersionResponse setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public NextKmVersionResponse setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public String getNextVersion() {
        return this.nextVersion;
    }

    public NextKmVersionResponse setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

    public NextKmVersionResponse setDocumentCount(Long documentCount) {
        this.documentCount = documentCount;
        return this;
    }
    public Long getDocumentCount() {
        return this.documentCount;
    }

}
