// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateStandardAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("tx_codes")
    public java.util.List<TxDto> txCodes;

    public static CreateStandardAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardAccountResponse self = new CreateStandardAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateStandardAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateStandardAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateStandardAccountResponse setTxCodes(java.util.List<TxDto> txCodes) {
        this.txCodes = txCodes;
        return this;
    }
    public java.util.List<TxDto> getTxCodes() {
        return this.txCodes;
    }

}
