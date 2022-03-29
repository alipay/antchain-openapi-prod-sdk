// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetCustompluginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 自定义监控指标详情
    @NameInMap("custom_plugin")
    public CustomPluginDO customPlugin;

    public static GetCustompluginResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustompluginResponse self = new GetCustompluginResponse();
        return TeaModel.build(map, self);
    }

    public GetCustompluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCustompluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCustompluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCustompluginResponse setCustomPlugin(CustomPluginDO customPlugin) {
        this.customPlugin = customPlugin;
        return this;
    }
    public CustomPluginDO getCustomPlugin() {
        return this.customPlugin;
    }

}
