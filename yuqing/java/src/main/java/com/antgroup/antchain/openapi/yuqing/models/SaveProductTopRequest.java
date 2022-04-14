// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SaveProductTopRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务号
    @NameInMap("biz_no")
    public String bizNo;

    // 租户 ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 实例 ID，兼容老模型的 tntInstId
    @NameInMap("instance_id")
    public String instanceId;

    // 产品编码
    @NameInMap("product_code")
    public String productCode;

    // 模块唯一标识
    @NameInMap("module_key")
    public String moduleKey;

    // 操作类型
    @NameInMap("operate")
    public String operate;

    // 操作来源渠道
    @NameInMap("channel")
    public String channel;

    public static SaveProductTopRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveProductTopRequest self = new SaveProductTopRequest();
        return TeaModel.build(map, self);
    }

    public SaveProductTopRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveProductTopRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveProductTopRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SaveProductTopRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveProductTopRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveProductTopRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SaveProductTopRequest setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey;
        return this;
    }
    public String getModuleKey() {
        return this.moduleKey;
    }

    public SaveProductTopRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public SaveProductTopRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
