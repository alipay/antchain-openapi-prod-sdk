// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ins_risk.models;

import com.aliyun.tea.*;

public class QueryScorePolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应结果
    @NameInMap("biz_result")
    public String bizResult;

    public static QueryScorePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScorePolicyResponse self = new QueryScorePolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryScorePolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryScorePolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryScorePolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryScorePolicyResponse setBizResult(String bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public String getBizResult() {
        return this.bizResult;
    }

}
