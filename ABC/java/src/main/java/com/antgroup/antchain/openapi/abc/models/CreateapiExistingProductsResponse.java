// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class CreateapiExistingProductsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 计算值返回
    @NameInMap("exec_num_echo")
    public Long execNumEcho;

    public static CreateapiExistingProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateapiExistingProductsResponse self = new CreateapiExistingProductsResponse();
        return TeaModel.build(map, self);
    }

    public CreateapiExistingProductsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateapiExistingProductsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateapiExistingProductsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateapiExistingProductsResponse setExecNumEcho(Long execNumEcho) {
        this.execNumEcho = execNumEcho;
        return this;
    }
    public Long getExecNumEcho() {
        return this.execNumEcho;
    }

}
