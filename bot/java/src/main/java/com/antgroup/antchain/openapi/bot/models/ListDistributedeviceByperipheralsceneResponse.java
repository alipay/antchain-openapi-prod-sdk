// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListDistributedeviceByperipheralsceneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发行的外围设备信息数组
    // 
    @NameInMap("distribute_device_list")
    public java.util.List<DistributeDevice> distributeDeviceList;

    public static ListDistributedeviceByperipheralsceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedeviceByperipheralsceneResponse self = new ListDistributedeviceByperipheralsceneResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributedeviceByperipheralsceneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDistributedeviceByperipheralsceneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDistributedeviceByperipheralsceneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDistributedeviceByperipheralsceneResponse setDistributeDeviceList(java.util.List<DistributeDevice> distributeDeviceList) {
        this.distributeDeviceList = distributeDeviceList;
        return this;
    }
    public java.util.List<DistributeDevice> getDistributeDeviceList() {
        return this.distributeDeviceList;
    }

}
