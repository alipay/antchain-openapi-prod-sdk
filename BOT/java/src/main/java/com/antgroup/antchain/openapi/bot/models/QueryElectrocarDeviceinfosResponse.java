// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceinfosResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // trust_product_key
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // product_key
    @NameInMap("product_key")
    public String productKey;

    // trust_device_id
    @NameInMap("trust_device_id")
    public String trustDeviceId;

    // device_name
    @NameInMap("device_name")
    public String deviceName;

    // nick_name
    @NameInMap("nick_name")
    public String nickName;

    // device_status
    @NameInMap("device_status")
    public String deviceStatus;

    // device_register_time
    @NameInMap("device_register_time")
    public String deviceRegisterTime;

    // device_active_time
    @NameInMap("device_active_time")
    public String deviceActiveTime;

    // last_online_time
    @NameInMap("last_online_time")
    public String lastOnlineTime;

    // last_offline_time
    @NameInMap("last_offline_time")
    public String lastOfflineTime;

    // last_communication_time
    @NameInMap("last_communication_time")
    public String lastCommunicationTime;

    // device_ota_version
    @NameInMap("device_ota_version")
    public String deviceOtaVersion;

    public static QueryElectrocarDeviceinfosResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceinfosResponse self = new QueryElectrocarDeviceinfosResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceinfosResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarDeviceinfosResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarDeviceinfosResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarDeviceinfosResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarDeviceinfosResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryElectrocarDeviceinfosResponse setTrustDeviceId(String trustDeviceId) {
        this.trustDeviceId = trustDeviceId;
        return this;
    }
    public String getTrustDeviceId() {
        return this.trustDeviceId;
    }

    public QueryElectrocarDeviceinfosResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryElectrocarDeviceinfosResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public QueryElectrocarDeviceinfosResponse setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public QueryElectrocarDeviceinfosResponse setDeviceRegisterTime(String deviceRegisterTime) {
        this.deviceRegisterTime = deviceRegisterTime;
        return this;
    }
    public String getDeviceRegisterTime() {
        return this.deviceRegisterTime;
    }

    public QueryElectrocarDeviceinfosResponse setDeviceActiveTime(String deviceActiveTime) {
        this.deviceActiveTime = deviceActiveTime;
        return this;
    }
    public String getDeviceActiveTime() {
        return this.deviceActiveTime;
    }

    public QueryElectrocarDeviceinfosResponse setLastOnlineTime(String lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }
    public String getLastOnlineTime() {
        return this.lastOnlineTime;
    }

    public QueryElectrocarDeviceinfosResponse setLastOfflineTime(String lastOfflineTime) {
        this.lastOfflineTime = lastOfflineTime;
        return this;
    }
    public String getLastOfflineTime() {
        return this.lastOfflineTime;
    }

    public QueryElectrocarDeviceinfosResponse setLastCommunicationTime(String lastCommunicationTime) {
        this.lastCommunicationTime = lastCommunicationTime;
        return this;
    }
    public String getLastCommunicationTime() {
        return this.lastCommunicationTime;
    }

    public QueryElectrocarDeviceinfosResponse setDeviceOtaVersion(String deviceOtaVersion) {
        this.deviceOtaVersion = deviceOtaVersion;
        return this;
    }
    public String getDeviceOtaVersion() {
        return this.deviceOtaVersion;
    }

}
