// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAapApplicationinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // siteCode
    @NameInMap("site_code")
    public String siteCode;

    // 应用实例
    @NameInMap("application_instance")
    public ApplicationInstance applicationInstance;

    public static QueryAapApplicationinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAapApplicationinstanceResponse self = new QueryAapApplicationinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAapApplicationinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAapApplicationinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAapApplicationinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAapApplicationinstanceResponse setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public QueryAapApplicationinstanceResponse setApplicationInstance(ApplicationInstance applicationInstance) {
        this.applicationInstance = applicationInstance;
        return this;
    }
    public ApplicationInstance getApplicationInstance() {
        return this.applicationInstance;
    }

}
