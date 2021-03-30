// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryScreenshotResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 取证id
    @NameInMap("evidence_id")
    public String evidenceId;

    // 取证状态
    @NameInMap("status")
    public String status;

    // 网页截图信息
    @NameInMap("data")
    public ScreenshotData data;

    public static QueryScreenshotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScreenshotResponse self = new QueryScreenshotResponse();
        return TeaModel.build(map, self);
    }

    public QueryScreenshotResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryScreenshotResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryScreenshotResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryScreenshotResponse setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public QueryScreenshotResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryScreenshotResponse setData(ScreenshotData data) {
        this.data = data;
        return this;
    }
    public ScreenshotData getData() {
        return this.data;
    }

}
