// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class SegmentsKmDocumentRequest extends TeaModel {
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

    // 切片内容关键词
    @NameInMap("keyword")
    public String keyword;

    public static SegmentsKmDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentsKmDocumentRequest self = new SegmentsKmDocumentRequest();
        return TeaModel.build(map, self);
    }

    public SegmentsKmDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SegmentsKmDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SegmentsKmDocumentRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public SegmentsKmDocumentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SegmentsKmDocumentRequest setDocMapId(String docMapId) {
        this.docMapId = docMapId;
        return this;
    }
    public String getDocMapId() {
        return this.docMapId;
    }

    public SegmentsKmDocumentRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
