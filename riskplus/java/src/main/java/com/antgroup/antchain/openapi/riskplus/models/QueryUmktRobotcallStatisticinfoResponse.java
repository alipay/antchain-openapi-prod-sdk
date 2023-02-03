// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktRobotcallStatisticinfoResponse extends TeaModel {
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
    public Long calleeCount;

    // 已拨打次数中接通的数量
    @NameInMap("connect_count")
    public Long connectCount;

    // 拨打率
    @NameInMap("call_rate")
    public Long callRate;

    // 接通率
    @NameInMap("connect_rate")
    public Long connectRate;

    public static QueryUmktRobotcallStatisticinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktRobotcallStatisticinfoResponse self = new QueryUmktRobotcallStatisticinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktRobotcallStatisticinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktRobotcallStatisticinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktRobotcallStatisticinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktRobotcallStatisticinfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUmktRobotcallStatisticinfoResponse setCallCount(Long callCount) {
        this.callCount = callCount;
        return this;
    }
    public Long getCallCount() {
        return this.callCount;
    }

    public QueryUmktRobotcallStatisticinfoResponse setCalleeCount(Long calleeCount) {
        this.calleeCount = calleeCount;
        return this;
    }
    public Long getCalleeCount() {
        return this.calleeCount;
    }

    public QueryUmktRobotcallStatisticinfoResponse setConnectCount(Long connectCount) {
        this.connectCount = connectCount;
        return this;
    }
    public Long getConnectCount() {
        return this.connectCount;
    }

    public QueryUmktRobotcallStatisticinfoResponse setCallRate(Long callRate) {
        this.callRate = callRate;
        return this;
    }
    public Long getCallRate() {
        return this.callRate;
    }

    public QueryUmktRobotcallStatisticinfoResponse setConnectRate(Long connectRate) {
        this.connectRate = connectRate;
        return this;
    }
    public Long getConnectRate() {
        return this.connectRate;
    }

}
