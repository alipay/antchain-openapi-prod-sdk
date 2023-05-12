// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListTransactionAppsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // apps
    @NameInMap("apps")
    public java.util.List<TrasactionAppInfo> apps;

    // true
    @NameInMap("success")
    public Boolean success;

    public static ListTransactionAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionAppsResponse self = new ListTransactionAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransactionAppsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTransactionAppsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTransactionAppsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTransactionAppsResponse setApps(java.util.List<TrasactionAppInfo> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<TrasactionAppInfo> getApps() {
        return this.apps;
    }

    public ListTransactionAppsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
