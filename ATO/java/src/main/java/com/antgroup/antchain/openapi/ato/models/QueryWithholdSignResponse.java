// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryWithholdSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 协议当前状态
    // 1. UNSIGNED：未签约
    // 2. SIGNED：已签约；
    // 3. TERMINATED：已解约
    @NameInMap("status")
    public String status;

    // 协议签署时间
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 协议生效时间
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 协议失效时间
    @NameInMap("invalid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    // 代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 代扣签约场景
    // JDbindCardH5：京东一键绑卡_H5
    // JDAPPSignH5：京东APP签约_H5
    @NameInMap("withhold_sign_scene")
    public String withholdSignScene;

    public static QueryWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdSignResponse self = new QueryWithholdSignResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWithholdSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWithholdSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWithholdSignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWithholdSignResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryWithholdSignResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryWithholdSignResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public QueryWithholdSignResponse setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public QueryWithholdSignResponse setWithholdSignScene(String withholdSignScene) {
        this.withholdSignScene = withholdSignScene;
        return this;
    }
    public String getWithholdSignScene() {
        return this.withholdSignScene;
    }

}
