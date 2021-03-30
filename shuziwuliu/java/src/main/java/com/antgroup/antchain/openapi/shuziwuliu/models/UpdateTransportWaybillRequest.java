// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateTransportWaybillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
    @NameInMap("all_freight")
    public String allFreight;

    // 货物名称
    @NameInMap("cargo_name")
    public String cargoName;

    // 单位（方），货物体积
    @NameInMap("cargo_volume")
    public String cargoVolume;

    // 单位（吨），货物重量
    @NameInMap("cargo_weight")
    public String cargoWeight;

    // 下游承运商did，一般为下一级承运商数字身份
    @NameInMap("carrier_did")
    public String carrierDid;

    // 车牌颜色，需填写黄色、蓝色、绿色中的一种
    @NameInMap("car_badge_color")
    public String carBadgeColor;

    // 车牌号，承运车牌号
    @NameInMap("car_badge_no")
    public String carBadgeNo;

    // 货主did，一般为合同甲方的链上数字身份
    @NameInMap("consignor_did")
    public String consignorDid;

    // 创建时间，13位毫秒级时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 实际承运司机did，实际承运司机的链上数字身份
    @NameInMap("driver_did")
    public String driverDid;

    // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
    @NameInMap("end_address")
    public String endAddress;

    // 目的地详细地址，街道村社区道路楼宇门牌号
    @NameInMap("end_detailed_address")
    public String endDetailedAddress;

    // 到达时间，13位毫秒级时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 货物数量
    @NameInMap("goods_amount")
    public Long goodsAmount;

    // 货物数量单位类型
    @NameInMap("goods_amount_type")
    public String goodsAmountType;

    // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
    @NameInMap("start_address")
    public String startAddress;

    // 起始地详细地址，街道村社区道路楼宇门牌号
    @NameInMap("start_detailed_address")
    public String startDetailedAddress;

    // 起运时间，13位毫秒级时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 客户系统内运单编号
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    // 3plDid，一般为合同乙方的链上数字身份
    @NameInMap("third_party_logistics_did")
    @Validation(required = true)
    public String thirdPartyLogisticsDid;

    // 所属合同编号
    @NameInMap("transport_contract_code")
    public String transportContractCode;

    // 所属运输线路编码
    @NameInMap("transport_route_code")
    public String transportRouteCode;

    public static UpdateTransportWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransportWaybillRequest self = new UpdateTransportWaybillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransportWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTransportWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateTransportWaybillRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public UpdateTransportWaybillRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public UpdateTransportWaybillRequest setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
        return this;
    }
    public String getCargoVolume() {
        return this.cargoVolume;
    }

    public UpdateTransportWaybillRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public UpdateTransportWaybillRequest setCarrierDid(String carrierDid) {
        this.carrierDid = carrierDid;
        return this;
    }
    public String getCarrierDid() {
        return this.carrierDid;
    }

    public UpdateTransportWaybillRequest setCarBadgeColor(String carBadgeColor) {
        this.carBadgeColor = carBadgeColor;
        return this;
    }
    public String getCarBadgeColor() {
        return this.carBadgeColor;
    }

    public UpdateTransportWaybillRequest setCarBadgeNo(String carBadgeNo) {
        this.carBadgeNo = carBadgeNo;
        return this;
    }
    public String getCarBadgeNo() {
        return this.carBadgeNo;
    }

    public UpdateTransportWaybillRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UpdateTransportWaybillRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public UpdateTransportWaybillRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public UpdateTransportWaybillRequest setEndAddress(String endAddress) {
        this.endAddress = endAddress;
        return this;
    }
    public String getEndAddress() {
        return this.endAddress;
    }

    public UpdateTransportWaybillRequest setEndDetailedAddress(String endDetailedAddress) {
        this.endDetailedAddress = endDetailedAddress;
        return this;
    }
    public String getEndDetailedAddress() {
        return this.endDetailedAddress;
    }

    public UpdateTransportWaybillRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateTransportWaybillRequest setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
        return this;
    }
    public Long getGoodsAmount() {
        return this.goodsAmount;
    }

    public UpdateTransportWaybillRequest setGoodsAmountType(String goodsAmountType) {
        this.goodsAmountType = goodsAmountType;
        return this;
    }
    public String getGoodsAmountType() {
        return this.goodsAmountType;
    }

    public UpdateTransportWaybillRequest setStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }
    public String getStartAddress() {
        return this.startAddress;
    }

    public UpdateTransportWaybillRequest setStartDetailedAddress(String startDetailedAddress) {
        this.startDetailedAddress = startDetailedAddress;
        return this;
    }
    public String getStartDetailedAddress() {
        return this.startDetailedAddress;
    }

    public UpdateTransportWaybillRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateTransportWaybillRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public UpdateTransportWaybillRequest setThirdPartyLogisticsDid(String thirdPartyLogisticsDid) {
        this.thirdPartyLogisticsDid = thirdPartyLogisticsDid;
        return this;
    }
    public String getThirdPartyLogisticsDid() {
        return this.thirdPartyLogisticsDid;
    }

    public UpdateTransportWaybillRequest setTransportContractCode(String transportContractCode) {
        this.transportContractCode = transportContractCode;
        return this;
    }
    public String getTransportContractCode() {
        return this.transportContractCode;
    }

    public UpdateTransportWaybillRequest setTransportRouteCode(String transportRouteCode) {
        this.transportRouteCode = transportRouteCode;
        return this;
    }
    public String getTransportRouteCode() {
        return this.transportRouteCode;
    }

}
