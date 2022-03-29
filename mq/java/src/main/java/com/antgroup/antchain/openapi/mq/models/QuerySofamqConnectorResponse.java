// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 连接器任务实体
    @NameInMap("data")
    public ConnectorJob data;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorResponse self = new QuerySofamqConnectorResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorResponse setData(ConnectorJob data) {
        this.data = data;
        return this;
    }
    public ConnectorJob getData() {
        return this.data;
    }

    public QuerySofamqConnectorResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
