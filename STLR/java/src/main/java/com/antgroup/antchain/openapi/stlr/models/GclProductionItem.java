// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GclProductionItem extends TeaModel {
    // 用户侧传入明细编码，用于异常回传和排查
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
    @Validation(required = true)
    public String locationName;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品规格
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 月度产量明细
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("production_data_list")
    @Validation(required = true)
    public java.util.List<MonthDataDetail> productionDataList;

    public static GclProductionItem build(java.util.Map<String, ?> map) throws Exception {
        GclProductionItem self = new GclProductionItem();
        return TeaModel.build(map, self);
    }

    public GclProductionItem setExternalItemCode(String externalItemCode) {
        this.externalItemCode = externalItemCode;
        return this;
    }
    public String getExternalItemCode() {
        return this.externalItemCode;
    }

    public GclProductionItem setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public GclProductionItem setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GclProductionItem setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public GclProductionItem setProductionDataList(java.util.List<MonthDataDetail> productionDataList) {
        this.productionDataList = productionDataList;
        return this;
    }
    public java.util.List<MonthDataDetail> getProductionDataList() {
        return this.productionDataList;
    }

}
