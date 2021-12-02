// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateModelrelationshipResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建出的模型关联
    @NameInMap("data")
    public ModelRelationship data;

    public static CreateModelrelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelrelationshipResponse self = new CreateModelrelationshipResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelrelationshipResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateModelrelationshipResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateModelrelationshipResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateModelrelationshipResponse setData(ModelRelationship data) {
        this.data = data;
        return this;
    }
    public ModelRelationship getData() {
        return this.data;
    }

}
