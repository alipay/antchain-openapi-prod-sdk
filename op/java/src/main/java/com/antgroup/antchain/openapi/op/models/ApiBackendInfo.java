// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiBackendInfo extends TeaModel {
    //  调用方法
    @NameInMap("dispatch_type")
    @Validation(required = true)
    public String dispatchType;

    // TR转发的uniqueid
    @NameInMap("unique_id")
    public String uniqueId;

    // TR转发的url
    @NameInMap("test_url")
    public String testUrl;

    // TR转发的路径
    @NameInMap("path")
    public String path;

    // 是否跳过鉴权
    @NameInMap("skip_auth")
    public Boolean skipAuth;

    // 后端转发超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    // 后端返回参数
    @NameInMap("response_params")
    @Validation(required = true)
    public java.util.List<ApiParamInfo> responseParams;

    // 返回结果码
    @NameInMap("result_codes")
    @Validation(required = true)
    public java.util.List<ApiResultCodeInfo> resultCodes;

    public static ApiBackendInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiBackendInfo self = new ApiBackendInfo();
        return TeaModel.build(map, self);
    }

    public ApiBackendInfo setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
        return this;
    }
    public String getDispatchType() {
        return this.dispatchType;
    }

    public ApiBackendInfo setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public ApiBackendInfo setTestUrl(String testUrl) {
        this.testUrl = testUrl;
        return this;
    }
    public String getTestUrl() {
        return this.testUrl;
    }

    public ApiBackendInfo setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ApiBackendInfo setSkipAuth(Boolean skipAuth) {
        this.skipAuth = skipAuth;
        return this;
    }
    public Boolean getSkipAuth() {
        return this.skipAuth;
    }

    public ApiBackendInfo setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ApiBackendInfo setResponseParams(java.util.List<ApiParamInfo> responseParams) {
        this.responseParams = responseParams;
        return this;
    }
    public java.util.List<ApiParamInfo> getResponseParams() {
        return this.responseParams;
    }

    public ApiBackendInfo setResultCodes(java.util.List<ApiResultCodeInfo> resultCodes) {
        this.resultCodes = resultCodes;
        return this;
    }
    public java.util.List<ApiResultCodeInfo> getResultCodes() {
        return this.resultCodes;
    }

}
