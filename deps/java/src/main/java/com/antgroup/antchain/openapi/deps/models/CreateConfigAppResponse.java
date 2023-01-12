// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateConfigAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用参数 id
    @NameInMap("app_param_id")
    public String appParamId;

    public static CreateConfigAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigAppResponse self = new CreateConfigAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateConfigAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateConfigAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateConfigAppResponse setAppParamId(String appParamId) {
        this.appParamId = appParamId;
        return this;
    }
    public String getAppParamId() {
        return this.appParamId;
    }

}
