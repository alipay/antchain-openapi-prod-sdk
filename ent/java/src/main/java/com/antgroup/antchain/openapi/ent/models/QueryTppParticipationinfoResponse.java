// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryTppParticipationinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 累计参与用户数
    @NameInMap("accumulative_users")
    public Long accumulativeUsers;

    // 累计全部参与收益
    @NameInMap("accumulative_revenue")
    public AccumulativeRevenue accumulativeRevenue;

    public static QueryTppParticipationinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTppParticipationinfoResponse self = new QueryTppParticipationinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTppParticipationinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTppParticipationinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTppParticipationinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTppParticipationinfoResponse setAccumulativeUsers(Long accumulativeUsers) {
        this.accumulativeUsers = accumulativeUsers;
        return this;
    }
    public Long getAccumulativeUsers() {
        return this.accumulativeUsers;
    }

    public QueryTppParticipationinfoResponse setAccumulativeRevenue(AccumulativeRevenue accumulativeRevenue) {
        this.accumulativeRevenue = accumulativeRevenue;
        return this;
    }
    public AccumulativeRevenue getAccumulativeRevenue() {
        return this.accumulativeRevenue;
    }

}
