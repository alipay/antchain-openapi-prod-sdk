// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RecognizeIotbasicCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否授权开通IoT产品
    @NameInMap("authorized")
    public Boolean authorized;

    // 设备数量列表
    @NameInMap("device_list")
    public java.util.List<DeviceOverViewResponse> deviceList;

    // 角色
    @NameInMap("iot_role")
    public String iotRole;

    public static RecognizeIotbasicCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIotbasicCustomerResponse self = new RecognizeIotbasicCustomerResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIotbasicCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeIotbasicCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeIotbasicCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeIotbasicCustomerResponse setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public RecognizeIotbasicCustomerResponse setDeviceList(java.util.List<DeviceOverViewResponse> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<DeviceOverViewResponse> getDeviceList() {
        return this.deviceList;
    }

    public RecognizeIotbasicCustomerResponse setIotRole(String iotRole) {
        this.iotRole = iotRole;
        return this;
    }
    public String getIotRole() {
        return this.iotRole;
    }

}
