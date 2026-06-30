// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeUserAggregationinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户聚合状态信息
    @NameInMap("user_aggregation_info")
    public UserAggregationInfo userAggregationInfo;

    public static QueryDubbridgeUserAggregationinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeUserAggregationinfoResponse self = new QueryDubbridgeUserAggregationinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeUserAggregationinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeUserAggregationinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeUserAggregationinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeUserAggregationinfoResponse setUserAggregationInfo(UserAggregationInfo userAggregationInfo) {
        this.userAggregationInfo = userAggregationInfo;
        return this;
    }
    public UserAggregationInfo getUserAggregationInfo() {
        return this.userAggregationInfo;
    }

}
