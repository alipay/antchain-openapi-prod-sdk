// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeCreditRequest extends TeaModel {
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
    public String prodNo;

    // 风险数据对象json字符串
    @NameInMap("risk_data")
    @Validation(required = true)
    public String riskData;

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

    // 资金方代码
    @NameInMap("fund_code")
    public String fundCode;

    public static ApplyDubbridgeCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeCreditRequest self = new ApplyDubbridgeCreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeCreditRequest setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
        return this;
    }
    public PersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    public ApplyDubbridgeCreditRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ApplyDubbridgeCreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyDubbridgeCreditRequest setBorrowerLiveInfo(LiveInfo borrowerLiveInfo) {
        this.borrowerLiveInfo = borrowerLiveInfo;
        return this;
    }
    public LiveInfo getBorrowerLiveInfo() {
        return this.borrowerLiveInfo;
    }

    public ApplyDubbridgeCreditRequest setBorrowerEmpInfo(JobInfo borrowerEmpInfo) {
        this.borrowerEmpInfo = borrowerEmpInfo;
        return this;
    }
    public JobInfo getBorrowerEmpInfo() {
        return this.borrowerEmpInfo;
    }

    public ApplyDubbridgeCreditRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public ApplyDubbridgeCreditRequest setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

    public ApplyDubbridgeCreditRequest setLoanReason(String loanReason) {
        this.loanReason = loanReason;
        return this;
    }
    public String getLoanReason() {
        return this.loanReason;
    }

    public ApplyDubbridgeCreditRequest setMaterials(java.util.List<Material> materials) {
        this.materials = materials;
        return this;
    }
    public java.util.List<Material> getMaterials() {
        return this.materials;
    }

    public ApplyDubbridgeCreditRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ApplyDubbridgeCreditRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public ApplyDubbridgeCreditRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public ApplyDubbridgeCreditRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public ApplyDubbridgeCreditRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public ApplyDubbridgeCreditRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ApplyDubbridgeCreditRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public ApplyDubbridgeCreditRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

}
