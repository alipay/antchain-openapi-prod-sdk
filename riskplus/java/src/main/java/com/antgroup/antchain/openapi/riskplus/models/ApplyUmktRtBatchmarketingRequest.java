// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyUmktRtBatchmarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 外部流水号
    @NameInMap("out_serial_no")
    @Validation(required = true)
    public String outSerialNo;

    // 用户标识类型
    @NameInMap("param_type")
    @Validation(required = true)
    public String paramType;

    // 批量透传字段
    @NameInMap("out_info")
    @Validation(required = true)
    public String outInfo;

    // 用户凭证列表
    @NameInMap("customer_details")
    @Validation(required = true)
    public java.util.List<CustomerDetail> customerDetails;

    public static ApplyUmktRtBatchmarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUmktRtBatchmarketingRequest self = new ApplyUmktRtBatchmarketingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUmktRtBatchmarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUmktRtBatchmarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUmktRtBatchmarketingRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ApplyUmktRtBatchmarketingRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ApplyUmktRtBatchmarketingRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ApplyUmktRtBatchmarketingRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public ApplyUmktRtBatchmarketingRequest setCustomerDetails(java.util.List<CustomerDetail> customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public java.util.List<CustomerDetail> getCustomerDetails() {
        return this.customerDetails;
    }

}
