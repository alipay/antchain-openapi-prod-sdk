// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CargoInfo extends TeaModel {
    // 货物类型，货物类型的大类
    @NameInMap("cargo_type")
    @Validation(required = true)
    public String cargoType;

    // 货物名称，实际的货物名称
    @NameInMap("cargo_name")
    @Validation(required = true)
    public String cargoName;

    // 货物数量
    @NameInMap("cargo_quantity")
    @Validation(required = true)
    public String cargoQuantity;

    // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
    @NameInMap("cargo_worth")
    @Validation(required = true)
    public String cargoWorth;

    public static CargoInfo build(java.util.Map<String, ?> map) throws Exception {
        CargoInfo self = new CargoInfo();
        return TeaModel.build(map, self);
    }

    public CargoInfo setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public CargoInfo setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public CargoInfo setCargoQuantity(String cargoQuantity) {
        this.cargoQuantity = cargoQuantity;
        return this;
    }
    public String getCargoQuantity() {
        return this.cargoQuantity;
    }

    public CargoInfo setCargoWorth(String cargoWorth) {
        this.cargoWorth = cargoWorth;
        return this;
    }
    public String getCargoWorth() {
        return this.cargoWorth;
    }

}
