// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerAgreementterminateconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商家处理超时时长-HOUR类型时长
    @NameInMap("timeout_hour")
    public String timeoutHour;

    // 商家处理超时时长-DAY类型时长
    @NameInMap("timeout_day")
    public String timeoutDay;

    public static QueryInnerAgreementterminateconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAgreementterminateconfigResponse self = new QueryInnerAgreementterminateconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerAgreementterminateconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerAgreementterminateconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerAgreementterminateconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerAgreementterminateconfigResponse setTimeoutHour(String timeoutHour) {
        this.timeoutHour = timeoutHour;
        return this;
    }
    public String getTimeoutHour() {
        return this.timeoutHour;
    }

    public QueryInnerAgreementterminateconfigResponse setTimeoutDay(String timeoutDay) {
        this.timeoutDay = timeoutDay;
        return this;
    }
    public String getTimeoutDay() {
        return this.timeoutDay;
    }

}
