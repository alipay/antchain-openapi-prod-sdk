// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCrowdriskSumResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询企业的影响金额之和
    @NameInMap("money_involved")
    public Long moneyInvolved;

    // 查询企业的影响人数之和
    @NameInMap("people_involved")
    public Long peopleInvolved;

    public static QueryRtopCrowdriskSumResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCrowdriskSumResponse self = new QueryRtopCrowdriskSumResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCrowdriskSumResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCrowdriskSumResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCrowdriskSumResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCrowdriskSumResponse setMoneyInvolved(Long moneyInvolved) {
        this.moneyInvolved = moneyInvolved;
        return this;
    }
    public Long getMoneyInvolved() {
        return this.moneyInvolved;
    }

    public QueryRtopCrowdriskSumResponse setPeopleInvolved(Long peopleInvolved) {
        this.peopleInvolved = peopleInvolved;
        return this;
    }
    public Long getPeopleInvolved() {
        return this.peopleInvolved;
    }

}
