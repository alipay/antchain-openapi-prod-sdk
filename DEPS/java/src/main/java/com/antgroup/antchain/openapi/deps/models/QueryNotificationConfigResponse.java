// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryNotificationConfigResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 通知配置列表
    @NameInMap("configs")
    public java.util.List<String> configs;

    public static QueryNotificationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotificationConfigResponse self = new QueryNotificationConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotificationConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNotificationConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNotificationConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNotificationConfigResponse setConfigs(java.util.List<String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

}
