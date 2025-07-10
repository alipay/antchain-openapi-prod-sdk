// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdpapi.models;

import com.aliyun.tea.*;

public class BatchqueryscoreAntdigitalMdpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户 id 与分数的对应关系
    @NameInMap("scores")
    public java.util.List<String> scores;

    public static BatchqueryscoreAntdigitalMdpResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryscoreAntdigitalMdpResponse self = new BatchqueryscoreAntdigitalMdpResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryscoreAntdigitalMdpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryscoreAntdigitalMdpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryscoreAntdigitalMdpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryscoreAntdigitalMdpResponse setScores(java.util.List<String> scores) {
        this.scores = scores;
        return this;
    }
    public java.util.List<String> getScores() {
        return this.scores;
    }

}
