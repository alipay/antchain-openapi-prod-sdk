// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyBcliInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投保流水号，格式：日期_身份标识_全局唯一序号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 保司编码,CPIC_SHENZHEN-太保深分
    @NameInMap("external_channel_code")
    @Validation(required = true)
    public String externalChannelCode;

    // 保险产品编码,Pbins-动力电池延保保险产品编码
    @NameInMap("external_product_code")
    @Validation(required = true)
    public String externalProductCode;

    // 投保人名称
    @NameInMap("tbr_name")
    @Validation(required = true)
    public String tbrName;

    // 投保人证件类型，01-居民身份证、03-营业执照
    @NameInMap("tbr_id_type")
    @Validation(required = true)
    public String tbrIdType;

    // 投保人证件号码
    @NameInMap("tbr_id_no")
    @Validation(required = true)
    public String tbrIdNo;

    // 投保人联系地址
    @NameInMap("tbr_addr")
    @Validation(required = true)
    public String tbrAddr;

    // 被保人名称
    @NameInMap("bbr_name")
    @Validation(required = true)
    public String bbrName;

    // 01-居民身份证、03-营业执照
    @NameInMap("bbr_id_type")
    @Validation(required = true)
    public String bbrIdType;

    // 被保人证件号码
    @NameInMap("bbr_id_no")
    @Validation(required = true)
    public String bbrIdNo;

    // 被保人联系地址
    @NameInMap("bbr_addr")
    @Validation(required = true)
    public String bbrAddr;

    // 投保方案ID，battery202501
    @NameInMap("scheme_name")
    @Validation(required = true)
    public String schemeName;

    // 保额，金额人民币元，整数
    @NameInMap("insured_amount")
    @Validation(required = true)
    public String insuredAmount;

    // 客户所期待的保险起期，实际保司出单以保司出具的信息为准，格式：YYYY-MM-DD HH:MM:SS
    @NameInMap("insure_start")
    public String insureStart;

    // 客户所期待的保险止期，实际保司出单以保司出具的信息为准,格式：YYYY-MM-DD HH:MM:SS
    @NameInMap("insure_end")
    public String insureEnd;

    // 邮箱地址，用于保司回传科技公司电子保单
    @NameInMap("email")
    public String email;

    // 保险期限内电池容量允许衰减程度
    @NameInMap("bcda_pt")
    @Validation(required = true)
    public String bcdaPt;

    // 车牌号码
    @NameInMap("vehicle_plate")
    @Validation(required = true)
    public String vehiclePlate;

    // 车架号
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 车辆初登日期  格式：YYYY-MM-DD
    @NameInMap("vehicle_regist_date")
    @Validation(required = true)
    public String vehicleRegistDate;

    // 行驶证发证日期,格式：YYYY-MM-DD
    @NameInMap("license_date")
    @Validation(required = true)
    public String licenseDate;

    // 车辆使用性质,01-企业非营业用车、02出租车、03租赁车、04家庭自用车、05党政机关用车、06事业团体用车、07城市公交、08公路客运、09营运货车、10营业特种车
    @NameInMap("vehicle_usage")
    @Validation(required = true)
    public String vehicleUsage;

    // 投保车辆实际价值（元）,金额人民币元，精确到小数点后2位
    @NameInMap("vehicle_price")
    @Validation(required = true)
    public String vehiclePrice;

    // 投保车龄（月）
    @NameInMap("vehicle_age")
    @Validation(required = true)
    public String vehicleAge;

    // 行驶证图片信息url
    @NameInMap("license_picture")
    @Validation(required = true)
    public String licensePicture;

    // 动力电池编码（ID),动力电池包的唯一标识
    @NameInMap("battery_code")
    @Validation(required = true)
    public String batteryCode;

    // 动力电池铭牌照片url
    @NameInMap("battery_nameplate_picture")
    @Validation(required = true)
    public String batteryNameplatePicture;

    public static ApplyBcliInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBcliInsuranceRequest self = new ApplyBcliInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBcliInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyBcliInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyBcliInsuranceRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyBcliInsuranceRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyBcliInsuranceRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyBcliInsuranceRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyBcliInsuranceRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyBcliInsuranceRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyBcliInsuranceRequest setTbrAddr(String tbrAddr) {
        this.tbrAddr = tbrAddr;
        return this;
    }
    public String getTbrAddr() {
        return this.tbrAddr;
    }

    public ApplyBcliInsuranceRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyBcliInsuranceRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyBcliInsuranceRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyBcliInsuranceRequest setBbrAddr(String bbrAddr) {
        this.bbrAddr = bbrAddr;
        return this;
    }
    public String getBbrAddr() {
        return this.bbrAddr;
    }

    public ApplyBcliInsuranceRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public ApplyBcliInsuranceRequest setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
        return this;
    }
    public String getInsuredAmount() {
        return this.insuredAmount;
    }

    public ApplyBcliInsuranceRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyBcliInsuranceRequest setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

    public ApplyBcliInsuranceRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ApplyBcliInsuranceRequest setBcdaPt(String bcdaPt) {
        this.bcdaPt = bcdaPt;
        return this;
    }
    public String getBcdaPt() {
        return this.bcdaPt;
    }

    public ApplyBcliInsuranceRequest setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
        return this;
    }
    public String getVehiclePlate() {
        return this.vehiclePlate;
    }

    public ApplyBcliInsuranceRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public ApplyBcliInsuranceRequest setVehicleRegistDate(String vehicleRegistDate) {
        this.vehicleRegistDate = vehicleRegistDate;
        return this;
    }
    public String getVehicleRegistDate() {
        return this.vehicleRegistDate;
    }

    public ApplyBcliInsuranceRequest setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
        return this;
    }
    public String getLicenseDate() {
        return this.licenseDate;
    }

    public ApplyBcliInsuranceRequest setVehicleUsage(String vehicleUsage) {
        this.vehicleUsage = vehicleUsage;
        return this;
    }
    public String getVehicleUsage() {
        return this.vehicleUsage;
    }

    public ApplyBcliInsuranceRequest setVehiclePrice(String vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
        return this;
    }
    public String getVehiclePrice() {
        return this.vehiclePrice;
    }

    public ApplyBcliInsuranceRequest setVehicleAge(String vehicleAge) {
        this.vehicleAge = vehicleAge;
        return this;
    }
    public String getVehicleAge() {
        return this.vehicleAge;
    }

    public ApplyBcliInsuranceRequest setLicensePicture(String licensePicture) {
        this.licensePicture = licensePicture;
        return this;
    }
    public String getLicensePicture() {
        return this.licensePicture;
    }

    public ApplyBcliInsuranceRequest setBatteryCode(String batteryCode) {
        this.batteryCode = batteryCode;
        return this;
    }
    public String getBatteryCode() {
        return this.batteryCode;
    }

    public ApplyBcliInsuranceRequest setBatteryNameplatePicture(String batteryNameplatePicture) {
        this.batteryNameplatePicture = batteryNameplatePicture;
        return this;
    }
    public String getBatteryNameplatePicture() {
        return this.batteryNameplatePicture;
    }

}
