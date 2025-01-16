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

    // 商户统一社会信用代码，SIT环境，非融必填
    @NameInMap("merchant_id")
    @Validation(maxLength = 42)
    public String merchantId;

    // 模板id
    @NameInMap("template_id")
    public String templateId;

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

    public AllAntchainAtoSignTemplateRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AllAntchainAtoSignTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
