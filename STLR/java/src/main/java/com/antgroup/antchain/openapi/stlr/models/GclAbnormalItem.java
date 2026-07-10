// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GclAbnormalItem extends TeaModel {
    // 明细编码
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("external_item_code")
    public String externalItemCode;

    // 生产单元名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("location_name")
    public String locationName;

    // 产品规格
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("specification")
    public String specification;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 发生月份
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("occur_date")
    public String occurDate;

    // 请求单位
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("dosage_unit")
    public String dosageUnit;

    // 业务错误码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 错误描述
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    // 单元过程名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_name")
    public String processName;

    // 物料类型
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("material_type")
    public String materialType;

    // 物料名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("material_name")
    public String materialName;

    // 供应商名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("supplier_name")
    public String supplierName;

    // 供应商产品名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("supplier_product_name")
    public String supplierProductName;

    // 过程编码
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_no")
    public String processNo;

    public static GclAbnormalItem build(java.util.Map<String, ?> map) throws Exception {
        GclAbnormalItem self = new GclAbnormalItem();
        return TeaModel.build(map, self);
    }

    public GclAbnormalItem setExternalItemCode(String externalItemCode) {
        this.externalItemCode = externalItemCode;
        return this;
    }
    public String getExternalItemCode() {
        return this.externalItemCode;
    }

    public GclAbnormalItem setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public GclAbnormalItem setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public GclAbnormalItem setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GclAbnormalItem setOccurDate(String occurDate) {
        this.occurDate = occurDate;
        return this;
    }
    public String getOccurDate() {
        return this.occurDate;
    }

    public GclAbnormalItem setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
        return this;
    }
    public String getDosageUnit() {
        return this.dosageUnit;
    }

    public GclAbnormalItem setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GclAbnormalItem setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GclAbnormalItem setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public GclAbnormalItem setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public GclAbnormalItem setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public GclAbnormalItem setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public GclAbnormalItem setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
        return this;
    }
    public String getSupplierProductName() {
        return this.supplierProductName;
    }

    public GclAbnormalItem setProcessNo(String processNo) {
        this.processNo = processNo;
        return this;
    }
    public String getProcessNo() {
        return this.processNo;
    }

}
