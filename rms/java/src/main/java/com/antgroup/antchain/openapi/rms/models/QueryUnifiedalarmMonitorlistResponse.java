// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmMonitorlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 缺省的监控指标。
    @NameInMap("stack_monitor_list")
    public java.util.List<StackMonitorItem> stackMonitorList;

    // 用户定制的告警项。
    @NameInMap("custom_plugin_list")
    public java.util.List<CustomPluginDO> customPluginList;

    public static QueryUnifiedalarmMonitorlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmMonitorlistResponse self = new QueryUnifiedalarmMonitorlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmMonitorlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmMonitorlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmMonitorlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmMonitorlistResponse setStackMonitorList(java.util.List<StackMonitorItem> stackMonitorList) {
        this.stackMonitorList = stackMonitorList;
        return this;
    }
    public java.util.List<StackMonitorItem> getStackMonitorList() {
        return this.stackMonitorList;
    }

    public QueryUnifiedalarmMonitorlistResponse setCustomPluginList(java.util.List<CustomPluginDO> customPluginList) {
        this.customPluginList = customPluginList;
        return this;
    }
    public java.util.List<CustomPluginDO> getCustomPluginList() {
        return this.customPluginList;
    }

}
