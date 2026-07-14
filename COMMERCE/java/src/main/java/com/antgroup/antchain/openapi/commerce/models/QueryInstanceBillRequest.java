// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class QueryInstanceBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 租户id
    @NameInMap("settle_user_id")
    @Validation(required = true)
    public String settleUserId;

    // 月份，最少包含1个，
    @NameInMap("bill_month_list")
    @Validation(required = true)
    public java.util.List<String> billMonthList;

    // 月账单类型：量价或预收，不传则按照原逻辑只查询量价账单
    @NameInMap("summary_type")
    public String summaryType;

    public static QueryInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillRequest self = new QueryInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInstanceBillRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryInstanceBillRequest setSettleUserId(String settleUserId) {
        this.settleUserId = settleUserId;
        return this;
    }
    public String getSettleUserId() {
        return this.settleUserId;
    }

    public QueryInstanceBillRequest setBillMonthList(java.util.List<String> billMonthList) {
        this.billMonthList = billMonthList;
        return this;
    }
    public java.util.List<String> getBillMonthList() {
        return this.billMonthList;
    }

    public QueryInstanceBillRequest setSummaryType(String summaryType) {
        this.summaryType = summaryType;
        return this;
    }
    public String getSummaryType() {
        return this.summaryType;
    }

}
