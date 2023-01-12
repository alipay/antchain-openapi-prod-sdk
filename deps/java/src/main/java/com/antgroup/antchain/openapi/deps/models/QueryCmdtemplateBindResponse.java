// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCmdtemplateBindResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权结果列表
    @NameInMap("list")
    public java.util.List<String> list;

    public static QueryCmdtemplateBindResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCmdtemplateBindResponse self = new QueryCmdtemplateBindResponse();
        return TeaModel.build(map, self);
    }

    public QueryCmdtemplateBindResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCmdtemplateBindResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCmdtemplateBindResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCmdtemplateBindResponse setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

}
