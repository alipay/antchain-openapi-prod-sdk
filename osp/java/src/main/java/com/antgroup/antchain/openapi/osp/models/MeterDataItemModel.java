// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class MeterDataItemModel extends TeaModel {
    // 计量项名称
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 计量项值
    @NameInMap("item_value")
    @Validation(required = true)
    public Long itemValue;

    public static MeterDataItemModel build(java.util.Map<String, ?> map) throws Exception {
        MeterDataItemModel self = new MeterDataItemModel();
        return TeaModel.build(map, self);
    }

    public MeterDataItemModel setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public MeterDataItemModel setItemValue(Long itemValue) {
        this.itemValue = itemValue;
        return this;
    }
    public Long getItemValue() {
        return this.itemValue;
    }

}
