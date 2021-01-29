// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteAppFavouriteRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 用户要取消收藏的应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 用户登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    public static DeleteAppFavouriteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppFavouriteRequest self = new DeleteAppFavouriteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppFavouriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppFavouriteRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteAppFavouriteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteAppFavouriteRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

}
