// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTripstatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("success")
    public Boolean success;

    // [{总里程、总用时、总次数、 时期码}，{总里程、总用时、总次数、 时期码}，......] 
    // 备注：返回前八个加上当前共九个的统计数据（按时间正排）
    // 时期码说明：
    // 月维度：
    // eg1: 12，11，10，9... 
    // eg2: 3, 2, 1, 12（去年12月）, 11...
    // 周维度：
    // eg1: 52，51，50，49...
    // eg2: 3，2，1，52（去年最后一周）， 51...
    // 日维度：
    // eg1: 30，29，28，27...
    // eg2: 3，2，1，30（上个月最后一天），29...
    @NameInMap("trip_statistics")
    public java.util.List<TripStatistics> tripStatistics;

    public static QueryElectrocarTripstatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTripstatisticsResponse self = new QueryElectrocarTripstatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTripstatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarTripstatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarTripstatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarTripstatisticsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarTripstatisticsResponse setTripStatistics(java.util.List<TripStatistics> tripStatistics) {
        this.tripStatistics = tripStatistics;
        return this;
    }
    public java.util.List<TripStatistics> getTripStatistics() {
        return this.tripStatistics;
    }

}
