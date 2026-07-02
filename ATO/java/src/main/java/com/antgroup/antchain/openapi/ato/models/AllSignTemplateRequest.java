// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AllSignTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同类型，如果不传则返回所有
    @NameInMap("contract_type")
    public String contractType;

    // 商户统一社会信用代码，SIT环境，非融必填
    @NameInMap("merchant_id")
    @Validation(maxLength = 42)
    public String merchantId;

    // 查询融资类型时，需要传入资方统一社会信用代码
    @NameInMap("fund_id")
    public String fundId;

    // -FINANCE 融资
    // -NON_FINANCE 非融资
    @NameInMap("fund_type")
    public String fundType;

    // 模板id
    @NameInMap("template_id")
    public String templateId;

    public static AllSignTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AllSignTemplateRequest self = new AllSignTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AllSignTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllSignTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllSignTemplateRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public AllSignTemplateRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AllSignTemplateRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public AllSignTemplateRequest setFundType(String fundType) {
        this.fundType = fundType;
        return this;
    }
    public String getFundType() {
        return this.fundType;
    }

    public AllSignTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
