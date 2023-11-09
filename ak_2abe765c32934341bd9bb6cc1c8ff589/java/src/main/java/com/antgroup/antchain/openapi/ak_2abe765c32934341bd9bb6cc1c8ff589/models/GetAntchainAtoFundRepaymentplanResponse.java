// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class GetAntchainAtoFundRepaymentplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 租赁公司支付宝UID
    @NameInMap("lease_alipay_uid")
    public String leaseAlipayUid;

    // 宽限期，天
    @NameInMap("grace_period_days")
    public Long gracePeriodDays;

    // 还款策略列表
    @NameInMap("repay_strategy_list")
    public String repayStrategyList;

    // 处罚策略
    //  NONE : 没有处罚
    //  PENALTY_FEE： 罚息
    @NameInMap("punishment_type")
    public String punishmentType;

    // 租期
    @NameInMap("pay_period")
    public Long payPeriod;

    public static GetAntchainAtoFundRepaymentplanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoFundRepaymentplanResponse self = new GetAntchainAtoFundRepaymentplanResponse();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoFundRepaymentplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntchainAtoFundRepaymentplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntchainAtoFundRepaymentplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntchainAtoFundRepaymentplanResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoFundRepaymentplanResponse setLeaseAlipayUid(String leaseAlipayUid) {
        this.leaseAlipayUid = leaseAlipayUid;
        return this;
    }
    public String getLeaseAlipayUid() {
        return this.leaseAlipayUid;
    }

    public GetAntchainAtoFundRepaymentplanResponse setGracePeriodDays(Long gracePeriodDays) {
        this.gracePeriodDays = gracePeriodDays;
        return this;
    }
    public Long getGracePeriodDays() {
        return this.gracePeriodDays;
    }

    public GetAntchainAtoFundRepaymentplanResponse setRepayStrategyList(String repayStrategyList) {
        this.repayStrategyList = repayStrategyList;
        return this;
    }
    public String getRepayStrategyList() {
        return this.repayStrategyList;
    }

    public GetAntchainAtoFundRepaymentplanResponse setPunishmentType(String punishmentType) {
        this.punishmentType = punishmentType;
        return this;
    }
    public String getPunishmentType() {
        return this.punishmentType;
    }

    public GetAntchainAtoFundRepaymentplanResponse setPayPeriod(Long payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Long getPayPeriod() {
        return this.payPeriod;
    }

}
