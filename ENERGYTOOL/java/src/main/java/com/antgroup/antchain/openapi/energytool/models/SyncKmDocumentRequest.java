// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class SyncKmDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 树ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 节点ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 向量文档ID
    @NameInMap("doc_map_id")
    @Validation(required = true)
    public String docMapId;

    public static SyncKmDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncKmDocumentRequest self = new SyncKmDocumentRequest();
        return TeaModel.build(map, self);
    }

    public SyncKmDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncKmDocumentRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public SyncKmDocumentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SyncKmDocumentRequest setDocMapId(String docMapId) {
        this.docMapId = docMapId;
        return this;
    }
    public String getDocMapId() {
        return this.docMapId;
    }

}
