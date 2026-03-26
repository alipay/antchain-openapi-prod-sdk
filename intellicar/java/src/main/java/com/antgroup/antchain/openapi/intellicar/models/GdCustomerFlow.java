// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdCustomerFlow extends TeaModel {
    // 当前页面
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
    /**
     * <strong>example:</strong>
     * <p>SHOP</p>
     */
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
    /**
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("time_type")
    @Validation(required = true)
    public String timeType;

    // 主品牌id
    /**
     * <strong>example:</strong>
     * <p>102</p>
     */
    @NameInMap("main_brand")
    @Validation(required = true)
    public String mainBrand;

    // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
    /**
     * <strong>example:</strong>
     * <p>20230103</p>
     */
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 品牌id，以”,”分隔
    /**
     * <strong>example:</strong>
     * <p>102</p>
     */
    @NameInMap("brand_limit")
    @Validation(required = true)
    public String brandLimit;

    // 数据指数类型（pv、uv中选择，多个以”,”分隔）
    /**
     * <strong>example:</strong>
     * <p>pv,uv</p>
     */
    @NameInMap("data_limit")
    @Validation(required = true)
    public String dataLimit;

    // 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("base_self")
    public Long baseSelf;

    public static GdCustomerFlow build(java.util.Map<String, ?> map) throws Exception {
        GdCustomerFlow self = new GdCustomerFlow();
        return TeaModel.build(map, self);
    }

    public GdCustomerFlow setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GdCustomerFlow setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GdCustomerFlow setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

    public GdCustomerFlow setMainBrand(String mainBrand) {
        this.mainBrand = mainBrand;
        return this;
    }
    public String getMainBrand() {
        return this.mainBrand;
    }

    public GdCustomerFlow setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public GdCustomerFlow setBrandLimit(String brandLimit) {
        this.brandLimit = brandLimit;
        return this;
    }
    public String getBrandLimit() {
        return this.brandLimit;
    }

    public GdCustomerFlow setDataLimit(String dataLimit) {
        this.dataLimit = dataLimit;
        return this;
    }
    public String getDataLimit() {
        return this.dataLimit;
    }

    public GdCustomerFlow setBaseSelf(Long baseSelf) {
        this.baseSelf = baseSelf;
        return this;
    }
    public Long getBaseSelf() {
        return this.baseSelf;
    }

}
