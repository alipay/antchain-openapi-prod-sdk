// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_84c42ea3533d458aa799ea9a39aba49f.models;

import com.aliyun.tea.*;

public class QueryAntchainDefincashierSaasPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json请求参数
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 编排版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static QueryAntchainDefincashierSaasPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDefincashierSaasPaymentRequest self = new QueryAntchainDefincashierSaasPaymentRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDefincashierSaasPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDefincashierSaasPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDefincashierSaasPaymentRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryAntchainDefincashierSaasPaymentRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
