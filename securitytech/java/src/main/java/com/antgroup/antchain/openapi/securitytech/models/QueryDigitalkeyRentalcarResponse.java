// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyRentalcarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 车架号
    @NameInMap("frame_no")
    public String frameNo;

    // 中控编号
    @NameInMap("tuid")
    public String tuid;

    // 在线状态：online/offline
    @NameInMap("online_status")
    public String onlineStatus;

    // 经度（WGS84）
    @NameInMap("longitude")
    public String longitude;

    // 纬度（WGS84）
    @NameInMap("latitude")
    public String latitude;

    // 启动状态（0-断电; 1-上电）
    @NameInMap("running_status")
    public String runningStatus;

    public static QueryDigitalkeyRentalcarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyRentalcarResponse self = new QueryDigitalkeyRentalcarResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyRentalcarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalkeyRentalcarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalkeyRentalcarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalkeyRentalcarResponse setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public QueryDigitalkeyRentalcarResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryDigitalkeyRentalcarResponse setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }
    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    public QueryDigitalkeyRentalcarResponse setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public QueryDigitalkeyRentalcarResponse setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public QueryDigitalkeyRentalcarResponse setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }
    public String getRunningStatus() {
        return this.runningStatus;
    }

}
