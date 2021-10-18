// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_iot.models;

import com.aliyun.tea.*;

public class CollectLabelContent extends TeaModel {
    // 链上设备ID
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 1.设备端上报数据内容 2.与设备上报的数据一致，服务...
    // 
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // content的签名 与设备上报的签名保持一致，服务端不可修改
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 未经设备签名的附加数据JSON String 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
    @NameInMap("extra_data")
    public String extraData;

    public static CollectLabelContent build(java.util.Map<String, ?> map) throws Exception {
        CollectLabelContent self = new CollectLabelContent();
        return TeaModel.build(map, self);
    }

    public CollectLabelContent setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public CollectLabelContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CollectLabelContent setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CollectLabelContent setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

}
