// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractTradestatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代扣计划的外部订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 最近一次扣款触发时间戳（单位：ms）
    @NameInMap("deduct_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deductTime;

    // 创建代扣计划时设置的扣款时间戳（单位：ms）
    @NameInMap("pay_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payDate;

    // 计划扣款金额（单位：分）
    @NameInMap("pay_money")
    public Long payMoney;

    // 扣款状态
    // PAY_TOBE_TRIGGER 初始未扣款
    // TRADE_IN_PROGRESS 扣款中
    // TRADE_REFUNDED 已发生退款
    // TRADE_END 交易终止（未成功）
    // TRADE_SUCCESS 扣款成功
    // TRADE_FAIL 扣款失败
    // TRADE_FINISHED 交易终止（扣款成功，并且距离首次扣款超过180天）
    // TRADE_CANCEL 代扣取消
    @NameInMap("status")
    public String status;

    public static QueryContractTradestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractTradestatusResponse self = new QueryContractTradestatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractTradestatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractTradestatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractTradestatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractTradestatusResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryContractTradestatusResponse setDeductTime(String deductTime) {
        this.deductTime = deductTime;
        return this;
    }
    public String getDeductTime() {
        return this.deductTime;
    }

    public QueryContractTradestatusResponse setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public QueryContractTradestatusResponse setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public QueryContractTradestatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
