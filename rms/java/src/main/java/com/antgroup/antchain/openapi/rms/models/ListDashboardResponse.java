// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListDashboardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 大盘列表
    @NameInMap("dashboards")
    public java.util.List<PluginModelDO> dashboards;

    public static ListDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardResponse self = new ListDashboardResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDashboardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDashboardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDashboardResponse setDashboards(java.util.List<PluginModelDO> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<PluginModelDO> getDashboards() {
        return this.dashboards;
    }

}
