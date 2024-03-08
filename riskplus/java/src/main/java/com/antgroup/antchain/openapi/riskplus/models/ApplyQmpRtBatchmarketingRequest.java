// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyQmpRtBatchmarketingRequest extends TeaModel {
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
    public String outInfo;

    // 用户凭证列表
    @NameInMap("customer_details")
    @Validation(required = true)
    public java.util.List<CustomerDetail> customerDetails;

    public static ApplyQmpRtBatchmarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyQmpRtBatchmarketingRequest self = new ApplyQmpRtBatchmarketingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyQmpRtBatchmarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyQmpRtBatchmarketingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyQmpRtBatchmarketingRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ApplyQmpRtBatchmarketingRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ApplyQmpRtBatchmarketingRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ApplyQmpRtBatchmarketingRequest setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public ApplyQmpRtBatchmarketingRequest setCustomerDetails(java.util.List<CustomerDetail> customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public java.util.List<CustomerDetail> getCustomerDetails() {
        return this.customerDetails;
    }

}
