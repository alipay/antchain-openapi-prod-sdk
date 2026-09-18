// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryPoiRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退款单号
    @NameInMap("refund_no")
    @Validation(required = true)
    public String refundNo;

    // 退款状态：INIT/PROCESSING/SUCCESS/FAILED
    @NameInMap("refund_status")
    @Validation(required = true)
    public String refundStatus;

    // 活体部分退款金额
    @NameInMap("pet_refund_amount")
    public String petRefundAmount;

    // 商城部分退款金额
    @NameInMap("mall_refund_amount")
    public String mallRefundAmount;

    // 说明（与退款申请响应同口径）
    @NameInMap("remark")
    public String remark;

    public static QueryPoiRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPoiRefundResponse self = new QueryPoiRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryPoiRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPoiRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPoiRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPoiRefundResponse setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

    public QueryPoiRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryPoiRefundResponse setPetRefundAmount(String petRefundAmount) {
        this.petRefundAmount = petRefundAmount;
        return this;
    }
    public String getPetRefundAmount() {
        return this.petRefundAmount;
    }

    public QueryPoiRefundResponse setMallRefundAmount(String mallRefundAmount) {
        this.mallRefundAmount = mallRefundAmount;
        return this;
    }
    public String getMallRefundAmount() {
        return this.mallRefundAmount;
    }

    public QueryPoiRefundResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
