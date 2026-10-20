// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryHealthLocationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 纬度
    @NameInMap("lat")
    public String lat;

    // 经度
    @NameInMap("lng")
    public String lng;

    // 定位时间，格式 yyyy-MM-dd HH:mm:ss
    @NameInMap("location_time")
    public String locationTime;

    // 预留可扩展字段json
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryHealthLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthLocationResponse self = new QueryHealthLocationResponse();
        return TeaModel.build(map, self);
    }

    public QueryHealthLocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHealthLocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHealthLocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHealthLocationResponse setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public QueryHealthLocationResponse setLng(String lng) {
        this.lng = lng;
        return this;
    }
    public String getLng() {
        return this.lng;
    }

    public QueryHealthLocationResponse setLocationTime(String locationTime) {
        this.locationTime = locationTime;
        return this;
    }
    public String getLocationTime() {
        return this.locationTime;
    }

    public QueryHealthLocationResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
