// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsurancepolicyUniversalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投保人开户银行，当打印发票选择为“1”时，必填
    @NameInMap("account_bank_name")
    @Validation(maxLength = 100)
    public String accountBankName;

    // 投保人银行账户，当打印发票选择为“1”时，必填
    @NameInMap("bank_account_information")
    @Validation(maxLength = 50)
    public String bankAccountInformation;

    // 被保人地址
    @NameInMap("bbr_addr")
    @Validation(maxLength = 200)
    public String bbrAddr;

    // 被保人did（被保人所在链上分布式数字身份）
    @NameInMap("bbr_did")
    @Validation(maxLength = 200)
    public String bbrDid;

    // 被保人证件号
    @NameInMap("bbr_id_no")
    @Validation(required = true, maxLength = 50)
    public String bbrIdNo;

    // 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他	
    // 
    @NameInMap("bbr_id_type")
    @Validation(required = true, maxLength = 2)
    public String bbrIdType;

    // 被保人姓名
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 100)
    public String bbrName;

    // 被保人电话号
    @NameInMap("bbr_tel")
    @Validation(required = true, maxLength = 20)
    public String bbrTel;

    // 被保人类型, 1-个人 2-团队
    @NameInMap("bbr_type")
    @Validation(required = true, maxLength = 1)
    public String bbrType;

    // 货物名称
    @NameInMap("cargo_name")
    @Validation(maxLength = 100)
    public String cargoName;

    // 货物数量
    @NameInMap("cargo_quantity")
    @Validation(required = true, maxLength = 20)
    public String cargoQuantity;

    // 货物数量单位
    @NameInMap("cargo_quantity_unit")
    @Validation(required = true, maxLength = 20)
    public String cargoQuantityUnit;

    // 货物吨位
    @NameInMap("cargo_tonnage")
    @Validation(maxLength = 20)
    public String cargoTonnage;

    // 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
    @NameInMap("cargo_type")
    @Validation(required = true, maxLength = 50)
    public String cargoType;

    // 货物体积
    @NameInMap("cargo_volume")
    @Validation(maxLength = 20)
    public String cargoVolume;

    // 货值
    @NameInMap("cargo_worth")
    @Validation(required = true, maxLength = 50)
    public String cargoWorth;

    // 车长
    @NameInMap("car_length")
    @Validation(maxLength = 10)
    public String carLength;

    // 车型
    @NameInMap("car_model")
    @Validation(maxLength = 20)
    public String carModel;

    // 目的地，格式为"省-市-区"
    @NameInMap("destination")
    @Validation(required = true, maxLength = 100)
    public String destination;

    // 司机姓名
    @NameInMap("driver_name")
    @Validation(required = true, maxLength = 50)
    public String driverName;

    // 司机联系方式
    @NameInMap("driver_tel")
    @Validation(required = true, maxLength = 20)
    public String driverTel;

    // 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
    @NameInMap("eff_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effDate;

    // 保司, 01-华泰, 02-平安, 03-亚太
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 2)
    public String externalChannelCode;

    // 险种, 01-承运人平台责任险
    // 
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 车架号
    @NameInMap("frame_no")
    @Validation(maxLength = 50)
    public String frameNo;

    // 投保额，整数以元为单位
    // 
    @NameInMap("insured_amount")
    @Validation(required = true, maxLength = 12)
    public String insuredAmount;

    // 车牌号
    @NameInMap("license_no")
    @Validation(required = true, maxLength = 20)
    public String licenseNo;

    // 车牌颜色，01-黄牌，02-蓝牌
    @NameInMap("license_plate_color")
    @Validation(maxLength = 2)
    public String licensePlateColor;

    // 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
    @NameInMap("nsr_identifier")
    @Validation(maxLength = 50)
    public String nsrIdentifier;

    // 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
    @NameInMap("order_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderTime;

    // 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
    @NameInMap("packing")
    @Validation(maxLength = 100)
    public String packing;

    // 是否打印发票，默认0-不开票  1-专票 2-电子发票
    @NameInMap("print_invoice")
    @Validation(required = true, maxLength = 1)
    public String printInvoice;

    // 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
    @NameInMap("rate")
    @Validation(required = true, maxLength = 8)
    public String rate;

    // 起运地，格式为"省-市-区"
    @NameInMap("start_place")
    @Validation(required = true, maxLength = 100)
    public String startPlace;

    // 投保人地址，当打印发票选择为“1”时，必填
    @NameInMap("tbr_addr")
    @Validation(maxLength = 200)
    public String tbrAddr;

    // 投保人-企业联系人联系方式
    @NameInMap("tbr_corporate_contract")
    @Validation(maxLength = 20)
    public String tbrCorporateContract;

    // 投保人did（投保人所在链上分布式数字身份）
    @NameInMap("tbr_did")
    @Validation(maxLength = 200)
    public String tbrDid;

    // 投保人邮箱，用以接受电子发票的邮箱地址
    @NameInMap("tbr_email")
    @Validation(maxLength = 50)
    public String tbrEmail;

    // 投保人证件号
    @NameInMap("tbr_id_no")
    @Validation(required = true, maxLength = 50)
    public String tbrIdNo;

    // 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
    @NameInMap("tbr_id_type")
    @Validation(required = true, maxLength = 2)
    public String tbrIdType;

    // 投保人名称
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 100)
    public String tbrName;

    // 投保人电话号
    @NameInMap("tbr_tel")
    @Validation(required = true, maxLength = 20)
    public String tbrTel;

    // 投保人类型, 1-个人 2-团队
    @NameInMap("tbr_type")
    @Validation(required = true, maxLength = 1)
    public String tbrType;

    // 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
    @NameInMap("term_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String termDate;

    // 专票邮寄地址
    @NameInMap("ticket_addr")
    @Validation(maxLength = 200)
    public String ticketAddr;

    // 订单号, 年月日+唯一字符ID
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 中转地，格式为"省-市-区"
    @NameInMap("transit_point")
    @Validation(maxLength = 100)
    public String transitPoint;

    // 运单id（平台方运单id）
    @NameInMap("waybill_id")
    @Validation(required = true, maxLength = 50)
    public String waybillId;

    public static ApplyInsurancepolicyUniversalRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurancepolicyUniversalRequest self = new ApplyInsurancepolicyUniversalRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsurancepolicyUniversalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsurancepolicyUniversalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsurancepolicyUniversalRequest setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
        return this;
    }
    public String getAccountBankName() {
        return this.accountBankName;
    }

    public ApplyInsurancepolicyUniversalRequest setBankAccountInformation(String bankAccountInformation) {
        this.bankAccountInformation = bankAccountInformation;
        return this;
    }
    public String getBankAccountInformation() {
        return this.bankAccountInformation;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrAddr(String bbrAddr) {
        this.bbrAddr = bbrAddr;
        return this;
    }
    public String getBbrAddr() {
        return this.bbrAddr;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrDid(String bbrDid) {
        this.bbrDid = bbrDid;
        return this;
    }
    public String getBbrDid() {
        return this.bbrDid;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrTel(String bbrTel) {
        this.bbrTel = bbrTel;
        return this;
    }
    public String getBbrTel() {
        return this.bbrTel;
    }

    public ApplyInsurancepolicyUniversalRequest setBbrType(String bbrType) {
        this.bbrType = bbrType;
        return this;
    }
    public String getBbrType() {
        return this.bbrType;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoQuantity(String cargoQuantity) {
        this.cargoQuantity = cargoQuantity;
        return this;
    }
    public String getCargoQuantity() {
        return this.cargoQuantity;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoQuantityUnit(String cargoQuantityUnit) {
        this.cargoQuantityUnit = cargoQuantityUnit;
        return this;
    }
    public String getCargoQuantityUnit() {
        return this.cargoQuantityUnit;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoTonnage(String cargoTonnage) {
        this.cargoTonnage = cargoTonnage;
        return this;
    }
    public String getCargoTonnage() {
        return this.cargoTonnage;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
        return this;
    }
    public String getCargoVolume() {
        return this.cargoVolume;
    }

    public ApplyInsurancepolicyUniversalRequest setCargoWorth(String cargoWorth) {
        this.cargoWorth = cargoWorth;
        return this;
    }
    public String getCargoWorth() {
        return this.cargoWorth;
    }

    public ApplyInsurancepolicyUniversalRequest setCarLength(String carLength) {
        this.carLength = carLength;
        return this;
    }
    public String getCarLength() {
        return this.carLength;
    }

    public ApplyInsurancepolicyUniversalRequest setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }
    public String getCarModel() {
        return this.carModel;
    }

    public ApplyInsurancepolicyUniversalRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsurancepolicyUniversalRequest setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
    public String getDriverName() {
        return this.driverName;
    }

    public ApplyInsurancepolicyUniversalRequest setDriverTel(String driverTel) {
        this.driverTel = driverTel;
        return this;
    }
    public String getDriverTel() {
        return this.driverTel;
    }

    public ApplyInsurancepolicyUniversalRequest setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }
    public String getEffDate() {
        return this.effDate;
    }

    public ApplyInsurancepolicyUniversalRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsurancepolicyUniversalRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsurancepolicyUniversalRequest setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public ApplyInsurancepolicyUniversalRequest setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
        return this;
    }
    public String getInsuredAmount() {
        return this.insuredAmount;
    }

    public ApplyInsurancepolicyUniversalRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public ApplyInsurancepolicyUniversalRequest setLicensePlateColor(String licensePlateColor) {
        this.licensePlateColor = licensePlateColor;
        return this;
    }
    public String getLicensePlateColor() {
        return this.licensePlateColor;
    }

    public ApplyInsurancepolicyUniversalRequest setNsrIdentifier(String nsrIdentifier) {
        this.nsrIdentifier = nsrIdentifier;
        return this;
    }
    public String getNsrIdentifier() {
        return this.nsrIdentifier;
    }

    public ApplyInsurancepolicyUniversalRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public ApplyInsurancepolicyUniversalRequest setPacking(String packing) {
        this.packing = packing;
        return this;
    }
    public String getPacking() {
        return this.packing;
    }

    public ApplyInsurancepolicyUniversalRequest setPrintInvoice(String printInvoice) {
        this.printInvoice = printInvoice;
        return this;
    }
    public String getPrintInvoice() {
        return this.printInvoice;
    }

    public ApplyInsurancepolicyUniversalRequest setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

    public ApplyInsurancepolicyUniversalRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrAddr(String tbrAddr) {
        this.tbrAddr = tbrAddr;
        return this;
    }
    public String getTbrAddr() {
        return this.tbrAddr;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrCorporateContract(String tbrCorporateContract) {
        this.tbrCorporateContract = tbrCorporateContract;
        return this;
    }
    public String getTbrCorporateContract() {
        return this.tbrCorporateContract;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrDid(String tbrDid) {
        this.tbrDid = tbrDid;
        return this;
    }
    public String getTbrDid() {
        return this.tbrDid;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrEmail(String tbrEmail) {
        this.tbrEmail = tbrEmail;
        return this;
    }
    public String getTbrEmail() {
        return this.tbrEmail;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrTel(String tbrTel) {
        this.tbrTel = tbrTel;
        return this;
    }
    public String getTbrTel() {
        return this.tbrTel;
    }

    public ApplyInsurancepolicyUniversalRequest setTbrType(String tbrType) {
        this.tbrType = tbrType;
        return this;
    }
    public String getTbrType() {
        return this.tbrType;
    }

    public ApplyInsurancepolicyUniversalRequest setTermDate(String termDate) {
        this.termDate = termDate;
        return this;
    }
    public String getTermDate() {
        return this.termDate;
    }

    public ApplyInsurancepolicyUniversalRequest setTicketAddr(String ticketAddr) {
        this.ticketAddr = ticketAddr;
        return this;
    }
    public String getTicketAddr() {
        return this.ticketAddr;
    }

    public ApplyInsurancepolicyUniversalRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsurancepolicyUniversalRequest setTransitPoint(String transitPoint) {
        this.transitPoint = transitPoint;
        return this;
    }
    public String getTransitPoint() {
        return this.transitPoint;
    }

    public ApplyInsurancepolicyUniversalRequest setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

}
