// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyDigitalcontentOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内容id
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 设备id
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    public static ApplyDigitalcontentOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDigitalcontentOrderRequest self = new ApplyDigitalcontentOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDigitalcontentOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDigitalcontentOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDigitalcontentOrderRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public ApplyDigitalcontentOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
