// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorjobdelayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 延迟详情
    @NameInMap("delay_detail")
    public java.util.List<DelayInfo> delayDetail;

    // 报错报告
    @NameInMap("error_detail")
    public ErrorReport errorDetail;

    public static QuerySofamqConnectorjobdelayResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorjobdelayResponse self = new QuerySofamqConnectorjobdelayResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorjobdelayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorjobdelayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorjobdelayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorjobdelayResponse setDelayDetail(java.util.List<DelayInfo> delayDetail) {
        this.delayDetail = delayDetail;
        return this;
    }
    public java.util.List<DelayInfo> getDelayDetail() {
        return this.delayDetail;
    }

    public QuerySofamqConnectorjobdelayResponse setErrorDetail(ErrorReport errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ErrorReport getErrorDetail() {
        return this.errorDetail;
    }

}
