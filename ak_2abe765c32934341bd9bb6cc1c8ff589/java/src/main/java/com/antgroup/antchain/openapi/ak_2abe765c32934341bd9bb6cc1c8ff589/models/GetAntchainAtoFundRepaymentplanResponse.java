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

    // 宽限期，精确到毫秒
    @NameInMap("limit")
    public Long limit;

    // 应付租金时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("pay_date_list")
    public String payDateList;

    // 租期
    @NameInMap("pay_period")
    public Long payPeriod;

    // 应付租金，精确到分，即1234表示12.34元
    @NameInMap("pay_money_list")
    public String payMoneyList;

    // 租赁公司支付宝UID
    @NameInMap("lease_alipay_uid")
    public String leaseAlipayUid;

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

    public GetAntchainAtoFundRepaymentplanResponse setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetAntchainAtoFundRepaymentplanResponse setPayDateList(String payDateList) {
        this.payDateList = payDateList;
        return this;
    }
    public String getPayDateList() {
        return this.payDateList;
    }

    public GetAntchainAtoFundRepaymentplanResponse setPayPeriod(Long payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Long getPayPeriod() {
        return this.payPeriod;
    }

    public GetAntchainAtoFundRepaymentplanResponse setPayMoneyList(String payMoneyList) {
        this.payMoneyList = payMoneyList;
        return this;
    }
    public String getPayMoneyList() {
        return this.payMoneyList;
    }

    public GetAntchainAtoFundRepaymentplanResponse setLeaseAlipayUid(String leaseAlipayUid) {
        this.leaseAlipayUid = leaseAlipayUid;
        return this;
    }
    public String getLeaseAlipayUid() {
        return this.leaseAlipayUid;
    }

}
