// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentsubWithdrawalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 原商户流水号
    @NameInMap("withdraw_order_id")
    @Validation(required = true)
    public String withdrawOrderId;

    // 交易时间 yyyy-MM-dd，原交易日期
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 一级商户商户号
    @NameInMap("first_level_memberid")
    @Validation(required = true)
    public String firstLevelMemberid;

    // 一级商户终端号
    @NameInMap("first_level_terminalid")
    @Validation(required = true)
    public String firstLevelTerminalid;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static QueryCutpaymentsubWithdrawalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentsubWithdrawalRequest self = new QueryCutpaymentsubWithdrawalRequest();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentsubWithdrawalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCutpaymentsubWithdrawalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCutpaymentsubWithdrawalRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCutpaymentsubWithdrawalRequest setWithdrawOrderId(String withdrawOrderId) {
        this.withdrawOrderId = withdrawOrderId;
        return this;
    }
    public String getWithdrawOrderId() {
        return this.withdrawOrderId;
    }

    public QueryCutpaymentsubWithdrawalRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public QueryCutpaymentsubWithdrawalRequest setFirstLevelMemberid(String firstLevelMemberid) {
        this.firstLevelMemberid = firstLevelMemberid;
        return this;
    }
    public String getFirstLevelMemberid() {
        return this.firstLevelMemberid;
    }

    public QueryCutpaymentsubWithdrawalRequest setFirstLevelTerminalid(String firstLevelTerminalid) {
        this.firstLevelTerminalid = firstLevelTerminalid;
        return this;
    }
    public String getFirstLevelTerminalid() {
        return this.firstLevelTerminalid;
    }

    public QueryCutpaymentsubWithdrawalRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
