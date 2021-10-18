// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_iot.models;

import com.aliyun.tea.*;

public class CollectContentNoSign extends TeaModel {
    // 链上设备Id
    // 
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 收集内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 服务端发送的扩展数据（非可信设备直接产生的数据）
    @NameInMap("extra_data")
    public String extraData;

    public static CollectContentNoSign build(java.util.Map<String, ?> map) throws Exception {
        CollectContentNoSign self = new CollectContentNoSign();
        return TeaModel.build(map, self);
    }

    public CollectContentNoSign setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public CollectContentNoSign setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CollectContentNoSign setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

}
