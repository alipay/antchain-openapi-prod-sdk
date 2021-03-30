// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadBizFinancingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上链hash
    @NameInMap("tx_codes")
    public java.util.List<TxDto> txCodes;

    public static UploadBizFinancingResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadBizFinancingResponse self = new UploadBizFinancingResponse();
        return TeaModel.build(map, self);
    }

    public UploadBizFinancingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadBizFinancingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadBizFinancingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadBizFinancingResponse setTxCodes(java.util.List<TxDto> txCodes) {
        this.txCodes = txCodes;
        return this;
    }
    public java.util.List<TxDto> getTxCodes() {
        return this.txCodes;
    }

}
