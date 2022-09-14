// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainUseDeclarationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 蚂蚁链申报用途接口体
    @NameInMap("result")
    public AntChainPurposeResponse result;

    public static ApplyChainUseDeclarationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainUseDeclarationResponse self = new ApplyChainUseDeclarationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyChainUseDeclarationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyChainUseDeclarationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyChainUseDeclarationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyChainUseDeclarationResponse setResult(AntChainPurposeResponse result) {
        this.result = result;
        return this;
    }
    public AntChainPurposeResponse getResult() {
        return this.result;
    }

}
