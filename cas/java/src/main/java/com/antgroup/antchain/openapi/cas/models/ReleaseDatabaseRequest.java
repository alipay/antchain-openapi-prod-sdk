// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ReleaseDatabaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 需要释放的应用 ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // 应用实例 ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // 需要释放应用的 database sequence
    @NameInMap("database_sequences")
    @Validation(required = true)
    public java.util.List<String> databaseSequences;

    public static ReleaseDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDatabaseRequest self = new ReleaseDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseDatabaseRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public ReleaseDatabaseRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public ReleaseDatabaseRequest setDatabaseSequences(java.util.List<String> databaseSequences) {
        this.databaseSequences = databaseSequences;
        return this;
    }
    public java.util.List<String> getDatabaseSequences() {
        return this.databaseSequences;
    }

}
