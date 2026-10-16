// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class SpecList extends TeaModel {
    // 品牌Id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>宝马</p>
     */
    @NameInMap("brand_name")
    @Validation(required = true)
    public String brandName;

    // 厂商id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("factory_id")
    @Validation(required = true)
    public String factoryId;

    // 厂商名称
    /**
     * <strong>example:</strong>
     * <p>华晨宝马</p>
     */
    @NameInMap("factory_name")
    @Validation(required = true)
    public String factoryName;

    // 车系id
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("series_id")
    @Validation(required = true)
    public String seriesId;

    // 车系名称
    /**
     * <strong>example:</strong>
     * <p>宝马X5</p>
     */
    @NameInMap("series_name")
    @Validation(required = true)
    public String seriesName;

    // 车型Id
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // 车型名称
    /**
     * <strong>example:</strong>
     * <p>2026款 改款 xDrive 40Li M运动曜夜套装</p>
     */
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    public static SpecList build(java.util.Map<String, ?> map) throws Exception {
        SpecList self = new SpecList();
        return TeaModel.build(map, self);
    }

    public SpecList setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public SpecList setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public SpecList setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

    public SpecList setFactoryName(String factoryName) {
        this.factoryName = factoryName;
        return this;
    }
    public String getFactoryName() {
        return this.factoryName;
    }

    public SpecList setSeriesId(String seriesId) {
        this.seriesId = seriesId;
        return this;
    }
    public String getSeriesId() {
        return this.seriesId;
    }

    public SpecList setSeriesName(String seriesName) {
        this.seriesName = seriesName;
        return this;
    }
    public String getSeriesName() {
        return this.seriesName;
    }

    public SpecList setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public SpecList setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

}
