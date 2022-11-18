// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1fef8815252948ebb01da07898dd0fb2.models;

import com.aliyun.tea.*;

public class GetAntchainBbpContractRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商code
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    public static GetAntchainBbpContractRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainBbpContractRuleRequest self = new GetAntchainBbpContractRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainBbpContractRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainBbpContractRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainBbpContractRuleRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

}
