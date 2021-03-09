// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryCertificateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<BasicCertificate> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCertificateResponse self = new QueryCertificateResponse();
        return TeaModel.build(map, self);
    }

    public QueryCertificateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCertificateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCertificateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCertificateResponse setData(java.util.List<BasicCertificate> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BasicCertificate> getData() {
        return this.data;
    }

    public QueryCertificateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
