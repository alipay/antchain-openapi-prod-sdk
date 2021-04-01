// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsMerchantbalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 积分库可用余额
    @NameInMap("budget_available_balance")
    public Long budgetAvailableBalance;

    // 预算库余额
    @NameInMap("budget_balance")
    public Long budgetBalance;

    // 预算库代码
    @NameInMap("budget_code")
    public String budgetCode;

    // 商户的支付宝商家ID
    @NameInMap("pid")
    public String pid;

    // 积分库余额
    @NameInMap("point_lib_balance")
    public Long pointLibBalance;

    // 积分库代码
    @NameInMap("point_lib_code")
    public String pointLibCode;

    // 商户的金融云租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryMypointsMerchantbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsMerchantbalanceResponse self = new QueryMypointsMerchantbalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypointsMerchantbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypointsMerchantbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypointsMerchantbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypointsMerchantbalanceResponse setBudgetAvailableBalance(Long budgetAvailableBalance) {
        this.budgetAvailableBalance = budgetAvailableBalance;
        return this;
    }
    public Long getBudgetAvailableBalance() {
        return this.budgetAvailableBalance;
    }

    public QueryMypointsMerchantbalanceResponse setBudgetBalance(Long budgetBalance) {
        this.budgetBalance = budgetBalance;
        return this;
    }
    public Long getBudgetBalance() {
        return this.budgetBalance;
    }

    public QueryMypointsMerchantbalanceResponse setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
        return this;
    }
    public String getBudgetCode() {
        return this.budgetCode;
    }

    public QueryMypointsMerchantbalanceResponse setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryMypointsMerchantbalanceResponse setPointLibBalance(Long pointLibBalance) {
        this.pointLibBalance = pointLibBalance;
        return this;
    }
    public Long getPointLibBalance() {
        return this.pointLibBalance;
    }

    public QueryMypointsMerchantbalanceResponse setPointLibCode(String pointLibCode) {
        this.pointLibCode = pointLibCode;
        return this;
    }
    public String getPointLibCode() {
        return this.pointLibCode;
    }

    public QueryMypointsMerchantbalanceResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
