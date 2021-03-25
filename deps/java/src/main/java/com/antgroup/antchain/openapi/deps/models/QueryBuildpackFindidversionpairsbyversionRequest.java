// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindidversionpairsbyversionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // techstackId
    @NameInMap("techstack_id")
    public Long techstackId;

    public static QueryBuildpackFindidversionpairsbyversionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindidversionpairsbyversionRequest self = new QueryBuildpackFindidversionpairsbyversionRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindidversionpairsbyversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindidversionpairsbyversionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindidversionpairsbyversionRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public QueryBuildpackFindidversionpairsbyversionRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryBuildpackFindidversionpairsbyversionRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

}
