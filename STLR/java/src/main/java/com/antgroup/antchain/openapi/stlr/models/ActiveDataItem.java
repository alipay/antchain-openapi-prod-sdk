// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ActiveDataItem extends TeaModel {
    // 明细编码，用于异常回传和排查
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("external_item_code")
    public String externalItemCode;

    // 单元过程名称；`inputByProcess = true` 时必填，取 options 返回的 `processList[].processName`
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_name")
    public String processName;

    // 物料名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("material_name")
    @Validation(required = true)
    public String materialName;

    // 供应商名称，无供应商时为空
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("supplier_name")
    public String supplierName;

    // 外购产品或自有产品名称，无供应商产品时为空
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("supplier_product_name")
    public String supplierProductName;

    // 月度活动数据明细，包含多个月份
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("active_data_list")
    @Validation(required = true)
    public java.util.List<MonthDataDetail> activeDataList;

    // 单元过程编码
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_no")
    public String processNo;

    // 物料类型，默认为RAW原辅料数据
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("material_type")
    public String materialType;

    public static ActiveDataItem build(java.util.Map<String, ?> map) throws Exception {
        ActiveDataItem self = new ActiveDataItem();
        return TeaModel.build(map, self);
    }

    public ActiveDataItem setExternalItemCode(String externalItemCode) {
        this.externalItemCode = externalItemCode;
        return this;
    }
    public String getExternalItemCode() {
        return this.externalItemCode;
    }

    public ActiveDataItem setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ActiveDataItem setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public ActiveDataItem setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public ActiveDataItem setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
        return this;
    }
    public String getSupplierProductName() {
        return this.supplierProductName;
    }

    public ActiveDataItem setActiveDataList(java.util.List<MonthDataDetail> activeDataList) {
        this.activeDataList = activeDataList;
        return this;
    }
    public java.util.List<MonthDataDetail> getActiveDataList() {
        return this.activeDataList;
    }

    public ActiveDataItem setProcessNo(String processNo) {
        this.processNo = processNo;
        return this;
    }
    public String getProcessNo() {
        return this.processNo;
    }

    public ActiveDataItem setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

}
