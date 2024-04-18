// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceVodResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 取证编号
    @NameInMap("evidence_id")
    public String evidenceId;

    public static CreateEvidenceVodResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceVodResponse self = new CreateEvidenceVodResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceVodResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateEvidenceVodResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateEvidenceVodResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateEvidenceVodResponse setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

}
