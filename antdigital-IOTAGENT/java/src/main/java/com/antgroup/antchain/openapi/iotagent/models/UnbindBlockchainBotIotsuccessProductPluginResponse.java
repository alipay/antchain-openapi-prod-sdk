// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UnbindBlockchainBotIotsuccessProductPluginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 枚举:NEXT_INTERACTION
    @NameInMap("effective_for")
    @Validation(required = true)
    public String effectiveFor;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("unbound")
    @Validation(required = true)
    public Boolean unbound;

    public static UnbindBlockchainBotIotsuccessProductPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindBlockchainBotIotsuccessProductPluginResponse self = new UnbindBlockchainBotIotsuccessProductPluginResponse();
        return TeaModel.build(map, self);
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setEffectiveFor(String effectiveFor) {
        this.effectiveFor = effectiveFor;
        return this;
    }
    public String getEffectiveFor() {
        return this.effectiveFor;
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UnbindBlockchainBotIotsuccessProductPluginResponse setUnbound(Boolean unbound) {
        this.unbound = unbound;
        return this;
    }
    public Boolean getUnbound() {
        return this.unbound;
    }

}
