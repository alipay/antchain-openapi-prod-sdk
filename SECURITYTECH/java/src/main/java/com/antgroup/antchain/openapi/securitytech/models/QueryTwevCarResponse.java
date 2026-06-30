// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevCarResponse extends TeaModel {
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

    // 车架号
    @NameInMap("frame_no")
    public String frameNo;

    // 在线状态 在线：ON_LINE/离线：OFF_LINE
    @NameInMap("running_status")
    public String runningStatus;

    // 启动状态 启动：ON/熄火：OFF
    @NameInMap("power_status")
    public String powerStatus;

    // 经度
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    @NameInMap("latitude")
    public String latitude;

    // 预留扩展字段 json
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryTwevCarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevCarResponse self = new QueryTwevCarResponse();
        return TeaModel.build(map, self);
    }

    public QueryTwevCarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTwevCarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTwevCarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTwevCarResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevCarResponse setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public QueryTwevCarResponse setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }
    public String getRunningStatus() {
        return this.runningStatus;
    }

    public QueryTwevCarResponse setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
        return this;
    }
    public String getPowerStatus() {
        return this.powerStatus;
    }

    public QueryTwevCarResponse setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public QueryTwevCarResponse setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public QueryTwevCarResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
