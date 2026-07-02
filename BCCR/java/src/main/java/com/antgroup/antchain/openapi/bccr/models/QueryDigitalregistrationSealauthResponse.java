// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDigitalregistrationSealauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否支持静默授权
    @NameInMap("is_auto_seal")
    public String isAutoSeal;

    public static QueryDigitalregistrationSealauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalregistrationSealauthResponse self = new QueryDigitalregistrationSealauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalregistrationSealauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalregistrationSealauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalregistrationSealauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalregistrationSealauthResponse setIsAutoSeal(String isAutoSeal) {
        this.isAutoSeal = isAutoSeal;
        return this;
    }
    public String getIsAutoSeal() {
        return this.isAutoSeal;
    }

}
