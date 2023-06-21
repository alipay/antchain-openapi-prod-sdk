// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyUmktRealtimemarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 营销盾内部租户下的子租户
    @NameInMap("sub_tenant_id")
    public String subTenantId;

    // 	
    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 外部流水号
    @NameInMap("out_serial_no")
    @Validation(required = true)
    public String outSerialNo;

    // 	
    // 用户参数类型
    @NameInMap("param_type")
    @Validation(required = true)
    public String paramType;

    // 触达渠道配置
    @NameInMap("channel_params")
    public String channelParams;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    // 手机号/手机号md5
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    public static ApplyUmktRealtimemarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUmktRealtimemarketingRequest self = new ApplyUmktRealtimemarketingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUmktRealtimemarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUmktRealtimemarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUmktRealtimemarketingRequest setSubTenantId(String subTenantId) {
        this.subTenantId = subTenantId;
        return this;
    }
    public String getSubTenantId() {
        return this.subTenantId;
    }

    public ApplyUmktRealtimemarketingRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ApplyUmktRealtimemarketingRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ApplyUmktRealtimemarketingRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ApplyUmktRealtimemarketingRequest setChannelParams(String channelParams) {
        this.channelParams = channelParams;
        return this;
    }
    public String getChannelParams() {
        return this.channelParams;
    }

    public ApplyUmktRealtimemarketingRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ApplyUmktRealtimemarketingRequest setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

}
