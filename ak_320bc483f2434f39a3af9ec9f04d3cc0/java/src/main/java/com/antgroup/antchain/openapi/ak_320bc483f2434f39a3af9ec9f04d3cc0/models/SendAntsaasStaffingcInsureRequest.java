// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SendAntsaasStaffingcInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部业务号（幂等、异步通知回传）
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 企业名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 统一社会信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 保险场景码: 
    // FLEXIBLE_EMPLOYMENT-日单（实时生效）
    // INITIATIVE_EMPLOYMENT- 长期（次日0点生效）
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 投保的险种编码:
    // ACCIDENT: 意外险,
    // EMPLOYER_LIABILITY: 雇主险
    @NameInMap("insurance_type_code")
    @Validation(required = true)
    public String insuranceTypeCode;

    // 产品ID
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 职业编码: 
    // default-1-一类职业; 
    // default-2-二类职业;
    // default-3-三类职业;
    // default-4-四类职业;
    // default-5-五类职业（雇主险60万和80万保额暂不支持）
    @NameInMap("job_code")
    @Validation(required = true)
    public String jobCode;

    // 保障周期：30D、360D（bizCode为长期时必传）
    @NameInMap("period")
    public String period;

    // 推荐编码
    @NameInMap("recom_flow_no")
    public String recomFlowNo;

    // 地址（bizCode为日单必传）
    @NameInMap("address")
    public String address;

    // 投保人列表，extra_msg需传递out_sub_biz_no，外部明细业务号（投保结果通知会回传，自行定义）
    @NameInMap("employee_list")
    @Validation(required = true)
    public java.util.List<InsureEmployeeInfo> employeeList;

    public static SendAntsaasStaffingcInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAntsaasStaffingcInsureRequest self = new SendAntsaasStaffingcInsureRequest();
        return TeaModel.build(map, self);
    }

    public SendAntsaasStaffingcInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendAntsaasStaffingcInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendAntsaasStaffingcInsureRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public SendAntsaasStaffingcInsureRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public SendAntsaasStaffingcInsureRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public SendAntsaasStaffingcInsureRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public SendAntsaasStaffingcInsureRequest setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

    public SendAntsaasStaffingcInsureRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SendAntsaasStaffingcInsureRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public SendAntsaasStaffingcInsureRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public SendAntsaasStaffingcInsureRequest setRecomFlowNo(String recomFlowNo) {
        this.recomFlowNo = recomFlowNo;
        return this;
    }
    public String getRecomFlowNo() {
        return this.recomFlowNo;
    }

    public SendAntsaasStaffingcInsureRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SendAntsaasStaffingcInsureRequest setEmployeeList(java.util.List<InsureEmployeeInfo> employeeList) {
        this.employeeList = employeeList;
        return this;
    }
    public java.util.List<InsureEmployeeInfo> getEmployeeList() {
        return this.employeeList;
    }

}
