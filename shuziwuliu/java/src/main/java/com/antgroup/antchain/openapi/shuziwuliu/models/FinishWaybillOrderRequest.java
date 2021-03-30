// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class FinishWaybillOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上账号 与司机did 二选一填写
    // 
    @NameInMap("account_id")
    public String accountId;

    // 运费，单位（元），平台支付给司机的运费
    @NameInMap("all_freight")
    @Validation(required = true)
    public String allFreight;

    // 回单押金
    // 
    @NameInMap("back_fee")
    public String backFee;

    // 业务类型
    @NameInMap("business_type")
    public String businessType;

    // 货物行业编码
    @NameInMap("cargo_business_code")
    public String cargoBusinessCode;

    // 货物商品编码
    @NameInMap("cargo_code")
    public String cargoCode;

    // 货物运费险
    @NameInMap("cargo_insurance_money")
    public String cargoInsuranceMoney;

    // 货源单号
    // 
    @NameInMap("cargo_order")
    public String cargoOrder;

    // 货物单位
    @NameInMap("cargo_unit")
    public String cargoUnit;

    // 货物体积，单位（方）
    @NameInMap("cargo_volume")
    public String cargoVolume;

    // 货物重量，单位（吨）
    @NameInMap("cargo_weight")
    public String cargoWeight;

    // 车牌颜色，黄色、蓝色、绿色
    @NameInMap("cart_badge_color")
    @Validation(required = true)
    public String cartBadgeColor;

    // 车牌号
    // 
    @NameInMap("cart_badge_no")
    @Validation(required = true)
    public String cartBadgeNo;

    // 承运商did
    @NameInMap("car_captain_did")
    public String carCaptainDid;

    // 货主运费金额，货主支付给平台的运费金额
    @NameInMap("consignor_freight_amount")
    @Validation(required = true)
    public String consignorFreightAmount;

    // 建单时间，13位毫秒级时间戳
    @NameInMap("created_time")
    @Validation(required = true)
    public Long createdTime;

    // 到达门点时间，13位毫秒级时间戳
    @NameInMap("dest_doors_end_time")
    public Long destDoorsEndTime;

    // 门点城市CODE，6位区域行政编码
    @NameInMap("doors_city_code")
    public String doorsCityCode;

    // 门点城市名称
    @NameInMap("doors_city_name")
    public String doorsCityName;

    // 门点区县CODE，6位区域行政编码
    @NameInMap("doors_county_code")
    public String doorsCountyCode;

    // 门点区县名称
    @NameInMap("doors_county_name")
    public String doorsCountyName;

    // 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
    @NameInMap("doors_division_code")
    public String doorsDivisionCode;

    // 门点省份CODE，6位区域行政编
    @NameInMap("doors_province_code")
    public String doorsProvinceCode;

    // 门点省份名称
    @NameInMap("doors_province_name")
    public String doorsProvinceName;

    // 发货方名称
    // 
    @NameInMap("drawee")
    @Validation(required = true)
    public String drawee;

    // 发货方纳税人识别号
    // 
    @NameInMap("drawee_tax_no")
    @Validation(required = true)
    public String draweeTaxNo;

    // 司机分布式数字身份
    // 
    @NameInMap("driver_did")
    @Validation(required = true)
    public String driverDid;

    // 司机姓名 已填司机分布式身份的情况下可不填
    // 
    @NameInMap("driver_name")
    public String driverName;

    // 目的地详细地址
    @NameInMap("end_address")
    public String endAddress;

    // 目的地城市CODE，6位区域行政编
    @NameInMap("end_city_code")
    @Validation(required = true)
    public String endCityCode;

    // 目的地城市名称
    // 
    @NameInMap("end_city_name")
    @Validation(required = true)
    public String endCityName;

    // 目的地区县CODE，6位区域行政编
    @NameInMap("end_county_code")
    public String endCountyCode;

    // 目的地区县名称
    // 
    @NameInMap("end_county_name")
    public String endCountyName;

    // 结束行政区划代码 ，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
    // 
    @NameInMap("end_division_code")
    @Validation(required = true)
    public String endDivisionCode;

    // 目的地省份CODE，6位区域行政编
    // 
    @NameInMap("end_province_code")
    @Validation(required = true)
    public String endProvinceCode;

    // 目的地省份名称
    // 
    @NameInMap("end_province_name")
    @Validation(required = true)
    public String endProvinceName;

    // 目的地街道CODE，12位行政区域编码
    @NameInMap("end_street_code")
    public String endStreetCode;

    // 目的地街道名称
    @NameInMap("end_street_name")
    public String endStreetName;

    // 终结时间，13位毫秒级时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 运费增项
    // 
    @NameInMap("freight_incr")
    public String freightIncr;

    // 货物数量
    // 
    @NameInMap("goods_amount")
    public Long goodsAmount;

    // 货物数量单位类型
    // 
    @NameInMap("goods_amount_type")
    public String goodsAmountType;

    // 货物名称
    // 
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 司机身份证号 已填司机分布式身份的情况下可不填
    // 
    @NameInMap("id_card")
    public String idCard;

    // 运费扣减
    // 
    @NameInMap("loss_fee")
    public String lossFee;

    // 司机手机号 已填司机分布式身份的情况下可不填
    // 
    @NameInMap("mobile_no")
    public String mobileNo;

    // 系统识别id 网商识别号
    // 
    @NameInMap("partner_id")
    public String partnerId;

    // 是否进行资金验证
    // 
    @NameInMap("pay_check")
    public Boolean payCheck;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    // 
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 预付款金额
    // 
    @NameInMap("prepayments")
    public String prepayments;

    // 线下预付ETC
    // 
    @NameInMap("prepayments_buy_etc")
    public String prepaymentsBuyEtc;

    // 线下气款金额
    // 
    @NameInMap("prepayments_buy_gas")
    public String prepaymentsBuyGas;

    // 线下油款预付
    // 
    @NameInMap("prepayments_buy_oil")
    public String prepaymentsBuyOil;

    // 预付ETC卡金额
    // 
    @NameInMap("prepayments_etccard")
    public String prepaymentsEtccard;

    // 预付油卡金额
    // 
    @NameInMap("prepayments_oilcard")
    public String prepaymentsOilcard;

    // 油卡赠送金额
    // 
    @NameInMap("present_amount_oil")
    public String presentAmountOil;

    // 起始地详细地址
    @NameInMap("start_address")
    public String startAddress;

    // 起始地CODE
    // ，6位区域行政编
    @NameInMap("start_city_code")
    @Validation(required = true)
    public String startCityCode;

    // 起始地城市名称
    // 
    @NameInMap("start_city_name")
    @Validation(required = true)
    public String startCityName;

    // 起始地区县CODE
    // ，6位区域行政编
    @NameInMap("start_county_code")
    public String startCountyCode;

    // 起始地区县名称
    // 
    @NameInMap("start_county_name")
    public String startCountyName;

    // 起始行政区划代码，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
    // 
    @NameInMap("start_division_code")
    @Validation(required = true)
    public String startDivisionCode;

    // 起始地省份CODE
    // ，6位区域行政编
    @NameInMap("start_province_code")
    @Validation(required = true)
    public String startProvinceCode;

    // 起始地省份名称
    // 
    @NameInMap("start_province_name")
    @Validation(required = true)
    public String startProvinceName;

    // 起始地街道CODE，12位区域行政编
    @NameInMap("start_street_code")
    public String startStreetCode;

    // 起始地街道名称
    @NameInMap("start_street_name")
    public String startStreetName;

    // 起运时间，13位毫秒级时间戳
    // 
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 运单ID
    // 
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
    @NameInMap("truck_length")
    public String truckLength;

    // 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
    @NameInMap("truck_type")
    public String truckType;

    // 运输单价
    // 
    @NameInMap("unit_price")
    public String unitPrice;

    public static FinishWaybillOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishWaybillOrderRequest self = new FinishWaybillOrderRequest();
        return TeaModel.build(map, self);
    }

    public FinishWaybillOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishWaybillOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishWaybillOrderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public FinishWaybillOrderRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public FinishWaybillOrderRequest setBackFee(String backFee) {
        this.backFee = backFee;
        return this;
    }
    public String getBackFee() {
        return this.backFee;
    }

    public FinishWaybillOrderRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public FinishWaybillOrderRequest setCargoBusinessCode(String cargoBusinessCode) {
        this.cargoBusinessCode = cargoBusinessCode;
        return this;
    }
    public String getCargoBusinessCode() {
        return this.cargoBusinessCode;
    }

    public FinishWaybillOrderRequest setCargoCode(String cargoCode) {
        this.cargoCode = cargoCode;
        return this;
    }
    public String getCargoCode() {
        return this.cargoCode;
    }

    public FinishWaybillOrderRequest setCargoInsuranceMoney(String cargoInsuranceMoney) {
        this.cargoInsuranceMoney = cargoInsuranceMoney;
        return this;
    }
    public String getCargoInsuranceMoney() {
        return this.cargoInsuranceMoney;
    }

    public FinishWaybillOrderRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public FinishWaybillOrderRequest setCargoUnit(String cargoUnit) {
        this.cargoUnit = cargoUnit;
        return this;
    }
    public String getCargoUnit() {
        return this.cargoUnit;
    }

    public FinishWaybillOrderRequest setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
        return this;
    }
    public String getCargoVolume() {
        return this.cargoVolume;
    }

    public FinishWaybillOrderRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public FinishWaybillOrderRequest setCartBadgeColor(String cartBadgeColor) {
        this.cartBadgeColor = cartBadgeColor;
        return this;
    }
    public String getCartBadgeColor() {
        return this.cartBadgeColor;
    }

    public FinishWaybillOrderRequest setCartBadgeNo(String cartBadgeNo) {
        this.cartBadgeNo = cartBadgeNo;
        return this;
    }
    public String getCartBadgeNo() {
        return this.cartBadgeNo;
    }

    public FinishWaybillOrderRequest setCarCaptainDid(String carCaptainDid) {
        this.carCaptainDid = carCaptainDid;
        return this;
    }
    public String getCarCaptainDid() {
        return this.carCaptainDid;
    }

    public FinishWaybillOrderRequest setConsignorFreightAmount(String consignorFreightAmount) {
        this.consignorFreightAmount = consignorFreightAmount;
        return this;
    }
    public String getConsignorFreightAmount() {
        return this.consignorFreightAmount;
    }

    public FinishWaybillOrderRequest setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public FinishWaybillOrderRequest setDestDoorsEndTime(Long destDoorsEndTime) {
        this.destDoorsEndTime = destDoorsEndTime;
        return this;
    }
    public Long getDestDoorsEndTime() {
        return this.destDoorsEndTime;
    }

    public FinishWaybillOrderRequest setDoorsCityCode(String doorsCityCode) {
        this.doorsCityCode = doorsCityCode;
        return this;
    }
    public String getDoorsCityCode() {
        return this.doorsCityCode;
    }

    public FinishWaybillOrderRequest setDoorsCityName(String doorsCityName) {
        this.doorsCityName = doorsCityName;
        return this;
    }
    public String getDoorsCityName() {
        return this.doorsCityName;
    }

    public FinishWaybillOrderRequest setDoorsCountyCode(String doorsCountyCode) {
        this.doorsCountyCode = doorsCountyCode;
        return this;
    }
    public String getDoorsCountyCode() {
        return this.doorsCountyCode;
    }

    public FinishWaybillOrderRequest setDoorsCountyName(String doorsCountyName) {
        this.doorsCountyName = doorsCountyName;
        return this;
    }
    public String getDoorsCountyName() {
        return this.doorsCountyName;
    }

    public FinishWaybillOrderRequest setDoorsDivisionCode(String doorsDivisionCode) {
        this.doorsDivisionCode = doorsDivisionCode;
        return this;
    }
    public String getDoorsDivisionCode() {
        return this.doorsDivisionCode;
    }

    public FinishWaybillOrderRequest setDoorsProvinceCode(String doorsProvinceCode) {
        this.doorsProvinceCode = doorsProvinceCode;
        return this;
    }
    public String getDoorsProvinceCode() {
        return this.doorsProvinceCode;
    }

    public FinishWaybillOrderRequest setDoorsProvinceName(String doorsProvinceName) {
        this.doorsProvinceName = doorsProvinceName;
        return this;
    }
    public String getDoorsProvinceName() {
        return this.doorsProvinceName;
    }

    public FinishWaybillOrderRequest setDrawee(String drawee) {
        this.drawee = drawee;
        return this;
    }
    public String getDrawee() {
        return this.drawee;
    }

    public FinishWaybillOrderRequest setDraweeTaxNo(String draweeTaxNo) {
        this.draweeTaxNo = draweeTaxNo;
        return this;
    }
    public String getDraweeTaxNo() {
        return this.draweeTaxNo;
    }

    public FinishWaybillOrderRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public FinishWaybillOrderRequest setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
    public String getDriverName() {
        return this.driverName;
    }

    public FinishWaybillOrderRequest setEndAddress(String endAddress) {
        this.endAddress = endAddress;
        return this;
    }
    public String getEndAddress() {
        return this.endAddress;
    }

    public FinishWaybillOrderRequest setEndCityCode(String endCityCode) {
        this.endCityCode = endCityCode;
        return this;
    }
    public String getEndCityCode() {
        return this.endCityCode;
    }

    public FinishWaybillOrderRequest setEndCityName(String endCityName) {
        this.endCityName = endCityName;
        return this;
    }
    public String getEndCityName() {
        return this.endCityName;
    }

    public FinishWaybillOrderRequest setEndCountyCode(String endCountyCode) {
        this.endCountyCode = endCountyCode;
        return this;
    }
    public String getEndCountyCode() {
        return this.endCountyCode;
    }

    public FinishWaybillOrderRequest setEndCountyName(String endCountyName) {
        this.endCountyName = endCountyName;
        return this;
    }
    public String getEndCountyName() {
        return this.endCountyName;
    }

    public FinishWaybillOrderRequest setEndDivisionCode(String endDivisionCode) {
        this.endDivisionCode = endDivisionCode;
        return this;
    }
    public String getEndDivisionCode() {
        return this.endDivisionCode;
    }

    public FinishWaybillOrderRequest setEndProvinceCode(String endProvinceCode) {
        this.endProvinceCode = endProvinceCode;
        return this;
    }
    public String getEndProvinceCode() {
        return this.endProvinceCode;
    }

    public FinishWaybillOrderRequest setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName;
        return this;
    }
    public String getEndProvinceName() {
        return this.endProvinceName;
    }

    public FinishWaybillOrderRequest setEndStreetCode(String endStreetCode) {
        this.endStreetCode = endStreetCode;
        return this;
    }
    public String getEndStreetCode() {
        return this.endStreetCode;
    }

    public FinishWaybillOrderRequest setEndStreetName(String endStreetName) {
        this.endStreetName = endStreetName;
        return this;
    }
    public String getEndStreetName() {
        return this.endStreetName;
    }

    public FinishWaybillOrderRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FinishWaybillOrderRequest setFreightIncr(String freightIncr) {
        this.freightIncr = freightIncr;
        return this;
    }
    public String getFreightIncr() {
        return this.freightIncr;
    }

    public FinishWaybillOrderRequest setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
        return this;
    }
    public Long getGoodsAmount() {
        return this.goodsAmount;
    }

    public FinishWaybillOrderRequest setGoodsAmountType(String goodsAmountType) {
        this.goodsAmountType = goodsAmountType;
        return this;
    }
    public String getGoodsAmountType() {
        return this.goodsAmountType;
    }

    public FinishWaybillOrderRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public FinishWaybillOrderRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public FinishWaybillOrderRequest setLossFee(String lossFee) {
        this.lossFee = lossFee;
        return this;
    }
    public String getLossFee() {
        return this.lossFee;
    }

    public FinishWaybillOrderRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public FinishWaybillOrderRequest setPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public String getPartnerId() {
        return this.partnerId;
    }

    public FinishWaybillOrderRequest setPayCheck(Boolean payCheck) {
        this.payCheck = payCheck;
        return this;
    }
    public Boolean getPayCheck() {
        return this.payCheck;
    }

    public FinishWaybillOrderRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public FinishWaybillOrderRequest setPrepayments(String prepayments) {
        this.prepayments = prepayments;
        return this;
    }
    public String getPrepayments() {
        return this.prepayments;
    }

    public FinishWaybillOrderRequest setPrepaymentsBuyEtc(String prepaymentsBuyEtc) {
        this.prepaymentsBuyEtc = prepaymentsBuyEtc;
        return this;
    }
    public String getPrepaymentsBuyEtc() {
        return this.prepaymentsBuyEtc;
    }

    public FinishWaybillOrderRequest setPrepaymentsBuyGas(String prepaymentsBuyGas) {
        this.prepaymentsBuyGas = prepaymentsBuyGas;
        return this;
    }
    public String getPrepaymentsBuyGas() {
        return this.prepaymentsBuyGas;
    }

    public FinishWaybillOrderRequest setPrepaymentsBuyOil(String prepaymentsBuyOil) {
        this.prepaymentsBuyOil = prepaymentsBuyOil;
        return this;
    }
    public String getPrepaymentsBuyOil() {
        return this.prepaymentsBuyOil;
    }

    public FinishWaybillOrderRequest setPrepaymentsEtccard(String prepaymentsEtccard) {
        this.prepaymentsEtccard = prepaymentsEtccard;
        return this;
    }
    public String getPrepaymentsEtccard() {
        return this.prepaymentsEtccard;
    }

    public FinishWaybillOrderRequest setPrepaymentsOilcard(String prepaymentsOilcard) {
        this.prepaymentsOilcard = prepaymentsOilcard;
        return this;
    }
    public String getPrepaymentsOilcard() {
        return this.prepaymentsOilcard;
    }

    public FinishWaybillOrderRequest setPresentAmountOil(String presentAmountOil) {
        this.presentAmountOil = presentAmountOil;
        return this;
    }
    public String getPresentAmountOil() {
        return this.presentAmountOil;
    }

    public FinishWaybillOrderRequest setStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }
    public String getStartAddress() {
        return this.startAddress;
    }

    public FinishWaybillOrderRequest setStartCityCode(String startCityCode) {
        this.startCityCode = startCityCode;
        return this;
    }
    public String getStartCityCode() {
        return this.startCityCode;
    }

    public FinishWaybillOrderRequest setStartCityName(String startCityName) {
        this.startCityName = startCityName;
        return this;
    }
    public String getStartCityName() {
        return this.startCityName;
    }

    public FinishWaybillOrderRequest setStartCountyCode(String startCountyCode) {
        this.startCountyCode = startCountyCode;
        return this;
    }
    public String getStartCountyCode() {
        return this.startCountyCode;
    }

    public FinishWaybillOrderRequest setStartCountyName(String startCountyName) {
        this.startCountyName = startCountyName;
        return this;
    }
    public String getStartCountyName() {
        return this.startCountyName;
    }

    public FinishWaybillOrderRequest setStartDivisionCode(String startDivisionCode) {
        this.startDivisionCode = startDivisionCode;
        return this;
    }
    public String getStartDivisionCode() {
        return this.startDivisionCode;
    }

    public FinishWaybillOrderRequest setStartProvinceCode(String startProvinceCode) {
        this.startProvinceCode = startProvinceCode;
        return this;
    }
    public String getStartProvinceCode() {
        return this.startProvinceCode;
    }

    public FinishWaybillOrderRequest setStartProvinceName(String startProvinceName) {
        this.startProvinceName = startProvinceName;
        return this;
    }
    public String getStartProvinceName() {
        return this.startProvinceName;
    }

    public FinishWaybillOrderRequest setStartStreetCode(String startStreetCode) {
        this.startStreetCode = startStreetCode;
        return this;
    }
    public String getStartStreetCode() {
        return this.startStreetCode;
    }

    public FinishWaybillOrderRequest setStartStreetName(String startStreetName) {
        this.startStreetName = startStreetName;
        return this;
    }
    public String getStartStreetName() {
        return this.startStreetName;
    }

    public FinishWaybillOrderRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public FinishWaybillOrderRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public FinishWaybillOrderRequest setTruckLength(String truckLength) {
        this.truckLength = truckLength;
        return this;
    }
    public String getTruckLength() {
        return this.truckLength;
    }

    public FinishWaybillOrderRequest setTruckType(String truckType) {
        this.truckType = truckType;
        return this;
    }
    public String getTruckType() {
        return this.truckType;
    }

    public FinishWaybillOrderRequest setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

}
