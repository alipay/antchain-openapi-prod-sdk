// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiVersion extends TeaModel {
    // 版本名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // api版本描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // apimeta数据id
    @NameInMap("api_meta_id")
    @Validation(required = true)
    public String apiMetaId;

    // api状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // api请求参数
    @NameInMap("request_params")
    public java.util.List<ParamModal> requestParams;

    // api响应参数
    @NameInMap("response_params")
    @Validation(required = true)
    public java.util.List<ParamModal> responseParams;

    // api uri模式
    @NameInMap("request_uri_pattern")
    public String requestUriPattern;

    // 请求参数路径
    @NameInMap("request_path_params")
    public String requestPathParams;

    // 请求方法
    @NameInMap("request_method")
    @Validation(required = true)
    public String requestMethod;

    // 具体API请求时，解析出来的路径参数与其对应的值
    // eg. /sofa/mq/msgtype/{id}，如果实际请求为/sofa/mq/msgtype/1，那么返回的map就是 id => 1
    @NameInMap("request_path_values")
    @Validation(required = true)
    public java.util.List<KeyValuePair> requestPathValues;

    // 请求分发方法
    @NameInMap("dispatch_type")
    @Validation(required = true)
    public String dispatchType;

    // 分发内容
    @NameInMap("dispatch_context")
    public String dispatchContext;

    // 接口特性
    @NameInMap("feature")
    public String feature;

    public static ApiVersion build(java.util.Map<String, ?> map) throws Exception {
        ApiVersion self = new ApiVersion();
        return TeaModel.build(map, self);
    }

    public ApiVersion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiVersion setApiMetaId(String apiMetaId) {
        this.apiMetaId = apiMetaId;
        return this;
    }
    public String getApiMetaId() {
        return this.apiMetaId;
    }

    public ApiVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiVersion setRequestParams(java.util.List<ParamModal> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.List<ParamModal> getRequestParams() {
        return this.requestParams;
    }

    public ApiVersion setResponseParams(java.util.List<ParamModal> responseParams) {
        this.responseParams = responseParams;
        return this;
    }
    public java.util.List<ParamModal> getResponseParams() {
        return this.responseParams;
    }

    public ApiVersion setRequestUriPattern(String requestUriPattern) {
        this.requestUriPattern = requestUriPattern;
        return this;
    }
    public String getRequestUriPattern() {
        return this.requestUriPattern;
    }

    public ApiVersion setRequestPathParams(String requestPathParams) {
        this.requestPathParams = requestPathParams;
        return this;
    }
    public String getRequestPathParams() {
        return this.requestPathParams;
    }

    public ApiVersion setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }

    public ApiVersion setRequestPathValues(java.util.List<KeyValuePair> requestPathValues) {
        this.requestPathValues = requestPathValues;
        return this;
    }
    public java.util.List<KeyValuePair> getRequestPathValues() {
        return this.requestPathValues;
    }

    public ApiVersion setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
        return this;
    }
    public String getDispatchType() {
        return this.dispatchType;
    }

    public ApiVersion setDispatchContext(String dispatchContext) {
        this.dispatchContext = dispatchContext;
        return this;
    }
    public String getDispatchContext() {
        return this.dispatchContext;
    }

    public ApiVersion setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

}
