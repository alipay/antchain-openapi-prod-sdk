// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectortriggerconfigsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页面渲染配置
    @NameInMap("configs")
    public java.util.List<UIControlModel> configs;

    // 错误报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectortriggerconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectortriggerconfigsResponse self = new QuerySofamqConnectortriggerconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectortriggerconfigsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectortriggerconfigsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectortriggerconfigsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectortriggerconfigsResponse setConfigs(java.util.List<UIControlModel> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<UIControlModel> getConfigs() {
        return this.configs;
    }

    public QuerySofamqConnectortriggerconfigsResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
