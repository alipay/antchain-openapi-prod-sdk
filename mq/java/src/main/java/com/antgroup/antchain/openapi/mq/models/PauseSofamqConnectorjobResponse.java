// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PauseSofamqConnectorjobResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static PauseSofamqConnectorjobResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseSofamqConnectorjobResponse self = new PauseSofamqConnectorjobResponse();
        return TeaModel.build(map, self);
    }

    public PauseSofamqConnectorjobResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PauseSofamqConnectorjobResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PauseSofamqConnectorjobResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PauseSofamqConnectorjobResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
