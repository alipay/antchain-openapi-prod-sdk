// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseBaseinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业信用编码
    @NameInMap("ep_code")
    public String epCode;

    // 企业名称
    @NameInMap("ep_name")
    public String epName;

    // 企业法人名称
    @NameInMap("legal_person_name")
    public String legalPersonName;

    public static QueryEnterpriseBaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseBaseinfoResponse self = new QueryEnterpriseBaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseBaseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseBaseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseBaseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseBaseinfoResponse setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public QueryEnterpriseBaseinfoResponse setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public QueryEnterpriseBaseinfoResponse setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

}
