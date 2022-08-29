// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyContractDocsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("code")
    public Long code;

    // 结果信息
    @NameInMap("message")
    public String message;

    // 文件签署信息
    @NameInMap("sign_infos")
    public java.util.List<ContractDocSignVerifyInfo> signInfos;

    public static VerifyContractDocsignResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyContractDocsignResponse self = new VerifyContractDocsignResponse();
        return TeaModel.build(map, self);
    }

    public VerifyContractDocsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyContractDocsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyContractDocsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyContractDocsignResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public VerifyContractDocsignResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyContractDocsignResponse setSignInfos(java.util.List<ContractDocSignVerifyInfo> signInfos) {
        this.signInfos = signInfos;
        return this;
    }
    public java.util.List<ContractDocSignVerifyInfo> getSignInfos() {
        return this.signInfos;
    }

}
