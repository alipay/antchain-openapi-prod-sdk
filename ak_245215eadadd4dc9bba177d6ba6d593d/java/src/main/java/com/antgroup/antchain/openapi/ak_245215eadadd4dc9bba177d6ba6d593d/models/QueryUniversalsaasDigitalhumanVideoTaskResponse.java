// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanVideoTaskResponse extends TeaModel {
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

    // 合成结果
    @NameInMap("data")
    public VideoTask data;

    public static QueryUniversalsaasDigitalhumanVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanVideoTaskResponse self = new QueryUniversalsaasDigitalhumanVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanVideoTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUniversalsaasDigitalhumanVideoTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUniversalsaasDigitalhumanVideoTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUniversalsaasDigitalhumanVideoTaskResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public QueryUniversalsaasDigitalhumanVideoTaskResponse setData(VideoTask data) {
        this.data = data;
        return this;
    }
    public VideoTask getData() {
        return this.data;
    }

}
