// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class GetConsumecardOrderwithdrawresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 提现任务期望提现的金额(单位:元,精确到分)
    @NameInMap("expected_withdraw_amount")
    public String expectedWithdrawAmount;

    // 状态
    @NameInMap("status")
    public String status;

    // 需要审批后才能提现的交易订单数量
    @NameInMap("withdraw_approval_order_count")
    public Long withdrawApprovalOrderCount;

    // 提现单编号
    @NameInMap("withdraw_biz_id")
    public String withdrawBizId;

    // 提现成功的总金额(单位:元,精确到分)
    @NameInMap("withdraw_total_amount")
    public String withdrawTotalAmount;

    // 提现成功的总笔数
    @NameInMap("withdraw_total_count")
    public Long withdrawTotalCount;

    public static GetConsumecardOrderwithdrawresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumecardOrderwithdrawresultResponse self = new GetConsumecardOrderwithdrawresultResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumecardOrderwithdrawresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConsumecardOrderwithdrawresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConsumecardOrderwithdrawresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConsumecardOrderwithdrawresultResponse setExpectedWithdrawAmount(String expectedWithdrawAmount) {
        this.expectedWithdrawAmount = expectedWithdrawAmount;
        return this;
    }
    public String getExpectedWithdrawAmount() {
        return this.expectedWithdrawAmount;
    }

    public GetConsumecardOrderwithdrawresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetConsumecardOrderwithdrawresultResponse setWithdrawApprovalOrderCount(Long withdrawApprovalOrderCount) {
        this.withdrawApprovalOrderCount = withdrawApprovalOrderCount;
        return this;
    }
    public Long getWithdrawApprovalOrderCount() {
        return this.withdrawApprovalOrderCount;
    }

    public GetConsumecardOrderwithdrawresultResponse setWithdrawBizId(String withdrawBizId) {
        this.withdrawBizId = withdrawBizId;
        return this;
    }
    public String getWithdrawBizId() {
        return this.withdrawBizId;
    }

    public GetConsumecardOrderwithdrawresultResponse setWithdrawTotalAmount(String withdrawTotalAmount) {
        this.withdrawTotalAmount = withdrawTotalAmount;
        return this;
    }
    public String getWithdrawTotalAmount() {
        return this.withdrawTotalAmount;
    }

    public GetConsumecardOrderwithdrawresultResponse setWithdrawTotalCount(Long withdrawTotalCount) {
        this.withdrawTotalCount = withdrawTotalCount;
        return this;
    }
    public Long getWithdrawTotalCount() {
        return this.withdrawTotalCount;
    }

}
