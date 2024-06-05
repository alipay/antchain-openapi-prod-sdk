// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasAbilityBusinesscodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 能力id
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    public static QueryAntchainSaasAbilityBusinesscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasAbilityBusinesscodeRequest self = new QueryAntchainSaasAbilityBusinesscodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasAbilityBusinesscodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSaasAbilityBusinesscodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSaasAbilityBusinesscodeRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

}
