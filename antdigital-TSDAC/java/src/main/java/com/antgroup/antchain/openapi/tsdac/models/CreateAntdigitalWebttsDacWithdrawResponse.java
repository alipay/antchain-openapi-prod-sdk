// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CreateAntdigitalWebttsDacWithdrawResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 出金订单号
    @NameInMap("order_id")
    public String orderId;

    public static CreateAntdigitalWebttsDacWithdrawResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalWebttsDacWithdrawResponse self = new CreateAntdigitalWebttsDacWithdrawResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalWebttsDacWithdrawResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntdigitalWebttsDacWithdrawResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntdigitalWebttsDacWithdrawResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntdigitalWebttsDacWithdrawResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
