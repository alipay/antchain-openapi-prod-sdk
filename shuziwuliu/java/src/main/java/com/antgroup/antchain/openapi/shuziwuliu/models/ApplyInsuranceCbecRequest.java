// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceCbecRequest extends TeaModel {
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

    // 保司编码，CPIC---太保
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 64)
    public String externalChannelCode;

    // 险种编码，03--跨境出口货运险
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 投保人名称
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 100)
    public String tbrName;

    // 投保人证件类型，03--营业执照
    @NameInMap("tbr_id_type")
    @Validation(maxLength = 2)
    public String tbrIdType;

    // 投保人证件号码
    @NameInMap("tbr_id_no")
    @Validation(maxLength = 30)
    public String tbrIdNo;

    // 被保人名称
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 100)
    public String bbrName;

    // 被保人证件类型，01--居民身份证，03--营业执照
    @NameInMap("bbr_id_type")
    @Validation(maxLength = 2)
    public String bbrIdType;

    // 被保人证件号码
    @NameInMap("bbr_id_no")
    @Validation(maxLength = 30)
    public String bbrIdNo;

    // 出库单号/航次号/运单号
    @NameInMap("related_order_no")
    @Validation(required = true, maxLength = 200)
    public String relatedOrderNo;

    // 包装及数量
    @NameInMap("cargo_quantity")
    @Validation(required = true, maxLength = 20)
    public String cargoQuantity;

    // 货物名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 100)
    public String cargoName;

    // 包装代码,参考保司提供样例-包装代码
    @NameInMap("packing_code")
    @Validation(required = true, maxLength = 2)
    public String packingCode;

    // 货物类型代码,参考保司提供样例-货物类型代码
    @NameInMap("cargo_type_code")
    @Validation(required = true, maxLength = 4)
    public String cargoTypeCode;

    // 航行区域代码,参考保司提供样例-航行区域代码
    @NameInMap("flight_area_code")
    @Validation(required = true, maxLength = 10)
    public String flightAreaCode;

    // 运输方式代码,参考保司提供样例-运输方式
    @NameInMap("transport_type_code")
    @Validation(required = true, maxLength = 2)
    public String transportTypeCode;

    // 运输工具名称
    @NameInMap("transport_means_name")
    @Validation(required = true, maxLength = 30)
    public String transportMeansName;

    // 航次号
    @NameInMap("voyage")
    @Validation(maxLength = 30)
    public String voyage;

    // 出发地
    @NameInMap("start_place")
    @Validation(required = true, maxLength = 200)
    public String startPlace;

    // 中转地
    @NameInMap("transit_point")
    @Validation(maxLength = 100)
    public String transitPoint;

    // 目的地
    @NameInMap("destination")
    @Validation(required = true, maxLength = 200)
    public String destination;

    // 理赔代理地代码，参考保司提供样例-理赔代理地
    @NameInMap("claim_agent_code")
    @Validation(required = true, maxLength = 30)
    public String claimAgentCode;

    // 主险条款代码--参考保司提供样例
    @NameInMap("main_item_code")
    @Validation(required = true, maxLength = 12)
    public String mainItemCode;

    // 主险条款内容--参考保司提供样例
    @NameInMap("main_item_content")
    @Validation(required = true, maxLength = 500)
    public String mainItemContent;

    // 附加条款集合
    @NameInMap("main_item_adds")
    public java.util.List<MainItemAdd> mainItemAdds;

    // 特别约定--填写协议中的特别约定
    @NameInMap("specialize")
    @Validation(maxLength = 500)
    public String specialize;

    // 申报货物价值,，最多兼容2位小数，单位（元）
    @NameInMap("cargo_worth")
    @Validation(required = true, maxLength = 50)
    public String cargoWorth;

    // 费率，最多兼容9位小数
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    // 保费，最多兼容2位小数，单位（元）
    @NameInMap("premium")
    @Validation(required = true)
    public String premium;

    // 保险起期，日期格式yyyy-mm-dd
    @NameInMap("insure_start")
    @Validation(required = true)
    public String insureStart;

    // 起运日期，日期格式yyyy-mm-dd
    @NameInMap("sale_date")
    @Validation(required = true)
    public String saleDate;

    public static ApplyInsuranceCbecRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceCbecRequest self = new ApplyInsuranceCbecRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceCbecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceCbecRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceCbecRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceCbecRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsuranceCbecRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsuranceCbecRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyInsuranceCbecRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyInsuranceCbecRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyInsuranceCbecRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsuranceCbecRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsuranceCbecRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsuranceCbecRequest setRelatedOrderNo(String relatedOrderNo) {
        this.relatedOrderNo = relatedOrderNo;
        return this;
    }
    public String getRelatedOrderNo() {
        return this.relatedOrderNo;
    }

    public ApplyInsuranceCbecRequest setCargoQuantity(String cargoQuantity) {
        this.cargoQuantity = cargoQuantity;
        return this;
    }
    public String getCargoQuantity() {
        return this.cargoQuantity;
    }

    public ApplyInsuranceCbecRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public ApplyInsuranceCbecRequest setPackingCode(String packingCode) {
        this.packingCode = packingCode;
        return this;
    }
    public String getPackingCode() {
        return this.packingCode;
    }

    public ApplyInsuranceCbecRequest setCargoTypeCode(String cargoTypeCode) {
        this.cargoTypeCode = cargoTypeCode;
        return this;
    }
    public String getCargoTypeCode() {
        return this.cargoTypeCode;
    }

    public ApplyInsuranceCbecRequest setFlightAreaCode(String flightAreaCode) {
        this.flightAreaCode = flightAreaCode;
        return this;
    }
    public String getFlightAreaCode() {
        return this.flightAreaCode;
    }

    public ApplyInsuranceCbecRequest setTransportTypeCode(String transportTypeCode) {
        this.transportTypeCode = transportTypeCode;
        return this;
    }
    public String getTransportTypeCode() {
        return this.transportTypeCode;
    }

    public ApplyInsuranceCbecRequest setTransportMeansName(String transportMeansName) {
        this.transportMeansName = transportMeansName;
        return this;
    }
    public String getTransportMeansName() {
        return this.transportMeansName;
    }

    public ApplyInsuranceCbecRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

    public ApplyInsuranceCbecRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsuranceCbecRequest setTransitPoint(String transitPoint) {
        this.transitPoint = transitPoint;
        return this;
    }
    public String getTransitPoint() {
        return this.transitPoint;
    }

    public ApplyInsuranceCbecRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsuranceCbecRequest setClaimAgentCode(String claimAgentCode) {
        this.claimAgentCode = claimAgentCode;
        return this;
    }
    public String getClaimAgentCode() {
        return this.claimAgentCode;
    }

    public ApplyInsuranceCbecRequest setMainItemCode(String mainItemCode) {
        this.mainItemCode = mainItemCode;
        return this;
    }
    public String getMainItemCode() {
        return this.mainItemCode;
    }

    public ApplyInsuranceCbecRequest setMainItemContent(String mainItemContent) {
        this.mainItemContent = mainItemContent;
        return this;
    }
    public String getMainItemContent() {
        return this.mainItemContent;
    }

    public ApplyInsuranceCbecRequest setMainItemAdds(java.util.List<MainItemAdd> mainItemAdds) {
        this.mainItemAdds = mainItemAdds;
        return this;
    }
    public java.util.List<MainItemAdd> getMainItemAdds() {
        return this.mainItemAdds;
    }

    public ApplyInsuranceCbecRequest setSpecialize(String specialize) {
        this.specialize = specialize;
        return this;
    }
    public String getSpecialize() {
        return this.specialize;
    }

    public ApplyInsuranceCbecRequest setCargoWorth(String cargoWorth) {
        this.cargoWorth = cargoWorth;
        return this;
    }
    public String getCargoWorth() {
        return this.cargoWorth;
    }

    public ApplyInsuranceCbecRequest setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

    public ApplyInsuranceCbecRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public ApplyInsuranceCbecRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyInsuranceCbecRequest setSaleDate(String saleDate) {
        this.saleDate = saleDate;
        return this;
    }
    public String getSaleDate() {
        return this.saleDate;
    }

}
