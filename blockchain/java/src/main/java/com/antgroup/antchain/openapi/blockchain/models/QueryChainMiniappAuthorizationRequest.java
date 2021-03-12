// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainMiniappAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // q_r_code_type
    @NameInMap("q_r_code_type")
    @Validation(required = true)
    public String qRCodeType;

    public static QueryChainMiniappAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainMiniappAuthorizationRequest self = new QueryChainMiniappAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainMiniappAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainMiniappAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainMiniappAuthorizationRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainMiniappAuthorizationRequest setQRCodeType(String qRCodeType) {
        this.qRCodeType = qRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.qRCodeType;
    }

}
