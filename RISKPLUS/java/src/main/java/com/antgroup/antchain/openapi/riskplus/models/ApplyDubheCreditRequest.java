// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubheCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础信息
    @NameInMap("personal_info")
    @Validation(required = true)
    public PersonalInfo personalInfo;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 居住信息
    @NameInMap("borrower_live_info")
    public LiveInfo borrowerLiveInfo;

    // 工作信息
    @NameInMap("borrower_emp_info")
    public JobInfo borrowerEmpInfo;

    // 产品编号
    @NameInMap("prod_no")
    @Validation(required = true)
    public String prodNo;

    // 风险数据对象
    @NameInMap("risk_data")
    public RiskData riskData;

    // 借款用途
    @NameInMap("loan_reason")
    public String loanReason;

    // 资料文件
    @NameInMap("materials")
    public java.util.List<Material> materials;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 流量名称
    @NameInMap("traffic_source_name")
    public String trafficSourceName;

    // 广告位标志
    @NameInMap("traffic_ad_id")
    public String trafficAdId;

    // 预留
    @NameInMap("traffic_mkt_id")
    public String trafficMktId;

    // 预留
    @NameInMap("click_id")
    public String clickId;

    // 渠道类型
    @NameInMap("channel_type")
    public String channelType;

    // 客户类型
    @NameInMap("custom_type")
    public String customType;

    public static ApplyDubheCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubheCreditRequest self = new ApplyDubheCreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubheCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubheCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubheCreditRequest setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
        return this;
    }
    public PersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    public ApplyDubheCreditRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ApplyDubheCreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyDubheCreditRequest setBorrowerLiveInfo(LiveInfo borrowerLiveInfo) {
        this.borrowerLiveInfo = borrowerLiveInfo;
        return this;
    }
    public LiveInfo getBorrowerLiveInfo() {
        return this.borrowerLiveInfo;
    }

    public ApplyDubheCreditRequest setBorrowerEmpInfo(JobInfo borrowerEmpInfo) {
        this.borrowerEmpInfo = borrowerEmpInfo;
        return this;
    }
    public JobInfo getBorrowerEmpInfo() {
        return this.borrowerEmpInfo;
    }

    public ApplyDubheCreditRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public ApplyDubheCreditRequest setRiskData(RiskData riskData) {
        this.riskData = riskData;
        return this;
    }
    public RiskData getRiskData() {
        return this.riskData;
    }

    public ApplyDubheCreditRequest setLoanReason(String loanReason) {
        this.loanReason = loanReason;
        return this;
    }
    public String getLoanReason() {
        return this.loanReason;
    }

    public ApplyDubheCreditRequest setMaterials(java.util.List<Material> materials) {
        this.materials = materials;
        return this;
    }
    public java.util.List<Material> getMaterials() {
        return this.materials;
    }

    public ApplyDubheCreditRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ApplyDubheCreditRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public ApplyDubheCreditRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public ApplyDubheCreditRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public ApplyDubheCreditRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public ApplyDubheCreditRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ApplyDubheCreditRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

}
