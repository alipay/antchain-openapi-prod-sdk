// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class TemplateDataConverter extends TeaModel {
    // 货物品类
    @NameInMap("commodity_category")
    @Validation(required = true)
    public String commodityCategory;

    // 仓单的生成时间
    @NameInMap("create_time")
    public Long createTime;

    // 仓储方名称或ID，提交的时候使用ID，展示使用名称
    @NameInMap("custodian_corp")
    public String custodianCorp;

    // 存货人名称或ID，提交的时候使用ID，展示使用名称
    @NameInMap("customer_corp")
    public String customerCorp;

    // 其他字典定制信息
    @NameInMap("custom_data")
    public String customData;

    // 是否补仓
    @NameInMap("is_supplement")
    @Validation(required = true)
    public Boolean isSupplement;

    // 联盟ID
    @NameInMap("league_id")
    @Validation(required = true)
    public String leagueId;

    // 联盟名称
    @NameInMap("league_name")
    @Validation(required = true)
    public String leagueName;

    // 资金方名称或ID，提交的时候使用ID，展示使用名称
    @NameInMap("lender_corp")
    public String lenderCorp;

    // 仓位ID列表
    @NameInMap("position")
    public java.util.List<String> position;

    // 预分配仓位ID列表
    @NameInMap("pre_position")
    public java.util.List<String> prePosition;

    // 预分配仓库名称或ID，提交的时候使用ID，展示使用名称
    @NameInMap("pre_warehouse_name")
    public String preWarehouseName;

    // 数量
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // 数量单位
    @NameInMap("quantity_unit")
    @Validation(required = true)
    public String quantityUnit;

    // 物权方
    @NameInMap("real_right_name")
    public String realRightName;

    // 仓单状态
    @NameInMap("state")
    public String state;

    // 补仓仓单ID
    @NameInMap("supplement_warehouse_receipt_id")
    public String supplementWarehouseReceiptId;

    // 仓单更新时间
    @NameInMap("update_time")
    public Long updateTime;

    // 仓库名称或ID，提交的时候使用ID，展示使用名称
    @NameInMap("warehouse_name")
    public String warehouseName;

    // 仓单ID
    @NameInMap("warehouse_receipt_id")
    public String warehouseReceiptId;

    // 重量
    @NameInMap("weight")
    @Validation(required = true)
    public String weight;

    // 重量单位
    @NameInMap("weight_unit")
    @Validation(required = true)
    public String weightUnit;

    public static TemplateDataConverter build(java.util.Map<String, ?> map) throws Exception {
        TemplateDataConverter self = new TemplateDataConverter();
        return TeaModel.build(map, self);
    }

    public TemplateDataConverter setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
        return this;
    }
    public String getCommodityCategory() {
        return this.commodityCategory;
    }

    public TemplateDataConverter setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public TemplateDataConverter setCustodianCorp(String custodianCorp) {
        this.custodianCorp = custodianCorp;
        return this;
    }
    public String getCustodianCorp() {
        return this.custodianCorp;
    }

    public TemplateDataConverter setCustomerCorp(String customerCorp) {
        this.customerCorp = customerCorp;
        return this;
    }
    public String getCustomerCorp() {
        return this.customerCorp;
    }

    public TemplateDataConverter setCustomData(String customData) {
        this.customData = customData;
        return this;
    }
    public String getCustomData() {
        return this.customData;
    }

    public TemplateDataConverter setIsSupplement(Boolean isSupplement) {
        this.isSupplement = isSupplement;
        return this;
    }
    public Boolean getIsSupplement() {
        return this.isSupplement;
    }

    public TemplateDataConverter setLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }
    public String getLeagueId() {
        return this.leagueId;
    }

    public TemplateDataConverter setLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }
    public String getLeagueName() {
        return this.leagueName;
    }

    public TemplateDataConverter setLenderCorp(String lenderCorp) {
        this.lenderCorp = lenderCorp;
        return this;
    }
    public String getLenderCorp() {
        return this.lenderCorp;
    }

    public TemplateDataConverter setPosition(java.util.List<String> position) {
        this.position = position;
        return this;
    }
    public java.util.List<String> getPosition() {
        return this.position;
    }

    public TemplateDataConverter setPrePosition(java.util.List<String> prePosition) {
        this.prePosition = prePosition;
        return this;
    }
    public java.util.List<String> getPrePosition() {
        return this.prePosition;
    }

    public TemplateDataConverter setPreWarehouseName(String preWarehouseName) {
        this.preWarehouseName = preWarehouseName;
        return this;
    }
    public String getPreWarehouseName() {
        return this.preWarehouseName;
    }

    public TemplateDataConverter setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public TemplateDataConverter setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
        return this;
    }
    public String getQuantityUnit() {
        return this.quantityUnit;
    }

    public TemplateDataConverter setRealRightName(String realRightName) {
        this.realRightName = realRightName;
        return this;
    }
    public String getRealRightName() {
        return this.realRightName;
    }

    public TemplateDataConverter setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public TemplateDataConverter setSupplementWarehouseReceiptId(String supplementWarehouseReceiptId) {
        this.supplementWarehouseReceiptId = supplementWarehouseReceiptId;
        return this;
    }
    public String getSupplementWarehouseReceiptId() {
        return this.supplementWarehouseReceiptId;
    }

    public TemplateDataConverter setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public TemplateDataConverter setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

    public TemplateDataConverter setWarehouseReceiptId(String warehouseReceiptId) {
        this.warehouseReceiptId = warehouseReceiptId;
        return this;
    }
    public String getWarehouseReceiptId() {
        return this.warehouseReceiptId;
    }

    public TemplateDataConverter setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

    public TemplateDataConverter setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
        return this;
    }
    public String getWeightUnit() {
        return this.weightUnit;
    }

}
