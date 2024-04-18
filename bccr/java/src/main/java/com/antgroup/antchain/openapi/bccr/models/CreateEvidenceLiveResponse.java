// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceLiveResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 直播取证id
    @NameInMap("evidence_id")
    public String evidenceId;

    public static CreateEvidenceLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceLiveResponse self = new CreateEvidenceLiveResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceLiveResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateEvidenceLiveResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateEvidenceLiveResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateEvidenceLiveResponse setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

}
