// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_8146025f0aa2474a88d81f508253e029.models;

import com.aliyun.tea.*;

public class SubmitHksecuritytechGatewayDeviceriskReportResponse extends TeaModel {
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

    public static SubmitHksecuritytechGatewayDeviceriskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHksecuritytechGatewayDeviceriskReportResponse self = new SubmitHksecuritytechGatewayDeviceriskReportResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setApdid(String apdid) {
        this.apdid = apdid;
        return this;
    }
    public String getApdid() {
        return this.apdid;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public String getCurrentTime() {
        return this.currentTime;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setVkeySwitch(String vkeySwitch) {
        this.vkeySwitch = vkeySwitch;
        return this;
    }
    public String getVkeySwitch() {
        return this.vkeySwitch;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setBugTrackSwitch(String bugTrackSwitch) {
        this.bugTrackSwitch = bugTrackSwitch;
        return this;
    }
    public String getBugTrackSwitch() {
        return this.bugTrackSwitch;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setAppListVer(String appListVer) {
        this.appListVer = appListVer;
        return this;
    }
    public String getAppListVer() {
        return this.appListVer;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setDynamicKey(String dynamicKey) {
        this.dynamicKey = dynamicKey;
        return this;
    }
    public String getDynamicKey() {
        return this.dynamicKey;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResultData(DeviceRiskReportResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public DeviceRiskReportResultData getResultData() {
        return this.resultData;
    }

}
