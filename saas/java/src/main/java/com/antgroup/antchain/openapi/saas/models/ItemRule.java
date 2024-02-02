// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class ItemRule extends TeaModel {
    // 上报次数
    @NameInMap("metering_item")
    @Validation(required = true)
    public String meteringItem;

    // 计量项列表
    @NameInMap("item_matching_rules")
    @Validation(required = true)
    public java.util.List<ItemMatchingRule> itemMatchingRules;

    public static ItemRule build(java.util.Map<String, ?> map) throws Exception {
        ItemRule self = new ItemRule();
        return TeaModel.build(map, self);
    }

    public ItemRule setMeteringItem(String meteringItem) {
        this.meteringItem = meteringItem;
        return this;
    }
    public String getMeteringItem() {
        return this.meteringItem;
    }

    public ItemRule setItemMatchingRules(java.util.List<ItemMatchingRule> itemMatchingRules) {
        this.itemMatchingRules = itemMatchingRules;
        return this;
    }
    public java.util.List<ItemMatchingRule> getItemMatchingRules() {
        return this.itemMatchingRules;
    }

}
