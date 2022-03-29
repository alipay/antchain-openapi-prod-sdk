// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgentbrowserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // extra_suffixs
    @NameInMap("extra_suffixs")
    @Validation(required = true)
    public java.util.List<String> extraSuffixs;

    // scan_dirs
    @NameInMap("scan_dirs")
    @Validation(required = true)
    public java.util.List<String> scanDirs;

    // prefer_host
    @NameInMap("prefer_host")
    @Validation(required = true)
    public String preferHost;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryRmsAgentbrowserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAgentbrowserRequest self = new QueryRmsAgentbrowserRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAgentbrowserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAgentbrowserRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryRmsAgentbrowserRequest setExtraSuffixs(java.util.List<String> extraSuffixs) {
        this.extraSuffixs = extraSuffixs;
        return this;
    }
    public java.util.List<String> getExtraSuffixs() {
        return this.extraSuffixs;
    }

    public QueryRmsAgentbrowserRequest setScanDirs(java.util.List<String> scanDirs) {
        this.scanDirs = scanDirs;
        return this;
    }
    public java.util.List<String> getScanDirs() {
        return this.scanDirs;
    }

    public QueryRmsAgentbrowserRequest setPreferHost(String preferHost) {
        this.preferHost = preferHost;
        return this;
    }
    public String getPreferHost() {
        return this.preferHost;
    }

    public QueryRmsAgentbrowserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
