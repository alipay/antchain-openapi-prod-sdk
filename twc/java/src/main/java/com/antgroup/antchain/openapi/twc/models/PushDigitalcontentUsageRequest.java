// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PushDigitalcontentUsageRequest extends TeaModel {
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

    // 使用量，按次使用需要为数字
    @NameInMap("usage")
    @Validation(required = true)
    public String usage;

    // 客户端幂等token
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static PushDigitalcontentUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDigitalcontentUsageRequest self = new PushDigitalcontentUsageRequest();
        return TeaModel.build(map, self);
    }

    public PushDigitalcontentUsageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDigitalcontentUsageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDigitalcontentUsageRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public PushDigitalcontentUsageRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public PushDigitalcontentUsageRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public PushDigitalcontentUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
