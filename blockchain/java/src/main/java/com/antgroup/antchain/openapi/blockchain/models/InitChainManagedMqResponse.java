// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitChainManagedMqResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 初始化托管 MQ 实例
    @NameInMap("result")
    public ManagedMQDTOStructBody result;

    public static InitChainManagedMqResponse build(java.util.Map<String, ?> map) throws Exception {
        InitChainManagedMqResponse self = new InitChainManagedMqResponse();
        return TeaModel.build(map, self);
    }

    public InitChainManagedMqResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitChainManagedMqResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitChainManagedMqResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitChainManagedMqResponse setResult(ManagedMQDTOStructBody result) {
        this.result = result;
        return this;
    }
    public ManagedMQDTOStructBody getResult() {
        return this.result;
    }

}
