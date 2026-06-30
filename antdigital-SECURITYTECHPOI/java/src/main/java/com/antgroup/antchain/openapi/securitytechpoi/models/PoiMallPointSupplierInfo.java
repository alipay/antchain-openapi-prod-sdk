// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class PoiMallPointSupplierInfo extends TeaModel {
    // 供应方名称
    /**
     * <strong>example:</strong>
     * <p>爱肯拿</p>
     */
    @NameInMap("supplier_name")
    public String supplierName;

    // 供应方类型 
    // 门店：STORE
    // 平台：PLATFORM
    // 供应商：SUPPLIER
    /**
     * <strong>example:</strong>
     * <p>STORE</p>
     */
    @NameInMap("supplier_type")
    public String supplierType;

    // 供应方编码
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("supplier_code")
    public String supplierCode;

    public static PoiMallPointSupplierInfo build(java.util.Map<String, ?> map) throws Exception {
        PoiMallPointSupplierInfo self = new PoiMallPointSupplierInfo();
        return TeaModel.build(map, self);
    }

    public PoiMallPointSupplierInfo setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public PoiMallPointSupplierInfo setSupplierType(String supplierType) {
        this.supplierType = supplierType;
        return this;
    }
    public String getSupplierType() {
        return this.supplierType;
    }

    public PoiMallPointSupplierInfo setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
