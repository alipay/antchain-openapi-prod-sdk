// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgentloglocateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // batch_ip_files
    @NameInMap("batch_ip_files")
    @Validation(required = true)
    public java.util.List<IpFileOs> batchIpFiles;

    // charset_str
    @NameInMap("charset_str")
    @Validation(required = true)
    public String charsetStr;

    // error_msg
    @NameInMap("error_msg")
    @Validation(required = true)
    public String errorMsg;

    // ips
    @NameInMap("ips")
    @Validation(required = true)
    public java.util.List<String> ips;

    // ip_file
    @NameInMap("ip_file")
    @Validation(required = true)
    public IpFileOs ipFile;

    // is_batch
    @NameInMap("is_batch")
    @Validation(required = true)
    public Boolean isBatch;

    // log_path
    @NameInMap("log_path")
    @Validation(required = true)
    public String logPath;

    // log_paths
    @NameInMap("log_paths")
    @Validation(required = true)
    public java.util.List<String> logPaths;

    // time
    @NameInMap("time")
    @Validation(required = true)
    public Long time;

    public static QueryRmsAgentloglocateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAgentloglocateRequest self = new QueryRmsAgentloglocateRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAgentloglocateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsAgentloglocateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryRmsAgentloglocateRequest setBatchIpFiles(java.util.List<IpFileOs> batchIpFiles) {
        this.batchIpFiles = batchIpFiles;
        return this;
    }
    public java.util.List<IpFileOs> getBatchIpFiles() {
        return this.batchIpFiles;
    }

    public QueryRmsAgentloglocateRequest setCharsetStr(String charsetStr) {
        this.charsetStr = charsetStr;
        return this;
    }
    public String getCharsetStr() {
        return this.charsetStr;
    }

    public QueryRmsAgentloglocateRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryRmsAgentloglocateRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public QueryRmsAgentloglocateRequest setIpFile(IpFileOs ipFile) {
        this.ipFile = ipFile;
        return this;
    }
    public IpFileOs getIpFile() {
        return this.ipFile;
    }

    public QueryRmsAgentloglocateRequest setIsBatch(Boolean isBatch) {
        this.isBatch = isBatch;
        return this;
    }
    public Boolean getIsBatch() {
        return this.isBatch;
    }

    public QueryRmsAgentloglocateRequest setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public QueryRmsAgentloglocateRequest setLogPaths(java.util.List<String> logPaths) {
        this.logPaths = logPaths;
        return this;
    }
    public java.util.List<String> getLogPaths() {
        return this.logPaths;
    }

    public QueryRmsAgentloglocateRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
