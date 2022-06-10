// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class GetContractRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商code
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    public static GetContractRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractRuleRequest self = new GetContractRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetContractRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContractRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetContractRuleRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

}
