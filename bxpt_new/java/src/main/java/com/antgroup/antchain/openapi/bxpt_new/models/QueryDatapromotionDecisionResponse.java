// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class QueryDatapromotionDecisionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务出参JSON字符串
    @NameInMap("biz_result")
    public String bizResult;

    public static QueryDatapromotionDecisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatapromotionDecisionResponse self = new QueryDatapromotionDecisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatapromotionDecisionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatapromotionDecisionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatapromotionDecisionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatapromotionDecisionResponse setBizResult(String bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public String getBizResult() {
        return this.bizResult;
    }

}
