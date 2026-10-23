// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryAdvisormarketAnalysisResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // JSON 数组字符串，调用方需再次解析。示例：[{"task_id":"ana_01K5A1B2","display_name":"中心商圈","analysis_type":"YINLI_CROWD_ANALYSIS","status":"PROCESSING","result_url":null,"created_at":"2026-09-14 15:30:00"}]。无数据返回 []；仅 SUCCESS 任务的结果查询会返回 result_url。
    @NameInMap("data")
    public String data;

    public static QueryAdvisormarketAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvisormarketAnalysisResponse self = new QueryAdvisormarketAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdvisormarketAnalysisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAdvisormarketAnalysisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAdvisormarketAnalysisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAdvisormarketAnalysisResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
