// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceOspireportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码。 系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码，PAIC---平安
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 险种编码，04--海外邮包险
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 保单号，申请理赔的保单号
    @NameInMap("policy_no")
    @Validation(required = true, maxLength = 200)
    public String policyNo;

    // 订单号，申请理赔所关联的订单号
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 500)
    public String relaOrderNo;

    // 出险时间，发生损失的时间
    @NameInMap("accident_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accidentTime;

    // 报案人名称，申请报案人的名称
    @NameInMap("reporter_name")
    @Validation(required = true, maxLength = 200)
    public String reporterName;

    // 报案人联系方式，申请报案人的联系方式
    @NameInMap("reporter_contact")
    @Validation(required = true, maxLength = 20)
    public String reporterContact;

    // 索赔金额，单位（元），最多支持2位小数，超2位小数拒绝
    @NameInMap("claim_amount")
    @Validation(required = true)
    public String claimAmount;

    // 物流揽收时间
    @NameInMap("collect_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String collectDate;

    // 工单号，平台客服判责的工单号
    @NameInMap("job_no")
    @Validation(required = true, maxLength = 100)
    public String jobNo;

    // 快递公司名称，实际的派送公司全称
    @NameInMap("courier_company")
    @Validation(required = true, maxLength = 200)
    public String courierCompany;

    // 快递单号，实际的派送快递单号
    @NameInMap("courier_number")
    @Validation(required = true, maxLength = 100)
    public String courierNumber;

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

    // 货物名称，实际的货物名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 200)
    public String cargoName;

    // 货物的重量
    @NameInMap("cargo_weight")
    @Validation(required = true, maxLength = 20)
    public String cargoWeight;

    // 出发地地址，货物的出发地地址
    @NameInMap("start_place")
    @Validation(required = true, maxLength = 500)
    public String startPlace;

    // 目的地地址，货物的目的地地址
    @NameInMap("destination")
    @Validation(required = true, maxLength = 500)
    public String destination;

    // ISO到达国别，包裹业务实际发生的国家
    @NameInMap("iso_country")
    @Validation(required = true, maxLength = 10)
    public String isoCountry;

    // 出险地址，货物发生实际损失的最近的一次地址记录
    @NameInMap("accident_address")
    @Validation(required = true, maxLength = 500)
    public String accidentAddress;

    // 平台赔款支付时间，平台先行赔付的时间
    @NameInMap("payment_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String paymentTime;

    // 赔付项目类型，01-运费，02-货值，03-货值2
    @NameInMap("payment_item")
    @Validation(required = true, maxLength = 2)
    public String paymentItem;

    // 出险类型，赔付的出险类型，届时保司和平台方商定
    @NameInMap("accident_type")
    @Validation(required = true, maxLength = 20)
    public String accidentType;

    // 索赔资料附件，最多10个
    @NameInMap("claim_informations")
    @Validation(required = true)
    public java.util.List<ClaimInformation> claimInformations;

    public static ApplyInsuranceOspireportRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceOspireportRequest self = new ApplyInsuranceOspireportRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceOspireportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceOspireportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceOspireportRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceOspireportRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsuranceOspireportRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsuranceOspireportRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public ApplyInsuranceOspireportRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public ApplyInsuranceOspireportRequest setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
        return this;
    }
    public String getAccidentTime() {
        return this.accidentTime;
    }

    public ApplyInsuranceOspireportRequest setReporterName(String reporterName) {
        this.reporterName = reporterName;
        return this;
    }
    public String getReporterName() {
        return this.reporterName;
    }

    public ApplyInsuranceOspireportRequest setReporterContact(String reporterContact) {
        this.reporterContact = reporterContact;
        return this;
    }
    public String getReporterContact() {
        return this.reporterContact;
    }

    public ApplyInsuranceOspireportRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public ApplyInsuranceOspireportRequest setCollectDate(String collectDate) {
        this.collectDate = collectDate;
        return this;
    }
    public String getCollectDate() {
        return this.collectDate;
    }

    public ApplyInsuranceOspireportRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public ApplyInsuranceOspireportRequest setCourierCompany(String courierCompany) {
        this.courierCompany = courierCompany;
        return this;
    }
    public String getCourierCompany() {
        return this.courierCompany;
    }

    public ApplyInsuranceOspireportRequest setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
        return this;
    }
    public String getCourierNumber() {
        return this.courierNumber;
    }

    public ApplyInsuranceOspireportRequest setBuyId(String buyId) {
        this.buyId = buyId;
        return this;
    }
    public String getBuyId() {
        return this.buyId;
    }

    public ApplyInsuranceOspireportRequest setSellId(String sellId) {
        this.sellId = sellId;
        return this;
    }
    public String getSellId() {
        return this.sellId;
    }

    public ApplyInsuranceOspireportRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ApplyInsuranceOspireportRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public ApplyInsuranceOspireportRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public ApplyInsuranceOspireportRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsuranceOspireportRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsuranceOspireportRequest setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
        return this;
    }
    public String getIsoCountry() {
        return this.isoCountry;
    }

    public ApplyInsuranceOspireportRequest setAccidentAddress(String accidentAddress) {
        this.accidentAddress = accidentAddress;
        return this;
    }
    public String getAccidentAddress() {
        return this.accidentAddress;
    }

    public ApplyInsuranceOspireportRequest setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public ApplyInsuranceOspireportRequest setPaymentItem(String paymentItem) {
        this.paymentItem = paymentItem;
        return this;
    }
    public String getPaymentItem() {
        return this.paymentItem;
    }

    public ApplyInsuranceOspireportRequest setAccidentType(String accidentType) {
        this.accidentType = accidentType;
        return this;
    }
    public String getAccidentType() {
        return this.accidentType;
    }

    public ApplyInsuranceOspireportRequest setClaimInformations(java.util.List<ClaimInformation> claimInformations) {
        this.claimInformations = claimInformations;
        return this;
    }
    public java.util.List<ClaimInformation> getClaimInformations() {
        return this.claimInformations;
    }

}
