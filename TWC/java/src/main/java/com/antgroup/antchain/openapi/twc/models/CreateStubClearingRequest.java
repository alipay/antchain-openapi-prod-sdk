// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateStubClearingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 待分账金额，单位：分。如传100，即为100分，1元
    @NameInMap("stub_amount")
    @Validation(required = true)
    public Long stubAmount;

    // 清分状态，CLEARING_SUCCESS（清分成功）；CLEARING_FAIL（清分失败）；CLEARING_NONEED（不需要进行清分）
    @NameInMap("clearing_status")
    @Validation(required = true)
    public String clearingStatus;

    // 数字票根计量字段，当clearing_status为CLEARING_SUCCESS时，该字段必填
    @NameInMap("metric_info")
    public MetricInfo metricInfo;

    public static CreateStubClearingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStubClearingRequest self = new CreateStubClearingRequest();
        return TeaModel.build(map, self);
    }

    public CreateStubClearingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStubClearingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateStubClearingRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateStubClearingRequest setStubAmount(Long stubAmount) {
        this.stubAmount = stubAmount;
        return this;
    }
    public Long getStubAmount() {
        return this.stubAmount;
    }

    public CreateStubClearingRequest setClearingStatus(String clearingStatus) {
        this.clearingStatus = clearingStatus;
        return this;
    }
    public String getClearingStatus() {
        return this.clearingStatus;
    }

    public CreateStubClearingRequest setMetricInfo(MetricInfo metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }
    public MetricInfo getMetricInfo() {
        return this.metricInfo;
    }

}
