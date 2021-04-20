// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecNftTransferResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部流水id
    @NameInMap("transfer_id")
    public String transferId;

    public static ExecNftTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecNftTransferResponse self = new ExecNftTransferResponse();
        return TeaModel.build(map, self);
    }

    public ExecNftTransferResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecNftTransferResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecNftTransferResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecNftTransferResponse setTransferId(String transferId) {
        this.transferId = transferId;
        return this;
    }
    public String getTransferId() {
        return this.transferId;
    }

}
