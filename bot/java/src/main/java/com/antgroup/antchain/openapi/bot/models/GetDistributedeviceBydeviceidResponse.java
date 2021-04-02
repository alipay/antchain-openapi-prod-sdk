// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDistributedeviceBydeviceidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发行设备
    @NameInMap("distribute_device_list")
    public java.util.List<DistributeDevice> distributeDeviceList;

    // 发行设备信息不存在的deviceid集合
    @NameInMap("miss_device_id_list")
    public java.util.List<String> missDeviceIdList;

    // 成功获取到发行设备信息的deviceid集合
    @NameInMap("success_device_id_list")
    public java.util.List<String> successDeviceIdList;

    public static GetDistributedeviceBydeviceidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedeviceBydeviceidResponse self = new GetDistributedeviceBydeviceidResponse();
        return TeaModel.build(map, self);
    }

    public GetDistributedeviceBydeviceidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDistributedeviceBydeviceidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDistributedeviceBydeviceidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDistributedeviceBydeviceidResponse setDistributeDeviceList(java.util.List<DistributeDevice> distributeDeviceList) {
        this.distributeDeviceList = distributeDeviceList;
        return this;
    }
    public java.util.List<DistributeDevice> getDistributeDeviceList() {
        return this.distributeDeviceList;
    }

    public GetDistributedeviceBydeviceidResponse setMissDeviceIdList(java.util.List<String> missDeviceIdList) {
        this.missDeviceIdList = missDeviceIdList;
        return this;
    }
    public java.util.List<String> getMissDeviceIdList() {
        return this.missDeviceIdList;
    }

    public GetDistributedeviceBydeviceidResponse setSuccessDeviceIdList(java.util.List<String> successDeviceIdList) {
        this.successDeviceIdList = successDeviceIdList;
        return this;
    }
    public java.util.List<String> getSuccessDeviceIdList() {
        return this.successDeviceIdList;
    }

}
