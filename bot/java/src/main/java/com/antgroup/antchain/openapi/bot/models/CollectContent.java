// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CollectContent extends TeaModel {
    // 链上设备Id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 收集的内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 对内容的签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 服务端发送的扩展数据（非可信设备直接产生的数据）
    @NameInMap("extra_data")
    public String extraData;

    // 数据模型Id
    @NameInMap("data_model_id")
    public String dataModelId;

    public static CollectContent build(java.util.Map<String, ?> map) throws Exception {
        CollectContent self = new CollectContent();
        return TeaModel.build(map, self);
    }

    public CollectContent setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public CollectContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CollectContent setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CollectContent setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public CollectContent setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
