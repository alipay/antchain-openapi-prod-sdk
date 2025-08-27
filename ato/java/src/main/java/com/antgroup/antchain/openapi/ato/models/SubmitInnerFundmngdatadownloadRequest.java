// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundmngdatadownloadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 任务类型
    //  FINANCE_ORDER_TRADE_PROMISE_DETAIL：融资订单交易履约明细
    // FINANCE_ORDER_LOAN_DETAIL：融资订单放款信息
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static SubmitInnerFundmngdatadownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundmngdatadownloadRequest self = new SubmitInnerFundmngdatadownloadRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundmngdatadownloadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerFundmngdatadownloadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerFundmngdatadownloadRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public SubmitInnerFundmngdatadownloadRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitInnerFundmngdatadownloadRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SubmitInnerFundmngdatadownloadRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
