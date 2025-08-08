// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CargoAmount extends TeaModel {
    // 货运单对应金额（2位小数）
    /**
     * <strong>example:</strong>
     * <p>100000.00</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 货源单号
    /**
     * <strong>example:</strong>
     * <p>123466</p>
     */
    @NameInMap("cargo_order")
    @Validation(required = true)
    public String cargoOrder;

    public static CargoAmount build(java.util.Map<String, ?> map) throws Exception {
        CargoAmount self = new CargoAmount();
        return TeaModel.build(map, self);
    }

    public CargoAmount setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CargoAmount setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

}
