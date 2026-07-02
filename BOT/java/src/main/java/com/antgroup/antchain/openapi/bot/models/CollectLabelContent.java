// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CollectLabelContent extends TeaModel {
    // 链上设备ID
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 1.设备端上报数据内容  
    // 2.与设备上报的数据一致，服务端不可修改
    // 3.解析后需与DataModel匹配 
    // 4.映射 Label 对象结构化存储
    // 5.转为JSON后如果是JSONObject 映射单个 Label
    // 6.转为JSON后如果是JSONArray 映射多个 Label
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // content的签名
    // 与设备上报的签名保持一致，服务端不可修改
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 未经设备签名的附加数据JSON String
    // 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
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
