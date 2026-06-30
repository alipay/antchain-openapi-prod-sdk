// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryTdiquickmsgRobotcallStatisticinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 全量手机号数量
    @NameInMap("total_count")
    public Long totalCount;

    // 累计拨打次数
    @NameInMap("call_count")
    public Long callCount;

    // 已经拨打的手机号数量
    @NameInMap("callee_count")
    public String calleeCount;

    // 已拨打次数中接通的数量
    @NameInMap("connect_count")
    public Long connectCount;

    // 拨打率
    @NameInMap("call_rate")
    public String callRate;

    // 接通率
    @NameInMap("connect_rate")
    public String connectRate;

    public static QueryTdiquickmsgRobotcallStatisticinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTdiquickmsgRobotcallStatisticinfoResponse self = new QueryTdiquickmsgRobotcallStatisticinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setCallCount(Long callCount) {
        this.callCount = callCount;
        return this;
    }
    public Long getCallCount() {
        return this.callCount;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setCalleeCount(String calleeCount) {
        this.calleeCount = calleeCount;
        return this;
    }
    public String getCalleeCount() {
        return this.calleeCount;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setConnectCount(Long connectCount) {
        this.connectCount = connectCount;
        return this;
    }
    public Long getConnectCount() {
        return this.connectCount;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setCallRate(String callRate) {
        this.callRate = callRate;
        return this;
    }
    public String getCallRate() {
        return this.callRate;
    }

    public QueryTdiquickmsgRobotcallStatisticinfoResponse setConnectRate(String connectRate) {
        this.connectRate = connectRate;
        return this;
    }
    public String getConnectRate() {
        return this.connectRate;
    }

}
