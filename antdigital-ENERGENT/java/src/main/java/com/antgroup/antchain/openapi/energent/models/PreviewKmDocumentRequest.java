// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class PreviewKmDocumentRequest extends TeaModel {
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

    // 文档挂载映射ID
    @NameInMap("doc_map_id")
    @Validation(required = true)
    public String docMapId;

    public static PreviewKmDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewKmDocumentRequest self = new PreviewKmDocumentRequest();
        return TeaModel.build(map, self);
    }

    public PreviewKmDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewKmDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewKmDocumentRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public PreviewKmDocumentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public PreviewKmDocumentRequest setDocMapId(String docMapId) {
        this.docMapId = docMapId;
        return this;
    }
    public String getDocMapId() {
        return this.docMapId;
    }

}
