// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class UpdateKmNodeRequest extends TeaModel {
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

    // 节点键名
    @NameInMap("slot_key")
    public String slotKey;

    // 节点值
    @NameInMap("slot_value")
    public String slotValue;

    public static UpdateKmNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKmNodeRequest self = new UpdateKmNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKmNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateKmNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateKmNodeRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public UpdateKmNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateKmNodeRequest setSlotKey(String slotKey) {
        this.slotKey = slotKey;
        return this;
    }
    public String getSlotKey() {
        return this.slotKey;
    }

    public UpdateKmNodeRequest setSlotValue(String slotValue) {
        this.slotValue = slotValue;
        return this;
    }
    public String getSlotValue() {
        return this.slotValue;
    }

}
