// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class ReorderKmNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 父节点ID(空为顶层)
    @NameInMap("parent_node_id")
    public String parentNodeId;

    // 按新顺序排列的节点ID(逗号分隔)
    @NameInMap("node_ids")
    @Validation(required = true)
    public String nodeIds;

    public static ReorderKmNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ReorderKmNodeRequest self = new ReorderKmNodeRequest();
        return TeaModel.build(map, self);
    }

    public ReorderKmNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReorderKmNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReorderKmNodeRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public ReorderKmNodeRequest setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public ReorderKmNodeRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

}
