// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDeviceBydeviceidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备详情
    @NameInMap("device_list")
    public java.util.List<Device> deviceList;

    // 设备信息不存在的deviceid列表
    @NameInMap("miss_device_id_list")
    public java.util.List<String> missDeviceIdList;

    // 成功获取到设备信息的deviceid列表
    @NameInMap("success_device_id_list")
    public java.util.List<String> successDeviceIdList;

    // 设备信息不存在的模组ID列表
    @NameInMap("miss_component_id_list")
    public java.util.List<String> missComponentIdList;

    // 成功获取到设备信息的模组ID列表
    @NameInMap("success_component_id_list")
    public java.util.List<String> successComponentIdList;

    public static GetDeviceBydeviceidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBydeviceidResponse self = new GetDeviceBydeviceidResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceBydeviceidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDeviceBydeviceidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDeviceBydeviceidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDeviceBydeviceidResponse setDeviceList(java.util.List<Device> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<Device> getDeviceList() {
        return this.deviceList;
    }

    public GetDeviceBydeviceidResponse setMissDeviceIdList(java.util.List<String> missDeviceIdList) {
        this.missDeviceIdList = missDeviceIdList;
        return this;
    }
    public java.util.List<String> getMissDeviceIdList() {
        return this.missDeviceIdList;
    }

    public GetDeviceBydeviceidResponse setSuccessDeviceIdList(java.util.List<String> successDeviceIdList) {
        this.successDeviceIdList = successDeviceIdList;
        return this;
    }
    public java.util.List<String> getSuccessDeviceIdList() {
        return this.successDeviceIdList;
    }

    public GetDeviceBydeviceidResponse setMissComponentIdList(java.util.List<String> missComponentIdList) {
        this.missComponentIdList = missComponentIdList;
        return this;
    }
    public java.util.List<String> getMissComponentIdList() {
        return this.missComponentIdList;
    }

    public GetDeviceBydeviceidResponse setSuccessComponentIdList(java.util.List<String> successComponentIdList) {
        this.successComponentIdList = successComponentIdList;
        return this;
    }
    public java.util.List<String> getSuccessComponentIdList() {
        return this.successComponentIdList;
    }

}
