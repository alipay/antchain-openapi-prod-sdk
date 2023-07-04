// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryOpsplanNodetreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布单id
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    // 发布单节点树根节点id
    @NameInMap("sub_tree_node_root_id")
    public String subTreeNodeRootId;

    public static QueryOpsplanNodetreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanNodetreeRequest self = new QueryOpsplanNodetreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanNodetreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsplanNodetreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOpsplanNodetreeRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

    public QueryOpsplanNodetreeRequest setSubTreeNodeRootId(String subTreeNodeRootId) {
        this.subTreeNodeRootId = subTreeNodeRootId;
        return this;
    }
    public String getSubTreeNodeRootId() {
        return this.subTreeNodeRootId;
    }

}
