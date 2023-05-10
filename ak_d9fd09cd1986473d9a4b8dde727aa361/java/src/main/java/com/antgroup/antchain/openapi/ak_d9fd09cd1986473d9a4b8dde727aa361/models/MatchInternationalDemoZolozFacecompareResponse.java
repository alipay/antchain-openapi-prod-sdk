// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d9fd09cd1986473d9a4b8dde727aa361.models;

import com.aliyun.tea.*;

public class MatchInternationalDemoZolozFacecompareResponse extends TeaModel {
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
    public Boolean samePerson;

    // 100
    @NameInMap("score")
    public String score;

    public static MatchInternationalDemoZolozFacecompareResponse build(java.util.Map<String, ?> map) throws Exception {
        MatchInternationalDemoZolozFacecompareResponse self = new MatchInternationalDemoZolozFacecompareResponse();
        return TeaModel.build(map, self);
    }

    public MatchInternationalDemoZolozFacecompareResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public MatchInternationalDemoZolozFacecompareResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MatchInternationalDemoZolozFacecompareResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public MatchInternationalDemoZolozFacecompareResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public MatchInternationalDemoZolozFacecompareResponse setSamePerson(Boolean samePerson) {
        this.samePerson = samePerson;
        return this;
    }
    public Boolean getSamePerson() {
        return this.samePerson;
    }

    public MatchInternationalDemoZolozFacecompareResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
