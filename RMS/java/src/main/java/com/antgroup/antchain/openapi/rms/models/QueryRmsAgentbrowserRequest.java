// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgentbrowserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // extra_suffixs
    @NameInMap("extra_suffixs")
    public java.util.List<String> extraSuffixs;

    // scan_dirs
    @NameInMap("scan_dirs")
    public java.util.List<String> scanDirs;

    // prefer_host
    @NameInMap("prefer_host")
    public String preferHost;

    // tenant_id
    @NameInMap("tenant_id")
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
