// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BindAuthPoapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 徽章ID
    @NameInMap("poap_id")
    public String poapId;

    public static BindAuthPoapResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAuthPoapResponse self = new BindAuthPoapResponse();
        return TeaModel.build(map, self);
    }

    public BindAuthPoapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindAuthPoapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindAuthPoapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindAuthPoapResponse setPoapId(String poapId) {
        this.poapId = poapId;
        return this;
    }
    public String getPoapId() {
        return this.poapId;
    }

}
