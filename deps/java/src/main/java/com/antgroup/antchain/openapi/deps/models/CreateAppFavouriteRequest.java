// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppFavouriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 用户要收藏的应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 用户登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    public static CreateAppFavouriteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppFavouriteRequest self = new CreateAppFavouriteRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppFavouriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppFavouriteRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateAppFavouriteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppFavouriteRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

}
