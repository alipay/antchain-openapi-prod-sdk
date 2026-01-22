// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas_de.models;

import com.aliyun.tea.*;

public class ApplyInsurglobifyprodOspiclaimRequest extends TeaModel {
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

    // 大保单号
    @NameInMap("big_pol_no")
    @Validation(required = true, maxLength = 100)
    public String bigPolNo;

    // 投保订单号
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 100)
    public String relaOrderNo;

    // 受损货物名称
    @NameInMap("damaged_cargo_name")
    @Validation(required = true, maxLength = 100)
    public String damagedCargoName;

    // 出险原因
    @NameInMap("incident_cause")
    @Validation(required = true, maxLength = 50)
    public String incidentCause;

    // 出险日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    @NameInMap("accident_time")
    @Validation(required = true, maxLength = 50)
    public String accidentTime;

    // 销售日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    @NameInMap("sale_date")
    @Validation(required = true, maxLength = 50)
    public String saleDate;

    // 时区
    // Asia/Shanghai
    // Europe/Berlin
    // America/New_York
    // Pacific/Auckland
    // Europe/Berlin 
    @NameInMap("time_zone")
    @Validation(required = true, maxLength = 20)
    public String timeZone;

    // 索赔状态（Open / Under Review / In Payment Process / Closed / Rejected / Cancelled）
    @NameInMap("claim_status")
    @Validation(required = true, maxLength = 20)
    public String claimStatus;

    // 货物大类
    @NameInMap("cargo_type")
    @Validation(required = true, maxLength = 256)
    public String cargoType;

    // 平台赔付日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    @NameInMap("claim_paid_time")
    @Validation(required = true, maxLength = 50)
    public String claimPaidTime;

    // 索赔类别(Valid / Fraudulent / Invalid
    @NameInMap("claim_category")
    @Validation(required = true, maxLength = 20)
    public String claimCategory;

    // 索赔被拒原因
    @NameInMap("claim_paid_desc")
    @Validation(required = true, maxLength = 256)
    public String claimPaidDesc;

    // 索赔总金额，小数位只支持2位
    @NameInMap("claim_paid_amount")
    @Validation(required = true, maxLength = 20)
    public String claimPaidAmount;

    // 币种，使用ISO 4217代码；
    // CNY：人民币
    // USD：美元
    // EUR：欧元
    // GBP：英镑
    // JPY：日元
    // CHF：瑞士法郎
    // SGD：新加坡元
    @NameInMap("currency")
    @Validation(required = true, minLength = 3)
    public String currency;

    // 索赔事件类型(Loss / Theft / Breakage / Non-Delivery）
    @NameInMap("claim_incident_type")
    @Validation(required = true, maxLength = 20)
    public String claimIncidentType;

    // 索赔事件详情情况
    @NameInMap("claim_verdict_desc")
    @Validation(required = true, maxLength = 526)
    public String claimVerdictDesc;

    public static ApplyInsurglobifyprodOspiclaimRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurglobifyprodOspiclaimRequest self = new ApplyInsurglobifyprodOspiclaimRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsurglobifyprodOspiclaimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setBigPolNo(String bigPolNo) {
        this.bigPolNo = bigPolNo;
        return this;
    }
    public String getBigPolNo() {
        return this.bigPolNo;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setDamagedCargoName(String damagedCargoName) {
        this.damagedCargoName = damagedCargoName;
        return this;
    }
    public String getDamagedCargoName() {
        return this.damagedCargoName;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setIncidentCause(String incidentCause) {
        this.incidentCause = incidentCause;
        return this;
    }
    public String getIncidentCause() {
        return this.incidentCause;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
        return this;
    }
    public String getAccidentTime() {
        return this.accidentTime;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setSaleDate(String saleDate) {
        this.saleDate = saleDate;
        return this;
    }
    public String getSaleDate() {
        return this.saleDate;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
        return this;
    }
    public String getClaimStatus() {
        return this.claimStatus;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimPaidTime(String claimPaidTime) {
        this.claimPaidTime = claimPaidTime;
        return this;
    }
    public String getClaimPaidTime() {
        return this.claimPaidTime;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimCategory(String claimCategory) {
        this.claimCategory = claimCategory;
        return this;
    }
    public String getClaimCategory() {
        return this.claimCategory;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimPaidDesc(String claimPaidDesc) {
        this.claimPaidDesc = claimPaidDesc;
        return this;
    }
    public String getClaimPaidDesc() {
        return this.claimPaidDesc;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimPaidAmount(String claimPaidAmount) {
        this.claimPaidAmount = claimPaidAmount;
        return this;
    }
    public String getClaimPaidAmount() {
        return this.claimPaidAmount;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimIncidentType(String claimIncidentType) {
        this.claimIncidentType = claimIncidentType;
        return this;
    }
    public String getClaimIncidentType() {
        return this.claimIncidentType;
    }

    public ApplyInsurglobifyprodOspiclaimRequest setClaimVerdictDesc(String claimVerdictDesc) {
        this.claimVerdictDesc = claimVerdictDesc;
        return this;
    }
    public String getClaimVerdictDesc() {
        return this.claimVerdictDesc;
    }

}
