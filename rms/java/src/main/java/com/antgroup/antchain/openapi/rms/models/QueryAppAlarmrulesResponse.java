// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAppAlarmrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 技术栈指标
    @NameInMap("stack_metrics")
    public java.util.List<StackMonitorItem> stackMetrics;

    // 应用自定义指标
    @NameInMap("custom_plugins")
    public java.util.List<CustomPluginDO> customPlugins;

    public static QueryAppAlarmrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppAlarmrulesResponse self = new QueryAppAlarmrulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppAlarmrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppAlarmrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppAlarmrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppAlarmrulesResponse setStackMetrics(java.util.List<StackMonitorItem> stackMetrics) {
        this.stackMetrics = stackMetrics;
        return this;
    }
    public java.util.List<StackMonitorItem> getStackMetrics() {
        return this.stackMetrics;
    }

    public QueryAppAlarmrulesResponse setCustomPlugins(java.util.List<CustomPluginDO> customPlugins) {
        this.customPlugins = customPlugins;
        return this;
    }
    public java.util.List<CustomPluginDO> getCustomPlugins() {
        return this.customPlugins;
    }

}
