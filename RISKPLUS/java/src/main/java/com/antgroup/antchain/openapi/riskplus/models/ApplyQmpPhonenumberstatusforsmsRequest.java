// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyQmpPhonenumberstatusforsmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 12345
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 用户模版类型
    @NameInMap("param_template")
    @Validation(required = true)
    public String paramTemplate;

    public static ApplyQmpPhonenumberstatusforsmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyQmpPhonenumberstatusforsmsRequest self = new ApplyQmpPhonenumberstatusforsmsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyQmpPhonenumberstatusforsmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyQmpPhonenumberstatusforsmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyQmpPhonenumberstatusforsmsRequest setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public ApplyQmpPhonenumberstatusforsmsRequest setParamTemplate(String paramTemplate) {
        this.paramTemplate = paramTemplate;
        return this;
    }
    public String getParamTemplate() {
        return this.paramTemplate;
    }

}
