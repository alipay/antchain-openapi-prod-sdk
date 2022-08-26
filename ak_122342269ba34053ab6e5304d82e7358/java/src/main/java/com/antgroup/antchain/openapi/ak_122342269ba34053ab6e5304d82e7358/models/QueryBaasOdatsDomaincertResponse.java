// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class QueryBaasOdatsDomaincertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 域名证书信息
    @NameInMap("data")
    public DomainCert data;

    public static QueryBaasOdatsDomaincertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasOdatsDomaincertResponse self = new QueryBaasOdatsDomaincertResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasOdatsDomaincertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasOdatsDomaincertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasOdatsDomaincertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasOdatsDomaincertResponse setData(DomainCert data) {
        this.data = data;
        return this;
    }
    public DomainCert getData() {
        return this.data;
    }

}
