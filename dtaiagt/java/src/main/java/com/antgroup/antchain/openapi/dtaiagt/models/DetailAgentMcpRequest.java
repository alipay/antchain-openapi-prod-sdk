// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DetailAgentMcpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 空间id
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 平台serverId
    @NameInMap("server_id")
    @Validation(required = true)
    public String serverId;

    public static DetailAgentMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAgentMcpRequest self = new DetailAgentMcpRequest();
        return TeaModel.build(map, self);
    }

    public DetailAgentMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAgentMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAgentMcpRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DetailAgentMcpRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
