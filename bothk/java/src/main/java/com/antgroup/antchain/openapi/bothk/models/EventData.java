// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class EventData extends TeaModel {
    // 数据内容
    /**
     * <strong>example:</strong>
     * <p>{ &quot;DEVICE-ID&quot;: &quot;ABC123&quot;, &quot;IMEI&quot;: &quot;868331011992179&quot;, &quot;HEART-BEAT-TIME&quot;: 1699053387008 }</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 可信设备ID
    /**
     * <strong>example:</strong>
     * <p>7213004826408435712</p>
     */
    @NameInMap("trust_iot_device_id")
    public Long trustIotDeviceId;

    // 业务ID
    /**
     * <strong>example:</strong>
     * <p>20240815</p>
     */
    @NameInMap("biz_id")
    public String bizId;

    // 数据签名
    /**
     * <strong>example:</strong>
     * <p>8e084d95c5ac9198b01b9f6b8040b2daa35a3e2706a472295f52ec0966119383d7654eb2c1f67eb563194ab9d2197fcd8fcb5232308927e708257ebea8ce1cda</p>
     */
    @NameInMap("signature")
    public String signature;

    // 设备数据间接上报时，服务端补充数据
    /**
     * <strong>example:</strong>
     * <p>{&quot;PRICE&quot;:2.2,&quot;NUMBER&quot;:3}</p>
     */
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
