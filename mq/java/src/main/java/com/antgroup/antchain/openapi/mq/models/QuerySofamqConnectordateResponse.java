// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectordateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回该任务的执行计划的实例摘要
    @NameInMap("data")
    public java.util.List<InstanceDigest> data;

    // 时间列表
    @NameInMap("date_list")
    public java.util.List<String> dateList;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectordateResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectordateResponse self = new QuerySofamqConnectordateResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectordateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectordateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectordateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectordateResponse setData(java.util.List<InstanceDigest> data) {
        this.data = data;
        return this;
    }
    public java.util.List<InstanceDigest> getData() {
        return this.data;
    }

    public QuerySofamqConnectordateResponse setDateList(java.util.List<String> dateList) {
        this.dateList = dateList;
        return this;
    }
    public java.util.List<String> getDateList() {
        return this.dateList;
    }

    public QuerySofamqConnectordateResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
