// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryLeagueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 联盟信息
    @NameInMap("league")
    public LeagueInfo league;

    // 时间
    @NameInMap("date")
    public Long date;

    // 请求标识
    @NameInMap("request_id")
    public String requestId;

    public static QueryLeagueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeagueResponse self = new QueryLeagueResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeagueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeagueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeagueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeagueResponse setLeague(LeagueInfo league) {
        this.league = league;
        return this;
    }
    public LeagueInfo getLeague() {
        return this.league;
    }

    public QueryLeagueResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public QueryLeagueResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
