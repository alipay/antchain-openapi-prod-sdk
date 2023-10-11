// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_aafd16538edd4fc0ab50acd01355adb6.models;

import com.aliyun.tea.*;

public class SyncBlockchainTaxRiskEvaluationResponse extends TeaModel {
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

    public static SyncBlockchainTaxRiskEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncBlockchainTaxRiskEvaluationResponse self = new SyncBlockchainTaxRiskEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public SyncBlockchainTaxRiskEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncBlockchainTaxRiskEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncBlockchainTaxRiskEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncBlockchainTaxRiskEvaluationResponse setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public SyncBlockchainTaxRiskEvaluationResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
