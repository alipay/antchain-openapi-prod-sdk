// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessDepositGrantcorpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 存证数据的逻辑主id(biz_id与key_id的拼接)
    @NameInMap("deposit_id")
    public String depositId;

    // 是否取消授权成功
    @NameInMap("status")
    public String status;

    public static CancelBusinessDepositGrantcorpResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessDepositGrantcorpResponse self = new CancelBusinessDepositGrantcorpResponse();
        return TeaModel.build(map, self);
    }

    public CancelBusinessDepositGrantcorpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelBusinessDepositGrantcorpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelBusinessDepositGrantcorpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelBusinessDepositGrantcorpResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public CancelBusinessDepositGrantcorpResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
