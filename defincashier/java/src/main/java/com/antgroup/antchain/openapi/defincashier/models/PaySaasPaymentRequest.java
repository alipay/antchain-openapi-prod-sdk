// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PaySaasPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json请求参数,示例超出限制，完整字段见下文
    // {"out_order_id":"","out_payer_id":{"reference_id_type":"","reference_id":""},"out_payee_id":{"reference_id_type":"","reference_id":""},"order_pay_time":"","payer_detail":{"payer_amount":"","payer_currency":"","account":{"inst_id":"","account_no":"","account_name":"","offical_name":"","offical_number":""},"pay_mode":""},"platform_member_id":""}
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 版本号
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static PaySaasPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        PaySaasPaymentRequest self = new PaySaasPaymentRequest();
        return TeaModel.build(map, self);
    }

    public PaySaasPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PaySaasPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PaySaasPaymentRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public PaySaasPaymentRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
