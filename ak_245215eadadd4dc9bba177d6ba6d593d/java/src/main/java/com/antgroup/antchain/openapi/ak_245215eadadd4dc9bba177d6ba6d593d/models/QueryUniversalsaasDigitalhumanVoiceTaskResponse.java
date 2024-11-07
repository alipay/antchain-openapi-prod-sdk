// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanVoiceTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果状态
    @NameInMap("status")
    public Boolean status;

    // 音频生成返回结果
    @NameInMap("data")
    public VoiceTask data;

    public static QueryUniversalsaasDigitalhumanVoiceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanVoiceTaskResponse self = new QueryUniversalsaasDigitalhumanVoiceTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanVoiceTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUniversalsaasDigitalhumanVoiceTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUniversalsaasDigitalhumanVoiceTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUniversalsaasDigitalhumanVoiceTaskResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public QueryUniversalsaasDigitalhumanVoiceTaskResponse setData(VoiceTask data) {
        this.data = data;
        return this;
    }
    public VoiceTask getData() {
        return this.data;
    }

}
