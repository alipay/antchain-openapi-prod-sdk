// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class ImportBizspaceBatchmarketingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 外部流水号，用于幂等处理，须外部保证唯一，最长64位
    @NameInMap("out_serial_no")
    @Validation(required = true)
    public String outSerialNo;

    // 用户标识类型：MOBILE（明文手机号）/ MOBILE_MD5（32位小写）/ MOBILE_SHA256（64位小写）
    @NameInMap("param_type")
    @Validation(required = true)
    public String paramType;

    // 批量用户列表，单批最大100
    @NameInMap("customer_details")
    @Validation(required = true)
    public java.util.List<CustomerItem> customerDetails;

    public static ImportBizspaceBatchmarketingRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportBizspaceBatchmarketingRequest self = new ImportBizspaceBatchmarketingRequest();
        return TeaModel.build(map, self);
    }

    public ImportBizspaceBatchmarketingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportBizspaceBatchmarketingRequest setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ImportBizspaceBatchmarketingRequest setOutSerialNo(String outSerialNo) {
        this.outSerialNo = outSerialNo;
        return this;
    }
    public String getOutSerialNo() {
        return this.outSerialNo;
    }

    public ImportBizspaceBatchmarketingRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ImportBizspaceBatchmarketingRequest setCustomerDetails(java.util.List<CustomerItem> customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    public java.util.List<CustomerItem> getCustomerDetails() {
        return this.customerDetails;
    }

}
