// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class QueryPartyRegisterstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 节点的nodeId
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 用户的partyId
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    public static QueryPartyRegisterstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPartyRegisterstatusRequest self = new QueryPartyRegisterstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryPartyRegisterstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPartyRegisterstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPartyRegisterstatusRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public QueryPartyRegisterstatusRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

}
