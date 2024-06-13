// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDeviceModelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 属性失败列表
    @NameInMap("attribute_fail_list")
    public java.util.List<IotbasicDeviceModelAttributeFailInfo> attributeFailList;

    // 固定属性失败列表
    @NameInMap("fixed_attribute_fail_list")
    public java.util.List<IotbasicDeviceModelFixedAttributeFailInfo> fixedAttributeFailList;

    public static CreateDeviceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceModelResponse self = new CreateDeviceModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceModelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDeviceModelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDeviceModelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDeviceModelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDeviceModelResponse setAttributeFailList(java.util.List<IotbasicDeviceModelAttributeFailInfo> attributeFailList) {
        this.attributeFailList = attributeFailList;
        return this;
    }
    public java.util.List<IotbasicDeviceModelAttributeFailInfo> getAttributeFailList() {
        return this.attributeFailList;
    }

    public CreateDeviceModelResponse setFixedAttributeFailList(java.util.List<IotbasicDeviceModelFixedAttributeFailInfo> fixedAttributeFailList) {
        this.fixedAttributeFailList = fixedAttributeFailList;
        return this;
    }
    public java.util.List<IotbasicDeviceModelFixedAttributeFailInfo> getFixedAttributeFailList() {
        return this.fixedAttributeFailList;
    }

}
