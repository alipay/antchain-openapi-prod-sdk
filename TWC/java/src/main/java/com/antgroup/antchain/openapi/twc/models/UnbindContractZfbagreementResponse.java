// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UnbindContractZfbagreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解约是否成功
    @NameInMap("unsign_success")
    public Boolean unsignSuccess;

    public static UnbindContractZfbagreementResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindContractZfbagreementResponse self = new UnbindContractZfbagreementResponse();
        return TeaModel.build(map, self);
    }

    public UnbindContractZfbagreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnbindContractZfbagreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnbindContractZfbagreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnbindContractZfbagreementResponse setUnsignSuccess(Boolean unsignSuccess) {
        this.unsignSuccess = unsignSuccess;
        return this;
    }
    public Boolean getUnsignSuccess() {
        return this.unsignSuccess;
    }

}
