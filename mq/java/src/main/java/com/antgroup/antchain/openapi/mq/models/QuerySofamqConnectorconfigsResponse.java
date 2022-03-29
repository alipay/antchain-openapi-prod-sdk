// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorconfigsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 该任务 来源或去向的配置信息，包括是否可以修改，已经每个配置项如何修改的控件
    @NameInMap("configs")
    public java.util.List<UIControlModel> configs;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectorconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorconfigsResponse self = new QuerySofamqConnectorconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorconfigsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorconfigsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorconfigsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorconfigsResponse setConfigs(java.util.List<UIControlModel> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<UIControlModel> getConfigs() {
        return this.configs;
    }

    public QuerySofamqConnectorconfigsResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
