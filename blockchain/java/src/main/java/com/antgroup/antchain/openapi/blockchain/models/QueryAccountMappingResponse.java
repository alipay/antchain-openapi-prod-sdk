// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAccountMappingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 该用户信息
    @NameInMap("data")
    public AccountMappingInfo data;

    public static QueryAccountMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountMappingResponse self = new QueryAccountMappingResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountMappingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAccountMappingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAccountMappingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAccountMappingResponse setData(AccountMappingInfo data) {
        this.data = data;
        return this;
    }
    public AccountMappingInfo getData() {
        return this.data;
    }

}
