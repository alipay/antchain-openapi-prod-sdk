// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SubmitDeviceriskReportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // success
    @NameInMap("success")
    public Boolean success;

    // apdid
    @NameInMap("apdid")
    public String apdid;

    // token
    @NameInMap("token")
    public String token;

    // current_time
    @NameInMap("current_time")
    public String currentTime;

    // version
    @NameInMap("version")
    public String version;

    // vkey_switch
    @NameInMap("vkey_switch")
    public String vkeySwitch;

    // bug_track_switch
    @NameInMap("bug_track_switch")
    public String bugTrackSwitch;

    // app_list_ver
    @NameInMap("app_list_ver")
    public String appListVer;

    // dynamic_key
    @NameInMap("dynamic_key")
    public String dynamicKey;

    // result_data
    @NameInMap("result_data")
    public DeviceRiskReportResultData resultData;

    public static SubmitDeviceriskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeviceriskReportResponse self = new SubmitDeviceriskReportResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDeviceriskReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitDeviceriskReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitDeviceriskReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitDeviceriskReportResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitDeviceriskReportResponse setApdid(String apdid) {
        this.apdid = apdid;
        return this;
    }
    public String getApdid() {
        return this.apdid;
    }

    public SubmitDeviceriskReportResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SubmitDeviceriskReportResponse setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public String getCurrentTime() {
        return this.currentTime;
    }

    public SubmitDeviceriskReportResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SubmitDeviceriskReportResponse setVkeySwitch(String vkeySwitch) {
        this.vkeySwitch = vkeySwitch;
        return this;
    }
    public String getVkeySwitch() {
        return this.vkeySwitch;
    }

    public SubmitDeviceriskReportResponse setBugTrackSwitch(String bugTrackSwitch) {
        this.bugTrackSwitch = bugTrackSwitch;
        return this;
    }
    public String getBugTrackSwitch() {
        return this.bugTrackSwitch;
    }

    public SubmitDeviceriskReportResponse setAppListVer(String appListVer) {
        this.appListVer = appListVer;
        return this;
    }
    public String getAppListVer() {
        return this.appListVer;
    }

    public SubmitDeviceriskReportResponse setDynamicKey(String dynamicKey) {
        this.dynamicKey = dynamicKey;
        return this;
    }
    public String getDynamicKey() {
        return this.dynamicKey;
    }

    public SubmitDeviceriskReportResponse setResultData(DeviceRiskReportResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public DeviceRiskReportResultData getResultData() {
        return this.resultData;
    }

}
