// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class BindResourceGeneralresourcefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序的APP ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 资源ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 文件ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static BindResourceGeneralresourcefileRequest build(java.util.Map<String, ?> map) throws Exception {
        BindResourceGeneralresourcefileRequest self = new BindResourceGeneralresourcefileRequest();
        return TeaModel.build(map, self);
    }

    public BindResourceGeneralresourcefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindResourceGeneralresourcefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindResourceGeneralresourcefileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindResourceGeneralresourcefileRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public BindResourceGeneralresourcefileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
