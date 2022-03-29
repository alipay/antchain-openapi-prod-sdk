// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListCustompluginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 自定义指标监控配置列表
    @NameInMap("custom_plugins")
    public java.util.List<CustomPluginDO> customPlugins;

    public static ListCustompluginResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustompluginResponse self = new ListCustompluginResponse();
        return TeaModel.build(map, self);
    }

    public ListCustompluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCustompluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCustompluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCustompluginResponse setCustomPlugins(java.util.List<CustomPluginDO> customPlugins) {
        this.customPlugins = customPlugins;
        return this;
    }
    public java.util.List<CustomPluginDO> getCustomPlugins() {
        return this.customPlugins;
    }

}
