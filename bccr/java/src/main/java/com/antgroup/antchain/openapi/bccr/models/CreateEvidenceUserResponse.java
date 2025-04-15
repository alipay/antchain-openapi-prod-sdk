// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 取证用户id
    @NameInMap("evidence_user_id")
    public String evidenceUserId;

    // 外部用户ID
    @NameInMap("out_user_id")
    public String outUserId;

    public static CreateEvidenceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceUserResponse self = new CreateEvidenceUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateEvidenceUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateEvidenceUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateEvidenceUserResponse setEvidenceUserId(String evidenceUserId) {
        this.evidenceUserId = evidenceUserId;
        return this;
    }
    public String getEvidenceUserId() {
        return this.evidenceUserId;
    }

    public CreateEvidenceUserResponse setOutUserId(String outUserId) {
        this.outUserId = outUserId;
        return this;
    }
    public String getOutUserId() {
        return this.outUserId;
    }

}
