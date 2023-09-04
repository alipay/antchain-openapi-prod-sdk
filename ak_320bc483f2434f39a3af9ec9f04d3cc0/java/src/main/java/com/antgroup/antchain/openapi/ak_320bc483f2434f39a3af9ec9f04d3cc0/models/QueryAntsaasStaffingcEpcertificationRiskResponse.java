// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcEpcertificationRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证状态，取值如下： SUCCESS，代表成功 INIT，代表初始化 CERTIFYING，代表认证中 FAIL，代表失败
    @NameInMap("certify_status")
    public String certifyStatus;

    // 授权状态，从用户授权开始计时，时间窗口3天 取值如下： SUCCESS，代表用户已授权 FAIL，代表用户未授权或授权失效
    @NameInMap("auth_status")
    public String authStatus;

    // 企业全称，字段auth_status为SUCCESS时返回
    @NameInMap("ep_name")
    public String epName;

    // 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
    @NameInMap("ep_cert_no")
    public String epCertNo;

    // 法人认证姓名，字段auth_status为SUCCESS时返回
    @NameInMap("user_name")
    public String userName;

    // 法人认证身份证号
    @NameInMap("certify_person_card_no_postfix")
    public String certifyPersonCardNoPostfix;

    // 认证失败原因列表，当certify_status=FAIL时返回
    @NameInMap("certify_fail_reasons")
    public java.util.List<String> certifyFailReasons;

    // 认证风险识别结果集合
    // 枚举值
    // 低风险认证: CERTIFICATION_LOW_RISK
    // 中风险认证: CERTIFICATION_MID_RISK2
    // 高风险认证: CERTIFICATION_HIGH_RISK
    // 批量注册: ONE_ADDR_MULTI_COMP
    // 经营异常: OPERATION_ABNORMAL
    // 交叉任职: CROSS_POSITION
    // 涉嫌洗钱: SUSPECTED_MONEY_LAUNDERING
    // 空壳公司: SHELL_COMPANY
    // 失信被执行: BREACH_PROMISE_EXECUTION
    // 严重违法失信: SERIOUS_BREACH_TRUST
    // 行政处罚: ADMINISTRATIVE_SANCTION
    // 司法冻结: JUDICIAL_FREEZE
    // 违规违禁: VIOLATION_BAN
    // 信贷逾期: CREDIT_OVERDUE
    // 多头借贷: LONG_BORROWING
    // 疑似欺诈: SUSPECTED_FRAUD
    // 疑似涉赌博: SUSPECTED_GAMBLING
    // 企业芝麻证: LI_XIN_CERTIFICATE
    @NameInMap("risk_identify_result")
    public java.util.List<String> riskIdentifyResult;

    // 空壳企业等级，描述企业空壳程度。
    // 枚举值
    // 优秀企业，没有空壳企业的常见特征，且有很多正向特征证明其正常经营: A+
    // 较为优秀的企业，没有空壳企业的常见特征，且有较多正向特征证明其正常经营: A
    // 较为优秀的企业，几乎没有空壳企业的常见特征，或者有较多正向特征证明其正常经营: B
    // 普通企业，一般没有空壳企业的常见特征，或者有很少量能反映其正常经营的数据: M+
    // 普通企业或者新注册的企业，一般没有空壳企业的常见特征，但是也没有太多能反映其在正常生产经营的数据: M
    // 普通企业，一般没有明显空壳企业的常见特征，也没有太多能反映其在正常生产经营的数据，可能和空壳企业有少量交集: M-
    // 较差企业，有部分空壳企业特征，可能有较少能反映其在正常生产经营的数据。建议这部分企业酌情考虑风险: C+
    // 差企业，有较多空壳企业特征，几乎没有能反映其在正常生产经营的数据: C
    // 差企业，有很多明显空壳企业特征，几乎没有能反映其在正常生产经营的数据: D
    @NameInMap("shell_company_level")
    public String shellCompanyLevel;

    public static QueryAntsaasStaffingcEpcertificationRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcEpcertificationRiskResponse self = new QueryAntsaasStaffingcEpcertificationRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setCertifyStatus(String certifyStatus) {
        this.certifyStatus = certifyStatus;
        return this;
    }
    public String getCertifyStatus() {
        return this.certifyStatus;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setCertifyPersonCardNoPostfix(String certifyPersonCardNoPostfix) {
        this.certifyPersonCardNoPostfix = certifyPersonCardNoPostfix;
        return this;
    }
    public String getCertifyPersonCardNoPostfix() {
        return this.certifyPersonCardNoPostfix;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setCertifyFailReasons(java.util.List<String> certifyFailReasons) {
        this.certifyFailReasons = certifyFailReasons;
        return this;
    }
    public java.util.List<String> getCertifyFailReasons() {
        return this.certifyFailReasons;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setRiskIdentifyResult(java.util.List<String> riskIdentifyResult) {
        this.riskIdentifyResult = riskIdentifyResult;
        return this;
    }
    public java.util.List<String> getRiskIdentifyResult() {
        return this.riskIdentifyResult;
    }

    public QueryAntsaasStaffingcEpcertificationRiskResponse setShellCompanyLevel(String shellCompanyLevel) {
        this.shellCompanyLevel = shellCompanyLevel;
        return this;
    }
    public String getShellCompanyLevel() {
        return this.shellCompanyLevel;
    }

}
