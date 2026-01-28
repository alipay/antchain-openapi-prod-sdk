// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AnyAmountItem extends TeaModel {
    // 数据项编码
    /**
     * <strong>example:</strong>
     * <p>AD1</p>
     */
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 数据值，按字符串输出，最多保留6位小数
    /**
     * <strong>example:</strong>
     * <p>221.11</p>
     */
    @NameInMap("item_amount")
    @Validation(required = true)
    public String itemAmount;

    public static AnyAmountItem build(java.util.Map<String, ?> map) throws Exception {
        AnyAmountItem self = new AnyAmountItem();
        return TeaModel.build(map, self);
    }

    public AnyAmountItem setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public AnyAmountItem setItemAmount(String itemAmount) {
        this.itemAmount = itemAmount;
        return this;
    }
    public String getItemAmount() {
        return this.itemAmount;
    }

}
