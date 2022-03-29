// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorjobpartitionstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分区分页状态
    @NameInMap("data")
    public ConnectorJobPartitionStatusPageResult data;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectorjobpartitionstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorjobpartitionstatusResponse self = new QuerySofamqConnectorjobpartitionstatusResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorjobpartitionstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorjobpartitionstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorjobpartitionstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorjobpartitionstatusResponse setData(ConnectorJobPartitionStatusPageResult data) {
        this.data = data;
        return this;
    }
    public ConnectorJobPartitionStatusPageResult getData() {
        return this.data;
    }

    public QuerySofamqConnectorjobpartitionstatusResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
