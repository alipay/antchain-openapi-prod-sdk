// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessContractGrantcorpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 成功取消授权的字段
    @NameInMap("data")
    public String data;

    // 是否取消授权成功，0表示成功
    @NameInMap("status")
    public Long status;

    public static CancelBusinessContractGrantcorpResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessContractGrantcorpResponse self = new CancelBusinessContractGrantcorpResponse();
        return TeaModel.build(map, self);
    }

    public CancelBusinessContractGrantcorpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelBusinessContractGrantcorpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelBusinessContractGrantcorpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelBusinessContractGrantcorpResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CancelBusinessContractGrantcorpResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
