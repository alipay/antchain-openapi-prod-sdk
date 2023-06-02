// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class PushOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // {产品}.{资源}.{子资源}.{操作}
    @NameInMap("operation_code")
    @Validation(required = true)
    public String operationCode;

    // 操作参数
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 可用区域信息，非必填
    @NameInMap("region")
    public String region;

    // 资源ID
    @NameInMap("resource_id")
    public String resourceId;

    // 资源类型
    @NameInMap("resource_type")
    public String resourceType;

    // 相应结果
    @NameInMap("response")
    public String response;

    // 操作来源，由接入方上报自身系统host
    @NameInMap("source")
    public String source;

    // 操作来源IP，由接入方上报
    @NameInMap("source_ip_address")
    public String sourceIpAddress;

    // 触发时间
    @NameInMap("time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    // TraceId用于事件追踪
    @NameInMap("trace_id")
    public String traceId;

    // agent信息
    @NameInMap("user_agent")
    public String userAgent;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 租户8位ID
    @NameInMap("user_tenant")
    @Validation(required = true)
    public String userTenant;

    public static PushOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        PushOperationRequest self = new PushOperationRequest();
        return TeaModel.build(map, self);
    }

    public PushOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushOperationRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public PushOperationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public PushOperationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public PushOperationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public PushOperationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PushOperationRequest setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public PushOperationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PushOperationRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public PushOperationRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public PushOperationRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public PushOperationRequest setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    public String getUserAgent() {
        return this.userAgent;
    }

    public PushOperationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushOperationRequest setUserTenant(String userTenant) {
        this.userTenant = userTenant;
        return this;
    }
    public String getUserTenant() {
        return this.userTenant;
    }

}
