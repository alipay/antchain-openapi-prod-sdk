// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryApiAuthtemplateresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 授权状态
    // 1、正在处理中
    // 2、登陆成功
    @NameInMap("auth_state")
    public String authState;

    public static QueryApiAuthtemplateresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiAuthtemplateresultResponse self = new QueryApiAuthtemplateresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiAuthtemplateresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiAuthtemplateresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiAuthtemplateresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiAuthtemplateresultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryApiAuthtemplateresultResponse setAuthState(String authState) {
        this.authState = authState;
        return this;
    }
    public String getAuthState() {
        return this.authState;
    }

}
