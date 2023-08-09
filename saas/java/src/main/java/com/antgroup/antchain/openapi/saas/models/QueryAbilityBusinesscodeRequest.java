// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryAbilityBusinesscodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 能力id
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    public static QueryAbilityBusinesscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAbilityBusinesscodeRequest self = new QueryAbilityBusinesscodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAbilityBusinesscodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAbilityBusinesscodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAbilityBusinesscodeRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

}
