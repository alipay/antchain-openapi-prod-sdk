// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevCardataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 行程统计数据列表
    @NameInMap("trip_statistics")
    public TripStatisticInfo tripStatistics;

    public static QueryTwevCardataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevCardataResponse self = new QueryTwevCardataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTwevCardataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTwevCardataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTwevCardataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTwevCardataResponse setTripStatistics(TripStatisticInfo tripStatistics) {
        this.tripStatistics = tripStatistics;
        return this;
    }
    public TripStatisticInfo getTripStatistics() {
        return this.tripStatistics;
    }

}
