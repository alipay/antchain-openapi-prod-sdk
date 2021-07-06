// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidInternalmaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否通过
    @NameInMap("accepted")
    public Boolean accepted;

    //  
    @NameInMap("verify_url")
    public String verifyUrl;

    public static QueryIndividualidInternalmaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidInternalmaskResponse self = new QueryIndividualidInternalmaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidInternalmaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIndividualidInternalmaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIndividualidInternalmaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIndividualidInternalmaskResponse setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public QueryIndividualidInternalmaskResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

}
