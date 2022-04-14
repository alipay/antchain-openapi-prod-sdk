// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class CommoditySpec extends TeaModel {
    // 规格项枚举值
    @NameInMap("spec_key")
    public String specKey;

    // 规格项默认值
    @NameInMap("value")
    public String value;

    public static CommoditySpec build(java.util.Map<String, ?> map) throws Exception {
        CommoditySpec self = new CommoditySpec();
        return TeaModel.build(map, self);
    }

    public CommoditySpec setSpecKey(String specKey) {
        this.specKey = specKey;
        return this;
    }
    public String getSpecKey() {
        return this.specKey;
    }

    public CommoditySpec setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
