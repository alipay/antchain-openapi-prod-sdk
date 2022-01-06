// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsAttributesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 添加成功的属性结构体
    @NameInMap("attribute")
    public Attribute attribute;

    public static AddDdcsAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsAttributesResponse self = new AddDdcsAttributesResponse();
        return TeaModel.build(map, self);
    }

    public AddDdcsAttributesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddDdcsAttributesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddDdcsAttributesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddDdcsAttributesResponse setAttribute(Attribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public Attribute getAttribute() {
        return this.attribute;
    }

}
