// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentTaskCreditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // credit消耗
    @NameInMap("credits")
    public String credits;

    public static QueryAntcloudMarketingagentTaskCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentTaskCreditResponse self = new QueryAntcloudMarketingagentTaskCreditResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentTaskCreditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingagentTaskCreditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingagentTaskCreditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingagentTaskCreditResponse setCredits(String credits) {
        this.credits = credits;
        return this;
    }
    public String getCredits() {
        return this.credits;
    }

}
