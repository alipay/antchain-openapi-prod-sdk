// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotsuccessProductMcpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // 枚举:REVIEWING,READY,FAILED
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    @NameInMap("header_names")
    @Validation(required = true)
    public java.util.List<String> headerNames;

    @NameInMap("has_secret")
    @Validation(required = true)
    public Boolean hasSecret;

    public static CreateIotsuccessProductMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIotsuccessProductMcpResponse self = new CreateIotsuccessProductMcpResponse();
        return TeaModel.build(map, self);
    }

    public CreateIotsuccessProductMcpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateIotsuccessProductMcpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateIotsuccessProductMcpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateIotsuccessProductMcpResponse setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public CreateIotsuccessProductMcpResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateIotsuccessProductMcpResponse setHeaderNames(java.util.List<String> headerNames) {
        this.headerNames = headerNames;
        return this;
    }
    public java.util.List<String> getHeaderNames() {
        return this.headerNames;
    }

    public CreateIotsuccessProductMcpResponse setHasSecret(Boolean hasSecret) {
        this.hasSecret = hasSecret;
        return this;
    }
    public Boolean getHasSecret() {
        return this.hasSecret;
    }

}
