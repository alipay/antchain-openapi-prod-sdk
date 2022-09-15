// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicRelrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作结果
    @NameInMap("success")
    public Boolean success;

    // 设备属性关系数据
    @NameInMap("iot_device_attribute_relationship_data")
    public IotDeviceAttributeRelationshipData iotDeviceAttributeRelationshipData;

    public static OperateIotbasicRelrationResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicRelrationResponse self = new OperateIotbasicRelrationResponse();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicRelrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateIotbasicRelrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateIotbasicRelrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateIotbasicRelrationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperateIotbasicRelrationResponse setIotDeviceAttributeRelationshipData(IotDeviceAttributeRelationshipData iotDeviceAttributeRelationshipData) {
        this.iotDeviceAttributeRelationshipData = iotDeviceAttributeRelationshipData;
        return this;
    }
    public IotDeviceAttributeRelationshipData getIotDeviceAttributeRelationshipData() {
        return this.iotDeviceAttributeRelationshipData;
    }

}
