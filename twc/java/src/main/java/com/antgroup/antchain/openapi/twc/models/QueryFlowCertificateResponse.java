// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryFlowCertificateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证证明下载地址，有效期1个小时
    @NameInMap("certificate_url")
    public String certificateUrl;

    // Legal码H5页面URL
    @NameInMap("legal_code_url")
    public String legalCodeUrl;

    // Legal码证书H5页面URL
    @NameInMap("legal_show_url")
    public String legalShowUrl;

    public static QueryFlowCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowCertificateResponse self = new QueryFlowCertificateResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowCertificateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowCertificateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowCertificateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowCertificateResponse setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public QueryFlowCertificateResponse setLegalCodeUrl(String legalCodeUrl) {
        this.legalCodeUrl = legalCodeUrl;
        return this;
    }
    public String getLegalCodeUrl() {
        return this.legalCodeUrl;
    }

    public QueryFlowCertificateResponse setLegalShowUrl(String legalShowUrl) {
        this.legalShowUrl = legalShowUrl;
        return this;
    }
    public String getLegalShowUrl() {
        return this.legalShowUrl;
    }

}
