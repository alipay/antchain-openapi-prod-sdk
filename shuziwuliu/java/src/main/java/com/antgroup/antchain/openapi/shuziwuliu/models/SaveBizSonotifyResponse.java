// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizSonotifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上凭证
    @NameInMap("tx_codes")
    public java.util.List<TxDto> txCodes;

    public static SaveBizSonotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBizSonotifyResponse self = new SaveBizSonotifyResponse();
        return TeaModel.build(map, self);
    }

    public SaveBizSonotifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveBizSonotifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveBizSonotifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveBizSonotifyResponse setTxCodes(java.util.List<TxDto> txCodes) {
        this.txCodes = txCodes;
        return this;
    }
    public java.util.List<TxDto> getTxCodes() {
        return this.txCodes;
    }

}
