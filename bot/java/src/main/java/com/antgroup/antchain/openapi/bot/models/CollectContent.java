// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CollectContent extends TeaModel {
    // 链上设备ID（与可信设备ID至少填一项）
    /**
     * <strong>example:</strong>
     * <p>1122</p>
     */
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 可信设备ID（与链上设备ID至少填一项）
    /**
     * <strong>example:</strong>
     * <p>7006071575519457281</p>
     */
    @NameInMap("trustiot_device_id")
    public Long trustiotDeviceId;

    // 收集的内容
    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;,&quot;1&quot;}</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 对内容的签名
    /**
     * <strong>example:</strong>
     * <p>wwexe02j</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 服务端发送的扩展数据（非可信设备直接产生的数据）
    /**
     * <strong>example:</strong>
     * <p>{&quot;extraKey&quot;:&quot;extraValue&quot;}</p>
     */
    @NameInMap("extra_data")
    public String extraData;

    // 数据模型Id
    /**
     * <strong>example:</strong>
     * <p>00000001</p>
     */
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

    public CollectContent setTrustiotDeviceId(Long trustiotDeviceId) {
        this.trustiotDeviceId = trustiotDeviceId;
        return this;
    }
    public Long getTrustiotDeviceId() {
        return this.trustiotDeviceId;
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
