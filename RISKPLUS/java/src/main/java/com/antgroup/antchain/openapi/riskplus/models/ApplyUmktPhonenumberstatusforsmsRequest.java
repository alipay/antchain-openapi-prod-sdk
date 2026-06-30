// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyUmktPhonenumberstatusforsmsRequest extends TeaModel {
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

    public static ApplyUmktPhonenumberstatusforsmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUmktPhonenumberstatusforsmsRequest self = new ApplyUmktPhonenumberstatusforsmsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUmktPhonenumberstatusforsmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUmktPhonenumberstatusforsmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUmktPhonenumberstatusforsmsRequest setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public ApplyUmktPhonenumberstatusforsmsRequest setParamTemplate(String paramTemplate) {
        this.paramTemplate = paramTemplate;
        return this;
    }
    public String getParamTemplate() {
        return this.paramTemplate;
    }

}
