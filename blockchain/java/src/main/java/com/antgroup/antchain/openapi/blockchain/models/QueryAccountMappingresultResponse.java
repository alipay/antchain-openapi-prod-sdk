// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAccountMappingresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 映射结果列表
    @NameInMap("data")
    public java.util.List<AccountMappingResult> data;

    public static QueryAccountMappingresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountMappingresultResponse self = new QueryAccountMappingresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountMappingresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAccountMappingresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAccountMappingresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAccountMappingresultResponse setData(java.util.List<AccountMappingResult> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccountMappingResult> getData() {
        return this.data;
    }

}
