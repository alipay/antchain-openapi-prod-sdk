// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CancelDubbridgeInstallmentOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单取消请求接受结果：
    // Y: 成功; N: 失败
    @NameInMap("cancel_result")
    public String cancelResult;

    public static CancelDubbridgeInstallmentOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDubbridgeInstallmentOrderResponse self = new CancelDubbridgeInstallmentOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelDubbridgeInstallmentOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelDubbridgeInstallmentOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelDubbridgeInstallmentOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelDubbridgeInstallmentOrderResponse setCancelResult(String cancelResult) {
        this.cancelResult = cancelResult;
        return this;
    }
    public String getCancelResult() {
        return this.cancelResult;
    }

}
