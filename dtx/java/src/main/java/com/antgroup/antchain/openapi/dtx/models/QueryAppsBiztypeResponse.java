// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class QueryAppsBiztypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 异库模式更新信息
    @NameInMap("asyn_info")
    public AsynDbTxInfo asynInfo;

    // Saga状态机的json定义
    @NameInMap("content")
    public String content;

    // initiator
    @NameInMap("initiator")
    public Initiator initiator;

    // participators
    @NameInMap("participators")
    public java.util.List<Participator> participators;

    public static QueryAppsBiztypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppsBiztypeResponse self = new QueryAppsBiztypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppsBiztypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppsBiztypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppsBiztypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppsBiztypeResponse setAsynInfo(AsynDbTxInfo asynInfo) {
        this.asynInfo = asynInfo;
        return this;
    }
    public AsynDbTxInfo getAsynInfo() {
        return this.asynInfo;
    }

    public QueryAppsBiztypeResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryAppsBiztypeResponse setInitiator(Initiator initiator) {
        this.initiator = initiator;
        return this;
    }
    public Initiator getInitiator() {
        return this.initiator;
    }

    public QueryAppsBiztypeResponse setParticipators(java.util.List<Participator> participators) {
        this.participators = participators;
        return this;
    }
    public java.util.List<Participator> getParticipators() {
        return this.participators;
    }

}
