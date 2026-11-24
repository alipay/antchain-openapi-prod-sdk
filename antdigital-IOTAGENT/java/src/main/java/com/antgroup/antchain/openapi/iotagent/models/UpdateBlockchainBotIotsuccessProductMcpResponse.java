// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotsuccessProductMcpResponse extends TeaModel {
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

    @NameInMap("updated")
    @Validation(required = true)
    public Boolean updated;

    public static UpdateBlockchainBotIotsuccessProductMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotsuccessProductMcpResponse self = new UpdateBlockchainBotIotsuccessProductMcpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotsuccessProductMcpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBlockchainBotIotsuccessProductMcpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBlockchainBotIotsuccessProductMcpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBlockchainBotIotsuccessProductMcpResponse setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpdateBlockchainBotIotsuccessProductMcpResponse setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

}
