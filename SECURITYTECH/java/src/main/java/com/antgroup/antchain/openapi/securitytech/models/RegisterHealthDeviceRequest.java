// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RegisterHealthDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品牌方渠道标识
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 设备唯一id  与sn不可同时为空
    @NameInMap("tuid")
    public String tuid;

    // 设备sn号 与tuid不可同时为空
    @NameInMap("sn")
    public String sn;

    // 是否清除设备历史数据 true-清除/false-保留
    @NameInMap("clear_history")
    @Validation(required = true)
    public Boolean clearHistory;

    // 预留可扩展字段
    @NameInMap("extra_info")
    public String extraInfo;

    public static RegisterHealthDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterHealthDeviceRequest self = new RegisterHealthDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterHealthDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterHealthDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterHealthDeviceRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RegisterHealthDeviceRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public RegisterHealthDeviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public RegisterHealthDeviceRequest setClearHistory(Boolean clearHistory) {
        this.clearHistory = clearHistory;
        return this;
    }
    public Boolean getClearHistory() {
        return this.clearHistory;
    }

    public RegisterHealthDeviceRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
