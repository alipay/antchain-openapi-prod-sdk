// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas_de.models;

import com.aliyun.tea.*;

public class ApplyInsurglobifyprodOspiinsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 险种编码
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 10)
    public String externalProductCode;

    // 保险方案名
    @NameInMap("ch_scheme_name")
    @Validation(required = true, maxLength = 20)
    public String chSchemeName;

    // 保险项目名
    @NameInMap("ch_project_name")
    @Validation(required = true, maxLength = 20)
    public String chProjectName;

    // 总保额，小数位只支持2位
    @NameInMap("insured_amount")
    @Validation(required = true, maxLength = 20)
    public String insuredAmount;

    // 保费，小数位只支持2位
    @NameInMap("premium")
    @Validation(required = true, maxLength = 20)
    public String premium;

    // 总保费，小数位只支持2位
    @NameInMap("total_premium")
    @Validation(required = true, maxLength = 20)
    public String totalPremium;

    // 币种，使用ISO 4217代码；
    // CNY：人民币
    // USD：美元
    // EUR：欧元
    // GBP：英镑
    // JPY：日元
    // CHF：瑞士法郎
    // SGD：新加坡元
    @NameInMap("currency")
    @Validation(required = true, maxLength = 3)
    public String currency;

    // 关联的大保单编号
    @NameInMap("big_pol_no")
    @Validation(required = true, maxLength = 200)
    public String bigPolNo;

    // 保险起期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    @NameInMap("insure_start")
    @Validation(required = true, maxLength = 50)
    public String insureStart;

    // 时区
    // Asia/Shanghai
    // Europe/Berlin
    // America/New_York
    // Pacific/Auckland
    // Europe/Berlin 
    @NameInMap("timezone")
    @Validation(required = true, maxLength = 20)
    public String timezone;

    // 投保人名称
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 100)
    public String tbrName;

    // 投保人证件类型
    // // 个人
    // // 护照
    // PASSPORT
    // // 国民身份证
    // NATIONAL_ID
    // // 居留许可
    // RESIDENCE_PERMIT
    // // 个人税号
    // TAX_ID
    // // 企业
    // // 公司注册号（最常用）
    // COMPANY_REGISTRATION
    // // 增值税号
    // VAT_NUMBER
    // // 企业税号
    // TAX_ID
    @NameInMap("tbr_id_type")
    @Validation(required = true, maxLength = 20)
    public String tbrIdType;

    // 投保人证件号
    @NameInMap("tbr_id_no")
    @Validation(required = true, maxLength = 100)
    public String tbrIdNo;

    // 被保人名称
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 100)
    public String bbrName;

    // 被保人证件类型
    // // 个人
    // // 护照
    // PASSPORT
    // // 国民身份证
    // NATIONAL_ID
    // // 居留许可
    // RESIDENCE_PERMIT
    // // 个人税号
    // TAX_ID
    // // 企业
    // // 公司注册号（最常用）
    // COMPANY_REGISTRATION
    // // 增值税号
    // VAT_NUMBER
    // // 企业税号
    // TAX_ID
    @NameInMap("bbr_id_type")
    @Validation(required = true, maxLength = 20)
    public String bbrIdType;

    // 被保人证件号
    @NameInMap("bbr_id_no")
    @Validation(required = true, maxLength = 100)
    public String bbrIdNo;

    // 订单号
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 100)
    public String relaOrderNo;

    // 寄件时间(ISO 8601格式，2026-01-11T14:30:00+02:00)
    @NameInMap("pick_up_time")
    @Validation(required = true, maxLength = 50)
    public String pickUpTime;

    // 快递公司名称
    @NameInMap("courier_company")
    @Validation(required = true, maxLength = 100)
    public String courierCompany;

    // 快递单号
    @NameInMap("courier_number")
    @Validation(required = true, maxLength = 100)
    public String courierNumber;

    // 货物大类
    @NameInMap("cargo_type")
    @Validation(required = true, maxLength = 256)
    public String cargoType;

    // 货物总数量（件）
    @NameInMap("cargo_total_quantity")
    @Validation(required = true, maxLength = 100)
    public String cargoTotalQuantity;

    // 货物总重量
    @NameInMap("cargo_total_weight")
    @Validation(required = true, maxLength = 200)
    public String cargoTotalWeight;

    // 货物总价值，小数位只支持2位
    @NameInMap("cargo_total_worth")
    @Validation(required = true, maxLength = 20)
    public String cargoTotalWorth;

    // 卖家脱敏唯一标识
    @NameInMap("sell_id")
    @Validation(required = true, maxLength = 100)
    public String sellId;

    // 卖家NAIC代码
    @NameInMap("sell_naic_code")
    @Validation(required = true, maxLength = 50)
    public String sellNaicCode;

    // 出发地ISO国别
    @NameInMap("start_place_iso_country")
    @Validation(required = true, maxLength = 10)
    public String startPlaceIsoCountry;

    // 出发地省市
    @NameInMap("start_place_province_city")
    @Validation(required = true, maxLength = 50)
    public String startPlaceProvinceCity;

    // 出发地详细地址
    @NameInMap("start_place")
    @Validation(required = true, maxLength = 500)
    public String startPlace;

    // 出发地邮编
    @NameInMap("start_place_postcode")
    @Validation(required = true, maxLength = 50)
    public String startPlacePostcode;

    // 买家脱敏唯一标识
    @NameInMap("buy_id")
    @Validation(required = true, maxLength = 100)
    public String buyId;

    // 目的地ISO国别
    @NameInMap("iso_country")
    @Validation(required = true, maxLength = 10)
    public String isoCountry;

    // 湖南省长沙市
    @NameInMap("destination_province_city")
    @Validation(required = true, maxLength = 50)
    public String destinationProvinceCity;

    // 目的地详细地址
    @NameInMap("destination")
    @Validation(required = true, maxLength = 500)
    public String destination;

    // 货物明细列表
    @NameInMap("cargo_details")
    @Validation(required = true)
    public java.util.List<CargoDetail> cargoDetails;

    public static ApplyInsurglobifyprodOspiinsureRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurglobifyprodOspiinsureRequest self = new ApplyInsurglobifyprodOspiinsureRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsurglobifyprodOspiinsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setChSchemeName(String chSchemeName) {
        this.chSchemeName = chSchemeName;
        return this;
    }
    public String getChSchemeName() {
        return this.chSchemeName;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setChProjectName(String chProjectName) {
        this.chProjectName = chProjectName;
        return this;
    }
    public String getChProjectName() {
        return this.chProjectName;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
        return this;
    }
    public String getInsuredAmount() {
        return this.insuredAmount;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setTotalPremium(String totalPremium) {
        this.totalPremium = totalPremium;
        return this;
    }
    public String getTotalPremium() {
        return this.totalPremium;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setBigPolNo(String bigPolNo) {
        this.bigPolNo = bigPolNo;
        return this;
    }
    public String getBigPolNo() {
        return this.bigPolNo;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
        return this;
    }
    public String getPickUpTime() {
        return this.pickUpTime;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCourierCompany(String courierCompany) {
        this.courierCompany = courierCompany;
        return this;
    }
    public String getCourierCompany() {
        return this.courierCompany;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
        return this;
    }
    public String getCourierNumber() {
        return this.courierNumber;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCargoTotalQuantity(String cargoTotalQuantity) {
        this.cargoTotalQuantity = cargoTotalQuantity;
        return this;
    }
    public String getCargoTotalQuantity() {
        return this.cargoTotalQuantity;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCargoTotalWeight(String cargoTotalWeight) {
        this.cargoTotalWeight = cargoTotalWeight;
        return this;
    }
    public String getCargoTotalWeight() {
        return this.cargoTotalWeight;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCargoTotalWorth(String cargoTotalWorth) {
        this.cargoTotalWorth = cargoTotalWorth;
        return this;
    }
    public String getCargoTotalWorth() {
        return this.cargoTotalWorth;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setSellId(String sellId) {
        this.sellId = sellId;
        return this;
    }
    public String getSellId() {
        return this.sellId;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setSellNaicCode(String sellNaicCode) {
        this.sellNaicCode = sellNaicCode;
        return this;
    }
    public String getSellNaicCode() {
        return this.sellNaicCode;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setStartPlaceIsoCountry(String startPlaceIsoCountry) {
        this.startPlaceIsoCountry = startPlaceIsoCountry;
        return this;
    }
    public String getStartPlaceIsoCountry() {
        return this.startPlaceIsoCountry;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setStartPlaceProvinceCity(String startPlaceProvinceCity) {
        this.startPlaceProvinceCity = startPlaceProvinceCity;
        return this;
    }
    public String getStartPlaceProvinceCity() {
        return this.startPlaceProvinceCity;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setStartPlacePostcode(String startPlacePostcode) {
        this.startPlacePostcode = startPlacePostcode;
        return this;
    }
    public String getStartPlacePostcode() {
        return this.startPlacePostcode;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setBuyId(String buyId) {
        this.buyId = buyId;
        return this;
    }
    public String getBuyId() {
        return this.buyId;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
        return this;
    }
    public String getIsoCountry() {
        return this.isoCountry;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setDestinationProvinceCity(String destinationProvinceCity) {
        this.destinationProvinceCity = destinationProvinceCity;
        return this;
    }
    public String getDestinationProvinceCity() {
        return this.destinationProvinceCity;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsurglobifyprodOspiinsureRequest setCargoDetails(java.util.List<CargoDetail> cargoDetails) {
        this.cargoDetails = cargoDetails;
        return this;
    }
    public java.util.List<CargoDetail> getCargoDetails() {
        return this.cargoDetails;
    }

}
