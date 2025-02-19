// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ResumeTradeUserpromiseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单重启时间
    @NameInMap("resume_day")
    public String resumeDay;

    // withhold_restart_day
    @NameInMap("withhold_restart_day")
    public String withholdRestartDay;

    public static ResumeTradeUserpromiseResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTradeUserpromiseResponse self = new ResumeTradeUserpromiseResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTradeUserpromiseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ResumeTradeUserpromiseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResumeTradeUserpromiseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResumeTradeUserpromiseResponse setResumeDay(String resumeDay) {
        this.resumeDay = resumeDay;
        return this;
    }
    public String getResumeDay() {
        return this.resumeDay;
    }

    public ResumeTradeUserpromiseResponse setWithholdRestartDay(String withholdRestartDay) {
        this.withholdRestartDay = withholdRestartDay;
        return this;
    }
    public String getWithholdRestartDay() {
        return this.withholdRestartDay;
    }

}
