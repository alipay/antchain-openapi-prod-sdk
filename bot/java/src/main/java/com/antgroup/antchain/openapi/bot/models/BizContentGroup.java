// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BizContentGroup extends TeaModel {
    // 设备链上ID（与scene参数、可信设备ID至少有一个参数不为空）
    /**
     * <strong>example:</strong>
     * <p>txhash123</p>
     */
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
    /**
     * <strong>example:</strong>
     * <p>7006071575519457281</p>
     */
    @NameInMap("trustiot_device_id")
    public Long trustiotDeviceId;

    // 业务Id
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务类型
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 数据内容 JSON字符串
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>{&quot;&quot;:&quot;&quot;,&quot;&quot;}</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static BizContentGroup build(java.util.Map<String, ?> map) throws Exception {
        BizContentGroup self = new BizContentGroup();
        return TeaModel.build(map, self);
    }

    public BizContentGroup setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public BizContentGroup setTrustiotDeviceId(Long trustiotDeviceId) {
        this.trustiotDeviceId = trustiotDeviceId;
        return this;
    }
    public Long getTrustiotDeviceId() {
        return this.trustiotDeviceId;
    }

    public BizContentGroup setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BizContentGroup setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public BizContentGroup setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
