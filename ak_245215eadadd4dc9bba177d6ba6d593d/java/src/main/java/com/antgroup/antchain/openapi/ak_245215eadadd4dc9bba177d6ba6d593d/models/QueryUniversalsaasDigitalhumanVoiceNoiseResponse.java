// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanVoiceNoiseResponse extends TeaModel {
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

    // 音色检测结果
    @NameInMap("data")
    public NoiseResult data;

    public static QueryUniversalsaasDigitalhumanVoiceNoiseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanVoiceNoiseResponse self = new QueryUniversalsaasDigitalhumanVoiceNoiseResponse();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public QueryUniversalsaasDigitalhumanVoiceNoiseResponse setData(NoiseResult data) {
        this.data = data;
        return this;
    }
    public NoiseResult getData() {
        return this.data;
    }

}
