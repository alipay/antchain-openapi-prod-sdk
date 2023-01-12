// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateApplicationServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 新建应用服务id
    @NameInMap("id")
    public String id;

    public static CreateApplicationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationServiceResponse self = new CreateApplicationServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateApplicationServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateApplicationServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateApplicationServiceResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
