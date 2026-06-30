// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevPositionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 经度
    @NameInMap("lng")
    public String lng;

    // 纬度
    @NameInMap("lat")
    public String lat;

    // 定位时间
    @NameInMap("gps_time")
    public String gpsTime;

    // json，扩展预留
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryTwevPositionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevPositionResponse self = new QueryTwevPositionResponse();
        return TeaModel.build(map, self);
    }

    public QueryTwevPositionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTwevPositionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTwevPositionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTwevPositionResponse setLng(String lng) {
        this.lng = lng;
        return this;
    }
    public String getLng() {
        return this.lng;
    }

    public QueryTwevPositionResponse setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public QueryTwevPositionResponse setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
        return this;
    }
    public String getGpsTime() {
        return this.gpsTime;
    }

    public QueryTwevPositionResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
