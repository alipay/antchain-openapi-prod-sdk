// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasAbilityResultcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1-INTERNAL_ERROR，2-TOO_MANY_REQUESTS，3-UNKNOW_ERROR，4-ACCESS_DENIED，5-OK，6-CUSTOM_RESULT_CODE_ONE，7-CUSTOM_RESULT_CODE_TWO
    @NameInMap("index")
    @Validation(required = true)
    public Long index;

    public static QueryAntchainSaasAbilityResultcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasAbilityResultcodeRequest self = new QueryAntchainSaasAbilityResultcodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasAbilityResultcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSaasAbilityResultcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSaasAbilityResultcodeRequest setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

}
