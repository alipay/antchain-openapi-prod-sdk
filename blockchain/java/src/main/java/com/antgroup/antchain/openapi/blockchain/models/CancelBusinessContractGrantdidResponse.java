// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessContractGrantdidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 取消授权成功的字段列表
    @NameInMap("data")
    public String data;

    // 是否取消授权成功，0表示成功
    @NameInMap("status")
    public Long status;

    public static CancelBusinessContractGrantdidResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessContractGrantdidResponse self = new CancelBusinessContractGrantdidResponse();
        return TeaModel.build(map, self);
    }

    public CancelBusinessContractGrantdidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelBusinessContractGrantdidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelBusinessContractGrantdidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelBusinessContractGrantdidResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CancelBusinessContractGrantdidResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
