// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CancelSofamqConnectorplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 报错报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static CancelSofamqConnectorplanResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSofamqConnectorplanResponse self = new CancelSofamqConnectorplanResponse();
        return TeaModel.build(map, self);
    }

    public CancelSofamqConnectorplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelSofamqConnectorplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelSofamqConnectorplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelSofamqConnectorplanResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
