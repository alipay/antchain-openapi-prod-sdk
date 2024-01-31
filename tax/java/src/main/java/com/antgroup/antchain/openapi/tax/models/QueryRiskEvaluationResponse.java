// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryRiskEvaluationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // unix秒时间戳,查询时间，用来对账使用
    @NameInMap("query_time")
    public String queryTime;

    // 是否查的，空数据标识
    @NameInMap("null_data_flag")
    public Boolean nullDataFlag;

    public static QueryRiskEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskEvaluationResponse self = new QueryRiskEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskEvaluationResponse setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public QueryRiskEvaluationResponse setNullDataFlag(Boolean nullDataFlag) {
        this.nullDataFlag = nullDataFlag;
        return this;
    }
    public Boolean getNullDataFlag() {
        return this.nullDataFlag;
    }

}
