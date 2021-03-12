// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthClaimTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 授权声明模版
    @NameInMap("claim_template")
    public String claimTemplate;

    public static GetAuthClaimTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthClaimTemplateResponse self = new GetAuthClaimTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthClaimTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAuthClaimTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAuthClaimTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAuthClaimTemplateResponse setClaimTemplate(String claimTemplate) {
        this.claimTemplate = claimTemplate;
        return this;
    }
    public String getClaimTemplate() {
        return this.claimTemplate;
    }

}
