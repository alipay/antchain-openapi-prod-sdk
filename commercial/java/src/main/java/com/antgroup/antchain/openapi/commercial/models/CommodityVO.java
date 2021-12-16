// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CommodityVO extends TeaModel {
    // 商品Code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 商品名称
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 商品服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 商品来源
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 商品描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    public static CommodityVO build(java.util.Map<String, ?> map) throws Exception {
        CommodityVO self = new CommodityVO();
        return TeaModel.build(map, self);
    }

    public CommodityVO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CommodityVO setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public CommodityVO setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CommodityVO setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CommodityVO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
