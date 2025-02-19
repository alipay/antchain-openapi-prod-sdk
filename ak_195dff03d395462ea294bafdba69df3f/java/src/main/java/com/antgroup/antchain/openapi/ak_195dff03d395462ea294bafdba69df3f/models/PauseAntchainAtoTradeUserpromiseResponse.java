// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class PauseAntchainAtoTradeUserpromiseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 暂停后自动重启时间
    @NameInMap("auto_resume_day")
    public String autoResumeDay;

    // 暂停后自动执行代扣时间，为autoResumeDay的第二天重新开始执行代扣计划
    @NameInMap("auto_withhold_restart_day")
    public String autoWithholdRestartDay;

    public static PauseAntchainAtoTradeUserpromiseResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseAntchainAtoTradeUserpromiseResponse self = new PauseAntchainAtoTradeUserpromiseResponse();
        return TeaModel.build(map, self);
    }

    public PauseAntchainAtoTradeUserpromiseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PauseAntchainAtoTradeUserpromiseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PauseAntchainAtoTradeUserpromiseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PauseAntchainAtoTradeUserpromiseResponse setAutoResumeDay(String autoResumeDay) {
        this.autoResumeDay = autoResumeDay;
        return this;
    }
    public String getAutoResumeDay() {
        return this.autoResumeDay;
    }

    public PauseAntchainAtoTradeUserpromiseResponse setAutoWithholdRestartDay(String autoWithholdRestartDay) {
        this.autoWithholdRestartDay = autoWithholdRestartDay;
        return this;
    }
    public String getAutoWithholdRestartDay() {
        return this.autoWithholdRestartDay;
    }

}
