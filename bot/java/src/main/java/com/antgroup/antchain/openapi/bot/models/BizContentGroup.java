// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BizContentGroup extends TeaModel {
    // 设备链上Id
    // 
    // 
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 业务Id
    // 
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务类型
    // 
    // 
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 数据内容 JSON字符串
    // 
    // 
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
