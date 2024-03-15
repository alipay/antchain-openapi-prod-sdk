// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

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

    // ● FINANCE 融资
    // ● NON_FINANCE 非融资
    @NameInMap("fund_type")
    public String fundType;

    // 查询融资类型时，需要传入资方统一社会信用代码
    @NameInMap("fund_id")
    public String fundId;

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

    public AllAntchainAtoSignTemplateRequest setFundType(String fundType) {
        this.fundType = fundType;
        return this;
    }
    public String getFundType() {
        return this.fundType;
    }

    public AllAntchainAtoSignTemplateRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
