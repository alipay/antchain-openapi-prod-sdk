// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class PublishProductSaassdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要发布的共享能力名称
    @NameInMap("saas_code")
    @Validation(required = true)
    public String saasCode;

    // 本次打包的版本
    @NameInMap("saassdk_version")
    @Validation(required = true)
    public String saassdkVersion;

    // 是否发布
    @NameInMap("publish")
    @Validation(required = true)
    public Boolean publish;

    public static PublishProductSaassdkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishProductSaassdkRequest self = new PublishProductSaassdkRequest();
        return TeaModel.build(map, self);
    }

    public PublishProductSaassdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishProductSaassdkRequest setSaasCode(String saasCode) {
        this.saasCode = saasCode;
        return this;
    }
    public String getSaasCode() {
        return this.saasCode;
    }

    public PublishProductSaassdkRequest setSaassdkVersion(String saassdkVersion) {
        this.saassdkVersion = saassdkVersion;
        return this;
    }
    public String getSaassdkVersion() {
        return this.saassdkVersion;
    }

    public PublishProductSaassdkRequest setPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }
    public Boolean getPublish() {
        return this.publish;
    }

}
