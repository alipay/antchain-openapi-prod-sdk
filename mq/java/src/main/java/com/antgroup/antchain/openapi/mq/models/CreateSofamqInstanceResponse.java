// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // InstanceCreate返回数据
    @NameInMap("data")
    public InstanceCreateDTO data;

    public static CreateSofamqInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqInstanceResponse self = new CreateSofamqInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSofamqInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSofamqInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSofamqInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSofamqInstanceResponse setData(InstanceCreateDTO data) {
        this.data = data;
        return this;
    }
    public InstanceCreateDTO getData() {
        return this.data;
    }

}
