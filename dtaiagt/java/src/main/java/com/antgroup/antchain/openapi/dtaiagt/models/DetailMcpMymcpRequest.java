// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DetailMcpMymcpRequest extends TeaModel {
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

    public static DetailMcpMymcpRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailMcpMymcpRequest self = new DetailMcpMymcpRequest();
        return TeaModel.build(map, self);
    }

    public DetailMcpMymcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailMcpMymcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailMcpMymcpRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DetailMcpMymcpRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
