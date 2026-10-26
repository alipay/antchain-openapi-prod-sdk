// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class ImportOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 投放任务ID
    @NameInMap("strategy_task_id")
    @Validation(required = true)
    public Long strategyTaskId;

    // 客户请求流水号
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 客户号码列表
    @NameInMap("customers")
    @Validation(required = true)
    public java.util.List<CustomerItem> customers;

    // 手机号传入格式:PLAIN明文 / MD5 / SHA256，不填即为默认PLAIN
    @NameInMap("mobile_format")
    public String mobileFormat;

    public static ImportOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportOrderRequest self = new ImportOrderRequest();
        return TeaModel.build(map, self);
    }

    public ImportOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportOrderRequest setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public ImportOrderRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public ImportOrderRequest setCustomers(java.util.List<CustomerItem> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<CustomerItem> getCustomers() {
        return this.customers;
    }

    public ImportOrderRequest setMobileFormat(String mobileFormat) {
        this.mobileFormat = mobileFormat;
        return this;
    }
    public String getMobileFormat() {
        return this.mobileFormat;
    }

}
