// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateConfigGlobalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建的全局参数 id
    @NameInMap("global_param_id")
    public String globalParamId;

    public static CreateConfigGlobalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigGlobalResponse self = new CreateConfigGlobalResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigGlobalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateConfigGlobalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateConfigGlobalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateConfigGlobalResponse setGlobalParamId(String globalParamId) {
        this.globalParamId = globalParamId;
        return this;
    }
    public String getGlobalParamId() {
        return this.globalParamId;
    }

}
