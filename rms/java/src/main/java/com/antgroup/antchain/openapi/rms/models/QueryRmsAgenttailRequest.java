// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgenttailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // prefer_host
    @NameInMap("prefer_host")
    @Validation(required = true)
    public String preferHost;

    // full_path
    @NameInMap("full_path")
    @Validation(required = true)
    public String fullPath;

    // scan_dirs
    @NameInMap("scan_dirs")
    @Validation(required = true)
    public java.util.List<String> scanDirs;

    // need_bytes
    @NameInMap("need_bytes")
    @Validation(required = true)
    public Long needBytes;

    // line_break_str
    @NameInMap("line_break_str")
    @Validation(required = true)
    public String lineBreakStr;

    // extra_suffixs
    @NameInMap("extra_suffixs")
    @Validation(required = true)
    public java.util.List<String> extraSuffixs;

    // charset_str
    @NameInMap("charset_str")
    @Validation(required = true)
    public String charsetStr;

    public static QueryRmsAgenttailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAgenttailRequest self = new QueryRmsAgenttailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAgenttailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAgenttailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryRmsAgenttailRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryRmsAgenttailRequest setPreferHost(String preferHost) {
        this.preferHost = preferHost;
        return this;
    }
    public String getPreferHost() {
        return this.preferHost;
    }

    public QueryRmsAgenttailRequest setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }
    public String getFullPath() {
        return this.fullPath;
    }

    public QueryRmsAgenttailRequest setScanDirs(java.util.List<String> scanDirs) {
        this.scanDirs = scanDirs;
        return this;
    }
    public java.util.List<String> getScanDirs() {
        return this.scanDirs;
    }

    public QueryRmsAgenttailRequest setNeedBytes(Long needBytes) {
        this.needBytes = needBytes;
        return this;
    }
    public Long getNeedBytes() {
        return this.needBytes;
    }

    public QueryRmsAgenttailRequest setLineBreakStr(String lineBreakStr) {
        this.lineBreakStr = lineBreakStr;
        return this;
    }
    public String getLineBreakStr() {
        return this.lineBreakStr;
    }

    public QueryRmsAgenttailRequest setExtraSuffixs(java.util.List<String> extraSuffixs) {
        this.extraSuffixs = extraSuffixs;
        return this;
    }
    public java.util.List<String> getExtraSuffixs() {
        return this.extraSuffixs;
    }

    public QueryRmsAgenttailRequest setCharsetStr(String charsetStr) {
        this.charsetStr = charsetStr;
        return this;
    }
    public String getCharsetStr() {
        return this.charsetStr;
    }

}
