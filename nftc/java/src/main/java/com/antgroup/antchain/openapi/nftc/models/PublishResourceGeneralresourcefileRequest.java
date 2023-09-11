// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class PublishResourceGeneralresourcefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序的APP ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 业务幂等ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 资源ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 版本号
    @NameInMap("file_version")
    @Validation(required = true)
    public Long fileVersion;

    public static PublishResourceGeneralresourcefileRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishResourceGeneralresourcefileRequest self = new PublishResourceGeneralresourcefileRequest();
        return TeaModel.build(map, self);
    }

    public PublishResourceGeneralresourcefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishResourceGeneralresourcefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishResourceGeneralresourcefileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PublishResourceGeneralresourcefileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PublishResourceGeneralresourcefileRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public PublishResourceGeneralresourcefileRequest setFileVersion(Long fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Long getFileVersion() {
        return this.fileVersion;
    }

}
