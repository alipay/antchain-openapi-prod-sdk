// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_84c42ea3533d458aa799ea9a39aba49f.models;

import com.aliyun.tea.*;

public class QueryAntchainDefincashierSaasAccountRequest extends TeaModel {
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

    public static QueryAntchainDefincashierSaasAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDefincashierSaasAccountRequest self = new QueryAntchainDefincashierSaasAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDefincashierSaasAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDefincashierSaasAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDefincashierSaasAccountRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryAntchainDefincashierSaasAccountRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
