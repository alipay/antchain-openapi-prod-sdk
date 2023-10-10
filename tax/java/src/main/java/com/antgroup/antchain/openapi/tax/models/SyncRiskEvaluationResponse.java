// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class SyncRiskEvaluationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1322324243	unix秒时间戳,查询时间，用来对账使用
    @NameInMap("query_time")
    public String queryTime;

    // 内容，List<JsonObject>
    @NameInMap("biz_content")
    public String bizContent;

    public static SyncRiskEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRiskEvaluationResponse self = new SyncRiskEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public SyncRiskEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncRiskEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncRiskEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncRiskEvaluationResponse setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public SyncRiskEvaluationResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
