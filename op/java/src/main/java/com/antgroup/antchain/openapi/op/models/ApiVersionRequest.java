// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiVersionRequest extends TeaModel {
    // 产品名称
    @NameInMap("provider_name")
    @Validation(required = true)
    public String providerName;

    // 套件版本
    @NameInMap("suite_version")
    @Validation(required = true)
    public String suiteVersion;

    // API名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // api版本名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // api版本描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // api转发方式
    @NameInMap("dispatch_type")
    @Validation(required = true)
    public String dispatchType;

    // unique id
    @NameInMap("uniqu_id")
    @Validation(required = true)
    public String uniquId;

    // 测试url
    @NameInMap("test_url")
    public String testUrl;

    // 转发路径
    @NameInMap("path")
    public String path;

    // api状态
    @NameInMap("status")
    @Validation(required = true)
    public StatusEnum status;

    // 1000
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    // 请求uri模式
    @NameInMap("request_uri_pattern")
    public String requestUriPattern;

    // 请求路径参数
    @NameInMap("request_path_params")
    public String requestPathParams;

    // 方法名称
    @NameInMap("request_method")
    @Validation(required = true)
    public String requestMethod;

    // 支持特性
    @NameInMap("feature")
    public String feature;

    public static ApiVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiVersionRequest self = new ApiVersionRequest();
        return TeaModel.build(map, self);
    }

    public ApiVersionRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public ApiVersionRequest setSuiteVersion(String suiteVersion) {
        this.suiteVersion = suiteVersion;
        return this;
    }
    public String getSuiteVersion() {
        return this.suiteVersion;
    }

    public ApiVersionRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ApiVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiVersionRequest setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
        return this;
    }
    public String getDispatchType() {
        return this.dispatchType;
    }

    public ApiVersionRequest setUniquId(String uniquId) {
        this.uniquId = uniquId;
        return this;
    }
    public String getUniquId() {
        return this.uniquId;
    }

    public ApiVersionRequest setTestUrl(String testUrl) {
        this.testUrl = testUrl;
        return this;
    }
    public String getTestUrl() {
        return this.testUrl;
    }

    public ApiVersionRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ApiVersionRequest setStatus(StatusEnum status) {
        this.status = status;
        return this;
    }
    public StatusEnum getStatus() {
        return this.status;
    }

    public ApiVersionRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ApiVersionRequest setRequestUriPattern(String requestUriPattern) {
        this.requestUriPattern = requestUriPattern;
        return this;
    }
    public String getRequestUriPattern() {
        return this.requestUriPattern;
    }

    public ApiVersionRequest setRequestPathParams(String requestPathParams) {
        this.requestPathParams = requestPathParams;
        return this;
    }
    public String getRequestPathParams() {
        return this.requestPathParams;
    }

    public ApiVersionRequest setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }

    public ApiVersionRequest setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

}
