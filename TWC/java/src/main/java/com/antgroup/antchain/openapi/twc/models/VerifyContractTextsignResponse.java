// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyContractTextsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务结果码, 成功0
    @NameInMap("code")
    public Long code;

    // 结果信息
    @NameInMap("message")
    public String message;

    // 签署信息, 包含签名与证书
    @NameInMap("sign_info")
    public ContractTextSignVerifySignInfo signInfo;

    public static VerifyContractTextsignResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyContractTextsignResponse self = new VerifyContractTextsignResponse();
        return TeaModel.build(map, self);
    }

    public VerifyContractTextsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyContractTextsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyContractTextsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyContractTextsignResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public VerifyContractTextsignResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyContractTextsignResponse setSignInfo(ContractTextSignVerifySignInfo signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public ContractTextSignVerifySignInfo getSignInfo() {
        return this.signInfo;
    }

}
