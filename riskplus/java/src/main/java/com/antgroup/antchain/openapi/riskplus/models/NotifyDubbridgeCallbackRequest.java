// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyDubbridgeCallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // json参数
    @NameInMap("biz_param")
    @Validation(required = true)
    public String bizParam;

    // 回调类型（1授信回调2用信回调）
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static NotifyDubbridgeCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyDubbridgeCallbackRequest self = new NotifyDubbridgeCallbackRequest();
        return TeaModel.build(map, self);
    }

    public NotifyDubbridgeCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyDubbridgeCallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyDubbridgeCallbackRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public NotifyDubbridgeCallbackRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public NotifyDubbridgeCallbackRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
