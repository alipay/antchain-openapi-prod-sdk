// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorjobpartitionstatuscolumnResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 列名称
    @NameInMap("column_name")
    public java.util.List<ColumnName> columnName;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectorjobpartitionstatuscolumnResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorjobpartitionstatuscolumnResponse self = new QuerySofamqConnectorjobpartitionstatuscolumnResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnResponse setColumnName(java.util.List<ColumnName> columnName) {
        this.columnName = columnName;
        return this;
    }
    public java.util.List<ColumnName> getColumnName() {
        return this.columnName;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
