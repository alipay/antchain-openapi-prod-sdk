// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTriplastResponse extends TeaModel {
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

    // {
    // "startTime":1733841600000,
    // "tripId":"T20251210140000001",
    // "endTime":1733845200000,
    // "mileage":36.8,
    // "duration":{
    // "value":"79",
    // "unit":"h"
    // },
    // "maxSpeed":85.5,
    // "avgSpeed":36.8,
    // "firstAddress":"上海市浦东新区张江高科技园区博云路",
    // "lastAddress":"上海市徐汇区漕河泾开发区桂平路",
    // "firstLocationTime":1733841605000,
    // "lastLocationTime":1733845195000
    // }
    @NameInMap("last_trip_detail")
    public TripDetail lastTripDetail;

    public static QueryElectrocarTriplastResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTriplastResponse self = new QueryElectrocarTriplastResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTriplastResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarTriplastResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarTriplastResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarTriplastResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarTriplastResponse setLastTripDetail(TripDetail lastTripDetail) {
        this.lastTripDetail = lastTripDetail;
        return this;
    }
    public TripDetail getLastTripDetail() {
        return this.lastTripDetail;
    }

}
