// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class CreateKmNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 父节点ID
    @NameInMap("parent_node_id")
    @Validation(required = true)
    public String parentNodeId;

    // 节点键名(最长50)
    @NameInMap("slot_key")
    @Validation(required = true)
    public String slotKey;

    // 节点值(最长100)
    @NameInMap("slot_value")
    @Validation(required = true)
    public String slotValue;

    public static CreateKmNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKmNodeRequest self = new CreateKmNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateKmNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateKmNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateKmNodeRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public CreateKmNodeRequest setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public CreateKmNodeRequest setSlotKey(String slotKey) {
        this.slotKey = slotKey;
        return this;
    }
    public String getSlotKey() {
        return this.slotKey;
    }

    public CreateKmNodeRequest setSlotValue(String slotValue) {
        this.slotValue = slotValue;
        return this;
    }
    public String getSlotValue() {
        return this.slotValue;
    }

}
