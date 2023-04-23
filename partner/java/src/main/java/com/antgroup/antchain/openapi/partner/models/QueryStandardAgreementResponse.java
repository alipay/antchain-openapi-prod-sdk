// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryStandardAgreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("code")
    public String code;

    // 错误描述
    @NameInMap("error_message")
    public String errorMessage;

    // 生效的标准合同版本
    @NameInMap("valid_version")
    public PartnerStandardContractVersion validVersion;

    public static QueryStandardAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardAgreementResponse self = new QueryStandardAgreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandardAgreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStandardAgreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStandardAgreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStandardAgreementResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStandardAgreementResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStandardAgreementResponse setValidVersion(PartnerStandardContractVersion validVersion) {
        this.validVersion = validVersion;
        return this;
    }
    public PartnerStandardContractVersion getValidVersion() {
        return this.validVersion;
    }

}
