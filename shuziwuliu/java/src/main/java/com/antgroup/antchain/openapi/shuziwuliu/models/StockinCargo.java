// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class StockinCargo extends TeaModel {
    // 入库序号，在同一次入库请求中，入库序号保持不重复，不能小于0
    @NameInMap("stockin_index")
    @Validation(required = true)
    public Long stockinIndex;

    // sku品名
    // 
    @NameInMap("sku")
    @Validation(required = true, maxLength = 200)
    public String sku;

    // 商品名称
    @NameInMap("cargo_name")
    @Validation(maxLength = 200)
    public String cargoName;

    // 商品单品重量(kg)
    @NameInMap("cargo_weight")
    @Validation(maxLength = 50)
    public String cargoWeight;

    // 商品外扩长宽高(cm)
    @NameInMap("cargo_dimensions")
    @Validation(maxLength = 200)
    public String cargoDimensions;

    // 商品单品货物价值(元),，最多支持2位小数
    @NameInMap("cargo_worth")
    @Validation(maxLength = 30)
    public String cargoWorth;

    // 箱号
    @NameInMap("container_no")
    @Validation(maxLength = 50)
    public String containerNo;

    // 实际入库件数
    @NameInMap("actual_stockin_num")
    @Validation(required = true)
    public Long actualStockinNum;

    public static StockinCargo build(java.util.Map<String, ?> map) throws Exception {
        StockinCargo self = new StockinCargo();
        return TeaModel.build(map, self);
    }

    public StockinCargo setStockinIndex(Long stockinIndex) {
        this.stockinIndex = stockinIndex;
        return this;
    }
    public Long getStockinIndex() {
        return this.stockinIndex;
    }

    public StockinCargo setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public StockinCargo setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public StockinCargo setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public StockinCargo setCargoDimensions(String cargoDimensions) {
        this.cargoDimensions = cargoDimensions;
        return this;
    }
    public String getCargoDimensions() {
        return this.cargoDimensions;
    }

    public StockinCargo setCargoWorth(String cargoWorth) {
        this.cargoWorth = cargoWorth;
        return this;
    }
    public String getCargoWorth() {
        return this.cargoWorth;
    }

    public StockinCargo setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public StockinCargo setActualStockinNum(Long actualStockinNum) {
        this.actualStockinNum = actualStockinNum;
        return this;
    }
    public Long getActualStockinNum() {
        return this.actualStockinNum;
    }

}
