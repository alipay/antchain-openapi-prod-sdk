// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgRouterruledispatchlogsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // List<ConfigDispatchLogDO>
    @NameInMap("config_dispatch_logs")
    public java.util.List<ConfigDispatchLogDO> configDispatchLogs;

    public static QuerySgRouterruledispatchlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgRouterruledispatchlogsResponse self = new QuerySgRouterruledispatchlogsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgRouterruledispatchlogsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgRouterruledispatchlogsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgRouterruledispatchlogsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgRouterruledispatchlogsResponse setConfigDispatchLogs(java.util.List<ConfigDispatchLogDO> configDispatchLogs) {
        this.configDispatchLogs = configDispatchLogs;
        return this;
    }
    public java.util.List<ConfigDispatchLogDO> getConfigDispatchLogs() {
        return this.configDispatchLogs;
    }

}
