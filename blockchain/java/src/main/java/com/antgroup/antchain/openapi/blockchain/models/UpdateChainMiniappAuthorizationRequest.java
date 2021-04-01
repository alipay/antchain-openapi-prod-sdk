// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateChainMiniappAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // q_r_code_type
    @NameInMap("q_r_code_type")
    public String qRCodeType;

    // authorization_type
    @NameInMap("authorization_type")
    public String authorizationType;

    public static UpdateChainMiniappAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainMiniappAuthorizationRequest self = new UpdateChainMiniappAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChainMiniappAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChainMiniappAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChainMiniappAuthorizationRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateChainMiniappAuthorizationRequest setQRCodeType(String qRCodeType) {
        this.qRCodeType = qRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.qRCodeType;
    }

    public UpdateChainMiniappAuthorizationRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

}
