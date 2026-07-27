// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTrustiotMiniappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 友宝跳转流水号
    @NameInMap("trace_no")
    @Validation(required = true)
    public String traceNo;

    // 本次授权设备清单，可包含多个 scene
    @NameInMap("device_scope")
    @Validation(required = true)
    public java.util.List<DeviceScopeItem> deviceScope;

    public static QueryTrustiotMiniappRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrustiotMiniappRequest self = new QueryTrustiotMiniappRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrustiotMiniappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTrustiotMiniappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTrustiotMiniappRequest setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

    public QueryTrustiotMiniappRequest setDeviceScope(java.util.List<DeviceScopeItem> deviceScope) {
        this.deviceScope = deviceScope;
        return this;
    }
    public java.util.List<DeviceScopeItem> getDeviceScope() {
        return this.deviceScope;
    }

}
