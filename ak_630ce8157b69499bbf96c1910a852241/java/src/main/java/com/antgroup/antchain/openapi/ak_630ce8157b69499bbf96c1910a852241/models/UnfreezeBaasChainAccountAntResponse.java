// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class UnfreezeBaasChainAccountAntResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public String result;

    public static UnfreezeBaasChainAccountAntResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeBaasChainAccountAntResponse self = new UnfreezeBaasChainAccountAntResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezeBaasChainAccountAntResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnfreezeBaasChainAccountAntResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnfreezeBaasChainAccountAntResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnfreezeBaasChainAccountAntResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
