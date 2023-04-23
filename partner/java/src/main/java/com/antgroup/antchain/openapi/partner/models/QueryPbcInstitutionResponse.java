// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryPbcInstitutionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 银行机构信息列表
    @NameInMap("institutions")
    public java.util.List<Institution> institutions;

    public static QueryPbcInstitutionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPbcInstitutionResponse self = new QueryPbcInstitutionResponse();
        return TeaModel.build(map, self);
    }

    public QueryPbcInstitutionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPbcInstitutionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPbcInstitutionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPbcInstitutionResponse setInstitutions(java.util.List<Institution> institutions) {
        this.institutions = institutions;
        return this;
    }
    public java.util.List<Institution> getInstitutions() {
        return this.institutions;
    }

}
