// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户链上账户
    // 与司机did 二选一填写
    @NameInMap("account_id")
    public String accountId;

    // 运费
    @NameInMap("all_freight")
    public String allFreight;

    // 回单押金
    // 
    @NameInMap("back_fee")
    public String backFee;

    // 货源单号
    @NameInMap("cargo_order")
    public String cargoOrder;

    // 车牌颜色
    @NameInMap("cart_badge_color")
    @Validation(required = true)
    public String cartBadgeColor;

    // 车牌号
    @NameInMap("cart_badge_no")
    @Validation(required = true)
    public String cartBadgeNo;

    // 建单时间
    @NameInMap("created_time")
    @Validation(required = true)
    public Long createdTime;

    // 受票方名称
    @NameInMap("drawee")
    @Validation(required = true)
    public String drawee;

    // 受票方纳税人识别号
    @NameInMap("drawee_tax_no")
    @Validation(required = true)
    public String draweeTaxNo;

    // 司机分布式身份
    @NameInMap("driver_did")
    public String driverDid;

    // 司机姓名
    // 已填司机分布式身份的情况下可不填
    @NameInMap("driver_name")
    public String driverName;

    // 目的地城市CODE
    @NameInMap("end_city_code")
    @Validation(required = true)
    public String endCityCode;

    // 目的地城市名称
    @NameInMap("end_city_name")
    @Validation(required = true)
    public String endCityName;

    // 目的地区县CODE
    @NameInMap("end_county_code")
    public String endCountyCode;

    // 目的地区县名称
    @NameInMap("end_county_name")
    public String endCountyName;

    // 结束行政区划代码
    @NameInMap("end_division_code")
    @Validation(required = true)
    public String endDivisionCode;

    // 目的地省份CODE
    @NameInMap("end_province_code")
    @Validation(required = true)
    public String endProvinceCode;

    // 目的地省份名称
    @NameInMap("end_province_name")
    @Validation(required = true)
    public String endProvinceName;

    // 运费增项
    @NameInMap("freight_incr")
    public String freightIncr;

    // 货物数量
    @NameInMap("goods_amount")
    public Long goodsAmount;

    // 货物数量单位类型
    @NameInMap("goods_amount_type")
    public String goodsAmountType;

    // 货物名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 司机身份证号
    // 已填司机分布式身份的情况下可不填
    @NameInMap("id_card")
    public String idCard;

    // 运费扣减
    // 
    @NameInMap("loss_fee")
    public String lossFee;

    // 司机手机号
    // 已填司机分布式身份的情况下可不填
    @NameInMap("mobile_no")
    public String mobileNo;

    // 系统识别id
    // 网商识别号
    @NameInMap("partner_id")
    public String partnerId;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    @NameInMap("platform_did")
    public String platformDid;

    // 预付款金额
    @NameInMap("prepayments")
    public String prepayments;

    // 线下预付ETC
    @NameInMap("prepayments_buy_etc")
    public String prepaymentsBuyEtc;

    // 线下气款金额
    @NameInMap("prepayments_buy_gas")
    public String prepaymentsBuyGas;

    // 线下油款预付
    @NameInMap("prepayments_buy_oil")
    public String prepaymentsBuyOil;

    // 预付ETC卡金额
    @NameInMap("prepayments_etccard")
    public String prepaymentsEtccard;

    // 预付油卡金额
    @NameInMap("prepayments_oilcard")
    public String prepaymentsOilcard;

    // 油卡赠送金额
    @NameInMap("present_amount_oil")
    public String presentAmountOil;

    // 起始地CODE
    @NameInMap("start_city_code")
    @Validation(required = true)
    public String startCityCode;

    // 起始地城市名称
    @NameInMap("start_city_name")
    @Validation(required = true)
    public String startCityName;

    // 起始地区县CODE
    @NameInMap("start_county_code")
    public String startCountyCode;

    // 起始地区县名称
    @NameInMap("start_county_name")
    public String startCountyName;

    // 起始行政区划代码
    @NameInMap("start_division_code")
    @Validation(required = true)
    public String startDivisionCode;

    // 起始地省份CODE
    @NameInMap("start_province_code")
    @Validation(required = true)
    public String startProvinceCode;

    // 起始地省份名称
    @NameInMap("start_province_name")
    @Validation(required = true)
    public String startProvinceName;

    // 起运时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 运单id
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    // 运输单价
    @NameInMap("unit_price")
    public String unitPrice;

    public static CreateLogisticFinanceOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceOrderRequest self = new CreateLogisticFinanceOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceOrderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateLogisticFinanceOrderRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public CreateLogisticFinanceOrderRequest setBackFee(String backFee) {
        this.backFee = backFee;
        return this;
    }
    public String getBackFee() {
        return this.backFee;
    }

    public CreateLogisticFinanceOrderRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public CreateLogisticFinanceOrderRequest setCartBadgeColor(String cartBadgeColor) {
        this.cartBadgeColor = cartBadgeColor;
        return this;
    }
    public String getCartBadgeColor() {
        return this.cartBadgeColor;
    }

    public CreateLogisticFinanceOrderRequest setCartBadgeNo(String cartBadgeNo) {
        this.cartBadgeNo = cartBadgeNo;
        return this;
    }
    public String getCartBadgeNo() {
        return this.cartBadgeNo;
    }

    public CreateLogisticFinanceOrderRequest setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public CreateLogisticFinanceOrderRequest setDrawee(String drawee) {
        this.drawee = drawee;
        return this;
    }
    public String getDrawee() {
        return this.drawee;
    }

    public CreateLogisticFinanceOrderRequest setDraweeTaxNo(String draweeTaxNo) {
        this.draweeTaxNo = draweeTaxNo;
        return this;
    }
    public String getDraweeTaxNo() {
        return this.draweeTaxNo;
    }

    public CreateLogisticFinanceOrderRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public CreateLogisticFinanceOrderRequest setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
    public String getDriverName() {
        return this.driverName;
    }

    public CreateLogisticFinanceOrderRequest setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
        return this;
    }
    public String getEndCityCode() {
        return this.endCityCode;
    }

    public CreateLogisticFinanceOrderRequest setEndCityName(String endCityName) {
        this.endCityName = endCityName;
        return this;
    }
    public String getEndCityName() {
        return this.endCityName;
    }

    public CreateLogisticFinanceOrderRequest setEndCountyCode(String endCountyCode) {
        this.endCountyCode = endCountyCode;
        return this;
    }
    public String getEndCountyCode() {
        return this.endCountyCode;
    }

    public CreateLogisticFinanceOrderRequest setEndCountyName(String endCountyName) {
        this.endCountyName = endCountyName;
        return this;
    }
    public String getEndCountyName() {
        return this.endCountyName;
    }

    public CreateLogisticFinanceOrderRequest setEndDivisionCode(String endDivisionCode) {
        this.endDivisionCode = endDivisionCode;
        return this;
    }
    public String getEndDivisionCode() {
        return this.endDivisionCode;
    }

    public CreateLogisticFinanceOrderRequest setEndProvinceCode(String endProvinceCode) {
        this.endProvinceCode = endProvinceCode;
        return this;
    }
    public String getEndProvinceCode() {
        return this.endProvinceCode;
    }

    public CreateLogisticFinanceOrderRequest setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName;
        return this;
    }
    public String getEndProvinceName() {
        return this.endProvinceName;
    }

    public CreateLogisticFinanceOrderRequest setFreightIncr(String freightIncr) {
        this.freightIncr = freightIncr;
        return this;
    }
    public String getFreightIncr() {
        return this.freightIncr;
    }

    public CreateLogisticFinanceOrderRequest setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
        return this;
    }
    public Long getGoodsAmount() {
        return this.goodsAmount;
    }

    public CreateLogisticFinanceOrderRequest setGoodsAmountType(String goodsAmountType) {
        this.goodsAmountType = goodsAmountType;
        return this;
    }
    public String getGoodsAmountType() {
        return this.goodsAmountType;
    }

    public CreateLogisticFinanceOrderRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public CreateLogisticFinanceOrderRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public CreateLogisticFinanceOrderRequest setLossFee(String lossFee) {
        this.lossFee = lossFee;
        return this;
    }
    public String getLossFee() {
        return this.lossFee;
    }

    public CreateLogisticFinanceOrderRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public CreateLogisticFinanceOrderRequest setPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public String getPartnerId() {
        return this.partnerId;
    }

    public CreateLogisticFinanceOrderRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateLogisticFinanceOrderRequest setPrepayments(String prepayments) {
        this.prepayments = prepayments;
        return this;
    }
    public String getPrepayments() {
        return this.prepayments;
    }

    public CreateLogisticFinanceOrderRequest setPrepaymentsBuyEtc(String prepaymentsBuyEtc) {
        this.prepaymentsBuyEtc = prepaymentsBuyEtc;
        return this;
    }
    public String getPrepaymentsBuyEtc() {
        return this.prepaymentsBuyEtc;
    }

    public CreateLogisticFinanceOrderRequest setPrepaymentsBuyGas(String prepaymentsBuyGas) {
        this.prepaymentsBuyGas = prepaymentsBuyGas;
        return this;
    }
    public String getPrepaymentsBuyGas() {
        return this.prepaymentsBuyGas;
    }

    public CreateLogisticFinanceOrderRequest setPrepaymentsBuyOil(String prepaymentsBuyOil) {
        this.prepaymentsBuyOil = prepaymentsBuyOil;
        return this;
    }
    public String getPrepaymentsBuyOil() {
        return this.prepaymentsBuyOil;
    }

    public CreateLogisticFinanceOrderRequest setPrepaymentsEtccard(String prepaymentsEtccard) {
        this.prepaymentsEtccard = prepaymentsEtccard;
        return this;
    }
    public String getPrepaymentsEtccard() {
        return this.prepaymentsEtccard;
    }

    public CreateLogisticFinanceOrderRequest setPrepaymentsOilcard(String prepaymentsOilcard) {
        this.prepaymentsOilcard = prepaymentsOilcard;
        return this;
    }
    public String getPrepaymentsOilcard() {
        return this.prepaymentsOilcard;
    }

    public CreateLogisticFinanceOrderRequest setPresentAmountOil(String presentAmountOil) {
        this.presentAmountOil = presentAmountOil;
        return this;
    }
    public String getPresentAmountOil() {
        return this.presentAmountOil;
    }

    public CreateLogisticFinanceOrderRequest setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
        return this;
    }
    public String getStartCityCode() {
        return this.startCityCode;
    }

    public CreateLogisticFinanceOrderRequest setStartCityName(String startCityName) {
        this.startCityName = startCityName;
        return this;
    }
    public String getStartCityName() {
        return this.startCityName;
    }

    public CreateLogisticFinanceOrderRequest setStartCountyCode(String startCountyCode) {
        this.startCountyCode = startCountyCode;
        return this;
    }
    public String getStartCountyCode() {
        return this.startCountyCode;
    }

    public CreateLogisticFinanceOrderRequest setStartCountyName(String startCountyName) {
        this.startCountyName = startCountyName;
        return this;
    }
    public String getStartCountyName() {
        return this.startCountyName;
    }

    public CreateLogisticFinanceOrderRequest setStartDivisionCode(String startDivisionCode) {
        this.startDivisionCode = startDivisionCode;
        return this;
    }
    public String getStartDivisionCode() {
        return this.startDivisionCode;
    }

    public CreateLogisticFinanceOrderRequest setStartProvinceCode(String startProvinceCode) {
        this.startProvinceCode = startProvinceCode;
        return this;
    }
    public String getStartProvinceCode() {
        return this.startProvinceCode;
    }

    public CreateLogisticFinanceOrderRequest setStartProvinceName(String startProvinceName) {
        this.startProvinceName = startProvinceName;
        return this;
    }
    public String getStartProvinceName() {
        return this.startProvinceName;
    }

    public CreateLogisticFinanceOrderRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateLogisticFinanceOrderRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public CreateLogisticFinanceOrderRequest setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

}
