// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInsureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户的订单号
    @NameInMap("order_id")
    public String orderId;

    // 保单号
    @NameInMap("insure_id")
    public String insureId;

    // 保险订单状态。TOBE_INSURE：待发起投保 ；INSUR_PRE_SUCC：投保成功。WITHHOLD_DEDUCTING：代扣中；WITHHOLD_SUCC：代扣成功。WITHHOLD_FAIL：代扣失败。INSUR_SUCC：承保成功
    @NameInMap("status")
    public String status;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 2024-09-24 20:04:35
    @NameInMap("insure_start_time")
    public String insureStartTime;

    // 2024-12-24 20:04:35
    @NameInMap("insure_end_time")
    public String insureEndTime;

    // 投保金额（保额），单位分。100代表1元
    @NameInMap("insure_amount")
    public String insureAmount;

    // 投保费用（保费），单位分。100代表1元
    @NameInMap("insure_premium")
    public String insurePremium;

    public static QueryInsureResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInsureResponse self = new QueryInsureResponse();
        return TeaModel.build(map, self);
    }

    public QueryInsureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInsureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInsureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInsureResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryInsureResponse setInsureId(String insureId) {
        this.insureId = insureId;
        return this;
    }
    public String getInsureId() {
        return this.insureId;
    }

    public QueryInsureResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInsureResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryInsureResponse setInsureStartTime(String insureStartTime) {
        this.insureStartTime = insureStartTime;
        return this;
    }
    public String getInsureStartTime() {
        return this.insureStartTime;
    }

    public QueryInsureResponse setInsureEndTime(String insureEndTime) {
        this.insureEndTime = insureEndTime;
        return this;
    }
    public String getInsureEndTime() {
        return this.insureEndTime;
    }

    public QueryInsureResponse setInsureAmount(String insureAmount) {
        this.insureAmount = insureAmount;
        return this;
    }
    public String getInsureAmount() {
        return this.insureAmount;
    }

    public QueryInsureResponse setInsurePremium(String insurePremium) {
        this.insurePremium = insurePremium;
        return this;
    }
    public String getInsurePremium() {
        return this.insurePremium;
    }

}
