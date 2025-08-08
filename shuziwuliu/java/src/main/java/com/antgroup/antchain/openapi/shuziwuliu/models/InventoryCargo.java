// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class InventoryCargo extends TeaModel {
    // 序号，在同一次库存申报请求中，序号保持不重复，不能小于等于0
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inventory_index")
    @Validation(required = true)
    public Long inventoryIndex;

    // sku品名
    /**
     * <strong>example:</strong>
     * <p>80656-RLC-422-5MP</p>
     */
    @NameInMap("sku")
    @Validation(required = true, maxLength = 200)
    public String sku;

    // 商品名称
    // 
    /**
     * <strong>example:</strong>
     * <p>小米手机9</p>
     */
    @NameInMap("cargo_name")
    @Validation(maxLength = 200)
    public String cargoName;

    // 商品单品重量(kg)
    /**
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("cargo_weight")
    @Validation(maxLength = 50)
    public String cargoWeight;

    // 商品外扩长宽高(cm)
    /**
     * <strong>example:</strong>
     * <p>20.00<em>30.00</em>40.00</p>
     */
    @NameInMap("cargo_dimensions")
    @Validation(maxLength = 200)
    public String cargoDimensions;

    // 商品单品货物价值(元),最多支持2位小数
    /**
     * <strong>example:</strong>
     * <p>3800.12</p>
     */
    @NameInMap("cargo_worth")
    @Validation(maxLength = 30)
    public String cargoWorth;

    // 当前库存货物数量
    /**
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("current_inventory_cargo_num")
    @Validation(required = true)
    public Long currentInventoryCargoNum;

    // 客户代码
    // 
    /**
     * <strong>example:</strong>
     * <p>32112</p>
     */
    @NameInMap("customer_code")
    @Validation(required = true, maxLength = 50)
    public String customerCode;

    // 关联保单号,需要仓储CP做拆分计算
    /**
     * <strong>example:</strong>
     * <p>TB1882881002991</p>
     */
    @NameInMap("policy_no")
    @Validation(maxLength = 64)
    public String policyNo;

    // 入库时间, yyyy-MM-dd HH:mm:ss，需要仓储CP做拆分计算
    // 
    /**
     * <strong>example:</strong>
     * <p>2021-3-08 13:12:22 </p>
     */
    @NameInMap("stockin_date")
    public String stockinDate;

    // 时区,仓储CP上报入库时间所属的时区
    /**
     * <strong>example:</strong>
     * <p>东八区</p>
     */
    @NameInMap("timezone")
    @Validation(maxLength = 16)
    public String timezone;

    public static InventoryCargo build(java.util.Map<String, ?> map) throws Exception {
        InventoryCargo self = new InventoryCargo();
        return TeaModel.build(map, self);
    }

    public InventoryCargo setInventoryIndex(Long inventoryIndex) {
        this.inventoryIndex = inventoryIndex;
        return this;
    }
    public Long getInventoryIndex() {
        return this.inventoryIndex;
    }

    public InventoryCargo setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public InventoryCargo setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public InventoryCargo setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public InventoryCargo setCargoDimensions(String cargoDimensions) {
        this.cargoDimensions = cargoDimensions;
        return this;
    }
    public String getCargoDimensions() {
        return this.cargoDimensions;
    }

    public InventoryCargo setCargoWorth(String cargoWorth) {
        this.cargoWorth = cargoWorth;
        return this;
    }
    public String getCargoWorth() {
        return this.cargoWorth;
    }

    public InventoryCargo setCurrentInventoryCargoNum(Long currentInventoryCargoNum) {
        this.currentInventoryCargoNum = currentInventoryCargoNum;
        return this;
    }
    public Long getCurrentInventoryCargoNum() {
        return this.currentInventoryCargoNum;
    }

    public InventoryCargo setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public InventoryCargo setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public InventoryCargo setStockinDate(String stockinDate) {
        this.stockinDate = stockinDate;
        return this;
    }
    public String getStockinDate() {
        return this.stockinDate;
    }

    public InventoryCargo setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
