// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeCaseinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询的案件编号
    @NameInMap("case_no")
    public String caseNo;

    // 证据要素
    @NameInMap("evidential_element")
    public EvidentialElement evidentialElement;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码信息
    @NameInMap("message")
    public String message;

    public static QueryJusticeCaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeCaseinfoResponse self = new QueryJusticeCaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryJusticeCaseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJusticeCaseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJusticeCaseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJusticeCaseinfoResponse setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }
    public String getCaseNo() {
        return this.caseNo;
    }

    public QueryJusticeCaseinfoResponse setEvidentialElement(EvidentialElement evidentialElement) {
        this.evidentialElement = evidentialElement;
        return this;
    }
    public EvidentialElement getEvidentialElement() {
        return this.evidentialElement;
    }

    public QueryJusticeCaseinfoResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryJusticeCaseinfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
