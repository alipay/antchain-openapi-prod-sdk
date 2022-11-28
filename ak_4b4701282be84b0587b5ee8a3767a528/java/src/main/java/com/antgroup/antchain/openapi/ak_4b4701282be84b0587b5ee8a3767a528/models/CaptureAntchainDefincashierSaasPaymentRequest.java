// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b4701282be84b0587b5ee8a3767a528.models;

import com.aliyun.tea.*;

public class CaptureAntchainDefincashierSaasPaymentRequest extends TeaModel {
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

    public static CaptureAntchainDefincashierSaasPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CaptureAntchainDefincashierSaasPaymentRequest self = new CaptureAntchainDefincashierSaasPaymentRequest();
        return TeaModel.build(map, self);
    }

    public CaptureAntchainDefincashierSaasPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CaptureAntchainDefincashierSaasPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CaptureAntchainDefincashierSaasPaymentRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public CaptureAntchainDefincashierSaasPaymentRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
