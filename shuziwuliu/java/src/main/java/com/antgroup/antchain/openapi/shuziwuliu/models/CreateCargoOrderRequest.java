// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCargoOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运费
    @NameInMap("all_freight")
    @Validation(required = true)
    public String allFreight;

    // 货物行业编码
    @NameInMap("cargo_business_code")
    public String cargoBusinessCode;

    // 货物商品编码
    @NameInMap("cargo_code")
    public String cargoCode;

    // 货运险金额
    @NameInMap("cargo_insurance_money")
    public String cargoInsuranceMoney;

    // 货物名称
    @NameInMap("cargo_name")
    @Validation(required = true)
    public String cargoName;

    // 货源单号
    @NameInMap("cargo_order")
    @Validation(required = true)
    public String cargoOrder;

    // 货物类型
    @NameInMap("cargo_type")
    @Validation(required = true)
    public String cargoType;

    // 货物单位
    @NameInMap("cargo_unit")
    public String cargoUnit;

    // 货物体积，单位（方）
    @NameInMap("cargo_volume")
    public String cargoVolume;

    // 货主did
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 卸货地，XX省-XX市-XX区
    @NameInMap("delivery_place")
    @Validation(required = true)
    public String deliveryPlace;

    // 装货地，XX省-XX市-XX区
    @NameInMap("loading_place")
    @Validation(required = true)
    public String loadingPlace;

    // 所属承运平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 货源单创建时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 联系人电话
    @NameInMap("user_phone")
    public String userPhone;

    // 货物重量，单位（吨）
    @NameInMap("weight")
    @Validation(required = true)
    public String weight;

    public static CreateCargoOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCargoOrderRequest self = new CreateCargoOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCargoOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCargoOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCargoOrderRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public CreateCargoOrderRequest setCargoBusinessCode(String cargoBusinessCode) {
        this.cargoBusinessCode = cargoBusinessCode;
        return this;
    }
    public String getCargoBusinessCode() {
        return this.cargoBusinessCode;
    }

    public CreateCargoOrderRequest setCargoCode(String cargoCode) {
        this.cargoCode = cargoCode;
        return this;
    }
    public String getCargoCode() {
        return this.cargoCode;
    }

    public CreateCargoOrderRequest setCargoInsuranceMoney(String cargoInsuranceMoney) {
        this.cargoInsuranceMoney = cargoInsuranceMoney;
        return this;
    }
    public String getCargoInsuranceMoney() {
        return this.cargoInsuranceMoney;
    }

    public CreateCargoOrderRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public CreateCargoOrderRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public CreateCargoOrderRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public CreateCargoOrderRequest setCargoUnit(String cargoUnit) {
        this.cargoUnit = cargoUnit;
        return this;
    }
    public String getCargoUnit() {
        return this.cargoUnit;
    }

    public CreateCargoOrderRequest setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
        return this;
    }
    public String getCargoVolume() {
        return this.cargoVolume;
    }

    public CreateCargoOrderRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public CreateCargoOrderRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public CreateCargoOrderRequest setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
        return this;
    }
    public String getLoadingPlace() {
        return this.loadingPlace;
    }

    public CreateCargoOrderRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateCargoOrderRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateCargoOrderRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    public String getUserPhone() {
        return this.userPhone;
    }

    public CreateCargoOrderRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
