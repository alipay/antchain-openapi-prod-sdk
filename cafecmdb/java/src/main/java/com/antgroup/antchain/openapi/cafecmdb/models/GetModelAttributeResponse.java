// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class GetModelAttributeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 获取到的字段
    @NameInMap("data")
    public Attribute data;

    public static GetModelAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelAttributeResponse self = new GetModelAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetModelAttributeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetModelAttributeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetModelAttributeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetModelAttributeResponse setData(Attribute data) {
        this.data = data;
        return this;
    }
    public Attribute getData() {
        return this.data;
    }

}
