// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDistributedeviceByperipheralidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发行设备信息数组
    @NameInMap("distribute_device_list")
    public java.util.List<DistributeDevice> distributeDeviceList;

    // 发行设备信息不存在的外围设备ID集合
    @NameInMap("miss_peripheral_id_list")
    public java.util.List<String> missPeripheralIdList;

    // 获取外围设备信息成功的外围设备ID集合
    @NameInMap("success_peripheral_id_list")
    public java.util.List<String> successPeripheralIdList;

    public static GetDistributedeviceByperipheralidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedeviceByperipheralidResponse self = new GetDistributedeviceByperipheralidResponse();
        return TeaModel.build(map, self);
    }

    public GetDistributedeviceByperipheralidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDistributedeviceByperipheralidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDistributedeviceByperipheralidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDistributedeviceByperipheralidResponse setDistributeDeviceList(java.util.List<DistributeDevice> distributeDeviceList) {
        this.distributeDeviceList = distributeDeviceList;
        return this;
    }
    public java.util.List<DistributeDevice> getDistributeDeviceList() {
        return this.distributeDeviceList;
    }

    public GetDistributedeviceByperipheralidResponse setMissPeripheralIdList(java.util.List<String> missPeripheralIdList) {
        this.missPeripheralIdList = missPeripheralIdList;
        return this;
    }
    public java.util.List<String> getMissPeripheralIdList() {
        return this.missPeripheralIdList;
    }

    public GetDistributedeviceByperipheralidResponse setSuccessPeripheralIdList(java.util.List<String> successPeripheralIdList) {
        this.successPeripheralIdList = successPeripheralIdList;
        return this;
    }
    public java.util.List<String> getSuccessPeripheralIdList() {
        return this.successPeripheralIdList;
    }

}
