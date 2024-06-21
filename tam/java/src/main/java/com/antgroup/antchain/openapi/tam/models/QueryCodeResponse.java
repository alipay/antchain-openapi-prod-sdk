// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("l3code_list")
    public java.util.List<String> l3codeList;

    //  
    @NameInMap("success")
    public Boolean success;

    public static QueryCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeResponse self = new QueryCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCodeResponse setL3codeList(java.util.List<String> l3codeList) {
        this.l3codeList = l3codeList;
        return this;
    }
    public java.util.List<String> getL3codeList() {
        return this.l3codeList;
    }

    public QueryCodeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
