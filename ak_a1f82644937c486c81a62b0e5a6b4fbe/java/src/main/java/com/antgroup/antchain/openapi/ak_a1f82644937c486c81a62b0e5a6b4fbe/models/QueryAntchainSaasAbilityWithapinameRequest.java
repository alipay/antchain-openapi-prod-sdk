// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasAbilityWithapinameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api名称列表
    @NameInMap("api_name_list")
    @Validation(required = true)
    public java.util.List<String> apiNameList;

    public static QueryAntchainSaasAbilityWithapinameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasAbilityWithapinameRequest self = new QueryAntchainSaasAbilityWithapinameRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasAbilityWithapinameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSaasAbilityWithapinameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSaasAbilityWithapinameRequest setApiNameList(java.util.List<String> apiNameList) {
        this.apiNameList = apiNameList;
        return this;
    }
    public java.util.List<String> getApiNameList() {
        return this.apiNameList;
    }

}
