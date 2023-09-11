// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryResourcePatchlistRequest extends TeaModel {
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

    // 版本号
    @NameInMap("file_version")
    @Validation(required = true)
    public Long fileVersion;

    public static QueryResourcePatchlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePatchlistRequest self = new QueryResourcePatchlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourcePatchlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourcePatchlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryResourcePatchlistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryResourcePatchlistRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public QueryResourcePatchlistRequest setFileVersion(Long fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Long getFileVersion() {
        return this.fileVersion;
    }

}
