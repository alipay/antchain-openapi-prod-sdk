// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsurancePiprereportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码，海外邮包险（CICP--中华财险、PAIC--平安）、跨境邮包险（PAIC--平安、PICC--人保、CPIC--太保）
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 险种编码 04--海外邮包险 06--跨境邮包险
    // 
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 保单号，申请理赔的保单号
    @NameInMap("policy_no")
    @Validation(required = true, maxLength = 200)
    public String policyNo;

    // 订单号，申请理赔所关联的订单号
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 200)
    public String relaOrderNo;

    // 出险时间，发生损失的时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("accident_time")
    @Validation(required = true)
    public String accidentTime;

    // 报案人名称，申请报案人的名称
    @NameInMap("reporter_name")
    @Validation(required = true, maxLength = 100)
    public String reporterName;

    // 报案人联系方式，申请报案人的联系方式
    @NameInMap("reporter_contact")
    @Validation(required = true, maxLength = 20)
    public String reporterContact;

    // 索赔金额，单位（元），最多支持2位小数，超2位小数拒绝
    @NameInMap("claim_amount")
    public String claimAmount;

    // 物流揽收时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("collect_date")
    @Validation(required = true)
    public String collectDate;

    // 工单号，平台客服判责的工单号
    // 
    @NameInMap("job_no")
    @Validation(required = true, maxLength = 100)
    public String jobNo;

    // 快递公司名称，实际的派送公司全称
    // 
    @NameInMap("courier_company")
    @Validation(maxLength = 200)
    public String courierCompany;

    // 快递单号，实际的派送快递单号
    @NameInMap("courier_number")
    @Validation(maxLength = 100)
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
    // 
    @NameInMap("site_id")
    @Validation(required = true, maxLength = 100)
    public String siteId;

    // 货物名称，实际的货物名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 200)
    public String cargoName;

    // 货物的重量，单位(kg)，最多支持6位小数
    @NameInMap("cargo_weight")
    @Validation(required = true, maxLength = 20)
    public String cargoWeight;

    // 出发地地址，货物的出发地地址
    // 
    @NameInMap("start_place")
    @Validation(required = true, maxLength = 500)
    public String startPlace;

    // 目的地地址，货物的目的地地址
    // 
    @NameInMap("destination")
    @Validation(required = true, maxLength = 500)
    public String destination;

    // ISO到达国别，包裹业务实际发生的国家
    @NameInMap("iso_country")
    @Validation(required = true, maxLength = 10)
    public String isoCountry;

    // 出险地址，货物发生实际损失的最近的一次地址记录
    @NameInMap("accident_address")
    @Validation(maxLength = 500)
    public String accidentAddress;

    // 赔付项目类型，01-运费，02-货值，03-货值2
    // 
    @NameInMap("payment_item")
    @Validation(maxLength = 2)
    public String paymentItem;

    // 出险类型，赔付的出险类型，届时保司和平台方商定
    @NameInMap("accident_type")
    @Validation(maxLength = 20)
    public String accidentType;

    // 索赔资料附件，最多10个
    @NameInMap("claim_informations")
    @Validation(required = true)
    public java.util.List<ClaimInformation> claimInformations;

    // 客户或物流CP商，针对此票货物的出发仓ID
    @NameInMap("despatch_warehouse_id")
    @Validation(maxLength = 100)
    public String despatchWarehouseId;

    // 投诉时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("complaint_time")
    @Validation(required = true)
    public String complaintTime;

    // 判责时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("judgment_time")
    public String judgmentTime;

    // 判责完成时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("judgment_finish_time")
    public String judgmentFinishTime;

    // 判责是否成立
    @NameInMap("judgment_is_tenable")
    public Boolean judgmentIsTenable;

    // 预报案操作类型, 01.创建预报  02.更新预报案信息 03.撤销预报案信息
    @NameInMap("action_type")
    @Validation(required = true)
    public String actionType;

    public static ApplyInsurancePiprereportRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurancePiprereportRequest self = new ApplyInsurancePiprereportRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsurancePiprereportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsurancePiprereportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsurancePiprereportRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsurancePiprereportRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsurancePiprereportRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsurancePiprereportRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public ApplyInsurancePiprereportRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public ApplyInsurancePiprereportRequest setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
        return this;
    }
    public String getAccidentTime() {
        return this.accidentTime;
    }

    public ApplyInsurancePiprereportRequest setReporterName(String reporterName) {
        this.reporterName = reporterName;
        return this;
    }
    public String getReporterName() {
        return this.reporterName;
    }

    public ApplyInsurancePiprereportRequest setReporterContact(String reporterContact) {
        this.reporterContact = reporterContact;
        return this;
    }
    public String getReporterContact() {
        return this.reporterContact;
    }

    public ApplyInsurancePiprereportRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public ApplyInsurancePiprereportRequest setCollectDate(String collectDate) {
        this.collectDate = collectDate;
        return this;
    }
    public String getCollectDate() {
        return this.collectDate;
    }

    public ApplyInsurancePiprereportRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public ApplyInsurancePiprereportRequest setCourierCompany(String courierCompany) {
        this.courierCompany = courierCompany;
        return this;
    }
    public String getCourierCompany() {
        return this.courierCompany;
    }

    public ApplyInsurancePiprereportRequest setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
        return this;
    }
    public String getCourierNumber() {
        return this.courierNumber;
    }

    public ApplyInsurancePiprereportRequest setBuyId(String buyId) {
        this.buyId = buyId;
        return this;
    }
    public String getBuyId() {
        return this.buyId;
    }

    public ApplyInsurancePiprereportRequest setSellId(String sellId) {
        this.sellId = sellId;
        return this;
    }
    public String getSellId() {
        return this.sellId;
    }

    public ApplyInsurancePiprereportRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ApplyInsurancePiprereportRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public ApplyInsurancePiprereportRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public ApplyInsurancePiprereportRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsurancePiprereportRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsurancePiprereportRequest setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
        return this;
    }
    public String getIsoCountry() {
        return this.isoCountry;
    }

    public ApplyInsurancePiprereportRequest setAccidentAddress(String accidentAddress) {
        this.accidentAddress = accidentAddress;
        return this;
    }
    public String getAccidentAddress() {
        return this.accidentAddress;
    }

    public ApplyInsurancePiprereportRequest setPaymentItem(String paymentItem) {
        this.paymentItem = paymentItem;
        return this;
    }
    public String getPaymentItem() {
        return this.paymentItem;
    }

    public ApplyInsurancePiprereportRequest setAccidentType(String accidentType) {
        this.accidentType = accidentType;
        return this;
    }
    public String getAccidentType() {
        return this.accidentType;
    }

    public ApplyInsurancePiprereportRequest setClaimInformations(java.util.List<ClaimInformation> claimInformations) {
        this.claimInformations = claimInformations;
        return this;
    }
    public java.util.List<ClaimInformation> getClaimInformations() {
        return this.claimInformations;
    }

    public ApplyInsurancePiprereportRequest setDespatchWarehouseId(String despatchWarehouseId) {
        this.despatchWarehouseId = despatchWarehouseId;
        return this;
    }
    public String getDespatchWarehouseId() {
        return this.despatchWarehouseId;
    }

    public ApplyInsurancePiprereportRequest setComplaintTime(String complaintTime) {
        this.complaintTime = complaintTime;
        return this;
    }
    public String getComplaintTime() {
        return this.complaintTime;
    }

    public ApplyInsurancePiprereportRequest setJudgmentTime(String judgmentTime) {
        this.judgmentTime = judgmentTime;
        return this;
    }
    public String getJudgmentTime() {
        return this.judgmentTime;
    }

    public ApplyInsurancePiprereportRequest setJudgmentFinishTime(String judgmentFinishTime) {
        this.judgmentFinishTime = judgmentFinishTime;
        return this;
    }
    public String getJudgmentFinishTime() {
        return this.judgmentFinishTime;
    }

    public ApplyInsurancePiprereportRequest setJudgmentIsTenable(Boolean judgmentIsTenable) {
        this.judgmentIsTenable = judgmentIsTenable;
        return this;
    }
    public Boolean getJudgmentIsTenable() {
        return this.judgmentIsTenable;
    }

    public ApplyInsurancePiprereportRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

}
