// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class CreateSaasPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json请求参数
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 版本号
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static CreateSaasPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSaasPaymentRequest self = new CreateSaasPaymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateSaasPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSaasPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSaasPaymentRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public CreateSaasPaymentRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
