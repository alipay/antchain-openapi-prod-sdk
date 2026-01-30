// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas_de.models;

import com.aliyun.tea.*;

public class CargoDetail extends TeaModel {
    // 货物序号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cargo_sequence_no")
    @Validation(required = true)
    public String cargoSequenceNo;

    // 货物名称
    /**
     * <strong>example:</strong>
     * <p>耳机</p>
     */
    @NameInMap("cargo_name")
    @Validation(required = true)
    public String cargoName;

    // 货物规格
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("cargo_specification")
    @Validation(required = true)
    public String cargoSpecification;

    // 货物数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("cargo_quantity")
    @Validation(required = true)
    public String cargoQuantity;

    // 货物单价，小数位只支持2位
    /**
     * <strong>example:</strong>
     * <p>454.22</p>
     */
    @NameInMap("cargo_unit_price")
    @Validation(required = true)
    public String cargoUnitPrice;

    public static CargoDetail build(java.util.Map<String, ?> map) throws Exception {
        CargoDetail self = new CargoDetail();
        return TeaModel.build(map, self);
    }

    public CargoDetail setCargoSequenceNo(String cargoSequenceNo) {
        this.cargoSequenceNo = cargoSequenceNo;
        return this;
    }
    public String getCargoSequenceNo() {
        return this.cargoSequenceNo;
    }

    public CargoDetail setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public CargoDetail setCargoSpecification(String cargoSpecification) {
        this.cargoSpecification = cargoSpecification;
        return this;
    }
    public String getCargoSpecification() {
        return this.cargoSpecification;
    }

    public CargoDetail setCargoQuantity(String cargoQuantity) {
        this.cargoQuantity = cargoQuantity;
        return this;
    }
    public String getCargoQuantity() {
        return this.cargoQuantity;
    }

    public CargoDetail setCargoUnitPrice(String cargoUnitPrice) {
        this.cargoUnitPrice = cargoUnitPrice;
        return this;
    }
    public String getCargoUnitPrice() {
        return this.cargoUnitPrice;
    }

}
