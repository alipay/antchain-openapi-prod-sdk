// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CargoLoss extends TeaModel {
    // 物品类型
    @NameInMap("cargo_type")
    @Validation(maxLength = 200)
    public String cargoType;

    // 物品名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 500)
    public String cargoName;

    // 物品所有人
    @NameInMap("cargo_owner")
    @Validation(maxLength = 200)
    public String cargoOwner;

    // 物品损失描述 
    @NameInMap("cargo_loss_desc")
    @Validation(maxLength = 500)
    public String cargoLossDesc;

    // 损失预估，单位（元），最多支持2位小数
    @NameInMap("cargo_loss_estimate_amount")
    @Validation(required = true)
    public String cargoLossEstimateAmount;

    public static CargoLoss build(java.util.Map<String, ?> map) throws Exception {
        CargoLoss self = new CargoLoss();
        return TeaModel.build(map, self);
    }

    public CargoLoss setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }
    public String getCargoType() {
        return this.cargoType;
    }

    public CargoLoss setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public CargoLoss setCargoOwner(String cargoOwner) {
        this.cargoOwner = cargoOwner;
        return this;
    }
    public String getCargoOwner() {
        return this.cargoOwner;
    }

    public CargoLoss setCargoLossDesc(String cargoLossDesc) {
        this.cargoLossDesc = cargoLossDesc;
        return this;
    }
    public String getCargoLossDesc() {
        return this.cargoLossDesc;
    }

    public CargoLoss setCargoLossEstimateAmount(String cargoLossEstimateAmount) {
        this.cargoLossEstimateAmount = cargoLossEstimateAmount;
        return this;
    }
    public String getCargoLossEstimateAmount() {
        return this.cargoLossEstimateAmount;
    }

}
