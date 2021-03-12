// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceCargoorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运费
    @NameInMap("all_freight")
    @Validation(required = true)
    public String allFreight;

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

    // 货主did
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 卸货地
    @NameInMap("delivery_place")
    @Validation(required = true)
    public String deliveryPlace;

    // 装货地
    @NameInMap("loading_place")
    @Validation(required = true)
    public String loadingPlace;

    // 平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 联系人电话
    @NameInMap("user_phone")
    public String userPhone;

    // 重量
    @NameInMap("weight")
    @Validation(required = true)
    public String weight;

    public static CreateLogisticFinanceCargoorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceCargoorderRequest self = new CreateLogisticFinanceCargoorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceCargoorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceCargoorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceCargoorderRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public CreateLogisticFinanceCargoorderRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public CreateLogisticFinanceCargoorderRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public CreateLogisticFinanceCargoorderRequest setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public CreateLogisticFinanceCargoorderRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public CreateLogisticFinanceCargoorderRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public CreateLogisticFinanceCargoorderRequest setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
        return this;
    }
    public String getLoadingPlace() {
        return this.loadingPlace;
    }

    public CreateLogisticFinanceCargoorderRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateLogisticFinanceCargoorderRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    public String getUserPhone() {
        return this.userPhone;
    }

    public CreateLogisticFinanceCargoorderRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
