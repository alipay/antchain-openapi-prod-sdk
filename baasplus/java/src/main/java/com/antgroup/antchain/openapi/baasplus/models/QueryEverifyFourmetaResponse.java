// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEverifyFourmetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0:核验成功
    // 1:企业信息有误
    // 2:企业非正常营业
    @NameInMap("code")
    public String code;

    // 企业经营状态
    @NameInMap("enterprise_status")
    public String enterpriseStatus;

    // 营业期限
    @NameInMap("open_time")
    public String openTime;

    // 认证是否通过
    @NameInMap("passed")
    public Boolean passed;

    // resultCode=0，核验一致
    // resultCode=1，核验不一致（人企核验不一致）
    // resultCode=2，库无（人在库中不存在，无法校验）
    // resultCode=3，企业二要素核验不通过
    // resultCode=4，查无企业，无法校验（此场景属于三要素核验）
    @NameInMap("return_code")
    public String returnCode;

    // 核验不一致的原因编码
    @NameInMap("reason_code")
    public String reasonCode;

    // 数据不一致的字段，存在多个
    // ep_cert_name 企业名称
    // ep_cert_no 企业信用编码
    // cert_name 法人名称
    // cert_no 法人证件号
    @NameInMap("reason_codes")
    public java.util.List<String> reasonCodes;

    public static QueryEverifyFourmetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEverifyFourmetaResponse self = new QueryEverifyFourmetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryEverifyFourmetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEverifyFourmetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEverifyFourmetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEverifyFourmetaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEverifyFourmetaResponse setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public QueryEverifyFourmetaResponse setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public QueryEverifyFourmetaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public QueryEverifyFourmetaResponse setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public QueryEverifyFourmetaResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public QueryEverifyFourmetaResponse setReasonCodes(java.util.List<String> reasonCodes) {
        this.reasonCodes = reasonCodes;
        return this;
    }
    public java.util.List<String> getReasonCodes() {
        return this.reasonCodes;
    }

}
