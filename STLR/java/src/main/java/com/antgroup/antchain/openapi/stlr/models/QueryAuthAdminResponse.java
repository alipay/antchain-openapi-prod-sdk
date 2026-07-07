// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryAuthAdminResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权策略
    @NameInMap("data")
    public AuthorizePolicy data;

    public static QueryAuthAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthAdminResponse self = new QueryAuthAdminResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthAdminResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthAdminResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthAdminResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthAdminResponse setData(AuthorizePolicy data) {
        this.data = data;
        return this;
    }
    public AuthorizePolicy getData() {
        return this.data;
    }

}
