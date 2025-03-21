// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.botsg.models;

import com.aliyun.tea.*;

public class EventData extends TeaModel {
    // 数据内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 可信设备ID
    @NameInMap("trust_iot_device_id")
    public Long trustIotDeviceId;

    // 业务ID
    @NameInMap("biz_id")
    public String bizId;

    // 数据签名
    @NameInMap("signature")
    public String signature;

    // 设备数据间接上报时，服务端补充数据
    @NameInMap("extra_data")
    public String extraData;

    public static EventData build(java.util.Map<String, ?> map) throws Exception {
        EventData self = new EventData();
        return TeaModel.build(map, self);
    }

    public EventData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EventData setTrustIotDeviceId(Long trustIotDeviceId) {
        this.trustIotDeviceId = trustIotDeviceId;
        return this;
    }
    public Long getTrustIotDeviceId() {
        return this.trustIotDeviceId;
    }

    public EventData setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public EventData setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public EventData setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

}
