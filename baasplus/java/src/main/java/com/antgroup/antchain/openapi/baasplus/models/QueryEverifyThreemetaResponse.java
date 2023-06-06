// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEverifyThreemetaResponse extends TeaModel {
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

    // 经营状态
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

    // 核验不通过异常编码
    @NameInMap("reason_code")
    public String reasonCode;

    // 企业名称 1.一致 2.不一致 3.无法验证
    @NameInMap("ent_name")
    public String entName;

    // 企业名称 1.一致 2.不一致 3.无法验证
    // 
    @NameInMap("ent_name_msg")
    public String entNameMsg;

    // 社会统一信用代码/注册号： 1.一致 2.不一致 3.无法验证
    @NameInMap("reg_no")
    public String regNo;

    // 社会统一信用代码/注册号： 1.一致 2.不一致 3.无法验证
    @NameInMap("reg_no_msg")
    public String regNoMsg;

    // 法人姓名：1.一致 2.不一致 3.无法验证
    // 
    @NameInMap("legal_name")
    public String legalName;

    // 法人姓名：1.一致 2.不一致 3.无法验证
    @NameInMap("legal_name_msg")
    public String legalNameMsg;

    public static QueryEverifyThreemetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEverifyThreemetaResponse self = new QueryEverifyThreemetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryEverifyThreemetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEverifyThreemetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEverifyThreemetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEverifyThreemetaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEverifyThreemetaResponse setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public QueryEverifyThreemetaResponse setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public QueryEverifyThreemetaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public QueryEverifyThreemetaResponse setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public QueryEverifyThreemetaResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public QueryEverifyThreemetaResponse setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public QueryEverifyThreemetaResponse setEntNameMsg(String entNameMsg) {
        this.entNameMsg = entNameMsg;
        return this;
    }
    public String getEntNameMsg() {
        return this.entNameMsg;
    }

    public QueryEverifyThreemetaResponse setRegNo(String regNo) {
        this.regNo = regNo;
        return this;
    }
    public String getRegNo() {
        return this.regNo;
    }

    public QueryEverifyThreemetaResponse setRegNoMsg(String regNoMsg) {
        this.regNoMsg = regNoMsg;
        return this;
    }
    public String getRegNoMsg() {
        return this.regNoMsg;
    }

    public QueryEverifyThreemetaResponse setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public QueryEverifyThreemetaResponse setLegalNameMsg(String legalNameMsg) {
        this.legalNameMsg = legalNameMsg;
        return this;
    }
    public String getLegalNameMsg() {
        return this.legalNameMsg;
    }

}
