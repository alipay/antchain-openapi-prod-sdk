// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteChainMiniappUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // AntChainId
    @NameInMap("ant_chain_id")
    public String antChainId;

    // phone
    @NameInMap("phone")
    public String phone;

    public static DeleteChainMiniappUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChainMiniappUserRequest self = new DeleteChainMiniappUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChainMiniappUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteChainMiniappUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteChainMiniappUserRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DeleteChainMiniappUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
