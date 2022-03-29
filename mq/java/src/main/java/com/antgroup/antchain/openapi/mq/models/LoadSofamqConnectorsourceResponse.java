// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class LoadSofamqConnectorsourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 来源的数据结构信息，包括名称、类型、别名、转化类型
    @NameInMap("data")
    public java.util.List<ColumnConfig> data;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static LoadSofamqConnectorsourceResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadSofamqConnectorsourceResponse self = new LoadSofamqConnectorsourceResponse();
        return TeaModel.build(map, self);
    }

    public LoadSofamqConnectorsourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LoadSofamqConnectorsourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LoadSofamqConnectorsourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LoadSofamqConnectorsourceResponse setData(java.util.List<ColumnConfig> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ColumnConfig> getData() {
        return this.data;
    }

    public LoadSofamqConnectorsourceResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
