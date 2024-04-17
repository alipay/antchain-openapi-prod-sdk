// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpRobotcallStatisticinfoResponse extends TeaModel {
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
    public String callRate;

    // 接通率
    @NameInMap("connect_rate")
    public String connectRate;

    public static QueryQmpRobotcallStatisticinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpRobotcallStatisticinfoResponse self = new QueryQmpRobotcallStatisticinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpRobotcallStatisticinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpRobotcallStatisticinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpRobotcallStatisticinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpRobotcallStatisticinfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryQmpRobotcallStatisticinfoResponse setCallCount(Long callCount) {
        this.callCount = callCount;
        return this;
    }
    public Long getCallCount() {
        return this.callCount;
    }

    public QueryQmpRobotcallStatisticinfoResponse setCalleeCount(Long calleeCount) {
        this.calleeCount = calleeCount;
        return this;
    }
    public Long getCalleeCount() {
        return this.calleeCount;
    }

    public QueryQmpRobotcallStatisticinfoResponse setConnectCount(Long connectCount) {
        this.connectCount = connectCount;
        return this;
    }
    public Long getConnectCount() {
        return this.connectCount;
    }

    public QueryQmpRobotcallStatisticinfoResponse setCallRate(String callRate) {
        this.callRate = callRate;
        return this;
    }
    public String getCallRate() {
        return this.callRate;
    }

    public QueryQmpRobotcallStatisticinfoResponse setConnectRate(String connectRate) {
        this.connectRate = connectRate;
        return this;
    }
    public String getConnectRate() {
        return this.connectRate;
    }

}
