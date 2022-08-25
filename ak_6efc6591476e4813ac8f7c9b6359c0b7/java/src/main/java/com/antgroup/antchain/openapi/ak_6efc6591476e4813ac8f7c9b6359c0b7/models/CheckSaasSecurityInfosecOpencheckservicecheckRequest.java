// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class CheckSaasSecurityInfosecOpencheckservicecheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 以json格式输入想要检测的内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 服务版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static CheckSaasSecurityInfosecOpencheckservicecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasSecurityInfosecOpencheckservicecheckRequest self = new CheckSaasSecurityInfosecOpencheckservicecheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
