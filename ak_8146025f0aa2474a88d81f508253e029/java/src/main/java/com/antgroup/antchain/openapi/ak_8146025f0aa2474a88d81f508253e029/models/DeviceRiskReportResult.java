// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_8146025f0aa2474a88d81f508253e029.models;

import com.aliyun.tea.*;

public class DeviceRiskReportResult extends TeaModel {
    // success
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // result_code
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // result_status
    @NameInMap("result_status")
    @Validation(required = true)
    public String resultStatus;

    // apdid
    @NameInMap("apdid")
    @Validation(required = true)
    public String apdid;

    // token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // current_time
    @NameInMap("current_time")
    @Validation(required = true)
    public String currentTime;

    // version
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // vkey_switch
    @NameInMap("vkey_switch")
    @Validation(required = true)
    public String vkeySwitch;

    // bug_track_switch
    @NameInMap("bug_track_switch")
    @Validation(required = true)
    public String bugTrackSwitch;

    // app_list_ver
    @NameInMap("app_list_ver")
    @Validation(required = true)
    public String appListVer;

    // dynamic_key
    @NameInMap("dynamic_key")
    @Validation(required = true)
    public String dynamicKey;

    // result_data
    @NameInMap("result_data")
    @Validation(required = true)
    public DeviceRiskReportResultData resultData;

    public static DeviceRiskReportResult build(java.util.Map<String, ?> map) throws Exception {
        DeviceRiskReportResult self = new DeviceRiskReportResult();
        return TeaModel.build(map, self);
    }

    public DeviceRiskReportResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeviceRiskReportResult setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeviceRiskReportResult setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public String getResultStatus() {
        return this.resultStatus;
    }

    public DeviceRiskReportResult setApdid(String apdid) {
        this.apdid = apdid;
        return this;
    }
    public String getApdid() {
        return this.apdid;
    }

    public DeviceRiskReportResult setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DeviceRiskReportResult setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public String getCurrentTime() {
        return this.currentTime;
    }

    public DeviceRiskReportResult setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DeviceRiskReportResult setVkeySwitch(String vkeySwitch) {
        this.vkeySwitch = vkeySwitch;
        return this;
    }
    public String getVkeySwitch() {
        return this.vkeySwitch;
    }

    public DeviceRiskReportResult setBugTrackSwitch(String bugTrackSwitch) {
        this.bugTrackSwitch = bugTrackSwitch;
        return this;
    }
    public String getBugTrackSwitch() {
        return this.bugTrackSwitch;
    }

    public DeviceRiskReportResult setAppListVer(String appListVer) {
        this.appListVer = appListVer;
        return this;
    }
    public String getAppListVer() {
        return this.appListVer;
    }

    public DeviceRiskReportResult setDynamicKey(String dynamicKey) {
        this.dynamicKey = dynamicKey;
        return this;
    }
    public String getDynamicKey() {
        return this.dynamicKey;
    }

    public DeviceRiskReportResult setResultData(DeviceRiskReportResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public DeviceRiskReportResultData getResultData() {
        return this.resultData;
    }

}
