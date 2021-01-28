// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractNotaryResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 存证信息列表
    @NameInMap("notaries")
    public java.util.List<ContractNotaryInfo> notaries;

    public static QueryContractNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractNotaryResponse self = new QueryContractNotaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractNotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractNotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractNotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractNotaryResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractNotaryResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractNotaryResponse setNotaries(java.util.List<ContractNotaryInfo> notaries) {
        this.notaries = notaries;
        return this;
    }
    public java.util.List<ContractNotaryInfo> getNotaries() {
        return this.notaries;
    }

}
