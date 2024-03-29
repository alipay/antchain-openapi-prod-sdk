// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEverifyTwometaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 经营状态
    @NameInMap("enterprise_status")
    public String enterpriseStatus;

    // 营业期限
    @NameInMap("open_time")
    public String openTime;

    // 认证是否通过
    @NameInMap("passed")
    public Boolean passed;

    // 0:核验成功
    // 1:企业信息有误
    // 2:企业非正常营业
    @NameInMap("code")
    public String code;

    // resultCode=0，核验一致
    // resultCode=1，核验不一致（人企核验不一致）
    // resultCode=2，库无（人在库中不存在，无法校验）
    // resultCode=3，企业二要素核验不通过
    // resultCode=4，查无企业，无法校验（此场景属于三要素核验）
    @NameInMap("return_code")
    public String returnCode;

    // 核验不通过异常编码
    @NameInMap("reason_code")
    public String reasonCode;

    // 要素核验不一致的字段
    // ep_cert_name 企业名称
    // ep_cert_no 企业信用编码
    @NameInMap("reason_codes")
    public java.util.List<String> reasonCodes;

    public static QueryEverifyTwometaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEverifyTwometaResponse self = new QueryEverifyTwometaResponse();
        return TeaModel.build(map, self);
    }

    public QueryEverifyTwometaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEverifyTwometaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEverifyTwometaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEverifyTwometaResponse setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public QueryEverifyTwometaResponse setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public QueryEverifyTwometaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public QueryEverifyTwometaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEverifyTwometaResponse setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public QueryEverifyTwometaResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public QueryEverifyTwometaResponse setReasonCodes(java.util.List<String> reasonCodes) {
        this.reasonCodes = reasonCodes;
        return this;
    }
    public java.util.List<String> getReasonCodes() {
        return this.reasonCodes;
    }

}
