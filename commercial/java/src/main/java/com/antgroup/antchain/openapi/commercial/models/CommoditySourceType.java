// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CommoditySourceType extends TeaModel {
    // 商品来源code
    @NameInMap("type_code")
    @Validation(required = true)
    public String typeCode;

    // 商品来源描述
    @NameInMap("type_desc")
    @Validation(required = true)
    public String typeDesc;

    public static CommoditySourceType build(java.util.Map<String, ?> map) throws Exception {
        CommoditySourceType self = new CommoditySourceType();
        return TeaModel.build(map, self);
    }

    public CommoditySourceType setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public String getTypeCode() {
        return this.typeCode;
    }

    public CommoditySourceType setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }
    public String getTypeDesc() {
        return this.typeDesc;
    }

}
