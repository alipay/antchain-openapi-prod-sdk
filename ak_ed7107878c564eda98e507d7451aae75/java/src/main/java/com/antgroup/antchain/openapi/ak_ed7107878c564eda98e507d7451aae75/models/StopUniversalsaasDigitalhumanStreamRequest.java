// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class StopUniversalsaasDigitalhumanStreamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 流Id
    @NameInMap("stream_id")
    @Validation(required = true)
    public String streamId;

    public static StopUniversalsaasDigitalhumanStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        StopUniversalsaasDigitalhumanStreamRequest self = new StopUniversalsaasDigitalhumanStreamRequest();
        return TeaModel.build(map, self);
    }

    public StopUniversalsaasDigitalhumanStreamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopUniversalsaasDigitalhumanStreamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StopUniversalsaasDigitalhumanStreamRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public StopUniversalsaasDigitalhumanStreamRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopUniversalsaasDigitalhumanStreamRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

}
