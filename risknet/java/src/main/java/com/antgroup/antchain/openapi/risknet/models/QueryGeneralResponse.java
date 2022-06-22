// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.risknet.models;

import com.aliyun.tea.*;

public class QueryGeneralResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 测试结果
    @NameInMap("risk_result")
    public String riskResult;

    // 风险咨询结果描述
    @NameInMap("risk_result_desc")
    public String riskResultDesc;

    public static QueryGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGeneralResponse self = new QueryGeneralResponse();
        return TeaModel.build(map, self);
    }

    public QueryGeneralResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGeneralResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGeneralResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGeneralResponse setRiskResult(String riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public String getRiskResult() {
        return this.riskResult;
    }

    public QueryGeneralResponse setRiskResultDesc(String riskResultDesc) {
        this.riskResultDesc = riskResultDesc;
        return this;
    }
    public String getRiskResultDesc() {
        return this.riskResultDesc;
    }

}
