// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class SyncKmVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 树ID
    @NameInMap("tree_id")
    public String treeId;

    // 版本
    @NameInMap("version")
    public String version;

    // 快照原文
    @NameInMap("snapshot")
    public String snapshot;

    // 版本关联的文档详情列表
    @NameInMap("documents")
    public java.util.List<SnapshotDocumentItem> documents;

    public static SyncKmVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncKmVersionResponse self = new SyncKmVersionResponse();
        return TeaModel.build(map, self);
    }

    public SyncKmVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncKmVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncKmVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncKmVersionResponse setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public SyncKmVersionResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SyncKmVersionResponse setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

    public SyncKmVersionResponse setDocuments(java.util.List<SnapshotDocumentItem> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<SnapshotDocumentItem> getDocuments() {
        return this.documents;
    }

}
