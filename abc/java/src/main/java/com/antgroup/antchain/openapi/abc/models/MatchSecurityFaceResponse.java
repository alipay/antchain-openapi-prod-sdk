// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class MatchSecurityFaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 123
    @NameInMap("transaction_id")
    public String transactionId;

    // 123
    @NameInMap("same_person")
    public String samePerson;

    // 123
    @NameInMap("score")
    public String score;

    public static MatchSecurityFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        MatchSecurityFaceResponse self = new MatchSecurityFaceResponse();
        return TeaModel.build(map, self);
    }

    public MatchSecurityFaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public MatchSecurityFaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MatchSecurityFaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public MatchSecurityFaceResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public MatchSecurityFaceResponse setSamePerson(String samePerson) {
        this.samePerson = samePerson;
        return this;
    }
    public String getSamePerson() {
        return this.samePerson;
    }

    public MatchSecurityFaceResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
