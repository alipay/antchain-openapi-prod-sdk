// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class PublishProductSdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 版本号。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>
    @NameInMap("publish_version")
    @Validation(required = true)
    public String publishVersion;

    // sdk发布请求来源。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>。
    @NameInMap("platform_origin")
    @Validation(required = true)
    public String platformOrigin;

    public static PublishProductSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishProductSdkRequest self = new PublishProductSdkRequest();
        return TeaModel.build(map, self);
    }

    public PublishProductSdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishProductSdkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public PublishProductSdkRequest setPublishVersion(String publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public String getPublishVersion() {
        return this.publishVersion;
    }

    public PublishProductSdkRequest setPlatformOrigin(String platformOrigin) {
        this.platformOrigin = platformOrigin;
        return this;
    }
    public String getPlatformOrigin() {
        return this.platformOrigin;
    }

}
