// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetMarketingInsureurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求 id，做防重校验逻辑
    // 接口根据 requestId 做防重校验逻辑，若重复会报错
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 128)
    public String requestId;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 128)
    public String productCode;

    // 保司编码
    @NameInMap("channel_code")
    @Validation(required = true, maxLength = 64)
    public String channelCode;

    // 保司出单机构编码，若没有同保司编码
    @NameInMap("issue_org")
    @Validation(required = true, maxLength = 64)
    public String issueOrg;

    // 保司产品编码
    @NameInMap("channel_product_code")
    @Validation(required = true, maxLength = 64)
    public String channelProductCode;

    // 保险产品类型，枚举：
    // STANDARD（均分）
    // PREMIUM（大小均分）
    // GIFT_TRANSFER（赠转商）
    @NameInMap("channel_product_type")
    @Validation(required = true, maxLength = 64)
    public String channelProductType;

    // 保险方案
    @NameInMap("insurance_plan")
    @Validation(required = true, maxLength = 20)
    public String insurancePlan;

    // 一级渠道编码
    @NameInMap("first_channel")
    @Validation(required = true, maxLength = 64)
    public String firstChannel;

    // 二级渠道编码
    @NameInMap("second_channel")
    @Validation(maxLength = 64)
    public String secondChannel;

    // 三级渠道/广告版位
    @NameInMap("advertising_position")
    @Validation(maxLength = 64)
    public String advertisingPosition;

    // 设备类型/用户类型，枚举：
    // muid
    // oaid
    // caid
    // imei
    // idfa
    // userid
    @NameInMap("device_type")
    @Validation(required = true, maxLength = 64)
    public String deviceType;

    // 设备编号/用户编号
    @NameInMap("device_id")
    @Validation(required = true, maxLength = 64)
    public String deviceId;

    // 点击时间 yyyy-MM-dd HH:mm:ss
    @NameInMap("click_time")
    @Validation(required = true, maxLength = 20)
    public String clickTime;

    // 订单编号
    @NameInMap("scene_order_no")
    @Validation(required = true, maxLength = 64)
    public String sceneOrderNo;

    // 投保人姓名
    @NameInMap("applicant_name")
    @Validation(maxLength = 64)
    public String applicantName;

    // 投保人证件号
    @NameInMap("applicant_cert_no")
    @Validation(maxLength = 64)
    public String applicantCertNo;

    // 投保人联系方式
    @NameInMap("applicant_phone")
    @Validation(maxLength = 64)
    public String applicantPhone;

    public static GetMarketingInsureurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMarketingInsureurlRequest self = new GetMarketingInsureurlRequest();
        return TeaModel.build(map, self);
    }

    public GetMarketingInsureurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMarketingInsureurlRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMarketingInsureurlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetMarketingInsureurlRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public GetMarketingInsureurlRequest setIssueOrg(String issueOrg) {
        this.issueOrg = issueOrg;
        return this;
    }
    public String getIssueOrg() {
        return this.issueOrg;
    }

    public GetMarketingInsureurlRequest setChannelProductCode(String channelProductCode) {
        this.channelProductCode = channelProductCode;
        return this;
    }
    public String getChannelProductCode() {
        return this.channelProductCode;
    }

    public GetMarketingInsureurlRequest setChannelProductType(String channelProductType) {
        this.channelProductType = channelProductType;
        return this;
    }
    public String getChannelProductType() {
        return this.channelProductType;
    }

    public GetMarketingInsureurlRequest setInsurancePlan(String insurancePlan) {
        this.insurancePlan = insurancePlan;
        return this;
    }
    public String getInsurancePlan() {
        return this.insurancePlan;
    }

    public GetMarketingInsureurlRequest setFirstChannel(String firstChannel) {
        this.firstChannel = firstChannel;
        return this;
    }
    public String getFirstChannel() {
        return this.firstChannel;
    }

    public GetMarketingInsureurlRequest setSecondChannel(String secondChannel) {
        this.secondChannel = secondChannel;
        return this;
    }
    public String getSecondChannel() {
        return this.secondChannel;
    }

    public GetMarketingInsureurlRequest setAdvertisingPosition(String advertisingPosition) {
        this.advertisingPosition = advertisingPosition;
        return this;
    }
    public String getAdvertisingPosition() {
        return this.advertisingPosition;
    }

    public GetMarketingInsureurlRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public GetMarketingInsureurlRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetMarketingInsureurlRequest setClickTime(String clickTime) {
        this.clickTime = clickTime;
        return this;
    }
    public String getClickTime() {
        return this.clickTime;
    }

    public GetMarketingInsureurlRequest setSceneOrderNo(String sceneOrderNo) {
        this.sceneOrderNo = sceneOrderNo;
        return this;
    }
    public String getSceneOrderNo() {
        return this.sceneOrderNo;
    }

    public GetMarketingInsureurlRequest setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public GetMarketingInsureurlRequest setApplicantCertNo(String applicantCertNo) {
        this.applicantCertNo = applicantCertNo;
        return this;
    }
    public String getApplicantCertNo() {
        return this.applicantCertNo;
    }

    public GetMarketingInsureurlRequest setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
        return this;
    }
    public String getApplicantPhone() {
        return this.applicantPhone;
    }

}
