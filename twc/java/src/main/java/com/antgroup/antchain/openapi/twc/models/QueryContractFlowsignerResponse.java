// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractFlowsignerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 签字人列表
    @NameInMap("signers")
    public java.util.List<ContractFlowSigner> signers;

    public static QueryContractFlowsignerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractFlowsignerResponse self = new QueryContractFlowsignerResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractFlowsignerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractFlowsignerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractFlowsignerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractFlowsignerResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractFlowsignerResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractFlowsignerResponse setSigners(java.util.List<ContractFlowSigner> signers) {
        this.signers = signers;
        return this;
    }
    public java.util.List<ContractFlowSigner> getSigners() {
        return this.signers;
    }

}
