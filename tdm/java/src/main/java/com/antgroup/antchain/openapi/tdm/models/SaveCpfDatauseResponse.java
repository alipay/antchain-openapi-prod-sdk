// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class SaveCpfDatauseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链链信息
    @NameInMap("chain_info")
    public ChainInfo chainInfo;

    public static SaveCpfDatauseResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCpfDatauseResponse self = new SaveCpfDatauseResponse();
        return TeaModel.build(map, self);
    }

    public SaveCpfDatauseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveCpfDatauseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveCpfDatauseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveCpfDatauseResponse setChainInfo(ChainInfo chainInfo) {
        this.chainInfo = chainInfo;
        return this;
    }
    public ChainInfo getChainInfo() {
        return this.chainInfo;
    }

}
