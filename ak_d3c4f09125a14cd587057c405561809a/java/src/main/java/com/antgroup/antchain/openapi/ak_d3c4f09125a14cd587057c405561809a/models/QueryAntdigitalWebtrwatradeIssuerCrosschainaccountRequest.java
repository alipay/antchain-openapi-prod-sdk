// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对侧链用户地址
    @NameInMap("target_user_address")
    @Validation(required = true)
    public String targetUserAddress;

    // 目标链
    @NameInMap("taget_chain_type")
    @Validation(required = true)
    public String tagetChainType;

    public static QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest self = new QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest setTargetUserAddress(String targetUserAddress) {
        this.targetUserAddress = targetUserAddress;
        return this;
    }
    public String getTargetUserAddress() {
        return this.targetUserAddress;
    }

    public QueryAntdigitalWebtrwatradeIssuerCrosschainaccountRequest setTagetChainType(String tagetChainType) {
        this.tagetChainType = tagetChainType;
        return this;
    }
    public String getTagetChainType() {
        return this.tagetChainType;
    }

}
