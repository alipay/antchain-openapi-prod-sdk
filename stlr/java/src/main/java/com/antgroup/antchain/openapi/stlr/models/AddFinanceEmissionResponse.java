// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddFinanceEmissionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 碳排放量
    @NameInMap("emission_amount")
    public String emissionAmount;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    public static AddFinanceEmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFinanceEmissionResponse self = new AddFinanceEmissionResponse();
        return TeaModel.build(map, self);
    }

    public AddFinanceEmissionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddFinanceEmissionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddFinanceEmissionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddFinanceEmissionResponse setEmissionAmount(String emissionAmount) {
        this.emissionAmount = emissionAmount;
        return this;
    }
    public String getEmissionAmount() {
        return this.emissionAmount;
    }

    public AddFinanceEmissionResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
