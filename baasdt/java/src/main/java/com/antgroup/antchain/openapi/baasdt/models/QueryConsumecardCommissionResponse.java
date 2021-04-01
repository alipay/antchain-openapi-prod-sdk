// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardCommissionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 手续费规则结果
    @NameInMap("commission_rules")
    public java.util.List<CommissionRuleResponse> commissionRules;

    // 分类id（ffaaaaabbbbbb，如果存在则直接更新）
    @NameInMap("category_id")
    public String categoryId;

    // 手续费类型（0:全局，1:商户）
    @NameInMap("type")
    public Long type;

    // 手续费归属的账户id,如果type为0 ，则该字段必须为空
    @NameInMap("account_id")
    public String accountId;

    // 手续费支出方（0.卖家，1.买家，2.平台）
    @NameInMap("pay_commission_type")
    public String payCommissionType;

    public static QueryConsumecardCommissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardCommissionResponse self = new QueryConsumecardCommissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardCommissionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardCommissionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardCommissionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardCommissionResponse setCommissionRules(java.util.List<CommissionRuleResponse> commissionRules) {
        this.commissionRules = commissionRules;
        return this;
    }
    public java.util.List<CommissionRuleResponse> getCommissionRules() {
        return this.commissionRules;
    }

    public QueryConsumecardCommissionResponse setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public QueryConsumecardCommissionResponse setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public QueryConsumecardCommissionResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryConsumecardCommissionResponse setPayCommissionType(String payCommissionType) {
        this.payCommissionType = payCommissionType;
        return this;
    }
    public String getPayCommissionType() {
        return this.payCommissionType;
    }

}
