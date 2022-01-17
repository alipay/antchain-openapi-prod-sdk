// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateTransportWaybillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
    @NameInMap("all_freight")
    @Validation(required = true)
    public String allFreight;

    // 货物名称
    @NameInMap("cargo_name")
    @Validation(required = true)
    public String cargoName;

    // 货物体积，单位（方）。货物重量、货物体积二选一填写
    @NameInMap("cargo_volume")
    public String cargoVolume;

    // 货物重量，单位（吨）。货物重量、货物体积二选一填写
    @NameInMap("cargo_weight")
    public String cargoWeight;

    // 下游承运商did，一般为下一级承运商数字身份
    @NameInMap("carrier_did")
    @Validation(required = true)
    public String carrierDid;

    // 车牌颜色，需填写黄色、蓝色、绿色中的一种
    @NameInMap("car_badge_color")
    @Validation(required = true)
    public String carBadgeColor;

    // 车牌号，承运车牌号
    @NameInMap("car_badge_no")
    @Validation(required = true)
    public String carBadgeNo;

    // 货主did，一般为合同甲方的链上数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 创建时间，13位毫秒级时间戳
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 实际承运司机did，实际承运司机的链上数字身份
    @NameInMap("driver_did")
    @Validation(required = true)
    public String driverDid;

    // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
    @NameInMap("end_address")
    @Validation(required = true)
    public String endAddress;

    // 目的地详细地址，街道村社区道路楼宇门牌号
    @NameInMap("end_detailed_address")
    @Validation(required = true)
    public String endDetailedAddress;

    // 货物数量
    @NameInMap("goods_amount")
    public Long goodsAmount;

    // 货物数量单位类型
    @NameInMap("goods_amount_type")
    public String goodsAmountType;

    // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
    @NameInMap("start_address")
    @Validation(required = true)
    public String startAddress;

    // 起始地详细地址，街道村社区道路楼宇门牌号
    @NameInMap("start_detailed_address")
    @Validation(required = true)
    public String startDetailedAddress;

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

    // 托盘方did
    @NameInMap("pallet_did")
    public String palletDid;

    public static CreateTransportWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransportWaybillRequest self = new CreateTransportWaybillRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransportWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTransportWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTransportWaybillRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public CreateTransportWaybillRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public CreateTransportWaybillRequest setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
        return this;
    }
    public String getCargoVolume() {
        return this.cargoVolume;
    }

    public CreateTransportWaybillRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public CreateTransportWaybillRequest setCarrierDid(String carrierDid) {
        this.carrierDid = carrierDid;
        return this;
    }
    public String getCarrierDid() {
        return this.carrierDid;
    }

    public CreateTransportWaybillRequest setCarBadgeColor(String carBadgeColor) {
        this.carBadgeColor = carBadgeColor;
        return this;
    }
    public String getCarBadgeColor() {
        return this.carBadgeColor;
    }

    public CreateTransportWaybillRequest setCarBadgeNo(String carBadgeNo) {
        this.carBadgeNo = carBadgeNo;
        return this;
    }
    public String getCarBadgeNo() {
        return this.carBadgeNo;
    }

    public CreateTransportWaybillRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public CreateTransportWaybillRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateTransportWaybillRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public CreateTransportWaybillRequest setEndAddress(String endAddress) {
        this.endAddress = endAddress;
        return this;
    }
    public String getEndAddress() {
        return this.endAddress;
    }

    public CreateTransportWaybillRequest setEndDetailedAddress(String endDetailedAddress) {
        this.endDetailedAddress = endDetailedAddress;
        return this;
    }
    public String getEndDetailedAddress() {
        return this.endDetailedAddress;
    }

    public CreateTransportWaybillRequest setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
        return this;
    }
    public Long getGoodsAmount() {
        return this.goodsAmount;
    }

    public CreateTransportWaybillRequest setGoodsAmountType(String goodsAmountType) {
        this.goodsAmountType = goodsAmountType;
        return this;
    }
    public String getGoodsAmountType() {
        return this.goodsAmountType;
    }

    public CreateTransportWaybillRequest setStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }
    public String getStartAddress() {
        return this.startAddress;
    }

    public CreateTransportWaybillRequest setStartDetailedAddress(String startDetailedAddress) {
        this.startDetailedAddress = startDetailedAddress;
        return this;
    }
    public String getStartDetailedAddress() {
        return this.startDetailedAddress;
    }

    public CreateTransportWaybillRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public CreateTransportWaybillRequest setThirdPartyLogisticsDid(String thirdPartyLogisticsDid) {
        this.thirdPartyLogisticsDid = thirdPartyLogisticsDid;
        return this;
    }
    public String getThirdPartyLogisticsDid() {
        return this.thirdPartyLogisticsDid;
    }

    public CreateTransportWaybillRequest setTransportContractCode(String transportContractCode) {
        this.transportContractCode = transportContractCode;
        return this;
    }
    public String getTransportContractCode() {
        return this.transportContractCode;
    }

    public CreateTransportWaybillRequest setTransportRouteCode(String transportRouteCode) {
        this.transportRouteCode = transportRouteCode;
        return this;
    }
    public String getTransportRouteCode() {
        return this.transportRouteCode;
    }

    public CreateTransportWaybillRequest setPalletDid(String palletDid) {
        this.palletDid = palletDid;
        return this;
    }
    public String getPalletDid() {
        return this.palletDid;
    }

}
