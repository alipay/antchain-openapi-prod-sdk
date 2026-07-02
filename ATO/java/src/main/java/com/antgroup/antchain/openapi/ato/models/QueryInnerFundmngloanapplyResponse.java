// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundmngloanapplyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 融资放款申请状态
    @NameInMap("finance_loan_apply_status")
    public String financeLoanApplyStatus;

    // 商户还款方式
    // 每期全额还款，FULL_REPAYMENT_PER_INSTALLMENT
    @NameInMap("merchant_pay_type")
    public String merchantPayType;

    // 商户代偿开始天数
    @NameInMap("merchant_compensate_start_day")
    public Long merchantCompensateStartDay;

    // 商户还款开始期数
    @NameInMap("pay_start_term_index")
    public Long payStartTermIndex;

    // 商户付款项目，多个逗号分隔
    @NameInMap("payment_item")
    public String paymentItem;

    // 分账支付宝账号uid
    @NameInMap("divide_alipay_user_id")
    public String divideAlipayUserId;

    // 分账支付宝账号登录号
    @NameInMap("divide_alipay_login_id")
    public String divideAlipayLoginId;

    // 代偿支付宝账号uid
    @NameInMap("compensate_alipay_user_id")
    public String compensateAlipayUserId;

    // 代偿支付宝账号登录号
    @NameInMap("compensate_alipay_login_id")
    public String compensateAlipayLoginId;

    // 商户履约承诺，MerchantPromiseInfo
    @NameInMap("merchant_promise_info")
    public String merchantPromiseInfo;

    // 放款结果，FinanceLoanResults
    @NameInMap("finance_loan_results")
    public String financeLoanResults;

    // 融资放款结果同步失败原因
    @NameInMap("finance_loan_result_sync_fail_reason")
    public String financeLoanResultSyncFailReason;

    public static QueryInnerFundmngloanapplyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundmngloanapplyResponse self = new QueryInnerFundmngloanapplyResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundmngloanapplyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFundmngloanapplyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFundmngloanapplyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFundmngloanapplyResponse setFinanceLoanApplyStatus(String financeLoanApplyStatus) {
        this.financeLoanApplyStatus = financeLoanApplyStatus;
        return this;
    }
    public String getFinanceLoanApplyStatus() {
        return this.financeLoanApplyStatus;
    }

    public QueryInnerFundmngloanapplyResponse setMerchantPayType(String merchantPayType) {
        this.merchantPayType = merchantPayType;
        return this;
    }
    public String getMerchantPayType() {
        return this.merchantPayType;
    }

    public QueryInnerFundmngloanapplyResponse setMerchantCompensateStartDay(Long merchantCompensateStartDay) {
        this.merchantCompensateStartDay = merchantCompensateStartDay;
        return this;
    }
    public Long getMerchantCompensateStartDay() {
        return this.merchantCompensateStartDay;
    }

    public QueryInnerFundmngloanapplyResponse setPayStartTermIndex(Long payStartTermIndex) {
        this.payStartTermIndex = payStartTermIndex;
        return this;
    }
    public Long getPayStartTermIndex() {
        return this.payStartTermIndex;
    }

    public QueryInnerFundmngloanapplyResponse setPaymentItem(String paymentItem) {
        this.paymentItem = paymentItem;
        return this;
    }
    public String getPaymentItem() {
        return this.paymentItem;
    }

    public QueryInnerFundmngloanapplyResponse setDivideAlipayUserId(String divideAlipayUserId) {
        this.divideAlipayUserId = divideAlipayUserId;
        return this;
    }
    public String getDivideAlipayUserId() {
        return this.divideAlipayUserId;
    }

    public QueryInnerFundmngloanapplyResponse setDivideAlipayLoginId(String divideAlipayLoginId) {
        this.divideAlipayLoginId = divideAlipayLoginId;
        return this;
    }
    public String getDivideAlipayLoginId() {
        return this.divideAlipayLoginId;
    }

    public QueryInnerFundmngloanapplyResponse setCompensateAlipayUserId(String compensateAlipayUserId) {
        this.compensateAlipayUserId = compensateAlipayUserId;
        return this;
    }
    public String getCompensateAlipayUserId() {
        return this.compensateAlipayUserId;
    }

    public QueryInnerFundmngloanapplyResponse setCompensateAlipayLoginId(String compensateAlipayLoginId) {
        this.compensateAlipayLoginId = compensateAlipayLoginId;
        return this;
    }
    public String getCompensateAlipayLoginId() {
        return this.compensateAlipayLoginId;
    }

    public QueryInnerFundmngloanapplyResponse setMerchantPromiseInfo(String merchantPromiseInfo) {
        this.merchantPromiseInfo = merchantPromiseInfo;
        return this;
    }
    public String getMerchantPromiseInfo() {
        return this.merchantPromiseInfo;
    }

    public QueryInnerFundmngloanapplyResponse setFinanceLoanResults(String financeLoanResults) {
        this.financeLoanResults = financeLoanResults;
        return this;
    }
    public String getFinanceLoanResults() {
        return this.financeLoanResults;
    }

    public QueryInnerFundmngloanapplyResponse setFinanceLoanResultSyncFailReason(String financeLoanResultSyncFailReason) {
        this.financeLoanResultSyncFailReason = financeLoanResultSyncFailReason;
        return this;
    }
    public String getFinanceLoanResultSyncFailReason() {
        return this.financeLoanResultSyncFailReason;
    }

}
