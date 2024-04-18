// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceRecordscreenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 录屏取证操作url
    @NameInMap("record_screen_url")
    public String recordScreenUrl;

    // 取证id
    @NameInMap("evidence_id")
    public String evidenceId;

    public static CreateEvidenceRecordscreenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceRecordscreenResponse self = new CreateEvidenceRecordscreenResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceRecordscreenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateEvidenceRecordscreenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateEvidenceRecordscreenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateEvidenceRecordscreenResponse setRecordScreenUrl(String recordScreenUrl) {
        this.recordScreenUrl = recordScreenUrl;
        return this;
    }
    public String getRecordScreenUrl() {
        return this.recordScreenUrl;
    }

    public CreateEvidenceRecordscreenResponse setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

}
