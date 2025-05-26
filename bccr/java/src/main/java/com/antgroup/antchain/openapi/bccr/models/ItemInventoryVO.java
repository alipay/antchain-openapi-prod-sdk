// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ItemInventoryVO extends TeaModel {
    // 库存数量
    @NameInMap("stock")
    @Validation(required = true)
    public Long stock;

    // 生效时间
    @NameInMap("gmt_valid")
    @Validation(required = true)
    public String gmtValid;

    // 失效时间
    @NameInMap("gmt_invalid")
    @Validation(required = true)
    public String gmtInvalid;

    public static ItemInventoryVO build(java.util.Map<String, ?> map) throws Exception {
        ItemInventoryVO self = new ItemInventoryVO();
        return TeaModel.build(map, self);
    }

    public ItemInventoryVO setStock(Long stock) {
        this.stock = stock;
        return this;
    }
    public Long getStock() {
        return this.stock;
    }

    public ItemInventoryVO setGmtValid(String gmtValid) {
        this.gmtValid = gmtValid;
        return this;
    }
    public String getGmtValid() {
        return this.gmtValid;
    }

    public ItemInventoryVO setGmtInvalid(String gmtInvalid) {
        this.gmtInvalid = gmtInvalid;
        return this;
    }
    public String getGmtInvalid() {
        return this.gmtInvalid;
    }

}
