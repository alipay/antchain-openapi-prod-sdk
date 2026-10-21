// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class UnmountKmDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 节点ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 向量库映射ID
    @NameInMap("vector_store_map_id")
    @Validation(required = true)
    public String vectorStoreMapId;

    public static UnmountKmDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountKmDocumentRequest self = new UnmountKmDocumentRequest();
        return TeaModel.build(map, self);
    }

    public UnmountKmDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnmountKmDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnmountKmDocumentRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public UnmountKmDocumentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UnmountKmDocumentRequest setVectorStoreMapId(String vectorStoreMapId) {
        this.vectorStoreMapId = vectorStoreMapId;
        return this;
    }
    public String getVectorStoreMapId() {
        return this.vectorStoreMapId;
    }

}
