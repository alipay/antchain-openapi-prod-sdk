// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorplansingletonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实例详情
    @NameInMap("job_instance")
    public JobRecordDTO jobInstance;

    // 报错报告
    @NameInMap("error_report")
    public ErrorReport errorReport;

    public static QuerySofamqConnectorplansingletonResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorplansingletonResponse self = new QuerySofamqConnectorplansingletonResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorplansingletonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorplansingletonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorplansingletonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorplansingletonResponse setJobInstance(JobRecordDTO jobInstance) {
        this.jobInstance = jobInstance;
        return this;
    }
    public JobRecordDTO getJobInstance() {
        return this.jobInstance;
    }

    public QuerySofamqConnectorplansingletonResponse setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
        return this;
    }
    public ErrorReport getErrorReport() {
        return this.errorReport;
    }

}
