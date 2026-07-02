// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceSpecsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备规格描述
    @NameInMap("device_specs")
    public IotBasicDeviceSpecs deviceSpecs;

    // 硬件模块集合
    @NameInMap("hardware_module_list")
    public java.util.List<IotBasicDeviceHardWareModule> hardwareModuleList;

    public static QueryDeviceSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSpecsResponse self = new QueryDeviceSpecsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSpecsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeviceSpecsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeviceSpecsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeviceSpecsResponse setDeviceSpecs(IotBasicDeviceSpecs deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public IotBasicDeviceSpecs getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public QueryDeviceSpecsResponse setHardwareModuleList(java.util.List<IotBasicDeviceHardWareModule> hardwareModuleList) {
        this.hardwareModuleList = hardwareModuleList;
        return this;
    }
    public java.util.List<IotBasicDeviceHardWareModule> getHardwareModuleList() {
        return this.hardwareModuleList;
    }

}
