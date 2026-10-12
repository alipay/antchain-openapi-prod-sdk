// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgePetrefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活体部分退款金额，单位：元
    @NameInMap("pet_refund_amount")
    public String petRefundAmount;

    // 商城部分退款金额，单位：元
    @NameInMap("mall_refund_amount")
    public String mallRefundAmount;

    // 退款状态，INIT/PROCESSING/SUCCESS/FAILED
    @NameInMap("refund_status")
    public String refundStatus;

    @NameInMap("remark")
    public String remark;

    // 业务订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 退款单号
    @NameInMap("refund_no")
    public String refundNo;

    public static QueryRiskplusDubbridgePetrefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgePetrefundResponse self = new QueryRiskplusDubbridgePetrefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgePetrefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskplusDubbridgePetrefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskplusDubbridgePetrefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskplusDubbridgePetrefundResponse setPetRefundAmount(String petRefundAmount) {
        this.petRefundAmount = petRefundAmount;
        return this;
    }
    public String getPetRefundAmount() {
        return this.petRefundAmount;
    }

    public QueryRiskplusDubbridgePetrefundResponse setMallRefundAmount(String mallRefundAmount) {
        this.mallRefundAmount = mallRefundAmount;
        return this;
    }
    public String getMallRefundAmount() {
        return this.mallRefundAmount;
    }

    public QueryRiskplusDubbridgePetrefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryRiskplusDubbridgePetrefundResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryRiskplusDubbridgePetrefundResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryRiskplusDubbridgePetrefundResponse setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

}
