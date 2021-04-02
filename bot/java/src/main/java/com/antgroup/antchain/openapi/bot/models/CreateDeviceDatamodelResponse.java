// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDeviceDatamodelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据模型id
    @NameInMap("device_data_model_id")
    public String deviceDataModelId;

    public static CreateDeviceDatamodelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDatamodelResponse self = new CreateDeviceDatamodelResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDatamodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDeviceDatamodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDeviceDatamodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDeviceDatamodelResponse setDeviceDataModelId(String deviceDataModelId) {
        this.deviceDataModelId = deviceDataModelId;
        return this;
    }
    public String getDeviceDataModelId() {
        return this.deviceDataModelId;
    }

}
