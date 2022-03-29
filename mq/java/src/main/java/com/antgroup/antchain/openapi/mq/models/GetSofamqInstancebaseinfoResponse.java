// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqInstancebaseinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实例信息对象
    @NameInMap("data")
    public InstanceBaseInfoDTO data;

    public static GetSofamqInstancebaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqInstancebaseinfoResponse self = new GetSofamqInstancebaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSofamqInstancebaseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSofamqInstancebaseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSofamqInstancebaseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSofamqInstancebaseinfoResponse setData(InstanceBaseInfoDTO data) {
        this.data = data;
        return this;
    }
    public InstanceBaseInfoDTO getData() {
        return this.data;
    }

}
