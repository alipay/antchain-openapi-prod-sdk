// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractAccountsealsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
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

    // 查询总数
    @NameInMap("total")
    public Long total;

    // 印章列表
    @NameInMap("seals")
    public java.util.List<ContractSeal> seals;

    public static QueryContractAccountsealsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractAccountsealsResponse self = new QueryContractAccountsealsResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractAccountsealsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractAccountsealsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractAccountsealsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractAccountsealsResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractAccountsealsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractAccountsealsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryContractAccountsealsResponse setSeals(java.util.List<ContractSeal> seals) {
        this.seals = seals;
        return this;
    }
    public java.util.List<ContractSeal> getSeals() {
        return this.seals;
    }

}
