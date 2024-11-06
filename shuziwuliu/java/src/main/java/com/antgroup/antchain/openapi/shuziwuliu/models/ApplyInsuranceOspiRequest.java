// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceOspiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。 
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码.，PAIC---平安，CICP-中华财险
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 险种编码，04--海外邮包险
    // 
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 投保人姓名，保险协议中的投保人全称
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 100)
    public String tbrName;

    // 投保人证件类型，03--营业执照
    @NameInMap("tbr_id_type")
    @Validation(required = true, maxLength = 2)
    public String tbrIdType;

    // 投保人证件号码
    @NameInMap("tbr_id_no")
    @Validation(required = true, maxLength = 30)
    public String tbrIdNo;

    // 被保人姓名，实际的保险被保人名称
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 100)
    public String bbrName;

    // 被保人证件类型，01--居民身份证、03--营业执照
    @NameInMap("bbr_id_type")
    @Validation(required = true, maxLength = 2)
    public String bbrIdType;

    // 被保人证件号码
    @NameInMap("bbr_id_no")
    @Validation(required = true, maxLength = 30)
    public String bbrIdNo;

    // 受益人名称，实际的保险受益人名称
    @NameInMap("beneficiary_name")
    @Validation(required = true, maxLength = 100)
    public String beneficiaryName;

    // 受益人证件类型，01--居民身份证、03--营业执照
    @NameInMap("beneficiary_id_type")
    @Validation(required = true, maxLength = 2)
    public String beneficiaryIdType;

    // 受益人证件号码
    @NameInMap("beneficiary_no")
    @Validation(required = true, maxLength = 30)
    public String beneficiaryNo;

    // 保险起期，日期格式yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_start")
    @Validation(required = true)
    public String insureStart;

    // 保险金额，单位（元），最多支持2位小数，超过2位拒绝；
    @NameInMap("insured_amount")
    @Validation(required = true)
    public String insuredAmount;

    // 方案名，海外邮包险--OWFP
    @NameInMap("scheme_name")
    @Validation(required = true, maxLength = 100)
    public String schemeName;

    // 项目名称,海外邮包险：OWFP-对应国别，例OWFP-RU
    @NameInMap("project_name")
    @Validation(required = true, maxLength = 500)
    public String projectName;

    // 订单号,物流平台用以区分业务的唯一码
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 200)
    public String relaOrderNo;

    // 寄件时间，日期格式yyyy-MM-dd HH:mm:ss
    @NameInMap("pick_up_time")
    @Validation(required = true)
    public String pickUpTime;

    // 快递公司名称，实际的派送公司全称
    @NameInMap("courier_company")
    @Validation(required = true, maxLength = 200)
    public String courierCompany;

    // 快递单号，实际的派送快递单号
    @NameInMap("courier_number")
    @Validation(required = true, maxLength = 100)
    public String courierNumber;

    // 货物类型，货物类型的大类
    @NameInMap("cargo_type")
    @Validation(required = true, maxLength = 100)
    public String cargoType;

    // 货物名称，实际的货物名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 200)
    public String cargoName;

    // 货物数量
    @NameInMap("cargo_quantity")
    @Validation(required = true)
    public String cargoQuantity;

    // 买家ID，买家的脱敏唯一标识
    @NameInMap("buy_id")
    @Validation(required = true, maxLength = 100)
    public String buyId;

    // 卖家ID，卖家的脱敏唯一标识
    @NameInMap("sell_id")
    @Validation(required = true, maxLength = 100)
    public String sellId;

    // 站点/仓储ID，站点/仓储的脱敏唯一标识
    @NameInMap("site_id")
    @Validation(required = true, maxLength = 100)
    public String siteId;

    // 出发地地址，包裹的实际发件地地址
    @NameInMap("start_place")
    @Validation(required = true, maxLength = 500)
    public String startPlace;

    // 目的地地址，包裹的实际收件地地址
    @NameInMap("destination")
    @Validation(required = true, maxLength = 500)
    public String destination;

    // ISO到达国别，包裹业务实际发生的国家
    @NameInMap("iso_country")
    @Validation(required = true, maxLength = 10)
    public String isoCountry;

    // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
    @NameInMap("cargo_worth")
    @Validation(required = true)
    public String cargoWorth;

    // 收货人名称
    @NameInMap("consignee_name")
    @Validation(maxLength = 100)
    public String consigneeName;

    // 询价code
    @NameInMap("quote_mark")
    public String quoteMark;

    // 标的列表
    @NameInMap("cargo_info")
    public java.util.List<CargoInfo> cargoInfo;

    public static ApplyInsuranceOspiRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceOspiRequest self = new ApplyInsuranceOspiRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceOspiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceOspiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceOspiRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceOspiRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsuranceOspiRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsuranceOspiRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyInsuranceOspiRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyInsuranceOspiRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyInsuranceOspiRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsuranceOspiRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsuranceOspiRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsuranceOspiRequest setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        return this;
    }
    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public ApplyInsuranceOspiRequest setBeneficiaryIdType(String beneficiaryIdType) {
        this.beneficiaryIdType = beneficiaryIdType;
        return this;
    }
    public String getBeneficiaryIdType() {
        return this.beneficiaryIdType;
    }

    public ApplyInsuranceOspiRequest setBeneficiaryNo(String beneficiaryNo) {
        this.beneficiaryNo = beneficiaryNo;
        return this;
    }
    public String getBeneficiaryNo() {
        return this.beneficiaryNo;
    }

    public ApplyInsuranceOspiRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyInsuranceOspiRequest setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
        return this;
    }
    public String getInsuredAmount() {
        return this.insuredAmount;
    }

    public ApplyInsuranceOspiRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public ApplyInsuranceOspiRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ApplyInsuranceOspiRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public ApplyInsuranceOspiRequest setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
        return this;
    }
    public String getPickUpTime() {
        return this.pickUpTime;
    }

    public ApplyInsuranceOspiRequest setCourierCompany(String courierCompany) {
        this.courierCompany = courierCompany;
        return this;
    }
    public String getCourierCompany() {
        return this.courierCompany;
    }

    public ApplyInsuranceOspiRequest setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
        return this;
    }
    public String getCourierNumber() {
        return this.courierNumber;
    }

    public ApplyInsuranceOspiRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public ApplyInsuranceOspiRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public ApplyInsuranceOspiRequest setCargoQuantity(String cargoQuantity) {
        this.cargoQuantity = cargoQuantity;
        return this;
    }
    public String getCargoQuantity() {
        return this.cargoQuantity;
    }

    public ApplyInsuranceOspiRequest setBuyId(String buyId) {
        this.buyId = buyId;
        return this;
    }
    public String getBuyId() {
        return this.buyId;
    }

    public ApplyInsuranceOspiRequest setSellId(String sellId) {
        this.sellId = sellId;
        return this;
    }
    public String getSellId() {
        return this.sellId;
    }

    public ApplyInsuranceOspiRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ApplyInsuranceOspiRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsuranceOspiRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsuranceOspiRequest setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
        return this;
    }
    public String getIsoCountry() {
        return this.isoCountry;
    }

    public ApplyInsuranceOspiRequest setCargoWorth(String cargoWorth) {
        this.cargoWorth = cargoWorth;
        return this;
    }
    public String getCargoWorth() {
        return this.cargoWorth;
    }

    public ApplyInsuranceOspiRequest setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
        return this;
    }
    public String getConsigneeName() {
        return this.consigneeName;
    }

    public ApplyInsuranceOspiRequest setQuoteMark(String quoteMark) {
        this.quoteMark = quoteMark;
        return this;
    }
    public String getQuoteMark() {
        return this.quoteMark;
    }

    public ApplyInsuranceOspiRequest setCargoInfo(java.util.List<CargoInfo> cargoInfo) {
        this.cargoInfo = cargoInfo;
        return this;
    }
    public java.util.List<CargoInfo> getCargoInfo() {
        return this.cargoInfo;
    }

}
