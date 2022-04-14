// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SaveProductOpenRequest extends TeaModel {
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

    // 规格
    @NameInMap("commodity_specs")
    public java.util.List<CommoditySpec> commoditySpecs;

    public static SaveProductOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveProductOpenRequest self = new SaveProductOpenRequest();
        return TeaModel.build(map, self);
    }

    public SaveProductOpenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveProductOpenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveProductOpenRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SaveProductOpenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveProductOpenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveProductOpenRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SaveProductOpenRequest setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey;
        return this;
    }
    public String getModuleKey() {
        return this.moduleKey;
    }

    public SaveProductOpenRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public SaveProductOpenRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SaveProductOpenRequest setCommoditySpecs(java.util.List<CommoditySpec> commoditySpecs) {
        this.commoditySpecs = commoditySpecs;
        return this;
    }
    public java.util.List<CommoditySpec> getCommoditySpecs() {
        return this.commoditySpecs;
    }

}
