// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RegisterHealthDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 品牌方渠道标识
    @NameInMap("channel_id")
    public String channelId;

    // 设备唯一id
    @NameInMap("tuid")
    public String tuid;

    // 设备sn号
    @NameInMap("sn")
    public String sn;

    // 绑定状态
    @NameInMap("bind_status")
    public String bindStatus;

    // 设备类型 WATCH-手表
    @NameInMap("device_type")
    public String deviceType;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    // 预留可扩展字段json
    @NameInMap("extra_info")
    public String extraInfo;

    public static RegisterHealthDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterHealthDeviceResponse self = new RegisterHealthDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterHealthDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterHealthDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterHealthDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterHealthDeviceResponse setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RegisterHealthDeviceResponse setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public RegisterHealthDeviceResponse setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public RegisterHealthDeviceResponse setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
        return this;
    }
    public String getBindStatus() {
        return this.bindStatus;
    }

    public RegisterHealthDeviceResponse setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public RegisterHealthDeviceResponse setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public RegisterHealthDeviceResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
