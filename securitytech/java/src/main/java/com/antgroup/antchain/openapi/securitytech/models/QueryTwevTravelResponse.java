// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevTravelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 中控号
    @NameInMap("tuid")
    public String tuid;

    // 轨迹点gps集合
    @NameInMap("locations")
    public java.util.List<SimCarLocationInfo> locations;

    // 预留扩展字段 json
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryTwevTravelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevTravelResponse self = new QueryTwevTravelResponse();
        return TeaModel.build(map, self);
    }

    public QueryTwevTravelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTwevTravelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTwevTravelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTwevTravelResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevTravelResponse setLocations(java.util.List<SimCarLocationInfo> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<SimCarLocationInfo> getLocations() {
        return this.locations;
    }

    public QueryTwevTravelResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
