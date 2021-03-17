// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeMediationResponse extends TeaModel {
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

    // 	业务码信息
    @NameInMap("message")
    public String message;

    // 案件处理进度信息对象
    @NameInMap("mediation_case_detail_info")
    public String mediationCaseDetailInfo;

    public static QueryJusticeMediationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeMediationResponse self = new QueryJusticeMediationResponse();
        return TeaModel.build(map, self);
    }

    public QueryJusticeMediationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJusticeMediationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJusticeMediationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJusticeMediationResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryJusticeMediationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryJusticeMediationResponse setMediationCaseDetailInfo(String mediationCaseDetailInfo) {
        this.mediationCaseDetailInfo = mediationCaseDetailInfo;
        return this;
    }
    public String getMediationCaseDetailInfo() {
        return this.mediationCaseDetailInfo;
    }

}
