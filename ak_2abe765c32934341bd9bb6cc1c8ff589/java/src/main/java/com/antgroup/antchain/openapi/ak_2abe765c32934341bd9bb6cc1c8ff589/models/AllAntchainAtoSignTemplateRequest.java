// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class AllAntchainAtoSignTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同类型，如果不传则返回所有
    @NameInMap("contract_type")
    public String contractType;

    public static AllAntchainAtoSignTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AllAntchainAtoSignTemplateRequest self = new AllAntchainAtoSignTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AllAntchainAtoSignTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllAntchainAtoSignTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllAntchainAtoSignTemplateRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

}
